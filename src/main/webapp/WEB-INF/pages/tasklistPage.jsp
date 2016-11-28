<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html"; charset="UTF-8">
		 	<meta name="viewport" content="width=device-width, initial-scale=1">
		 	<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
		 	<link rel="stylesheet" type="text/css" href="//fonts.googleapis.com/css?family=Lato" />
		 	<title>My tasks</title>
		 	<link rel="stylesheet" type="text/css" href="../css/styles.css">
</head>
    <body>

    <a href="/home"> <input type="submit" value="back"> </a>

    <br>

    Task list name: &nbsp ${taskList.getName()}
    <br>
    <br>
        Active tasks:
    <br>
    <c:forEach items="${isActive}" var="item">

      ${item.getName()}

        <a href="/delete?taskId=${item.getId()}"> <input type="submit" value="delete"> </a> &nbsp
        <a href="/isActive?taskId=${item.getId()}"> <input type="submit" value="Mark as done"> </a>
        <br>

        <br>

    </c:forEach>

    <br>
    <br>
        Done tasks:
    <br>
    <c:forEach items="${isDone}" var="item">

         ${item.getName()}
<br>
        <a href="/delete?taskId=${item.getId()}"> <input type="submit" value="remove"> </a> &nbsp
        <a href="/isActive?taskId=${item.getId()}"> <input type="submit" value="Return to active"> </a>
        <br>

        <br>
        <br>

    </c:forEach>


    </body>
</html>