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
#first_Y{height:20px;float:right;}
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
<div id="first_Y" style="display:none ">
 <span style="color:white;font-size:20px;font-weight:bold;"> 欢迎：李银河      </span> 
&nbsp;&nbsp;
<button type="button" onClick='comeboke()'>进入我的博客 </button>
<button type="button" onClick='tuichu()'>退出登录 </button>
</div>
<div id="toolTip" style="position:fixed;background-color:white;" onmouseleave='hideToolTip()'></div>
</div>

<div id="second" name="第二块">
<img  src="img/eight.gif" height="50px" width="140px" />
&nbsp;&nbsp;
<input type="text" style="height:25px" name="SS"> 
<button type="button" onClick='showhidediv("sousuo")'>搜索  </button>
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
<tr style="height:100x;backgrond-color:blue">
<td style="padding:8px; "  > 
<span style="font-size:20px;font-weight:bold;"> 北京现血红色的晚霞 粽子博物馆    中国唯一嘉兴粽子博物馆</span>
，<br>原来粽子品种这么多。</td>
<td style="padding:8px;" ><span style="font-size:20px;font-weight:bold;">那些让你我热泪盈眶的瞬间 马丘比丘 </span>
 <br>古老的马丘比丘开始向社会透射出它曾经辉煌的帝国文明。</td>
 
</tr>
<tr style="height:100x;">
<td style="padding:8px; "  > 
<span style="font-size:20px;font-weight:bold;"> 人工智能VS投资者  把自己穿胖20斤</span>
，<br>把自己穿胖20斤！细数蒋欣到底穿错多少衣？</td>

<td style="padding:8px; "  > 
<span style="font-size:20px;font-weight:bold;"> “国家队”抢滩校园贷 一亿的教训</span>
，<br>一次Google信箱诈骗是如何得手的？</td>

</tr>

<tr style="height:100x;">
<td style="padding:8px; "  > 
<span style="font-size:20px;font-weight:bold;"> 卖掉老家的房子 低调奢华的海鲜山派对</span>
，<br>享受凉爽的空调，来上一顿集合了龙虾、生蚝等的海鲜山大餐。</td>

<td style="padding:8px; "  > 
<span style="font-size:20px;font-weight:bold;"> 最全的河南烟标大盘点 李广射虎是假的</span>
，<br>李广射虎西汉时人们就有所怀疑，为啥还能在我们现代课本里？</td>

</tr>

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
  <td width="380px">李银河</td><td width="180px"><button type="button" style="width:180px;height:25px" onClick=''>进入他 的博客</button> </td>
  </tr>
    <tr style="height:30px;">
  <td width="380px">李银河</td><td width="180px"><button type="button" style="width:180px;height:25px" onClick=''>进入他 的博客</button> </td>
  </tr>
    <tr style="height:30px;">
  <td width="380px">李银河</td><td width="180px"><button type="button" style="width:180px;height:25px" onClick=''>进入他 的博客</button> </td>
  </tr>
    <tr style="height:30px;">
  <td width="380px">李银河</td><td width="180px"><button type="button" style="width:180px;height:25px" onClick=''>进入他 的博客</button> </td>
  </tr>
    

  
  
  </table>
  </div>
  
  </div>
  
  
 <div id="first" name="第一块">

</div>
 
 



</body>
<script type="text/javascript" src="js/tooltip.js"></script>
<script type="text/javascript">
function tuichu(){
	var YFile=document.getElementById("first_Y");   
	var WFile=document.getElementById("first_W");   
    WFile.style.display='block';
    YFile.style.display='none';
}
function comeboke(){
	window.location.href="MyBlog.jsp";
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