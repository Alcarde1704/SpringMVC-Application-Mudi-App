package br.com.spring.mvc.mudi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.spring.mvc.mudi.dto.RequisicaoNovoPedido;

@Controller
@RequestMapping("pedido")
public class PedidoController {
  
  @GetMapping("formulario")
  public String formulario(){
    return "pedido/formulario";
  }

  @PostMapping("novo")
  public String novo(RequisicaoNovoPedido requisicao){

    Pedido pedido = requisicao.toPedido();
    return "";
  }

}
