<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<script>
$(document).ready(function() {
	$("#btnChugaProc").click(function() {
		//move('ChugaProc', '', '');
		
		if(confirm('등록OK?')) {
			var imsiUrl = "${path}/book/chugaProc";
			//alert(imsiUrl);
			
			document.form.action= imsiUrl;
			document.form.method="post";
			document.form.submit();
			
		}
	});
});
	$(document).ready(function() {
		$("#btnSujungProc").click(function() {
			
			//move('ChugaProc', '', '');
			
			if(confirm('등록OK?')) {
				var imsiUrl = "${path}/book/sujungProc";
				//alert(imsiUrl);
				
				document.form.action= imsiUrl;
				document.form.method="post";
				document.form.submit();
				
			}
		});
	
	
	
	$("#btnListAll").click(function() {
		move('list', '', '');
	});
	
	$("#btnList").click(function() {
		//alert('aaa');
		move('list', '', '');
	});
	
	$(document).ready(function() {
		$("#btnChuga").click(function() {
		//alert('등록');
		move('chuga', '', '');
		});
	});
	

	
	$("#btnSujung").click(function() {
		move('sujung', '${resultDto.bookNo }', '');
	});
	
	$("#btnSakje").click(function() {
		move('sakje', '${resultDto.bookNo }', '');
	});
	
});


function move(value1, value2, value3) {
	var imsiUrl = "";
	imsiUrl += "${path}/book/" + value1; 
	imsiUrl += "?bookNo=" + value2; 
	imsiUrl += "&page=" + value3; 
	
	
	location.href= imsiUrl;
}
</script>