<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="biz.Board.BoardVO" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Date" %>
<% List<BoardVO> boardList = (List<BoardVO>) request.getAttribute("boardList"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Board Main</title>
<%@ include file="Header.jsp" %>
<link rel="stylesheet" type="text/css" href="css/Board.css" />
</head>
<body>
  <div class="table-container">
    <h1 class="page-header">Board Main</h1>
    <table>
        <thead>
            <tr>
                <th>게시물 번호</th>
                <th>아이디</th>
                <th>게시물 제목</th>
                <th>작성 날짜</th>
            </tr>
        </thead>
        <tbody>
            <% if (boardList != null) { %>
                <% for (BoardVO board : boardList) { %>
                    <tr>
                        <td><%= board.getPostNum() %></td>
                        <td><%= board.getId() %></td>
                        <td><a href="boardinfo?postNum=<%= board.getPostNum() %>"><%= board.getTitle() %></a></td>
                        <td><%= board.getPostDate() %></td>
                    </tr>
                <% } %>
            <% } %>
        </tbody>
    </table>
  </div>
<%@ include file="Footer.jsp" %>
</body>
</html>
