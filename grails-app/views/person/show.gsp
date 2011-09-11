<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Users</title>
    <meta name="layout" content="main"/>
</head>

<body>
<table id="user-list">
    <thead>
    <tr>
        <th>User Id</th>
        <th>User Name</th>
    </tr>
    </thead>
    <tbody>
    <g:each in="${userList}" var="user">
        <tr>
            <td><%=user.id%></td>
            <td><%=user.name%></td>
        </tr>
    </g:each>
    </tbody>
</table>
</body>
</html>