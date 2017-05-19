<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

${message}
<form:form method="POST" action="${pageContext.request.contextPath}/addNewPattern" modelAttribute="pattern">
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
	<button type="submit" class="button is-primary">Save</button>
</form:form>