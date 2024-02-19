package com.kamatech.servlets;

import com.kamatech.daos.DespesaDAO;
import com.kamatech.models.Categoria;
import com.kamatech.models.Despesa;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@WebServlet("/cadastro-despesa")
public class CadastroDespesaServlet extends HttpServlet {

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    String descricao = request.getParameter("descricao");
    String dataStr = request.getParameter("data");
    String valorStr = request.getParameter("valor");
    String categoriaStr = request.getParameter("categoria");
    String memo = request.getParameter("memo");

    LocalDate data = LocalDate.parse(dataStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    double valor = Double.parseDouble(valorStr);
    Categoria categoria = Categoria.valueOf(categoriaStr);

    Despesa despesa = new Despesa(descricao, valor, data, categoria, memo);
    DespesaDAO dao = new DespesaDAO();
    dao.save(despesa);

    PrintWriter out = response.getWriter();
    out.println("<html><body><h1>Despesa salva com sucesso</h1></body></html");

  }
}
