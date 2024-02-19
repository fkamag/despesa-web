package com.kamatech.infra;

import io.github.cdimascio.dotenv.Dotenv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

  private ConnectionFactory() {}

  public static Connection getConnection() {
    Dotenv dotenv = Dotenv.load();
    String url = dotenv.get("DB_URL");
    String user = dotenv.get("DB_USER");
    String password = dotenv.get("DB_PASSWORD");
    try {
      assert url != null;
      return DriverManager.getConnection(url, user, password);
    } catch (SQLException e) {
      throw new RuntimeException();
    }
  }
}
