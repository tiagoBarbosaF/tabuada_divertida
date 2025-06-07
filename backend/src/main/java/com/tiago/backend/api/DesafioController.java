package com.tiago.backend.api;

import com.tiago.backend.app.dto.DesafioRequest;
import com.tiago.backend.app.dto.DesafioResponse;
import com.tiago.backend.core.DesafioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DesafioController {
    private final DesafioService desafioService;

    public DesafioController(DesafioService desafioService) {
        this.desafioService = desafioService;
    }

    @GetMapping("/desafio")
    public ResponseEntity<DesafioResponse> getDesafio() {
        DesafioResponse response = desafioService.getDesafio();
        return response != null ? ResponseEntity.ok(response) : ResponseEntity.notFound().build();
    }

    @PostMapping("/desafio")
    public ResponseEntity<DesafioResponse> postResult(@RequestBody DesafioRequest desafioRequest) {
        DesafioResponse response = desafioService.postDesafio(desafioRequest);
        return response != null ? ResponseEntity.ok(response) : ResponseEntity.notFound().build();
    }
}
