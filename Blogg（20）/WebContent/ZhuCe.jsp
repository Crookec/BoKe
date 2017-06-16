<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link type="text/css" />
<style type="text/css">
div{
padding:5px;
margin:5px;
}
#first{
height:55px;
background:url(img/TOP.jpg);
}
#first_W{height:20px;float:right;}
#SECONDA{
height:320px;width:1320px;
float:left;
background:url(img/BackG_01.jpg);
}
#second{
height:60px;
width:80%;
 background-color:#BC8F8F; 
text-align:right; /* center;  */
margin-left: auto;
margin-right: auto;
}
#third{width:80%; height:360px; margin:1em auto; position:relative; overflow:hidden;margin-left: auto;
margin-right: auto;}  
#third_1{width:200px; height:360px; float:left;background:url(img/back_2.gif)}
#third_2{width:520px; height:360px; float:left;background:url(img/white.jpg);text-align: center;margin-left: auto;margin-right: auto;}
#third_3{width:300px; height:360px; float:left;background:url(img/back_2.gif)}
.list{margin:0; padding:0; position:absolute;}
.list{
    -moz-animation: slide 20s infinite;
    -webkit-animation: slide 20s infinite;
}
@-moz-keyframes slide {
    0% { top: 0px;}  
    25% { top: -400px;  }
     50% { top: -800px;  }
      75% { top: -1200px;  }

}
@-webkit-keyframes slide {
    0% { top: 0px;}  
    25% { top: -400px;  }
     50% { top: -800px;  }
      75% { top: -1200px;  }
   
}
</style>
</head>
<script language="javascript" type="text/javascript" >
//src="loadxmldoc.js"
var  xmlhttp;
function loadXMLDoc(url,cfunc){
	  
	  if(window.XMLHttpRequest){
	 
	  xmlhttp = new XMLHttpRequest();
	  
	  }
	  else{
	     xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
	  }
	  xmlhttp.onreadystatechange = cfunc;
	  xmlhttp.open("GET",url,true);
	  xmlhttp.send(null);
	  }
function addfuntion(){
	var id=document.formadd.txtid.value;
	var nick=document.formadd.txtname.value;
	var pwd=document.formadd.txtpwd.value;
	var rpwd=document.formadd.txtrpwd.value;
	 loadXMLDoc("Zhuce_Code.jsp?id=" + id +"&nick="+nick
				+ "&pwd=" + pwd+ "&rpwd=" + rpwd, proc_add );
	
}
function proc_add(){
	 // alert( "处理ajax" );
	 if (xmlhttp.readyState==4 && xmlhttp.status==200){
	     // ajax_code.jsp处理完毕，并且返回了数据
	     var repeat = xmlhttp.responseXML.getElementsByTagName(
	    		 "repeat")[0].firstChild.nodeValue;
	     if(repeat==("注册成功！")){
	    	 window.location.href="MyBlog.jsp";
	    	 }
	     else{
	    	 alert(repeat);
	     }
	 }
}
</script>


<body background="img/Back01.gif">


<div id="first" name="第一块">

<div id="first_W" style="display: ">

</div>

</div>

<div id="second" name="第二块">
<img  src="img/eight.gif" height="50px" width="140px" />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

<!-- <span style="font-weight:bold;color:red;font-size:10px;" >搜索 </span> <br><br> -->
 </div>
 
 <form name ="formadd">
 <div id="third" name="第三块">
 
<div id="third_1">

 </div>
<div id="third_2">
<br><br><br>

<span style="font-weight:bold;font-size:20px;" >电话号码</span>&nbsp;&nbsp;
<input type="text" style="height:25px" name="txtid"> <br><br>

<span style="font-weight:bold;font-size:20px;" >昵&nbsp;&nbsp;称</span>&nbsp;&nbsp;
<input type="text" style="height:25px" name="txtname"> <br><br>

<span style="font-weight:bold;font-size:20px;" >密&nbsp;&nbsp; 码</span>&nbsp;&nbsp;
<input type="text" style="height:25px" name="txtpwd"> <br><br>

<span style="font-weight:bold;font-size:20px;" >确认密码</span>&nbsp;&nbsp;&nbsp;
<input type="text" style="height:25px" name="txtrpwd"> <br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 <button type="button" style="width:80px;height:25px;" onClick='addfuntion()'>注 册  </button>
<button type="button" style="width:80px;height:25px" onClick='FANHUI()'>返回  </button> 
 </div>
 
 
 <div id="third_3">

 </div>
    
 </div>
 </form>
 <div id="first" name="第一块">

</div>
 
 



</body>

<script type="text/javascript">
function FANHUI(){
		window.location.href="Home_Page.jsp";
}
function ZHUCE(){
	var jieguo="aaaa";
	if(jieguo.equals("注册成功！"))
		window.location.href="MyBlog.jsp";
	else
		alert(jieguo);
}
</script>
</html>