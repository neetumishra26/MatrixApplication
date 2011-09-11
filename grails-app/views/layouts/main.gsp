<!DOCTYPE html>
<html>
<head>
    <title><g:layoutTitle default="Grails"/></title>
    <link rel="shortcut icon" href="${resource(dir: 'images', file: 'pairing.jpg')}" type="image/x-icon"/>
    <link rel="stylesheet" href="${resource(dir: 'css', file: 'main.css')}"/>
    <g:javascript library="jquery" />
    <g:layoutHead/>
</head>

<body>
%{--<g:if test="${flash.error}">--}%
%{--<div id="errorMessage"><span class="flash-message">${flash.error}</span></div>--}%
%{--</g:if>--}%
%{--<g:if test="${flash.message}">--}%
%{--<div id="status"><span class="flash-message">${flash.message}</span></div>--}%
%{--</g:if>--}%
<div id="header">
    <div id="logo"><img src="pairing.jpg"/></div>
    <div id="blank"></div>
    <div id="Banner">
        <img src="logo.jpg" />
    </div>
</div>

<div id="content-wrapper">
    <div id="sidebar">
        <g:link controller="person" action="create" name="createNewUser">Create User</g:link>
        <br/>
        <g:link controller="person" action="show" name="showUser">Show User</g:link>
        <br/>
        <g:link controller="matrix" action="index" name="showMatrix">Show Matrix</g:link>
        <br/>
        <g:link controller="matrix" action="create" name="createNewPairing">Add Pairing</g:link>
        <br/>
    </div>

    <div id="main-content"><g:layoutBody/></div>
</div>

<div id="footer">
    <h6>Made By NEETU MISHRA</h6>
</div>
</body>
</html>
