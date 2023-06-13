<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="_inc_top.jsp" %>
<h2>회원 수정</h2>

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
    <td><input type="text" name="phone" value="${resultDto.phone }"></td>
  </tr>
  <tr>
    <td>이메일</td>
    <td><input type="text" name="email" value="${resultDto.email }"></td>
  </tr>
  <tr>
    <td>주민번호</td>
    <td>${resultDto.jumin }</td>
  </tr>
  <tr>
    <td>주소</td>
    <td>
    	<input type="text" id="sample6_postcode" name="juso1" placeholder="우편번호" value="${resultDto.juso1 }">
		<input type="button" onclick="sample6_execDaumPostcode()" value="우편번호 찾기"><br>
		<input type="text" id="sample6_address" name="juso2" placeholder="주소" value="${resultDto.juso2 }"><br>
		<input type="text" id="sample6_detailAddress" name="juso3" placeholder="상세주소" value="${resultDto.juso3 }">
		<input type="text" id="sample6_extraAddress" name="juso4" placeholder="참고항목" value="${resultDto.juso4 }"><br>
    </td>
  </tr>
  <tr>
    <td>회원등급</td>
    <td>
    	<input type="radio" name="grade" value="최우수회원" <c:if test="${resultDto.grade == '최우수회원' }">checked</c:if>>최우수회원
    	<input type="radio" name="grade" value="우수회원" <c:if test="${resultDto.grade == '우수회원' }">checked</c:if>>우수회원
    	<input type="radio" name="grade" value="일반회원" <c:if test="${resultDto.grade == '일반회원' }">checked</c:if>>일반회원
    </td>
  </tr>
   <tr>
    <td colspan="2">
    	<button type="button" id="btnSujungProc">수정하기</button>
    	
    	<button type="button" id="btnListAll">전체목록</button>
    	<button type="button" id="btnList">목록</button>
    	<button type="button" id="btnChugaAttach">등록(첨부)</button>
	</td>
  </tr>
</table>
</form>

<%@ include file="_inc_script.jsp" %>


<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script>
    function sample6_execDaumPostcode() {
        new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                // 각 주소의 노출 규칙에 따라 주소를 조합한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var addr = ''; // 주소 변수
                var extraAddr = ''; // 참고항목 변수

                //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                    addr = data.roadAddress;
                } else { // 사용자가 지번 주소를 선택했을 경우(J)
                    addr = data.jibunAddress;
                }

                // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.
                if(data.userSelectedType === 'R'){
                    // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                    // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                    if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                        extraAddr += data.bname;
                    }
                    // 건물명이 있고, 공동주택일 경우 추가한다.
                    if(data.buildingName !== '' && data.apartment === 'Y'){
                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                    }
                    // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                    if(extraAddr !== ''){
                        extraAddr = ' (' + extraAddr + ')';
                    }
                    // 조합된 참고항목을 해당 필드에 넣는다.
                    document.getElementById("sample6_extraAddress").value = extraAddr;
                
                } else {
                    document.getElementById("sample6_extraAddress").value = '';
                }

                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                document.getElementById('sample6_postcode').value = data.zonecode;
                document.getElementById("sample6_address").value = addr;
                // 커서를 상세주소 필드로 이동한다.
                document.getElementById("sample6_detailAddress").focus();
            }
        }).open();
    }
</script>