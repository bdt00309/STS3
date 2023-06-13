<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="_inc_top.jsp" %>

<h2>도서 목록</h2>
<table border="1">
	<tr>
	    <td>도서코드</td>
	    <td>도서명</td>
	    <td>저자</td>  
	    <td>출판사</td>  
	    <td>발행일</td>  
	</tr>	

<c:forEach var="dto" items="${list }">
	<tr>
	    <td>${dto.bookNo }</td>
	    <td><a href="#" onclick="move('view', '${dto.bookNo}');">${dto.bookName }</a></td>
	    <td>${dto.author }</td>  
	    <td>${dto.publisher }</td>  
	    <td>${dto.regiDate }</td>  
	</tr>
</c:forEach>
	<tr>
		<td colspan="6" align="right">
		
    	<button type="button" id="btnListAll">전체목록</button>
    	<button type="button" id="btnList">목록</button>
    	<button type="button" id="btnChuga">등록하기</button>
    	
		</td>
	</tr>
</table>

<%@ include file="_inc_script.jsp" %>