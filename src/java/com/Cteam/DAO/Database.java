package com.Cteam.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {

    private static final String Driver = "com.mysql.cj.jdbc.Driver";
    private static final String Url = "jdbc:mysql://ra1.anystream.eu:1011/cteam?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String Username = "cteam";
    private static final String Password = "cteam";
    private static Connection connection = null;
    // create a JDBCSingleton class.  
    //static member holds only one instance of the JDBCSingleton class.
    private static Database db;
//JDBCSingleton prevents the instantiation from any other class.  

    private Database() {
    }

    //Now we are providing gloabal point of access.
    public static Database getInstance() {
        if (db == null) {
            db = new Database();
        }
        return db;
    }

    public static Connection getConnection() {

        try {
            Class.forName(Driver);
            connection = DriverManager.getConnection(Url, Username, Password);
            System.out.println("You are connected!!");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("You are not connected");
        }
        return connection;

    }
}
