<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 视窗 -->
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title></title>
</head>

<body>
	<form action="<%=request.getContextPath() %>/selects" method="post">
		影片名称：<input type="text" name="name" value="${name }"><br>
		导演：<input type="text" name="actor" value="${actor }"><br>
		影片年代：<input type="text" name="years" value="${years }"><br>
		    <input type="submit" value="查询">
		<table>
			<tr>
				<td>电影名称</td>
				<td>导演</td>
				<td>票价</td>
				<td>上映时间</td>
				<td>时长</td>
				<td>类型</td>
				<td>年代</td>
				<td>区域</td>
				<td>状态</td>
			</tr>
			
			<c:forEach items="${info.list}" var="movie">
				<tr>
					<td>${movie.name }</td>
					<td>${movie.actor }</td>
					<td>${movie.price}</td>
					<td>${movie.uptime }</td>
					<td>${movie.longtime }</td>
					<td>${movie.type }</td>
					<td>${movie.years }</td>
					<td>${movie.area }</td>
					<td>${movie.status }</td>
				</tr>
	
			</c:forEach>
			
			<tr>
				<td colspan="10"> <jsp:include page="/WEB-INF/view/pages.jsp"></jsp:include> </td>
			</tr>
		</table>
	</form>
</body>

<script type="text/javascript">
	function goPage(pageNum) {
		location.href="/selects?pageNum="+pageNum
	}
</script>