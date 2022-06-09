<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta property="og:title" content="JunWoo PORTFOLIO">
<meta property="og:description" content="Hello. I'm JunWoo">
<title>JunWoo PORTFOLIO</title>


<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/animate.min.css">
<link rel="stylesheet" href="css/portfolio.css">
<link rel="stylesheet" href="css/font.css">
</head>
<body>
<div class="container-fluid bgimg">
	<%@ include file="nav-menu.jsp"%>
    <div class="row home-txt hidden-xs">
      <h1 class="fadeInUp" style="margin-left:20px;">
        Hello, I'm Jun-Woo!</br>
        <small style="color:rgb(159, 162, 159);">
          Developers who want to create a variety of things.
        </small>
      </h1>
    </div>

    <div class="row home-txt visible-xs">
      <h2 class="fadeInUp" style="margin-left:30px;">
        Hello, I'm Jun-Woo!</br>
        <small style="color:rgb(159, 162, 159);">
          Developers who want to create a variety of things.
        </small>
      </h2>
    </div>

  </div>

</body>
</html>