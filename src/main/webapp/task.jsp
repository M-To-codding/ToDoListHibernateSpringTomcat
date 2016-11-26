	 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
		 <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
		 <html>
		 <head>
		 	<meta http-equiv="Content-Type" content="text/html"; charset="UTF-8">
		 	<meta name="viewport" content="width=device-width, initial-scale=1">
		 	<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
		 	<link rel="stylesheet" type="text/css" href="//fonts.googleapis.com/css?family=Lato" />
		 	<title>My tasks</title>
		 	<link rel="stylesheet" type="text/css" href="style.css">
		 	<body>
		 	</style>
		 </head>
		 <br>
		 <h1 style = "margin-left: 590px;" style = "font-weight: 200;"> My tasks</h1>
		 <div style = "margin-left: 485px">
		 	<c:if test="${taskActiveList.size() != 0}">

		 	<br>
		 	<div style = "margin-left: 100px;">
		 		<h2>Active tasks</h2>
		 	</div>
		 	<br>

		 	<c:forEach items="${taskActiveList}" var="task">
		 	<div class="list-type6" style = " background-color: #FFE4C4; color: 	#778899;">${task.taskName}
		 		<c:if test="${task.active}">

		 		<a href="/sortedTasks?task=${task.taskNumber}" style = "color: green; margin-left:300px;"><i class="material-icons">done</i></a>
		 		<br>
		 	</c:if>

		 	<a href="/details?task=${task.taskNumber}" style="color: gray; margin-left:400px;">
		 		<i class="material-icons">grade</i>
		 	</a>
		 	<a href="/delete?task=${task.taskNumber}" style="color: red; margin-left:400px;">
		 		<i class="material-icons">delete</i>
		 	</a>
		 </div>
		</c:forEach>
	</c:if>


	<div style = "margin-left: 450px;">
		<c:if test="${taskDoneList.size() != 0}">
	</div>

	<br>
	<div style = "margin-left: 100px;">
		<h2>Done tasks</h2>
	</div>

	<c:forEach items="${taskDoneList}" var="task">
	<div class="list-type6">${task.taskName}
		<c:if test="${!task.active}">
		<br>

		<div title="reopen task">
			<a href="/sortedTasks?task=${task.taskNumber}&active=${!task.active}" style="color: green; margin-left:180px;">
				<i class="material-icons">to list</i>
			</a>
			<br>
		</div>
	</c:if>

	<a href="/details?task=${task.taskNumber}" style="color: gray; margin-left:400px;">
		<i class="material-icons">grade</i>
	</a>
	<a href="/delete?task=${task.taskNumber}" style="color: red; margin-left:400px;">
		<i class="material-icons">delete</i>
	</a>
	</div>
	</c:forEach>
	</c:if>

	<br>
	<br>
	<br>
	<button  style = "margin-left: 350px;" type="submit" value="New task" onclick="window.location='index.jsp'">
		<i class="material-icons">control_point</i>
		&nbsp&nbsp <i>New task</i></button>
	</body>
	</html>
