/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author informatica
 */
public class User {
    private int idteachers;
    private String email;
    private String first_name;
    private String last_name;
    private String speciality;
    private String telephone;

    public User(int idteachers, String first_name, String last_name, String email, String speciality, String telephone) {
        
        this.idteachers= idteachers;
        this.first_name= first_name;
        this.last_name = last_name;
        this.email = email;
        this.speciality= speciality;
        this.telephone = telephone;
        
    }
    public static ResultSet User() throws ClassNotFoundException, SQLException {
         
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetc","root","");
        Statement stmt = con.createStatement();
        ResultSet result = stmt.executeQuery("select * from teachers"); 
        return result;
    }
    public static ResultSet User(int idteachers) throws ClassNotFoundException, SQLException {
         
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetc","root","");
        Statement stmt = con.createStatement();
        ResultSet result = stmt.executeQuery("select * from teachers where idteachers='"+idteachers+"'"); 
        return result;
    }
    User() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdteachers() {
        return idteachers;
    }

    public void setIdteachers(int idteachers) {
        this.idteachers = idteachers;
    }

    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }


   
}

