package com.farmfresh.util;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class MongoConnection {
    private static MongoClient client;
    private static MongoDatabase database;

    public static MongoDatabase getDatabase() {
        if (client == null) {
            String connectionString = System.getenv("MONGO_URI");
            client = MongoClients.create(connectionString);
            database = client.getDatabase("farmfresh_java");
        }
        return database;
    }
}