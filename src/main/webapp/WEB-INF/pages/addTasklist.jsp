<<<<<<< HEAD
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
=======
>>>>>>> origin/newBranch
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
<<<<<<< HEAD
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

=======

<form action="/addTasklist" method="post">
<a href="/home"><input type="submit" value="Back"></a>
    <input type="text" name="title" placeholder="List name" required><br>
    <input type="submit" value="Add List"><br>
</form>
   <div class="list-type6 addTasks menu">    <h2>Task Lists</h2>
       <c:forEach items="${taskLists}" var="taskList">
       <a id="linkList${taskList.id}" href="/home/${taskList.id}">
         <input id="linkListValue${taskList.id}" type="button" value="${taskList.listName}" style="background: none; border: none">
           </a>
        <input id="editList${taskList.id}" type="text" value="${taskList.listName}"
          style="display: none">
            <i id="editIcon${taskList.id}" onclick="viewTaskListEdit(${taskList.id})"
            aria-hidden="true"></i>
            <i id="saveIcon${taskList.id}" onclick="saveTaskList(${taskList.id})"
            aria-hidden="true"></i>
            <a href="" onclick="deleteTaskList(${taskList.id})">
                    delete
                </a>
        </c:forEach>
</div>
</body>
</html>
>>>>>>> origin/newBranch
