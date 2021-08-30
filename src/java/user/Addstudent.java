/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author informatica
 */
public class Addstudent extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String first_name= request.getParameter("first_name");
        String last_name= request.getParameter("last_name");
        String email= request.getParameter("email");
        String telephone= request.getParameter("telephone");
        String groupe= request.getParameter("groupe");
        String level= request.getParameter("level");
        String photo= request.getParameter("photo");
        String savePath= "images\\"+"\\"+photo;
         try (PrintWriter out = response.getWriter()) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetc","root","");
                Statement stmt = con.createStatement();
                 ResultSet result = stmt.executeQuery("select * from students where email='"+email+"'"); 
                if (result.first() ) {
                    request.setAttribute("error", "Student already exists!");
                    request
                        .getRequestDispatcher("addstudents.jsp")
                        .forward(request, response);
                } else{
                stmt.executeUpdate("insert into students (first_name, last_name, email, telephone, groupe, level, photo) values('"+first_name+"','"+last_name+"','"+email+"','"+telephone+"','"+groupe+"','"+level+"','"+savePath+"')");
                response.sendRedirect("/projetj2ee/students.jsp");
                }
            } catch (SQLException | ClassNotFoundException e) {out.print(e.getMessage());}
        }
      
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
