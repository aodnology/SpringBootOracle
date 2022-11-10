<%@ page import="kopo.poly.dto.FoodDTO" %>
<%@ page import="kopo.poly.util.CmmUtil" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    List<FoodDTO> rList = (List<FoodDTO>) request.getAttribute("rList");
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>서울강서캠퍼스 식단</title>
</head>
<body>
이번주 학교 점심식사<br/>
----------------------------------------<br/>
<%
    for (FoodDTO rDTO : rList) {
        out.println(CmmUtil.nvl(rDTO.getDay()));
        out.println("메뉴 : "+ CmmUtil.nvl(rDTO.getFood_nm()));
        out.println("<hr/>");
    }
%>
</body>
</html>