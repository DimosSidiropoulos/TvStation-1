package dbms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Db_connect {
	static String     driverClassName = "org.postgresql.Driver" ;
    static String     url = "jdbc:postgresql://dblabs.it.teithe.gr:5432/it174904" ;
    static Connection dbConnection = null;
    static String     username = "";
    static String     passwd = "";
    static java.sql.Statement statement = null;
    static ResultSet rs = null;
    
    public static void main (String[] args) throws Exception {
    	try {
    		Class.forName (driverClassName);
    		dbConnection = DriverManager.getConnection (url, username, passwd);
    		statement = dbConnection.createStatement();
    	if(dbConnection!=null) {
    		System.out.println("connected");
    	}
    		dbConnection.close();
    	}catch (Exception e){
    		System.out.println(e);
    		
    	}
    }
}
