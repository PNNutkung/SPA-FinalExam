<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<div style="margin: 10px;">
	<h4>Patterns List</h4>
	<h3>${message}</h3>
	<table class="table">
		<tbody>
			<tr>
				<th>Id</th>
				<th>Pattern Name</th>
				<th>Group</th>
				<th>Implementation</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
			<c:forEach var="pattern" items="${patterns}" >
				<tr>
					<td><c:out value="${pattern.id }"/></td>
					<td><c:out value="${pattern.name }"/></td>
					<td><c:out value="${pattern.group }"/></td>
					<td><c:out value="${pattern.implementation }"/></td>
					<td><a href="${pageContext.request.contextPath}/editPattern/${pattern.id}"><i class="fa fa-pencil" aria-hidden="true"></i></a></td>
					<td><form action="${pageContext.request.contextPath}/deletePattern/${pattern.id}" method="POST"><button type="submit"><i class="fa fa-trash" aria-hidden="true"></i></button></form></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>