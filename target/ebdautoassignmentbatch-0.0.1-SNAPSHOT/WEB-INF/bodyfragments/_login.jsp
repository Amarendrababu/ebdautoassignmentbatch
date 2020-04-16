<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    
<title>Log In Page</title>
<style>
 body {
  background-image: url("sliders-green-bg.png");
}
input[type=text], input[type=password] {
 
  width: 80%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}
label{
display:inline-block;
width:85px;
align:left;
}
.button {
  background-color: darkblue;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 20%;
  font-family: monospace;
}
.button1 {
  background-color: darkblue;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 20%;
}
.container {
margin: 0 auto;
width: 535px;
//margin-top: 90px;//

  padding: 50px;

  
}

.login {
margin: 0 auto;
//width: 700px;//
margin-top: 90px;

  padding: 50px;
background-color:white; 
}
.cms {
margin: 0 auto;
padding-bottom: 15px;
}
hr {
    display: block;
    height: 1px;
    border: 0;
    border-top: 1px solid #ccc;
    margin: 1em 0;
    padding: 0;
}

.errorblock {
         color: #ff0000;
        
      }
</style>
</head>
<body>
<%-- <div>
<img src="<c:url value="/icon-maxis.png" />" alt="maxis" width="130" height="130">
</div> --%>

<div class="container">
    <label style="font-size:30px;font-family:sans-serif;color: white;width: 100%;padding-bottom:20px;">EBD PORTAL</label>

<div class="login">
<form method="post" action="/login">
<h9 align="left" style="font-size:28px;color:darkblue;width:100px;font-family: sans-serif;">Login</h9><br>
<hr/>
<label style="color:darkblue"><b>User Name</b></label>

<input type="text" name="userName" placeholder="Enter Username" required id="uname" ><br><br>
<label style="color:darkblue"><b>Password</b></label>
  <input type="password" name="passWord" placeholder="Enter Password" required id="pswd" ><br><br>
<hr/>


<div align="center">
    
   
    <button class="button" >LOGIN</a></button>
   
   
</div>
<div align="center">
<span  class="errorblock">                                                                   
<c:if test="${not empty error}">
    ${error}
</c:if>
</span> 
</div> 
</form>
</div>
    
</div>

</body>
</html>
