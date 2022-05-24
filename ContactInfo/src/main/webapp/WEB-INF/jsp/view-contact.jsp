<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <title>View Contact</title>
     
    </head>
    <body>
        <table>
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Phone No.</th>
                    <th>Email</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${contacts}" var="contact">
                    <tr>
                        <td>${contact.name}</td>
                        <td>${contact.phoneNumber}</td>
                        <td>${contact.email}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>