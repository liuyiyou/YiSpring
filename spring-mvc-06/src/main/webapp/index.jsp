<%--
  Created by IntelliJ IDEA.
  User: liuyiyou
  Date: 6/18/15
  Time: 10:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="base" value="<%=request.getContextPath()%>"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title></title>
</head>
<body>

<p>1. <a href="${base}/returnStr">  返回中文字符串 </a> </p>

<p>1. <a href="${base}/returnMap">  返回Map </a> </p>

<p>1. <a href="${base}/returnJavaBean">  返回javaBean </a> </p>

<p>1. <a href="${base}/returnStr">  returnStr </a> </p>


</body>
</html>