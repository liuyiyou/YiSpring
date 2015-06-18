<%--
  Created by IntelliJ IDEA.
  User: liuyiyou
  Date: 14-11-13
  Time: 下午8:38
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
    <script type="text/javascript" src="${base}/static/jquery/1.6/jquery.js"></script>
    <script type="text/javascript" src="${base}/static/jquery/jquery.form.js"></script>
    <script type="text/javascript" src="${base}/static/js/fileupload.js"></script>

</head>
<body>
<form   id="myForm" method="post" enctype="multipart/form-data">
    <input type="file" name="file">
    <textarea rows="20" cols="20" name="data"></textarea>
    <input type="button" value="submit" id="submitButton">

    <h2>返回的结果</h2>


</form>


<div id="result"></div>
</body>
</html>