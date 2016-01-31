<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<META http-equiv="Content-Type" content="text/html; charset=UTF-8">

<html>
<head>
  <title>Spring MVC Hello World</title>
</head>

<body>
<h2>All Pictures in System</h2>

<table border="1">
  <tr>
    <th>Author Id</th>
    <th>Author Name</th>
    <th>Subject Name</th>
    <th>url </th>
  </tr>
  <c:forEach items="${pictures}" var="picture">
    <tr>
      <td>${picture.authorID}</td>
      <td>${picture.authorName}</td>
      <td>${picture.subjectName}</td>
      <td>${picture.url}</td>
    </tr>
  </c:forEach>
</table>

</body>
</html>
