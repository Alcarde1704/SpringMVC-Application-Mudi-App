package br.com.spring.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.spring.mvc.mudi.models.Pedido;

@Controller
public class HomeController {
  
  @GetMapping("/home")
  public String home(Model model){

    Pedido pedido = new Pedido();
    pedido.setNomeProduto("Xiaomi Redmi Note 11");
    pedido.setUrlImagem("https://images-na.ssl-images-amazon.com/images/I/51e3KdrHuCL.__AC_SX300_SY300_QL70_ML2_.jpg");
    pedido.setUrlProduto("https://www.amazon.com.br/Xiaomi-Redmi-Note-11-Graphite/dp/B09QSB4N2C/ref=sr_1_5?__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=ZXQ49YQT14V8&keywords=xiaomi&qid=1663270391&sprefix=xiaomi%2Caps%2C259&sr=8-5&ufe=app_do%3Aamzn1.fos.25548f35-0de7-44b3-b28e-0f56f3f96147");
    pedido.setDescricao("Uma descricao qualquer");
    
    List<Pedido> pedidos = Arrays.asList(pedido);
    model.addAttribute("pedidos", pedidos);

    return "home";
  }

}
