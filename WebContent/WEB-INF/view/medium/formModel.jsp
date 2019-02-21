<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Model</title>
</head>
<body>
	<form:form action="processFormModel" method="GET" modelAttribute="people">
	
		Name: <form:input placeholder="What is your name?" type="text" path="name"/>
		<br>
		
		How old are you?: <form:input type="number" path="age"/>
		<br>
		
		Country:
		<form:select path="country">
			<form:options items="${countryOptions}"/>
		</form:select>
		<br>
		
		<form:radiobutton path="gender" value="F"/> Female 
		<form:radiobutton path="gender" value="M"/> Male 
		<br>
		
		<form:checkbox path="eighteenAbove"/> Above Eighteen? 
		 
		<br><br>		
		<button type="submit">Submit</button>
		
	</form:form>
</body>
</html>