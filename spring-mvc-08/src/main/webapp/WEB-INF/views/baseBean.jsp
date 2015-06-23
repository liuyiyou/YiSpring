<%--
  Created by IntelliJ IDEA.
  User: liuyiyou
  Date: 6/22/15
  Time: 1:33 PM
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
    <title>简单对象类型转换</title>
</head>
<body>
<form action="baseBean" method="post">
    <div class="f_left">姓名:</div>
    <div class="f_left"><input name="name" value="张三"/></div>
    <div class="clear"></div>
    <div class="f_left">年龄:</div>
    <div class="f_left"><input name="age" value="20"/></div>
    <div class="clear"></div>
    <div class="f_left">收入:</div>
    <div class="f_left"><input name="income" value="100000"/></div>
    <div class="clear"></div>
    <div class="f_left">结婚:</div>
    <div class="f_left">
        <input type="radio" name="married" value="true" checked="checked"/>是
        <input type="radio" name="married" value="false"/>否</div>
    <div class="clear"></div>
    <div class="f_left">兴趣:</div>
    <div class="f_left">
        <input type="checkbox" name="interests" value="听歌" checked="checked"/>听歌
        <input type="checkbox" name="interests" value="书法" checked="checked"/>书法
        <input type="checkbox" name="interests" value="看电影" checked="checked"/>看电影
    </div>
    <div class="clear"></div>
    <div><input type="submit" value="提交表单"/></div>
</form>
</body>
</html>