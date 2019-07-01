<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Login form</h1>
      <div>
            <form action="Login" method="post">
                  <table>
                        <tr>
                              <td>Name :</td>
                 <td><input type="text" name="userName" />                                  </td>
                        </tr>
                        <tr>
                              <td>Password :</td>
                <td><input type="password" name="userPass"/></td>
                        </tr>
                        <tr>
                 <td><input type="submit" value="login" /></td>
                        </tr>
                  </table>
            </form>
      </div>
</body>
</html>