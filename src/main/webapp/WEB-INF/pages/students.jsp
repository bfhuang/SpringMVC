<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<c:forEach var="student" items="${students}">
    ${student.name},${student.grade}
</c:forEach>
<h1>${myValue}</h1>

</body>
</html>