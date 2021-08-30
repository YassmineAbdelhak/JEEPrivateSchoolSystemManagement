<%-- 
    Document   : login
    Created on : Jan 11, 2020, 3:03:48 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title>Login Form</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css" />
        <style>
            *{
                margin: 0;
                padding: 0;
                text-decoration: none;
                font-family: 'Molle' ,cursive;
                box-sizing: border-box;
            }
            body{
                min-height: 100vh;
                background: url('photo.jpg') no-repeat;
                background-size: cover;
           
            }
            .LoginForm{
                width: 360px;
                height: 540px;
                padding: 80px 40px;
                background: #18011cbf;
                left: 50%;
                top: 50%;
                position: fixed;
                text-align: center;
                transform: translate(-50%,-50%);
            }
            .LoginForm h1{
                margin-bottom: 70px;
                color: #f4f4f4;   
            }
            .InputDiv {
                position: relative;
                margin: 30px 0;
                display: block;
                color: white;
            }
            .InputDiv::after{
                content: '';
                position: absolute;
                top: 40px;
                right: 30px;
                width: 80%;
                height: 1px;
                transition: .5s;
                background-color: white;
                
            }
            .InputDiv i{
                display: inline;
                color: white;
            }
            .InputDiv input{
                display: inline;
                font-size: 15px;
                color: white;
                border: none;
                width: 70%;
                outline: none;
                background: none;
                padding: 0 0;
                height: 40px;
            }
            span::before{
                content: attr(data-placeholder);
                position: absolute;
                color: #adadad;
                transform: translateY(-80%);
                z-index: -1;
                transition: .5s;
                top: 26px;
                right: 45px;
                width: 100%;
            }
            span::after{
                content: '';
                position: absolute;
                top: 40px;
                right: 30px;
                width: 0%;
                height: 1px;
                transition: all .5s ease-in-out;
                background: linear-gardient(120deg,#ff015f,#9863ae);
            }
            .btnlogin{
                width: 70%;
                height: 50px;
                margin: 40px 0;
                border: none;
                background-color: crimson;
                border-radius: 50px;
                color: #fff;
                outline: none;
                cursor: pointer;
                transition: .8s;
                font-size: larger;
            }
            .btnlogin:hover{
                transition: .5s;
                background-color: #bf0780;
            }
            .BottomForm p{
                font-size: 11px;
                color: white;
            }
            .BottomForm a{
                font-size: 15px;
                color: white;
            }
            .focus + span::before{
                top: -5px;
            }
            .focus + span::after{
                z-index: 1;
                width: 80%;
            }
            .error {
  color: #fff;
  padding: 8px;
  margin: 6px 0 12px 0;
  background: #f15c41;
  text-align: left;
}
            
        </style>
    </head>
    <body>
        
        <form action="Login" method="post" class="LoginForm">
            <h1> Welcome !</h1>
            <% if (request.getAttribute("error") != null ) { %>
                <div class='error'>${error}</div>
                <% } %>
            <div class="InputDiv">
                <i class="fas fa-user"></i>
                <input type="text" name="username" required="required" />
                <span data-placeholder="Username"></span>
            </div>
            <div class="InputDiv">
                <i class="fas fa-lock"></i>
                <input type="password" name="pwd" required="required"/>
                <span data-placeholder="Password"></span>
            </div>
            <input type="submit" class="btnlogin" value="Login" />
            <div class="BottomForm">
                <p> Don't have an account? </p>
                <a href="signup.jsp"> Sign Up </a>
            </div>
            
        </form>
        
        
        
        <!--begin js file -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"> </script>
        <script>
            $(".InputDiv input").on("focus",function(){
                $(this).addClass("focus");
            });
            $(".InputDiv input").on("blur",function(){
               if($(this).val()=="")
               $(this).removeClass("focus");
            });
        </script>
    </body>
</html>
