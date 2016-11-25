   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
</body>
<h1>Task List</h1>
<table>
<tr>
 <th>Id</th>
 <th>Status</th>
 <th>Title</th>
 <th>Description</th></tr>
   <c:forEach var="task" items="${taskList}">
     <tr>
       <td>${task.idTask}</td>
       <td>${task.isActive}</td>
       <td>${task.taskName}</td>
    </tr>
   </c:forEach>
</table>
</html>