<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../_include/inc_header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- - main.jsp가 모든 파일에 공통으로 들어가기 때문에 헤더에 넣지 않고 메인파일에 넣음 -->
<script src="http://code.jquery.com/jquery-3.3.1.min.js"></script> 


</head>
<body>
<%--
folderName: ${folderName}<br>
fileName: ${fileName}
 --%>
 
 
<table border="1" align="center">
	<tr>
		<td align="center" style="padding:20px 20px;">
			<%@ include file="../_include/inc_menu.jsp" %>
		</td>
	</tr>
	<tr>	
		<td align="center" style="padding:20px 20px;">
			<jsp:include page="../${folderName}/${fileName }.jsp" />
		</td>
	</tr>
	<tr>
		<td align="center" style="padding:20px 20px;">
			<jsp:include page="../_include/inc_footer.jsp"></jsp:include>
		</td>
	</tr>
</table>


</body>
</html>