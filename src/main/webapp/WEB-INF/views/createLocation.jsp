<%@ page language="java" contentType="text/html; ISO-8859-1" pageEncoding="UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html">
    <title>Create Location</title>
</head>
<body>
<form action="saveLoc" method="post">
    <pre>
    ID: <input type="text" name="id"/>
    Code: <input type="text" name="code"/>
    Name: <input type="text" name="name"/>
    Type: Urban <input type="radio" name="type" value="urban"/>
        Rural: <input type="radio" name="type" value="rural"/>
    <input type="submit" value="Save"/>
    </pre>
</form>
${msg}

<a href="displaylocation"> view all</a>
</body>
</html>