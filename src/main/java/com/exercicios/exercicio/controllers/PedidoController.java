package com.exercicios.exercicio.controllers;

import com.exercicios.exercicio.model.PedidoModel;
import com.exercicios.exercicio.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "/pedido")
public class PedidoController {

    @Autowired
    PedidoService pedidoService;

    @PostMapping
    public PedidoModel criarPedido(@RequestBody PedidoModel pedidoModel){
        return pedidoService.criarPedido(pedidoModel);
    }

    @DeleteMapping("/{id}")
    public void deletarPedido(@PathVariable Long id){
        pedidoService.deleteById(id);
    }

    @GetMapping
    public List<PedidoModel> listarPedidos(){
        return pedidoService.findAll();
    }

    @GetMapping("/{id}")
    public PedidoModel findById(@PathVariable Long id){
        return pedidoService.findById(id);
    }
}
