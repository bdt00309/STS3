<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../_include/inc_header.jsp" %>  
<%@ include file="_inc_top.jsp" %>

<h2>도서 상세보기</h2>

<table border="1">
  <tr>
    <td>도서코드</td>
    <td>${resultDto.bookNo }</td>
  </tr>
  <tr>
    <td>도서명</td>
    <td>${resultDto.bookName }</td>
  </tr>
  <tr>
    <td>분류</td>
    <td>${resultDto.cate }</td>
  </tr>
  <tr>
    <td>저자</td>
    <td>${resultDto.author }</td>
  </tr>
  <tr>
    <td>출판사</td>
    <td>${resultDto.publisher }</td>
  </tr>
   <tr>
    <td>발행일</td>
    <td>${resultDto.regiDate }</td>
  </tr>
</table>

<hr>

|
<a href="#" onclick="move('list', '');">목록</a>
|
<a href="#" onclick="move('chuga', '');">등록</a>
|
<a href="#" onclick="move('sujung', '${resultDto.bookNo}');">수정</a>
|
<a href="#" onclick="move('sakje', '${resultDto.bookNo}');">삭제</a>
|



<%@ include file="_inc_script.jsp" %>