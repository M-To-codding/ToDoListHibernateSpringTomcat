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
<div class="activeTasks options">
	<a href="/home"> <input type="submit" value="back"> </a>
    <h2>Task Lists</h2>
        <ul>
            <c:forEach items="${taskLists}" var="taskList">
             <li>
                ${taskList.getName()}
                <form action="/deleteTasklist" method="post">
                    <input type="hidden" name="taskListId" value="${taskList.id}">
                    <input type="submit" value="delete">
                </form>
             </li>
            </c:forEach>
        <form action="/addTasklist" method="post">
            <input type="text" name="name" placeholder="List name" required><br>
            <input type="submit" value="Add List"><br>
        </form>
</div>


</body>
</html>

