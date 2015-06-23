<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="base" value="<%=request.getContextPath()%>"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>SpringMVC异常处理</title>
    <link type="text/css"  href="${base}/static/bootstrap/css/bootstrap.min.css">
</head>
<body>
<div class="container" >
    <div class="row">
        <h2>SpringMVC异常处理</h2>
    </div>
    <div class="row">
        errorCode异常测试：<a href="${base}/hello">404异常测试</a>
    </div>
    <div class="row">
        局部异常测试：<a href="${base}/exception">局部异常测试</a>
    </div>
    <div class="row">
        局部异常测试：<a href="${base}/error">局部异常测试</a>
    </div>
    <div class="row">
        局部异常测试：<a href="${base}/error2">局部异常测试</a>
    </div>




</div>
</body>
</html>