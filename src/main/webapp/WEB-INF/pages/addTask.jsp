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
<div class="addTasks">
<a href="/home"> <input type="submit" value="back"> </a>
<<<<<<< HEAD

<form action="/addTask" method="post">
    <input type="text" name="name" placeholder="Add your task" required>
   Select your task list : <select name="listId">
=======
<form action="/addTask" method="post">
    <input type="text" name="title" placeholder="Add task" required>
    Enter task list : <select name="listId">
>>>>>>> origin/newBranch
    <c:forEach items="${lists}" var="taskList">
        <option value="${taskList.id}">${taskList.name}</option>
    </c:forEach>
    </select><br>
<<<<<<< HEAD

    <input type="submit" value="Add Task"><br>
</form>
    <br></div>

</form>

=======
    <input type="submit" value="Add Task"><br></div>
</form>
</div>
>>>>>>> origin/newBranch
</body>
</html>