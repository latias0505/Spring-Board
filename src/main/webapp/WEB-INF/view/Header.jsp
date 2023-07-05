<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/Header.css" />
</head>
<body>
    <div class="headercontainer">
      <img src="img/logo.png" alt="logo" class="headerlogo" />
      <a class="headerlogotitle">제목 들어갈 공간</a>
        <input type="submit" value="로그아웃" class="headerloginbutton"
        <% if (session.getAttribute("userName") ==
        null) { %> style="display: none;" <% } %> />
      <input type="button" value="   로그인" class="headerloginbutton"
      <% if
      (session.getAttribute("userName") != null) { %> style="display: none;" <%
      } %> /> <img src="img/login.png" alt="loginlogo" class="headerloginlogo" <% if
      (session.getAttribute("userName") != null) { %> style="display: none;" <%
      } %> />
	   <ul class="headermenu" <% if (session.getAttribute("userName") != null) { %> style="margin-left: -18px;" <% } %>>
		<li><a>메뉴1</a></li>
		<li><a>메뉴2</a></li>
		<li><a>게시판</a></li>
	   </ul>
    </div>
    <% String userName = (String) session.getAttribute("userName"); %> <% if
    (session.getAttribute("userName") != null) { %>
    <a class="headerusertext">
      <%= userName %>님 접속 중
    </a>
    <% } %>
  </body>
</html>