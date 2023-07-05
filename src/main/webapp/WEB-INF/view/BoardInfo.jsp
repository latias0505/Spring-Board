<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="biz.Board.BoardVO" %>
<% BoardVO board = (BoardVO) request.getAttribute("board"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Board Info</title>
<%@ include file="Header.jsp" %>
<link rel="stylesheet" type="text/css" href="css/BoardInfo.css" />
</head>
<body>
  <div class="table-container">
    <h1 class="page-header">Board Info</h1>
    <table>
        <thead>
            <tr>
                <th>게시물 번호</th>
                <th>아이디</th>
                <th>게시물 제목</th>
                <th>내용</th>
                <th>작성 날짜</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td><%= board.getPostNum() %></td>
                <td><%= board.getId() %></td>
                <td><%= board.getTitle() %></td>
                <td><%= board.getContent() %></td>
                <td><%= board.getPostDate() %></td>
            </tr>
        </tbody>
    </table>
  </div>
<%@ include file="Footer.jsp" %>
</body>
</html>
