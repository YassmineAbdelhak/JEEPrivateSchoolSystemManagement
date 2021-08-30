package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Login Form</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css\" />\n");
      out.write("        <style>\n");
      out.write("            *{\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                text-decoration: none;\n");
      out.write("                font-family: 'Molle' ,cursive;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                min-height: 100vh;\n");
      out.write("                background: url('photo.jpg') no-repeat;\n");
      out.write("                background-size: cover;\n");
      out.write("           \n");
      out.write("            }\n");
      out.write("            .LoginForm{\n");
      out.write("                width: 360px;\n");
      out.write("                height: 650px;\n");
      out.write("                padding: 80px 40px;\n");
      out.write("                background: #18011cbf;\n");
      out.write("                left: 50%;\n");
      out.write("                top: 50%;\n");
      out.write("                position: fixed;\n");
      out.write("                text-align: center;\n");
      out.write("                transform: translate(-50%,-50%);\n");
      out.write("            }\n");
      out.write("            .LoginForm h1{\n");
      out.write("                margin-bottom: 70px;\n");
      out.write("                color: #f4f4f4;   \n");
      out.write("            }\n");
      out.write("            .InputDiv {\n");
      out.write("                position: relative;\n");
      out.write("                margin: 30px 0;\n");
      out.write("                display: block;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            .InputDiv::after{\n");
      out.write("                content: '';\n");
      out.write("                position: absolute;\n");
      out.write("                top: 40px;\n");
      out.write("                right: 30px;\n");
      out.write("                width: 80%;\n");
      out.write("                height: 1px;\n");
      out.write("                transition: .5s;\n");
      out.write("                background-color: white;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            .InputDiv i{\n");
      out.write("                display: inline;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            .InputDiv input{\n");
      out.write("                display: inline;\n");
      out.write("                font-size: 15px;\n");
      out.write("                color: white;\n");
      out.write("                border: none;\n");
      out.write("                width: 70%;\n");
      out.write("                outline: none;\n");
      out.write("                background: none;\n");
      out.write("                padding: 0 0;\n");
      out.write("                height: 40px;\n");
      out.write("            }\n");
      out.write("            span::before{\n");
      out.write("                content: attr(data-placeholder);\n");
      out.write("                position: absolute;\n");
      out.write("                color: #adadad;\n");
      out.write("                transform: translateY(-80%);\n");
      out.write("                z-index: -1;\n");
      out.write("                transition: .5s;\n");
      out.write("                top: 26px;\n");
      out.write("                right: 45px;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("            span::after{\n");
      out.write("                content: '';\n");
      out.write("                position: absolute;\n");
      out.write("                top: 40px;\n");
      out.write("                right: 30px;\n");
      out.write("                width: 0%;\n");
      out.write("                height: 1px;\n");
      out.write("                transition: all .5s ease-in-out;\n");
      out.write("                background: linear-gardient(120deg,#ff015f,#9863ae);\n");
      out.write("            }\n");
      out.write("            .btnlogin{\n");
      out.write("                width: 70%;\n");
      out.write("                height: 50px;\n");
      out.write("                margin: 40px 0;\n");
      out.write("                border: none;\n");
      out.write("                background-color: crimson;\n");
      out.write("                border-radius: 50px;\n");
      out.write("                color: #fff;\n");
      out.write("                outline: none;\n");
      out.write("                cursor: pointer;\n");
      out.write("                transition: .8s;\n");
      out.write("                font-size: larger;\n");
      out.write("            }\n");
      out.write("            .btnlogin:hover{\n");
      out.write("                transition: .5s;\n");
      out.write("                background-color: #bf0780;\n");
      out.write("            }\n");
      out.write("            .BottomForm p{\n");
      out.write("                font-size: 11px;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            .BottomForm a{\n");
      out.write("                font-size: 15px;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            .focus + span::before{\n");
      out.write("                top: -5px;\n");
      out.write("            }\n");
      out.write("            .focus + span::after{\n");
      out.write("                z-index: 1;\n");
      out.write("                width: 80%;\n");
      out.write("            }\n");
      out.write("            .error {\n");
      out.write("  color: #fff;\n");
      out.write("  padding: 8px;\n");
      out.write("  margin: 6px 0 12px 0;\n");
      out.write("  background: #f15c41;\n");
      out.write("  text-align: left;\n");
      out.write("}\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <form action=\"connexionUser\" method=\"post\" class=\"LoginForm\">\n");
      out.write("            <h1> Sign Up !</h1>\n");
      out.write("            ");
 if (request.getAttribute("error") != null ) { 
      out.write("\n");
      out.write("                    <div class='error'>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                  ");
 } 
      out.write("\n");
      out.write("            <div class=\"InputDiv\">\n");
      out.write("                <i class=\"fas fa-user\"></i>\n");
      out.write("                <input type=\"email\" name=\"email\" required=\"required\" />\n");
      out.write("                <span data-placeholder=\"Email\"></span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"InputDiv\">\n");
      out.write("                <i class=\"fas fa-user\"></i>\n");
      out.write("                <input type=\"text\" name=\"username\" required=\"required\" />\n");
      out.write("                <span data-placeholder=\"Username\"></span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"InputDiv\">\n");
      out.write("                <i class=\"fas fa-lock\"></i>\n");
      out.write("                <input type=\"password\" name=\"pwd\" required=\"required\"/>\n");
      out.write("                <span data-placeholder=\"Password\"></span>\n");
      out.write("            </div>\n");
      out.write("            <input type=\"submit\" class=\"btnlogin\" value=\"Sign Up\" />\n");
      out.write("            <div class=\"BottomForm\">\n");
      out.write("                <p> You have an account? </p>\n");
      out.write("                <a href=\"#\"> login </a>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!--begin js file -->\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js\"> </script>\n");
      out.write("        <script>\n");
      out.write("            $(\".InputDiv input\").on(\"focus\",function(){\n");
      out.write("                $(this).addClass(\"focus\");\n");
      out.write("            });\n");
      out.write("            $(\".InputDiv input\").on(\"blur\",function(){\n");
      out.write("               if($(this).val()==\"\")\n");
      out.write("               $(this).removeClass(\"focus\");\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
