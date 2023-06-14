package br.com.api.calculadora.controller;

import br.com.api.calculadora.model.Imc;
import br.com.api.calculadora.service.ImcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;
import java.util.List;

@RestController
@RequestMapping({"/api/v1/imc"})
public class ImcController {
    @Autowired
    private ImcService imcService;
    @PostMapping
    public ResponseEntity<Imc> registrarImc (@RequestBody Imc registroImc){
        imcService.registrarImc(registroImc);
        return ResponseEntity.badRequest().body(registroImc);
    }
    @GetMapping
    public ResponseEntity<List<Imc>> obterListaImc(){
        return ResponseEntity.ok().body(imcService.listarTodos());
    }

}
