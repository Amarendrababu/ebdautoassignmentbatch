<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    <head>
    </head>
    <body>
    <form:form method="GET" action="/getuser">
     Search By User Id <input name="userid" >
     <button id="search">Search</button>
    
    </form:form>
        <h3>Welcome, Enter The User Details</h3>
        <form:form method="POST"
          action="/updateuser" modelAttribute="userDetails" >
             <table>
                <tr>
                    <td><form:label path="userId">User ID:</form:label></td>
                    <td><form:input path="userId" readonly="true"/></td>
                </tr>
                <tr>
                    <td><form:label path="email">Email</form:label></td>
                    <td><form:input path="email"/></td>
                </tr>
                <tr>
                    <td><form:label path="mobileno">
                      Mobile Number</form:label></td>
                    <td><form:input path="mobileno" /></td>
                </tr>
                 <tr>
                    <td><form:label path="companyname">
                      Company Name</form:label></td>
                    <td><form:input path="companyname" readonly="true"/></td>
                </tr>
                 <tr>
                    <td><form:label path="dealercode">
                      Dealer Code</form:label></td>
                    <td><form:input path="dealercode" readonly="true"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>
    </body>
</html>