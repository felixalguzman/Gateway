package com.practicafinal.gateway.controladores;

import com.practicafinal.gateway.entidades.Cliente;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * CorreoController
 */
@RestController
@RequestMapping("/api/correos")
public class CorreoController {

    private RestTemplate restTemplate = new RestTemplate();


    @GetMapping("/nuevo")
    public ResponseEntity enviarCorreo(@RequestBody Cliente cliente) {
        
        HttpEntity<Cliente> request = new HttpEntity<>(cliente);
        ResponseEntity<Cliente> exchange = restTemplate.exchange("http://localhost:8088/correo/nuevoCliente", HttpMethod.GET,
                request, Cliente.class);

        return new ResponseEntity<>(HttpStatus.OK);
    }
    
}