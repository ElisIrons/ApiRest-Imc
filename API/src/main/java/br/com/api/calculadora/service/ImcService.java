package br.com.api.calculadora.service;

import br.com.api.calculadora.model.Imc;
import br.com.api.calculadora.repository.ImcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImcService {
    @Autowired
        private ImcRepository imcRepository;

        public void registrarImc(Imc imc) {
            imcRepository.save(imc);
        }
        public List<Imc> listarTodos(){
            return imcRepository.findAll();
    }
}
