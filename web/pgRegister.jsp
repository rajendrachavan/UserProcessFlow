<%-- 
    Document   : pgRegister
    Created on : 2 Aug, 2019, 4:58:41 PM
    Author     : webwerks
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="pgCPStyle.css">
        <title>JSP Page</title>
    </head>
    <body>
        <div><center>
            <h3>
                <span class="title">Regist</span><span class="title1">ration</span>
            </h3>
            </center>
        </div>
        <div>
            <center>
                <div id="table">
                    <form action="processRegister" method="post">
                <table border="0">
                    
                <tr>
                <td><input type="text" name="username" placeholder="Enter your name & surname." autofocus required/> 
                </tr>
                <tr>
                    <td><center>
                        <input type="date" name="dob"/>
                    </center>
                    </td>
                </tr>
                <tr>
                    <td id = "gender">Gender:</td>
                </tr>    
                <tr>
                    <th id = "gender"><input type="radio" name="genderValue" value="male" checked>Male <br></th>
                </tr>
                <tr>
                    <th id = "gender">&nbsp;&nbsp;<input type="radio" name="genderValue" value="female" >Female <br></th>
                </tr>
                <tr>
                    <th id = "gender">&nbsp;<input type="radio" name="genderValue" value="other" >Other <br></th>
                </tr>
             
                <tr>
                    <td><input type="number" name="mobno" placeholder="Enter your mobile No." required/></td>
                </tr>
                <tr>
                    <td><input type="email" name="emailid" placeholder="Enter your e-mail id." required/></td>
                </tr>
                
                <tr>
                    <td><input type="password" name="passwd" placeholder="Create Password." pattern=".{8,}" required title="minimum 8 characters."/></td>    
                </tr>
                <tr>
                    <td><input type="password" name="passwd1" placeholder="Confirm Password." required/></td>    
                </tr>
               
                <tr>
                    <td>
                    <span><button class="button1" >Register</button></span>
                    <span><button class="button1" type="reset" value="reset">Clear</button></span>
                    </td>
                </tr>    
                </table>
                <div class="txt">
                    Already a User? <button class="button1" onclick="location.href = 'pgLogin.jsp';">Login</button>
                </div>
                </form>
                </div>
            </center>
        </div>
    </body>
</html>
