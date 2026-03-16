package com.exercicios.exercicio.services;

import com.exercicios.exercicio.model.PedidoModel;
import com.exercicios.exercicio.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    PedidoRepository pessoaRepository;

    public PedidoModel criarPedido(PedidoModel pedidoModel){
        return pessoaRepository.save(pedidoModel);
    }

    public void deleteById(Long id){
        pessoaRepository.deleteById(id);
    }

    public PedidoModel findById(Long id){
        return pessoaRepository.findById(id).orElse(null);
    }

    public List<PedidoModel> findAll(){
        return pessoaRepository.findAll();
    }
}
