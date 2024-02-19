package com.kamatech.daos;

import com.kamatech.infra.ConnectionFactory;
import com.kamatech.models.Categoria;
import com.kamatech.models.Despesa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class DespesaDAO implements IDespesaDAO {

  @Override
  public Despesa save(Despesa despesa) {

    try (Connection connection = ConnectionFactory.getConnection()) {
      String sql = "INSERT INTO despesas (descricao, valor, data, categoria, memo) "
          + "VALUES (?, ?, ?, ?, ?)";

      PreparedStatement preparedStatement = connection.prepareStatement(sql);
      preparedStatement.setString(1, despesa.getDescricao());
      preparedStatement.setDouble(2, despesa.getValor());
      preparedStatement.setDate(3, java.sql.Date.valueOf(despesa.getData()));
      preparedStatement.setString(4, despesa.getCategoria().toString());
      preparedStatement.setString(5, despesa.getMemo());

      preparedStatement.executeUpdate();

    } catch (SQLException e) {
      throw new RuntimeException(e);
    }

    return despesa;
  }

  @Override
  public Despesa update(Despesa despesa) {
    return null;
  }

  @Override
  public void delete(Long id) {

  }

  @Override
  public List<Despesa> findAll() {
    return null;
  }

  @Override
  public Optional<Despesa> findById(Long id) {
    return Optional.empty();
  }

  @Override
  public List<Despesa> findByCategoria(Categoria categoria) {
    return null;
  }
}
