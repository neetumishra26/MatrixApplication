<!DOCTYPE html>
<html>
<head>
    <title><g:layoutTitle default="Grails"/></title>
    <link rel="shortcut icon" href="${resource(dir: 'images', file: 'pairing.jpg')}" type="image/x-icon"/>
    %{--<link rel="stylesheet" href="${resource(dir: 'css', file: 'main.css')}"/>--}%
    <style type="text/css">

    body {
        margin: 10px;
        padding: 0;
        height: 100%;
        width: 100%;
        font-family: 'Lucida Grande', Helvetica, Arial;
    }

    a, a:hover, a:visited {
        text-decoration: none;
        cursor: pointer;

    }

    img, h6 {
        text-align: center;
        vertical-align: middle;

    }

    #header {
        height: 100px;
        width: 100%;
        border-bottom: 1px solid;
        padding: 5px;
    }

    #logo {
        height: 100px;
        float: left;
        clear: right;
    }

    #blank{
        height: 20px;
        float: left;
        width: 80%;
    }

    #banner {
        height: 100px;
        width: 80%;
        float: right;
        vertical-align: middle;
    }

    #content-wrapper {
        height: 800px;
        width: 100%;
    }

    #sidebar {
        height: 800px;
        width: 10%;
        float: left;
        clear: right;
        margin: 40px;
        line-height: 150%;
    }

    #main-content {
        height: 800px;
        width: 75%;
        float: left;
        border-left: 1px solid;
        margin: 0px;
    }

    #footer {
        height: 60px;
        width: 100%;
        border-top: 1px solid;
        border-bottom: 1px solid;
        background-color: #EBEBEB;
    }
    </style>
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
    <div id="logo"><img src="images/pairing.jpg"/></div>
    <div id="blank"></div>
    <div id="Banner">
        <img src="images/logo.jpg" />
    </div>
</div>

<div id="content-wrapper">
    <div id="sidebar">
        <g:link controller="matrix" action="show" name="showMatrix">Show Matrix</g:link>
        <br/>
        <g:link controller="user" action="show" name="showUser">Show User</g:link>
        <br/>
        <g:link controller="user" action="save" name="createNewUser">Add User</g:link>
        <br/>
        <g:link controller="matrix" action="save" name="createNewPairing">Add Pairing</g:link>
        <br/>
    </div>

    <div id="main-content"><g:layoutBody/></div>
</div>

<div id="footer">
    <h6>Made By NEETU MISHRA</h6>
</div>
</body>
</html>
