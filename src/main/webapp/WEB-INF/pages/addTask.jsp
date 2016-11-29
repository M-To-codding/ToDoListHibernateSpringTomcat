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

<form action="/addTask" method="post">

<input type="hidden" name="listId" value="${taskList.getId()}">
       <input type="text" name="taskName" placeholder="task name" required>
        <!--  <input type="date" name="taskDate" placeholder="enter date" required> -->
          <br>


    Enter task list name: <select name="listId">
        <c:forEach items="${taskList}" var="taskList">
            <option value="${taskList.getId()}">${taskList.getName()}</option>
        </c:forEach>
        </select><br>

    <input type="submit" value="Add Task">
    <br></div>

</form>

</body>
</html>