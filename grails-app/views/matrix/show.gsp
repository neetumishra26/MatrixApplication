<html>
  <head>
      <title>Show Matrix</title>
      <meta name="layout" content="main"/>
  </head>

  <body>
  <h4>Matrix:</h4>
  <br>


  <table style="width:400;" id="all-user-table ">
    <thead>
    <tr>
        <th>All User</th>
    </tr>
    </thead>
    <tbody>
    <g:each in="${allUser}" var="userOne">
        <g:each in="${allUser}" var="userTwo">
        <tr>
            <td><%=userOne.name%></td>
            <td><%=userTwo.name%></td>
        </tr>
        </g:each>
    </g:each>


    </tbody>
</table>

  <table style="width:400">
    <thead>
    <tr>
        <th>User 1</th>
        <th>User 2</th>
    </tr>
    </thead>
    <tbody>
    <g:each in="${allPairing}" var="users">
        <tr>
            <td><%=users.personOne.name%></td>
            <td><%=users.personTwo.name%></td>
        </tr>
    </g:each>
    </tbody>
</table>
  </body>
</html>