<%@ page import="model.Player" %>
<%@ page import="model.Cat" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Evgeniy
  Date: 23.03.2022
  Time: 20:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Добро пожаловать на коммерческий турнир!</title>
</head>
<body>
<h1>Добро пожаловать на коммерческий турнир!</h1>
<h2>Список участников на сегодня:</h2>
<%--<p>Name: ${cat.name}</p>--%>
<%--<p>Age: ${cat.age}</p>--%>
<%--<p>Children</p>--%>
<hr>
<ul>
    <% if ((request.getAttribute("player")) != null) %>
    <% for (Player player : (List<Player>)request.getAttribute("player")) { %>
    <li> <%=player.getName()%> rating: <%=player.getRating()%>
    </li>
    <% } %>
</ul>
</body>
</html>
