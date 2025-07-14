package com.streamvibe.api.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/olamundo")
public class OlaMundoController {
    
    @GetMapping("/oi")
    public String olaMundo() {
        
        return "Olá mundo";
    }
}
