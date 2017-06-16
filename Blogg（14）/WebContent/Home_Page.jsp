<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Info.Passage"%>
<%@page import="Operation.PassageOP"%>
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
#fourth{width:80%; height:360px; margin:1em auto; position:relative; overflow:hidden; margin-left: auto;
margin-right: auto;}
#third_1{width:500px; height:360px; float:left;}
#third_2{width:540px; height:360px; float:right;background-color:white}
#fourth_1{width:500px; height:360px; float:left;}
#fourth_2{width:540px; height:360px; float:right;background-color:white;overflow:auto;}
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
<body background="img/Back01.gif">


<div id="first" name="第一块">

<div id="first_W" style="display: ">

<img  src="img/denglu.png" height="50px" width="100px"  onclick="showToolTip(event);" /> 
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</div>
<div id="toolTip" style="position:fixed;background-color:white;" onmouseleave='hideToolTip()'></div>
</div>

<div id="second" name="第二块">
<img  src="img/eight.gif" height="50px" width="140px" />
&nbsp;&nbsp;
<input type="text" style="height:25px" name="SS"> 
<button type="button" onClick='Sousuo()'>搜索  </button>
<button type="button" onClick='showhidediv("shouye")'>首页  </button>
<!-- <span style="font-weight:bold;color:red;font-size:10px;" >搜索 </span> <br><br> -->
 </div>
 
 <div id="third" name="第三块" style="display: ">
 
<div id="third_1">
    <ul class="list">
        <li><img class="slide" src="img/Home_01.jpg" height="400px" width="500"  /></li>
        <li><img class="slide" src="img/Home_02.jpg" height="400px" width="500" /></li>
         <li><img class="slide" src="img/Home_03.jpg" height="400px" width="500" /></li>
          <li><img class="slide" src="img/Home_04.jpg" height="400px" width="500" /></li>
           
       
    </ul>  
 </div>
<div id="third_2">
<table border="2">
<%
String find=request.getParameter("find");
ArrayList<Passage> _myPassages=new ArrayList<Passage>();
PassageOP passageop=new PassageOP();
passageop.get_mainPassages(_myPassages, 6);
Iterator<Passage> iter=_myPassages.iterator();
while(iter.hasNext())
{
	Passage passage1=new Passage();
	Passage passage2=new Passage();
	passage2.set_title("");
	passage2.set_article("");
	passage1=(Passage) iter.next();
	if(iter.hasNext())
		passage2=(Passage) iter.next();
%>
<tr style="height:100x;backgrond-color:blue">
<td style="padding:8px; "  > 
<span style="font-size:20px;font-weight:bold;"> <%=passage1.get_title() %></span>
，<br><%=passage1.get_article() %></td>
<td style="padding:8px;" ><span style="font-size:20px;font-weight:bold;"><%=passage2.get_title() %> </span>
 <br><%=passage2.get_title() %></td>
</tr>
<% }%>

</table>
 </div>
    
 </div>
 
  <div id="fourth" name="搜索框" style="display:none">
  
  <div id="fourth_1" ><img  src="img/back_5.jpg" height="400px" width="500"  /></div>
  <div id="fourth_2" >
  <table border="2"> 

  <tr style="height:30px;">
  <td width="380px">李银河</td><td width="180px"><button type="button" style="width:180px;height:25px" onClick=''>进入他 的博客</button> </td>
  </tr>
  
  <tr style="height:30px;">
  <td width="380px">李银河</td><td width="180px"><button type="button" style="width:180px;height:25px" onClick=''>进入他 的博客</button> </td>
  </tr>
    <tr style="height:30px;">
  <td width="380px">李银河和</td><td width="180px"><button type="button" style="width:180px;height:25px" onClick=''>进入他 的博客</button> </td>
  </tr>
    <tr style="height:30px;">
  <td width="380px">李银河—_jiu</td><td width="180px"><button type="button" style="width:180px;height:25px" onClick=''>进入他 的博客</button> </td>
  </tr>
    <tr style="height:30px;">
  <td width="380px">李银河_kljl</td><td width="180px"><button type="button" style="width:180px;height:25px" onClick=''>进入他 的博客</button> </td>
  </tr>
    <tr style="height:30px;">
  <td width="380px">李银河*</td><td width="180px"><button type="button" style="width:180px;height:25px" onClick=''>进入他 的博客</button> </td>
  </tr>
    

  
  
  </table>
  </div>
  
  </div>
  
  
 <div id="first" name="第一块">

</div>
 
 



</body>
<script type="text/javascript" src="js/tooltip.js"></script>
<script type="text/javascript">
function Sousuo()
{
	showhidediv("sousuo");
}

function showhidediv(id){
	var Ffile=document.getElementById("third");   //shouye
	var Wfile=document.getElementById("fourth");   //sousuo
	if (id == 'shouye') {
	if (Ffile.style.display=='none') {
	Wfile.style.display='none';
	Ffile.style.display='block';
	}
	} else {
	if (Wfile.style.display=='none') {
	Ffile.style.display='none';
	Wfile.style.display='block';
	}
	} 
	}
</script>
</html>