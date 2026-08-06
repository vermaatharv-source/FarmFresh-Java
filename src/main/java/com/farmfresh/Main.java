package com.farmfresh;

import com.farmfresh.util.MongoConnection;
import com.mongodb.client.MongoDatabase;

public class Main {
    public static void main(String[] args) {
        MongoDatabase db = MongoConnection.getDatabase();
        System.out.println("Connected to database: " + db.getName());
    }
}