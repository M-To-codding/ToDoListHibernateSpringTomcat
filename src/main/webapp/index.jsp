<%@ page language="java" %>
	<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<html>
	<head>
	    <meta http-equiv="Content-Type" content="text/html"; charset="UTF-8">
	    <title>Your user tasks</title>
	    <style type="text/css">
	body {
	    background-image: url('http://crunchify.com/bg.png');
	}
	</style>
  </head>
  <body>
	<div align="center" style = "margin-top:400px;">
	    <form action="/AddTasksServlet" method="get">
	        <input type="text" name="task">
	        <br>
	        <input type="submit" value="Add task">
	     </form>
   </div>
 </body>
</html>