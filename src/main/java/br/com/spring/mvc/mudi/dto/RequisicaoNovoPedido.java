package br.com.spring.mvc.mudi.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import br.com.spring.mvc.mudi.models.Pedido;
import br.com.spring.mvc.mudi.models.StatusPedido;

public class RequisicaoNovoPedido {
  
  @NotBlank 
  private String nomeProduto;

  @NotBlank
  @Size(min = 5, max = 255)
  private String urlProduto;

  @NotBlank
  @Size(min = 5, max = 255)
  private String urlImagem;

  private String descricao;

  public String getNomeProduto() {
    return nomeProduto;
  }
  public void setNomeProduto(String nomeProduto) {
    this.nomeProduto = nomeProduto;
  }
  public String getUrlProduto() {
    return urlProduto;
  }
  public void setUrlProduto(String urlProduto) {
    this.urlProduto = urlProduto;
  }
  public String getUrlImagem() {
    return urlImagem;
  }
  public void setUrlImagem(String urlImagem) {
    this.urlImagem = urlImagem;
  }
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public Pedido toPedido(){
    Pedido pedido = new Pedido();
    pedido.setDescricao(descricao);
    pedido.setNomeProduto(nomeProduto);
    pedido.setUrlImagem(urlImagem);
    pedido.setUrlProduto(urlProduto);
    pedido.setStatus(StatusPedido.AGUARDANDO);
    return pedido;
  }

  

}
