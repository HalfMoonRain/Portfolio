<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <title>JunWoo PORTFOLIO</title>

  <link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/animate.min.css">
<link rel="stylesheet" href="css/portfolio.css">
<link rel="stylesheet" href="css/font.css">

 
</head>
<body>
<div class="container-fluid" style="border:0; padding:0;">
	<%@ include file="nav-menu.jsp"%>

    <div class="container about-contents-box work fadeIn">
      <h2 class="text-center work-title">
        WORK<br />
        <small style="color:rgb(159, 162, 159); font-family:'noto-regular';">
          I'll show you an incredible work.<br />
                   사진 클릭시 해당 사이트로 이동합니다. 
        </small>
      </h2>
 
      <div class="row">
        <div class="col-md-4">
          <a href="main" target="_blank" class="img-responsive" style="display:inline-block;"><img src="resources/images/HotelFestival.png" class="img-responsive" style="max-height:500px;" /></a>
          
        </div> 
        <div class="col-md-8">
          <span>
            Hotel Festival
          </span>
          <span>
	      	<b> 주요 업무</b><br />
			기업, 유저, 관리자 계정 회원 가입, 마이 페이지, 엑티비티, 프론트 기능구현<br /><br />
			<b>상세 역할</b><br />
			계정 업무 종료 후 다른 조원들의 프론트와 백엔드 연결 및 기능 구현 보조<br /><br />
            <b>느낀점</b> <br /> 
	           처음 프로젝트를 시작했을 때는 스스로 잘 만들기만 하면 된다는 생각이 있었습니다. 하지만
		개별적인 작업이 끝나고 코드들이 합쳐질 때 많은 문제들이 생겼습니다. 같은 기능을
		만들더라도 다른 변수명을 사용했기에 코드가 복잡해졌습니다. 뿐만 아니라 서로가 만든
		코드가 어떠한 기능인지 몰라서 서로가 기능확인을 하는 시간이 많아져 개발을 하는 시간보다
		서로가 어떠한 의도로 코드를 만들었는지 물어보는 시간이 더 많아졌습니다. 결국 만들던
		것들을 중단하고 회의를 하면서 변수명을 통일시키며 기능에 대한 경계선을 구별하였으며
		주석의 양식을 정해서 서로가 만든 코드를 설명하여 합치는 과정에서 혼선을 최대한 줄여
		나갔습니다. 이러한 과정에서 코드가 언어와 같아서 정확하고 간결하게 표현하지 않으면
		소통에 큰 문제가 생긴다는 것을 깨닫게 되었습니다. 또한 Git Hub 사용을 늦게
		시작하였습니다. Git Hub 를 사용하기 전에는 각자 만든 코드를 개인 컴퓨터에 백업하고 합치는
		과정을 진행했는데 이는 불편한 과정이었습니다. 결국 강사님께 프로젝트 종료 후 예정 되
		있던 Git 강의를 빠르게 진행해 달라 요청하였습니다. Git 의 여러 기능들을 실제 프로젝트에서
		사용하면서 많은 편리함과 작업물을 기록해 나가는 과정의 중요성을 깨닫게 되었습니다.
            <div class="text-muted small" style="margin-top:10px;">
              <small>#Spring</small>
              <small>#Java</small>
              <small>#CSS3</small>
              <small>#HTML5</small>
              <small>#JavaScript</small>
              <small>#Jquery</small>
              <small>#JSP</small>              
              <small>#SQL</small>
            </div>
          </span>
        </div>
      </div>

    </div>


  </div>

</body>
</html>