package com.kamatech.models;

import java.time.LocalDate;

public class Despesa {

  private Long id;
  private String descricao;
  private Double valor;
  private LocalDate data;
  private Categoria categoria;
  private String memo;

  public Despesa(String descricao, Double valor, LocalDate data,
      Categoria categoria, String memo) {
    this.descricao = descricao;
    this.valor = valor;
    this.data = data;
    this.categoria = categoria;
    this.memo = memo;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public Double getValor() {
    return valor;
  }

  public void setValor(Double valor) {
    this.valor = valor;
  }

  public LocalDate getData() {
    return data;
  }

  public void setData(LocalDate data) {
    this.data = data;
  }

  public Categoria getCategoria() {
    return categoria;
  }

  public void setCategoria(Categoria categoria) {
    this.categoria = categoria;
  }

  public String getMemo() {
    return memo;
  }

  public void setMemo(String memo) {
    this.memo = memo;
  }
}
