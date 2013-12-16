<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>G Analytics</h1>
<hr color="grey" width="5">

	<form:form commandName="credential" method="POST">
		<table>
			<tr>
				<td><label>Email Address : </label> </td>
				<td><form:input path="userName" /></td>
				<!-- <td><input type="text" name="userName" id="userName"> </td> -->
			</tr>
			
			<!-- <tr>
				<td><label>VDC Name : </label> </td>
				<td><input type="text" name="vdcName" id=""> </td>
			</tr>
			 -->
			<tr>
				<td><label>Access Key ID : </label> </td>
					<td><form:password path="accessKeyId" /></td>
			<!-- 	<td><input type="password" name="accessKeyId" id="accessKeyId"> </td> -->
			</tr>
			
			<tr>
				<td><label>Secret Access Key : </label> </td>
				<td><form:password path="secretKeyId" /></td>
				<!-- <td><input type="password" name="secretKeyId" id="secretKeyId"> </td> -->
			</tr>
			
			<tr>
				<td><label>Amazon S3 Bucket Name : </label> </td>
				<td><form:input path="bucketName" /></td>
				<!-- <td><input type="text" name="bucketName" id="bucketName"> </td> -->
			</tr>
			<tr>
			<!-- 	<td><label>Amazon S3 Bucket Name : </label> </td> -->
			<td><form:hidden path="pattern" value="aws_cost" /></td>
				<!-- <td><input type="hidden" name="pattern" id="pattern" value="aws_cost"> </td> -->
			</tr>
			
			<tr>
				<td colspan="2"><input type="submit" name="register" id="register" value="Register"> </td>
			</tr>
		</table>
	
	</form:form>

</body>
</html>