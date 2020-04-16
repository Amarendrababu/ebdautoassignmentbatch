<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title><tiles:getAsString name="title" /></title>
</head>
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
      
#logout {
	float: right;
}
</style>
</head>
<body>
<div>
<img src="<c:url value="/icon-maxis.png" />" alt="maxis" width="130" height="100">
</div>


    <table width="100%">
        <tr>
            <td colspan="2">
                <tiles:insertAttribute name="header" />
            </td>
        </tr>
        <tr>
            <td width="20%" nowrap="nowrap">
                 <tiles:insertAttribute name="menu" />
             </td>
            <td width="80%">
                 <tiles:insertAttribute name="body" />
             </td>
        </tr>
        <tr>
            <td colspan="2">
                 <tiles:insertAttribute name="footer" />
            </td>
        </tr>
    </table>
</body>
</html>