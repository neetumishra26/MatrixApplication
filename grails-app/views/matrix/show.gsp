<html>
<head>
    <title>Show Matrix</title>
    <meta name="layout" content="main"/>
</head>

<body>

<h4>All Pairings:</h4>
<br>
<table style="width:400;" id="all-user-table ">
    <thead>
    <tr>
        <th>User1</th>
        <th>User2</th>
    </tr>
    </thead>
    <tbody>
    <g:each in="${allPairing}" var="pair">
        <tr>
            <td><%=pair.personOne.name%></td>
            <td><%=pair.personTwo.name%></td>
        </tr>
    </g:each>
    </tbody>
</table>

<br>
<br>
<h4>Pairing Matrix:</h4>
<br>
<table style="width:400">
    <g:each in="${allUser}" var="usersCol" status="i">
        <tr>
            <g:if test="${i == 0}">
                <td></td>
                <g:each in="${allUser}" var="usersRow">
                    <td><%=usersRow.name%></td>
                </g:each>
            </g:if>
        </tr>
        <tr><td colspan="4"><%=usersCol.name%></td></tr>
    </g:each>
</table>

<g:each in="${pairingMatrix}" var="number">
    <%=number%>
</g:each>

</body>
</html>