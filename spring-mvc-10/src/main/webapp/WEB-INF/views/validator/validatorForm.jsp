<%--
  Created by IntelliJ IDEA.
  User: liuyiyou
  Date: 14-7-25
  Time: 下午9:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<c:set var="ctx" value="<%=request.getContextPath()%>"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <script type="text/javascript" src="${ctx}/static/jquery/1.6/jquery.js"></script>

    <script type="text/javascript" src="${ctx}/static/bootstrap/js/bootstrap.min.js"></script>
    <link href="${ctx}/static/bootstrap/css/bootstrap.min.css" type="text/css" rel="stylesheet" media="all">


    <title></title>
</head>
<body>
<div class="container">

<table class="table form-horizontal">

    <form:form action="${ctx}/validator" method="post" modelAttribute="user">
        <form:errors/>
        <tr>
            <td><form:label path="username">Username</form:label></td>
            <td><form:input path="username"></form:input></td>
            <td><form:errors path="username"></form:errors></td>
        </tr>

        <tr>
            <td><form:label path="password">password</form:label></td>
            <td><form:input path="password"></form:input></td>
            <td><form:errors path="password"></form:errors></td>
        </tr>

        <tr>
            <td><form:label path="email">email</form:label></td>
            <td><form:input path="email"></form:input></td>
            <td><form:errors path="email"></form:errors></td>
        </tr>
        <tr>
            <td colspan="3">
                <input type="submit" value="SUBMIT">
            </td>
        </tr>

    </form:form>
</table>
</div>
</body>
</html>