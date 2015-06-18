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
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<c:set var="ctx" value="<%=request.getContextPath()%>"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <script type="text/javascript" src="${ctx}/static/jquery/1.6/jquery.js"></script>

    <script type="text/javascript" src="${ctx}/static/bootstrap/js/bootstrap.min.js"></script>
    <link href="${ctx}/static/bootstrap/css/bootstrap.min.css" type="text/css" rel="stylesheet" media="all">


    <title></title>
    <script type="text/javascript">
        $().ready(function () {
            $(".submit").click(function () {
                $.ajax({
                    url: "${ctx}/validator2",
                    method: "POST",
                    success: function (data) {
                        //得到传来的filedError
                        //  filedError  = data.fieldError;
                    }});
            });
        });
    </script>
</head>
<body>

<div class="container">

    <table class="table">

        <form action="${ctx}/validator2" method="post">
            <tr>
                <td>Username</td>
                <td><input name="username" id="username"/></td>
                <td><span id="usernameError"></span></td>

            </tr>

            <tr>
                <td> password</td>
                <td><input name="password" id="password"></td>
                <td><spring:message code="empty.user.username"></spring:message></td>
            </tr>

            <tr>
                <td colspan="3">
                    <input type="submit" value="SUBMIT">
                </td>
            </tr>

        </form>
    </table>
</div>
</body>
</html>