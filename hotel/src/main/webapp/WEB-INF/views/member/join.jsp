<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/resources/css/member/join.css">
</head>

<body>
	<div class="back">
		<form id="join_form" method="post">
			<div id="joinForm">회원가입</div><br>
			<div align="center">
				<div>
					<div class="id_wrap">
				<div class="id_name">아이디</div>
				<div class="id_input_box">
					<input class="id_input" name="memberId">
				</div>
				<span class="id_input_re_1">사용 가능한 아이디입니다.</span>
				<span class="id_input_re_2">아이디가 이미 존재합니다.</span>	
				<span class="final_id_ck">아이디를 입력해주세요.</span>			
			</div>
					<input type="password" class="input_pw" name="password"placeholder="비밀번호" class="in"><br> 
					<!-- <input type="password" placeholder="비밀번호 확인" class="in"><br> -->
					<input type="text" class="input_name" name="name"placeholder="이름"><br>
					<input type="text"class="input_email" name="email" placeholder="email" class="in">
				<!--<input type="button" id="btn1" value="인증번호"><br> -->
					<input type="submit" class="join_button" id="join" value="회원가입"><br>
				</div>
		</form>
	</div>
	<script>

$(document).ready(function(){
	//회원가입 버튼(회원가입 기능 작동)
	$(".join_button").click(function(){
		$("#join_form").attr("action", "/member/join");
		$("#join_form").submit();
	});
});

//아이디 중복검사
$('.id_input').on("propertychange change keyup paste input", function(){

	console.log("keyup 테스트");	

});// function 종료

</script>
</body>

</html>
