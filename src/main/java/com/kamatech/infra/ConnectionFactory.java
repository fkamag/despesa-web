package com.kamatech.infra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

  private ConnectionFactory() {}

  public static Connection getConnection() {
    String url = System.getenv("DB_URL");
    String user = System.getenv("DB_USER");
    String password = System.getenv("DB_PASSWORD");
    try {
      assert url != null;
      try {
        Class.forName("org.postgresql.Driver");
      } catch (ClassNotFoundException e) {
        throw new RuntimeException(e);
      }
      return DriverManager.getConnection(url, user, password);
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }
}
