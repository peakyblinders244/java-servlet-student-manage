package dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

/**
 * Le-Hong-Quan
 * Date: 14/04/2023
 * Time: 07:58
 */
public class BaseDao {
    protected Logger logger;
    protected String url = "jdbc:postgresql://localhost:5432/student-management";
    protected String user = "postgres";
    protected String password = "postgres";

    public Connection open() throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        return DriverManager.getConnection(url, user, password);
    }

    public Logger getLogger() {
        if (logger == null) {
            logger = Logger.getLogger(this.getClass().getName());
        }
        return logger;
    }
}
