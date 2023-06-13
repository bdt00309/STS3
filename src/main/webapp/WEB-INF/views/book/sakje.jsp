<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../_include/inc_header.jsp" %>  
<%@ include file="_inc_top.jsp" %>

<h2>도서 삭제</h2>

<form name="form">
<input type="hidden" name="bookNo" value="${resultDto.bookNo }">

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
   <tr>
    <td colspan="2" align="center">
    	<button type="button" onclick="save();">삭제</button>
	</td>
  </tr>
</table>
</form>

<script>
function save() {
	if(confirm('삭제OK?')) {
		document.form.action="${path}/book/sakjeProc";
		document.form.method="post";
		document.form.submit();
	}
}
</script>

<%@ include file="_inc_script.jsp" %>