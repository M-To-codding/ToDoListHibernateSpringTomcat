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

<form action="/addNewTask">

<<<<<<< HEAD
 <input type="hidden" name="listId" value="${taskList.getId()}">
       <input type="text" name="taskName" placeholder="task name" required>
        <!--  <input type="date" name="taskDate" placeholder="enter date" required> -->
          <br>


    <select name="taskList">
        <c:forEach items="${taskLists}" var="item">
            <option value="${item.getId()}"> ${item.getName()}  </option>
=======
    <input type="text" name="task_name" placeholder="enter title" required>
    <br>
    <textarea name ="task_description" rows="10" cols="50"></textarea>
    <br>
    <input type="date" name="task_date" placeholder="enter date" required>
    <br>


    <select name="task_list">
        <c:forEach items="${taskLists}" var="item">

            <option value="${item.getId()}"> ${item.getName()}  </option>

>>>>>>> e09f6f9e886a956cd1891eeeeddf593e3c62f016
        </c:forEach>
    </select>

    <input type="submit" value="Add Task">
    <br>

</form>

</body>
</html>