<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
<P> Your first name: ${fn} </P>
<P> Your last name: ${ln} </P>
<P> Your email: ${em} </P>
<br>
<p>You are interested in these classes: <br>${classes}</p>
</body>
</html>
