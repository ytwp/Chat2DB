/**
 * alibaba.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package ai.chat2db.spi.jdbc;

import java.sql.SQLException;

import ai.chat2db.spi.DBManage;
import ai.chat2db.spi.sql.SQLExecutor;

/**
 * @author jipengfei
 * @version : DefaultDBManage.java
 */
public class DefaultDBManage implements DBManage {

    @Override
    public void connectDatabase(String database) {

    }

    @Override
    public void modifyDatabase(String databaseName, String newDatabaseName) {

    }

    @Override
    public void createDatabase(String databaseName) {

    }

    @Override
    public void dropDatabase(String databaseName) {

    }

    @Override
    public void createSchema(String databaseName, String schemaName) {

    }

    @Override
    public void dropSchema(String databaseName, String schemaName) {

    }

    @Override
    public void modifySchema(String databaseName, String schemaName, String newSchemaName) {

    }

    @Override
    public void dropTable(String databaseName, String schemaName, String tableName) {
        String sql = "DROP TABLE "+ tableName ;
        SQLExecutor.getInstance().executeSql(sql, resultSet -> null);
    }
}