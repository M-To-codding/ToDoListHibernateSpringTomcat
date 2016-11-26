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

&nbsp &nbsp

<br>

Tasklist: &nbsp  ${tasklist.getName()}
<br>
<br>
Tasks to do:
<br>
<c:forEach items="${toDoTasks}" var="item">

    &nbsp <label style="color: brown"> ${item.getName()} </label> &nbsp ${item.getDueDate()}

    <a href="/taskRemover?taskId=${item.getId()}"> <input type="submit" value="remove"> </a> &nbsp
    <a href="/marker?taskId=${item.getId()}"> <input type="submit" value="mark as done"> </a>
    <br>
    &nbsp ${item.getDescription()}
    <br>
    <br>

</c:forEach>
<br>
<br>
Completed tasks:
<br>
<c:forEach items="${completedTasks}" var="item">

    &nbsp <label style="color: green"> ${item.getName()} </label> &nbsp
    <a href="/taskRemover?taskId=${item.getId()}"> <input type="submit" value="remove"> </a> &nbsp
    <a href="/marker?taskId=${item.getId()}"> <input type="submit" value="mark as undone"> </a>
    <br>
    &nbsp ${item.getDescription()}
    <br>
    <br>

</c:forEach>
<br>
<br>

<a href="/listRemover?taskListId=${tasklist.getId()}"> <input type="submit" value="Remove list ${tasklist.getName()}"> </a>

</body>
</html>