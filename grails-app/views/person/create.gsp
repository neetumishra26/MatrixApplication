<%@ page contentType="text/html;charset=UTF-8" %>
<html>
  <head>
      <title>Create User</title>
      <meta name="layout" content="main" />
  </head>
  <body>
     <g:form controller="person" action="save" method="POST">
         <h4>Enter User Details:</h4>
         <br>
         <label>User Name</label>
         <g:textField name="name" id="user-name" />
         <br>
         <br>
         <button type="submit" id="user-save">save</button>
     </g:form>
  </body>
</html>
