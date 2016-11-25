   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
</body>
<h2>Add task</h2>
  <form:form method="POST" action="/save">
      <table>
       <tr>
           <td>Task name:</td>
           <td><input type="text" name="name"></td>
       </tr>
       <tr>
            <td><input type="submit" value="Submit"/></td>
       </tr>
   </table>
  </form:form>
  </html>