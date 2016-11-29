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
   <div class="list-type6 menu"><input type="submit" value="Add Task" onclick="window.location='/addTask'"></div>
   <div class="list-type6 menu forTaskButton"><input type="submit" value="Task Lists" onclick="window.location='/addTasklist'"><br></div>
  <c:if test="${taskActiveList.size() != 0}">
        <tr><h2 align="center">Active Tasks</h2></tr>
          <c:forEach items="${taskActiveList}" var="task">
             ${task.name}
             <c:if test="${task.active}">
              <div title="Mark as done"></div>
             <a href="" onclick="switchTaskActivity(${task.id}, ${task.active})">
               Is done
               </c:if>
                   <a href="/details?taskId=${task.id}">
                     return to active list
               <a href="" onclick="deleteTask(${task.id})">
                    delete</a>
               </c:forEach>
              </div>
        </c:if>
        <c:if test="${taskDoneList.size() != 0}">
                <h2 align="center">Done tasks</h2>
                  <c:forEach items="${taskDoneList}" var="task">
                   ${task.name}
                   <c:if test="${!task.isActive}">
                  <div title="reopen task">
                <a href="" onclick="switchTaskActivity(${task.id}, ${task.active})">
           Add to active
        </a>
          </c:if>
       <a href="/details?taskId=${task.id}">
        announcement
          <a href="" onclick="deleteTask(${task.id})">
           delete</a>
            </c:forEach>
            </div>
    </c:if>
</body>
</html>
