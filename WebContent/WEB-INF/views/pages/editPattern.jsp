<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<form:form method="POST" action="${pageContext.request.contextPath}/editPattern/${pattern.id }" modelAttribute="pattern">
	<div class="field">
		<form:label path="name" >Name</form:label>
		<p class="control">
			<form:input path="name" class="input" placeholder="Pattern name"/>
		</p>
	</div>
	<div class="field">
		<form:label path="group" >Group</form:label>
		<p class="control">
			<form:input path="group" class="input" placeholder="Pattern group"/>
		</p>
	</div>
	<div class="field">
		<form:label path="implementation" >Implementation</form:label>
		<p class="control">
			<form:input path="implementation" class="input" placeholder="Pattern implementation"/>
		</p>
	</div>
	<button type="submit" class="btn btn-default">Save</button>
</form:form>