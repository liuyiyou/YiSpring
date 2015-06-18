<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<c:set var="ctx" value="<%=request.getContextPath()%>" /><!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <script type="text/javascript"  src="${ctx}/static/jquery/1.6/jquery.js"></script>

    <script type="text/javascript" src="${ctx}/static/bootstrap/js/bootstrap.min.js"></script>
    <link href="${ctx}/static/bootstrap/css/bootstrap.min.css" type="text/css" rel="stylesheet" media="all">


    <script type="text/javascript" src="${ctx}/static/SyntaxHighlighter/shCore.js"></script>
    <script type="text/javascript" src="${ctx}/static/SyntaxHighlighter/shBrushJava.js"></script>
    <script type="text/javascript" src="${ctx}/static/SyntaxHighlighter/shBrushXml.js"></script>
    <link  href="${ctx}/static/SyntaxHighlighter/shCoreDefault.css" type="text/css" rel="stylesheet" media="all">
    <script type="text/javascript">
        SyntaxHighlighter.all();
    </script>
</head>
<body>
<div class="container">

    <h2>基于Spring自带的validator</h2>
    <ul>
        <li>实现方式</li>
        <li>国际化如何实现</li>
        <li>前台如何显示错误信息</li>
    </ul>

    <p>前台使用spring Form表单，使用表单方式提交</p>

    <a href="<c:url value="validator"></c:url>">基于Spring自带的验证演示</a>



    <h2>基于Spring自带的validator</h2>
    <ul>
        <li>实现方式</li>
        <li>国际化如何实现</li>
        <li>前台如何显示错误信息</li>
    </ul>


    <p>前台使用不使用spring form标签，使用表单方式提交，这种方式是为了使用ajax提交，如果使用该方式提交</p>

    <a href="<c:url value="validator2"></c:url>">基于Spring自带的验证演示</a>


    <p>难度在于如果使用ajax提交，不能使用Spring form标签，所以，需要多做一些额外的代码，要将错误信息直接返回在某个元素上，需要通过js。</p>


    <p>国际化显示的难点：</p>
    <p>在自带的Spring验证的时候，国际化显示的难点在于需要自己写，因为只有在显示到前台的时候才会发生国际化，所以在后台是无法简单测试到是否显示国际化的。而且前台需要使用spring:message来显示国际化信息，但是至少能用ajax提交了。</p>
</div>
</body>
</html>
