<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Vacancy ${requestScope.vacancy.position}</title>
</head>
<body>
    <h2>Vacancy Info</h2>
    <p>${requestScope.vacancy.vacancyId}</p>
    <p>${requestScope.vacancy.dateTime}</p>
    <p>${requestScope.vacancy.position}</p>
    <p>${requestScope.vacancy.experience}</p>
    <p>${requestScope.vacancy.salary}</p>
    <p>${requestScope.vacancy.info}</p>
<br>
    <a href="${pageContext.request.contextPath}/controller?command=vapps&id=${requestScope.vacancy.vacancyId}&position=${requestScope.vacancy.position}">Apps Of Vacancy</a><br>

</body>
</html>
