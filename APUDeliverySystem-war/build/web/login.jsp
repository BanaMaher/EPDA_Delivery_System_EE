<%-- 
    Document   : login
    Created on : Mar 2, 2022, 10:56:36 AM
    Author     : banamaher
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>

    </head>
    <body class="p-5">
        
        <jsp:include page="nav.jsp"/>

        <a href="signup.jsp" class="badge badge-primary">REGISTER HERE</a>


        <br><br><br>
        <form action="Login" method="POST">

            <div class="form-group">
                <label for="exampleInputEmail1">Email address</label>
                <input name="email" type="email" class="form-control" id="usernameInput" aria-describedby="emailHelp" placeholder="Enter email">
            </div>
            
            <div class="form-group">
                <label for="exampleInputPassword1">Password</label>
                <input name="pswd" type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
            </div>
           

            <button type="submit" class="btn btn-success">LogIn</button>


        </form>

    </body>
</html>
