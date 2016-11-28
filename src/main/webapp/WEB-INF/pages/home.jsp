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
	<div  class ="list-type6 menu">
		<input type="submit" value="Add taskList" onclick="window.location='/addTasklist'">&nbsp&nbsp</div>
		<div class = "list-type6 menu forTaskButton"><input type="submit"  value="Add task" onclick="window.location='/addTask'"></div>

		<br>
		<h2 align = "center"> Tasklists: </h2>
		<br>
		<c:forEach items="${taskLists}" var="item">
		${item.getName()}
		&nbsp <a href="/tasklistPage?taskListId=${item.getId()}"> View tasks </a>

		<form action="/delete" method="post">
			<button type="submit" name = "listId" value="${item.getId()}">delete</button>
			<br>
		</form>

	</c:forEach>

</body>
</html>