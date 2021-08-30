/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author USER
 */
public class Student {
    private int idstudents;
    private String email;
    private String first_name;
    private String last_name;
    private String groupe;
    private String level;
    private String photo;

    public Student(int idstudents, String email, String first_name, String last_name, String groupe, String level, String photo) {
        this.idstudents = idstudents;
        this.email = email;
        this.first_name = first_name;
        this.last_name = last_name;
        this.groupe = groupe;
        this.level = level;
        this.photo = photo;
    }
    public static ResultSet Student(int idstudents) throws ClassNotFoundException, SQLException {
         
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetc","root","");
        Statement stmt = con.createStatement();
        ResultSet result = stmt.executeQuery("select * from students where idstudents='"+idstudents+"'"); 
        return result;
    }
    public static ResultSet Student() throws ClassNotFoundException, SQLException {
         
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetc","root","");
        Statement stmt = con.createStatement();
        ResultSet result = stmt.executeQuery("select * from students"); 
        return result;
    }

    public int getIdstudents() {
        return idstudents;
    }

    public void setIdstudents(int idstudents) {
        this.idstudents = idstudents;
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

    public String getGroupe() {
        return groupe;
    }

    public void setGroupe(String groupe) {
        this.groupe = groupe;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
    
}
