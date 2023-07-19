package com.github.pelenthium.spring.dialect;

import org.springframework.data.jdbc.repository.config.DialectResolver;
import org.springframework.data.relational.core.dialect.Dialect;
import org.springframework.jdbc.core.ConnectionCallback;
import org.springframework.jdbc.core.JdbcOperations;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.util.Optional;

/**
 * SPI to extend Spring's default JDBC Dialect discovery mechanism.
 * This is implementation to provide dialect for ClickHouse database
 *
 * @author Sergei Lugovoi
 * @see org.springframework.data.jdbc.repository.config.DialectResolver
 */
public class ClickhouseDialectResolver implements DialectResolver.JdbcDialectProvider {

    @Override
    public Optional<Dialect> getDialect(JdbcOperations operations) {
        return Optional.ofNullable(operations.execute((ConnectionCallback<Dialect>) this::getDialect));
    }

    private Dialect getDialect(Connection connection) throws SQLException {
        DatabaseMetaData metaData = connection.getMetaData();
        String name = metaData.getDatabaseProductName().toLowerCase();
        if (name.contains("clickhouse")) {
            return ClickhouseDialect.INSTANCE;
        }
        return null;
    }
}
