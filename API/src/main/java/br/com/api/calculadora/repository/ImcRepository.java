package br.com.api.calculadora.repository;

import br.com.api.calculadora.model.Imc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImcRepository extends JpaRepository <Imc,Integer> {
}
