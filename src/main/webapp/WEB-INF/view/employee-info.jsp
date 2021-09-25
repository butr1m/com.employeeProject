<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="forrm" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h2> Employee info</h2>
<br>

<form:form action="saveEmployee" modelAttribute="employee">

    <form:hidden path="id"/>

    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br> <br>
    Surname <form:input path="surname"/>
    <form:errors path="surname"/>
    <br> <br>
    Age <form:input path="age"/>
    <form:errors path="age"/>
    <br> <br>
    Email <form:input path="email"/>
    <form:errors path="email"/>
    <br> <br>
    Phone number <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br> <br>
    Marital status:
    Married <form:radiobutton path="maritalStatus" value="Мarried"/>
    Not married <form:radiobutton path="maritalStatus" value="Not married"/>
    Divorced <form:radiobutton path="maritalStatus" value="Divorced"/>
    <br> <br>
    Department <form:select path="department">
    <form:option value="Information Technology" label="IT"/>
    <form:option value="Human Resources" label="HR"/>
    <form:option value="Sales " label="Sales"/>
    <form:option value="Project Manager " label="PM"/>
    <form:option value="QA engineer  " label="QA"/>
    <form:option value=" DevOps engineer " label="DevOps"/>
    </form:select>

    <br> <br>
    Salary <form:input path="salary"/>
    <form:errors path="salary"/>
    <br> <br>
    <input type="submit" value="OK">

</form:form>

</body>

</html>