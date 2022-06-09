<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1" />
<title>JunWoo PORTFOLIO</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/animate.min.css">
<link rel="stylesheet" href="css/portfolio.css">
<link rel="stylesheet" href="css/font.css">
 
</head>
<body>

    <div class="container-fluid" style="border: 0; padding: 0;">
      
	<%@ include file="nav-menu.jsp"%>

      <div class="container about-contents-box fadeIn">
        <h2 class="text-center">안녕하세요</h2>
        <h1 class="text-center">신입 Back-end 개발자 이준우 입니다.</h1>

        <div class="row" style="margin-top: 50px;">
          <div class="col-md-3">
            <img src="resources/images/selfi.jpg" class="img-responsive center-block about-img" />
          </div>
          <div class="col-md-9">
            <p class="text-left about-me">
서울 노원구에 살고 있는 Back-End 개발자가 되고 싶은 이준우 입니다.<br />
국민 취업 지원제도를 통해 JAVA, Android 웹&앱 개발자 과정을 이수 하였습니다.<br />
HTML5, Java, JavaScript, HTML, jQuery, JSP, MyBatis등을 이용하여 프로젝트를 진행하였습니다. <br />
프로젝트에서 담당 업무로는 기업,유저,관리자 계정 관련 기능 구현 및 프론트 기능 구현 및 디자인을 담당하였습니다. <br />
프론트 기능 까지 구현하게 된 이유는 앞으로 개발자로 일하기 전에 다양한 경험을 쌓고 싶었기 때문입니다. <br />
프로젝트를 진행하고 최종적으로 Back-End 개발자가 되고 싶은 이유는 프로젝트를 진행 하면서 서버에서 데이터를 다루며 데이터들을 정리하고 다양한 기능 구현을 하는 것에 큰 매력을 느꼇습니다. <br />
            </p>
          </div>
        </div>

        <div class="row about-bottom">
          <div class="col-md-5">
            MY Education
            <p><br />JAVA, Android 웹&앱 개발자 과정<br />한국 외국어 대학원 구조분석화학 석사 과정 중퇴<br />한국 외국어대학교 화학과 졸업</p>
          </div>
          <div class="col-md-4">
            CONTACT ME
            <p><br />010-2443-1759 <br />junwoo0619@naver.com</p>
          </div>
          <div class="col-md-3" style="margin-bottom: 40px;">
            TOOLS
            <p><br />Spring, GIT Hub</p>
          </div> 
        </div>
      </div>
    </div>

</body>
</html>