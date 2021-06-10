<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<style type="text/css">
.box.login
{
	height:100%;
    width:80%;
	position:absolute;
	left:50%;
	top:50%;
	margin:10px 10px;
	border-collapse:collapse;
}

.hhh.table{
	
}

th{
	width:100px;
	height:50px;
}

th, td{
	border:1px;
}

.pic{
	width:50px;
	higth:50px;
}

.even{
	background-color=#ddd;
}

.odd{
	background-color=#ccc;
	
}

</style>


</head>
<body>
<form class="box login" action="login" method="post">
	<table class="hhh table">
	<tr>
		<th>编号</th>
		<th>姓名</th>
		<th>电话</th>
		<th>身份证号码</th>
		<th>身份证图片</th>
		<th>地址</th>
		<th>品牌</th>
		<th>logo</th>
		<th>状态</th>
		<th>操作</th>
	</tr>
	<c:forEach var="mer" items="${applicationScope.mers}" varStatus="state">
		<c:if test="${state.index%2==0 }">
			<tr class=even>
				<td>${mer.mId }</td>
				<td>${mer.mPersonName }</td>
				<td>${mer.mTel }</td>
				<td>${mer.mIdCard }</td>
				<td><a href="${mer.mCardPath }" target=_blank><img alt="商家身份证" src=${mer.mCardPath } class="pic"></a></td>
				<td>${mer.mLocation }</td>
				<td>${mer.mBrand }</td>
				<td><a href="${mer.mLogoPath }" target=_blank><img alt="商家logo" src=${mer.mLogoPath } class="pic"></a></td>
				<td>
					<c:choose>
						<c:when test="${mer.mStatus==1 }">
							待审核
						</c:when>
						<c:when test="${mer.mStatus==2 }">
							已通过
						</c:when>
						<c:when test="${mer.mStatus==3 }">
							已拉黑
						</c:when>
						<c:when test="${mer.mStatus==4 }">
							审核未通过
						</c:when>
						<c:otherwise>
							error
						</c:otherwise>
					</c:choose>				
				</td>
					<td>
					<c:choose>
						<c:when test="${mer.mStatus==1 }">
							<a href="">通过</a>/<a href="">拒绝</a>
						</c:when>
						<c:when test="${mer.mStatus==2 }">
							<a href="">拉黑</a>
						</c:when>
						<c:when test="${mer.mStatus==3 }">
							<a href="">恢复</a>
						</c:when>
						<c:when test="${mer.mStatus==4 }">
							<a href="">删除</a>
						</c:when>
						<c:otherwise>
							error
						</c:otherwise>
					</c:choose>				
				</td>
				
			</tr>
		</c:if>
		<c:if test="${state.index%2==1 }">
			<tr class="odd">
				<td>${mer.mId }</td>
				<td>${mer.mPersonName }</td>
				<td>${mer.mTel }</td>
				<td>${mer.mIdCard }</td>
				<td><a href="${mer.mCardPath }" target=_blank><img alt="商家身份证" src=${mer.mCardPath } class="pic"></a></td>
				<td>${mer.mLocation }</td>
				<td>${mer.mBrand }</td>
				<td><a href="${mer.mLogoPath }" target=_blank><img alt="商家logo" src=${mer.mLogoPath } class="pic"></a></td>
				<td>
					<c:choose>
						<c:when test="${mer.mStatus==1 }">
							待审核
						</c:when>
						<c:when test="${mer.mStatus==2 }">
							已通过
						</c:when>
						<c:when test="${mer.mStatus==3 }">
							已拉黑
						</c:when>
						<c:when test="${mer.mStatus==4 }">
							审核未通过
						</c:when>
						<c:otherwise>
							error
						</c:otherwise>
					</c:choose>				
				</td>
					<td>
					<c:choose>
						<c:when test="${mer.mStatus==1 }">
							<a href="">通过</a>/<a href="">拒绝</a>
						</c:when>
						<c:when test="${mer.mStatus==2 }">
							<a href="">拉黑</a>
						</c:when>
						<c:when test="${mer.mStatus==3 }">
							<a href="">恢复</a>
						</c:when>
						<c:when test="${mer.mStatus==4 }">
							<a href="">删除</a>
						</c:when>
						<c:otherwise>
							error
						</c:otherwise>
					</c:choose>				
				</td>
				
			</tr>
		</c:if>
	</c:forEach>
	</table>
	
</form>
</body>
</html>