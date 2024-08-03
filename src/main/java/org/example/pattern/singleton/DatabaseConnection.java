package org.example.pattern.singleton;

/**
 * Bill Pugh Solution for Singleton Class.
 */
public class DatabaseConnection {

    private DatabaseConnection() {
    }

    private static class DatabaseConnectionHelper {
        private static final DatabaseConnection DATABASE_INSTANCE = new DatabaseConnection();
    }

    public static DatabaseConnection getDatabaseConnection() {
        return DatabaseConnectionHelper.DATABASE_INSTANCE;
    }
}
