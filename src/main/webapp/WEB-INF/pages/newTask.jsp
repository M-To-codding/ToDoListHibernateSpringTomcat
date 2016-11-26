<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>

</head>
<body>
<a href="/home"> <input type="submit" value="back"> </a>

<form action="/newTaskAdder">

    <input type="text" name="task_name" placeholder="enter name" required>
    <br>

    <select name="task_list">
        <c:forEach items="${taskLists}" var="item">

            <option value="${item.getId()}"> ${item.getName()}  </option>

        </c:forEach>
    </select>

    <input type="submit" value="Add Task">
    <br>

</form>

</body>
</html>