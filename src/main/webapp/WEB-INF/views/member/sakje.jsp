<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="_inc_top.jsp" %>

<h2>회원 삭제</h2>

<form name="form">
<input type="hidden" name="no" value="${resultDto.no }">
<table border="1">
  <tr>
    <td>아이디</td>
    <td>${resultDto.id }</td>
  </tr>
   <tr>
    <td>비밀번호</td>
    <td><input type="password" name="passwd"></td>
  </tr>
  <tr>
    <td>이름</td>
    <td>${resultDto.name }</td>
  </tr>
  <tr>
    <td>전화번호</td>
    <td>${resultDto.phone }</td>
  </tr>
  <tr>
    <td>이메일</td>
    <td>${resultDto.email }</td>
  </tr>
  <tr>
    <td>주민번호</td>
    <td>
    	${resultDto.jumin }
    </td>
  </tr>
  <tr>
    <td>주소</td>
    <td>
    	${resultDto.juso1 }
    	${resultDto.juso2 }<br>
    	${resultDto.juso3 }
    	${resultDto.juso4 }
    </td>
  </tr>
  <tr>
    <td>등급</td>
    <td>
    	${resultDto.grade }
    </td>
  </tr>
   <tr>
    <td>등록일</td>
    <td>${resultDto.regiDate }</td>
  </tr>
  <tr>
  	<td colspan="2">
  	<button type="button" id="btnSakjeProc">삭제하기</button>
  	
  		<button type="button" id="btnListAll">전체목록</button>
    	<button type="button" id="btnList">목록</button>
    	<button type="button" id="btnChuga">가입하기</button>
    	<button type="button" id="btnChugaAttach">등록(첨부)</button>
    	
    	<button type="button" id="btnSujung">수정</button>
    	
  	</td>
  </tr>
</table>
</form>

<%@ include file="_inc_script.jsp" %>