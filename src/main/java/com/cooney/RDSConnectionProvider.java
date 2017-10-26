package com.cooney;

import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.SQLException;

@Component("connectionProvide")
public class RDSConnectionProvider implements ConnectionProvider {

    public Connection getConnection() throws SQLException {
        return null;
    }

    public void closeConnection(Connection connection) throws SQLException {

    }

    public boolean supportsAggressiveRelease() {
        return false;
    }

    public boolean isUnwrappableAs(Class aClass) {
        return false;
    }

    public <T> T unwrap(Class<T> aClass) {
        return null;
    }
}
