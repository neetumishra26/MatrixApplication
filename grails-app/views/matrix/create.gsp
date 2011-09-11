<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Add Pairing</title>
    <meta name="layout" content="main"/>
</head>

<body>
<g:form controller="matrix" action="link" method="POST">
    <h4>Enter Pairing Details:</h4>
    <br>
    <label>User 1</label>
    <g:textField name="nameOne"/>
    <br>
    <label>User 2</label>
    <g:textField name="nameTwo"/>
    <br>
    <br>
    <button type="submit" id="pairing-save">save</button>
</g:form>
</body>
</html>