<%@ page import="model.Product" %>
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
    <title>Product</title>
</head>
<body>
<h1>Products:</h1>
<ul>
    <% if(request.getAttribute("product") != null) %>
    <% for(Product product : (List<Product>) request.getAttribute("product")) { %>
    <li> id: <%=product.getId()%>; title: <%=product.getTitle()%>; cost: <%=product.getCost()%></li>
    <% } %>
</ul>
</body>
</html>
