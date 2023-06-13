<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="_inc_top.jsp" %>

<h2>회원 목록</h2>
<table border="1">
	<tr>
	    <td>순번</td>
	    <td>아이디</td>
	    <td>이름</td>
	    <td>연락처</td>  
	    <td>주민번호</td>  
	    <td>가입일</td>  
	</tr>

<c:forEach var="dto" items="${list }">
	<tr>
	    <td>${dto.no }</td>
	    <td><a href="#" onclick="move('view', '${dto.no}', '');">${dto.id }</a></td>
	    <td>${dto.name }</td>
	    <td>${dto.phone }</td>  
	    <td>${dto.jumin }</td>  
	    <td>${dto.regiDate }</td>  
	</tr>
</c:forEach>
	<tr>
		<td colspan="6" align="right">
		
    	<button type="button" id="btnListAll">전체목록</button>
    	<button type="button" id="btnList">목록</button>
    	<button type="button" id="btnChuga">가입하기</button>
    	
		</td>
	</tr>
</table>

<%@ include file="_inc_script.jsp" %>