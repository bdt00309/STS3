<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<script>
$(document).ready(function() {
	$("#btnChugaProc").click(function() {
		//move('ChugaProc', '', '');
		
		if(confirm('등록OK?')) {
			var imsiUrl = "${path}/member/chugaProc";
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
			
			if(confirm('수정OK?')) {
				var imsiUrl = "${path}/member/sujungProc";
				//alert(imsiUrl);
				
				document.form.action= imsiUrl;
				document.form.method="post";
				document.form.submit();
				
			}
		});
		
		$(document).ready(function() {
		$("#btnSakjeProc").click(function() {
			
			//move('ChugaProc', '', '');
			
			if(confirm('삭제OK?')) {
				var imsiUrl = "${path}/member/sakjeProc";
				//alert(imsiUrl);
				
				document.form.action= imsiUrl;
				document.form.method="post";
				document.form.submit();
				
			}
		});
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
		move('sujung', '${resultDto.no }', '');
	});
	
	$("#btnSakje").click(function() {
		move('sakje', '${resultDto.no }', '');
	});
	
});


function move(value1, value2, value3) {
	var imsiUrl = "";
	imsiUrl += "${path}/member/" + value1; 
	imsiUrl += "?no=" + value2; 
	imsiUrl += "&page=" + value3; 
	
	location.href= imsiUrl;
}
</script>