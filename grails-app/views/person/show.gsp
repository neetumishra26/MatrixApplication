<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Users</title>
    <meta name="layout" content="main"/>
</head>

<body>
<div style="width: 250px">
    <h4>All User of Matrix Application</h4>
    <br>
    <table>
        <thead>
        <tr>
            <th>User Name</th>
        </tr>
        </thead>
        <tbody>
        <g:each in="${userList}" var="user">
            <tr>
                <td><%=user.name%></td>
            </tr>
        </g:each>
        </tbody>
    </table>
</div>
</body>
</html>