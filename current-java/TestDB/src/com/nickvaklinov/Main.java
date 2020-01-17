package com.nickvaklinov;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/nikolayvaklinov/Desktop/Music/GitHub_Projects/Java_Programming_Masterclass/current-java/TestDB/testjava.db");
            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE contacts (name TEXT, phone INTEGER, email TEXT)");
        }catch (SQLException e){
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
