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
<<<<<<< HEAD
<div class="menu list-type6">
              <input type="submit" value="Add task" onclick="window.location='/addTask'">
              <br></div>
              <div class="menu forTaskButton list-type6"><input type="submit" value="Add task list" onclick="window.location='/addTasklist'"><br>
              </div><div class="activeTasks options">
                    	<select name="listId" onchange="window.location = '/home/' + this.value;">
                                <option value="0">Select list</option>
                                <c:forEach items="${taskLists}" var="taskList">
                                    <option value="${taskList.id}"
                                    <c:if test="${taskList.id == listId}">selected</c:if> >${taskList.name}</option>
                                </c:forEach>
                            </select>
                            <a href="" onclick="deleteList(${taskList.id})" ><input type="submit" value="Delete"></a>
                            </div>
                            <c:if test="${activeTasks.size() != 0}">
             <div class="activeTasks"> <h2>Active Tasks</h2>
              <c:forEach items="${activeTasks}" var="task">
              <br>
              ${task.name}
              <br>
              <c:if test="${task.isActive}">
              <br>
              <div title="close task">
              <a href="" onclick="switchTaskActivity (${task.id}, ${task.isActive})">
              <input type="submit" value="Mark as done">
              </a>
              </c:if>
            </a>
            </div>
             <a href="" onclick="delete(${task.id})">
             <input type="submit" value="delete">
             </a>
             </c:forEach>
        </c:if></div>

       <div class="doneTasks"> <c:if test="${doneTasks.size() != 0}">
                <h2>Done Tasks</h2>
             <c:forEach items="${doneTasks}" var="task">
             <br>
                   ${task.name}
                   <c:if test="${!task.isActive()}">
                   <br>
                 <div title="reopen task">
                <a href="" onclick="switchTaskActivity(${task.id}, ${!task.isActive()})">
                 <input type="submit" value="add to active">
                 </a>

              </c:if>
           <a href="" onclick="delete(${task.id})">
              <input type="submit" value="delete">
              </a>
           </c:forEach>
        </c:if>
</div>
</body>
</html>
=======
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
>>>>>>> origin/newBranch
