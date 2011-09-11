<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Users</title>
    <meta name="layout" content="main"/>
</head>

<body>
<table>
    <tr><td>Name</td></tr>
    <g:each in="${userList}" var="user">
        <tr>
            <td class="user-name"><%=user.name%></td>
        </tr>
    </g:each>
</table>
</body>
</html>