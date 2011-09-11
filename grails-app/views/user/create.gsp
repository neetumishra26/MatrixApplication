<%@ page contentType="text/html;charset=UTF-8" %>
<html>
  <head>
      <title>Create User</title>
      <meta name="layout" content="main" />
  </head>
  <body>
     <g:form action="create" method="POST">
         <label>User Name</label>
         <g:textField name="userName" id="user-name" />
         <br>
         <br>
         <button id="user-save">save</button>
         <button id="user-cancel">cancel</button>
     </g:form>
  </body>
</html>