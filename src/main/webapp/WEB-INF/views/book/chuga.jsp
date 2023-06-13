<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../_include/inc_header.jsp" %>  
<%@ include file="_inc_top.jsp" %>


<h2>도서 등록</h2>

<form name="form">
<table border="1">
  <tr>
    <td>도서명</td>
    <td><input type="text" name="bookName"></td>
  </tr>
  <tr>
    <td>분류</td>
    <td><input type="text" name="cate"></td>
  </tr>
  <tr>
    <td>저자</td>
    <td><input type="text" name="author"></td>
  </tr>
  <tr>
    <td>출판사</td>
    <td><input type="text" name="publisher"></td>
  </tr>
   <tr>
    <td colspan="2" align="center">
    	<button type="button" onclick="save();">등록</button>
	</td>
  </tr>
</table>
</form>


<script>
function save() {
	if(confirm('등록OK?')) {
		document.form.action="${path}/book/chugaProc";
		document.form.method="post";
		document.form.submit();
	}
}
</script>


<%@ include file="_inc_script.jsp" %>