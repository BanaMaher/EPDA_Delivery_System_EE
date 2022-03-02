<%-- 
    Document   : signup
    Created on : Mar 2, 2022, 10:56:22 AM
    Author     : banamaher
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!--Setting a custom param for servlet to know if it is customer or staff registration-->
<% String servletParam = "customer";
request.setAttribute("userRoleParam",servletParam);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign Up Page</title>
    </head
    <body class="p-5">        
        
        <jsp:include page="nav.jsp"/>
        
           
        <div class="p-5">
            
            <a href="login.jsp" class="badge badge-primary mb-5">LOGIN HERE</a>
            
            <form action="Signup" method="POST">
                <div class="form-group">
                    <label for="exampleInputEmail1">Email address</label>
                    <input name="email" type="email" class="form-control" id="usernameInput" aria-describedby="emailHelp" placeholder="Enter Email">
                </div>

                <div class="form-group">
                    <label for="exampleInputPassword1">Password</label>
                    <input name="pswd" type="password" class="form-control" placeholder="Password">
                </div>

                 <div class="form-group">
                    <label for="exampleInputEmail1">Full Name</label>
                    <input name="fullName" class="form-control" aria-describedby="emailHelp" placeholder="Enter Full Name">
                </div>

                 <div class="form-group">
                    <label for="exampleInputEmail1">Address</label>
                    <input name="address" class="form-control" aria-describedby="emailHelp" placeholder="Enter Address">
                </div>

                <div class="form-group">
                    <label for="exampleInputEmail1">Phone</label>
                    <input name="phone" type="number" class="form-control" aria-describedby="emailHelp" placeholder="Enter Phone">
                </div>

                <div class="form-group">
                    <label for="exampleInputEmail1">IC Number</label>
                    <input name="ic" type="number" class="form-control" aria-describedby="emailHelp" placeholder="Enter IC Number">
                </div>


                <button type="submit" class="btn btn-success">Submit</button>


            </form>
        </div>
        
    </body>
</html>
