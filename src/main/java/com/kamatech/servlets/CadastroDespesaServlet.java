package com.kamatech.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cadastro-despesa")
public class CadastroDespesaServlet extends HttpServlet {

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    String descricao = request.getParameter("descricao");
    String data = request.getParameter("data");
    String valor = request.getParameter("valor");
    String categoria = request.getParameter("categoria");

    System.out.println(descricao);
    System.out.println(data);
    System.out.println(valor);
    System.out.println(categoria);
  }
}
