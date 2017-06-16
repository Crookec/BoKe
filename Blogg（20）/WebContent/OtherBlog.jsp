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
.stable tbody tr:hover{ 
background-color:yellow; 
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
text-align: center; 
margin-left: auto;
margin-right: auto;
}

#fourth{width:80%; height:360px; margin:1em auto; position:relative; overflow:hidden; margin-left: auto;
margin-right: auto;}
#sixth{width:75%;  margin:1em auto; position:relative; overflow:hidden; margin-left: auto;
margin-right: auto;}
#seventh{width:75%; height:360px; margin:1em auto; position:relative; overflow:hidden; margin-left: auto;
margin-right: auto;}
#nineth{width:75%; height:360px; margin:1em auto; position:relative; overflow:hidden; margin-left: auto;
margin-right: auto;}

#fourth_1{width:200px; height:360px; float:left;text-align: center;background:url(img/back_3.gif);  }
#fourth_2{width:840px; height:360px; float:right;background:url(img/back_4.gif); overflow:auto; }

#tjliuyan{width:80%;margin:1em auto;background:url(img/5-120601094T3.gif);  }
#choose tbody td:hover{ 
background-color:yellow; 
} 
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
<button type="button" style="width:100px;height:30px;" onClick='comeback()'>返回  </button>

</div>

</div>

<div id="second" name="第二块">
<table id="choose" border="2" style="margin: 0 auto"><tr height="50px">
<td  width="300px" onClick='showhidediv("bowen")'> <img  src="img/six.gif" height="20px" width="20" />他的博文</td>
<td width="300px" onClick='showhidediv("liuyanban")'><img  src="img/four.gif" height="20px" width="20" />留言板</td>
<td width="300px" onClick='showhidediv("message")'><img  src="img/five.gif" height="20px" width="20" />他的信息</td>

</tr></table> 
 </div>
 


    

 
  <div id="fourth" name="他的博文" style="display:">                                                                       <!-- 我的博文 -->
  
  <div id="fourth_1">

 </div>
<div id="fourth_2">
 <table class="stable"  style="border-style: dashed;"   > 
  <tr style="height:30px;" >
    <td width="100px">2017-5-6<br>-----------</td>
  <td width="580px">李银河<br>------------------------------------------------------------------------</td>
  <td width="100px" onClick='showhidediv("bowenxq")'>阅读全文>> <br>-----------</td>
  </tr>
    <tr style="height:30px;">
    <td width="100px">2017-5-6<br>-----------</td>
  <td width="580px">李银河<br>------------------------------------------------------------------------</td>
  <td width="100px">阅读全文>> <br>-----------</td>
  </tr>
    <tr style="height:30px;">
    <td width="100px">2017-5-6<br>-----------</td>
  <td width="580px">李银河<br>------------------------------------------------------------------------</td>
  <td width="100px">阅读全文>> <br>-----------</td>
  </tr>
    <tr style="height:30px;">
    <td width="100px">2017-5-6<br>-----------</td>
  <td width="580px">李银河<br>------------------------------------------------------------------------</td>
  <td width="100px">阅读全文>> <br>-----------</td>
  </tr>
  

  </table>
 </div>
    
  </div>
  
     
     <div id="sixth" name="留言板" style="display:none">                                                                 <!--  留言板 -->
<table border="2" >
<tr>
<td width="200px" style="text-align: center;"> <img  src="img/head.png" height="60px" width="60px"  /><br>
 <span style="font-size:16px;font-weight:bold;">李银河  </span> </td>
<td width="800px">
<table border="1">
<tr ><td width="780px">2017-5-20</td></tr>
<tr ><td width="780px">&nbsp;&nbsp;&nbsp;&nbsp;踩踩</td></tr>
<tr ><td width="780px">回复：真棒！</td></tr>

<tr ><td width="780px" style="text-align: right;">
<button type="button" style="width:100px;height:30px;" onClick='showliu("liu1")'>回复  </button>
<button type="button" style="width:100px;height:30px;" onClick='hideliu("liu1")'>收起  </button>
</td></tr>
<tr><td>
<div id="liu1"  style="width:760px;display:none">
<textarea style="width:750px;height:80px;"></textarea> <br>
<button type="button" style="width:100px;height:30px;" onClick=''>回复  </button>
</div>
</td></tr>
</table>

</td>
</tr>
</table><br> 
<div id="tjliuyan"  >
<textarea style="width:800px;height:80px;"></textarea> <br>
<button type="button" style="width:100px;height:30px;" onClick=''>添加留言</button>
 </div>
 
     </div>
     
     
      
     <div id="seventh" name="个人信息" style="display:none">                                                  <!--  个人信息 -->
     <table border="2" >
<tr>
<td width="200px" style="text-align: center;"> <img  src="img/minion.png" height="60px" width="60px"  /><br>
 <span style="font-size:16px;font-weight:bold;">李银河  </span><br>
 <button type="button" style="width:100px;height:30px;" onClick=''>关注他  </button>
  </td>
<td width="800px">
<div style="width:780px;background-color:#FFD700">基本资料</div>
<table border="2">
<tr ><td width="200px">昵称：</td><td width="580px">李银河 </td></tr>
<tr ><td width="200px">手机号：</td><td width="580px">17826875886 </td></tr>
<tr ><td width="200px">昵称：</td><td width="580px">李银河 </td></tr>
</table>
</td>
</tr>

</table>  
     </div>
     
 <div id="nineth" name="日志详情" style="display:none">                                           <!-- 日志详情 -->
  <br> <span style="font-size:32px;font-weight:bold; font-family:Microsoft YaHei"> 浪漫深入骨髓的布拉格，艺术浸满灵魂的查理桥    </span> <br><br>
   浪漫不是空泛的感觉。在布拉格，源于那些奇妙的楼宇、众多的尖塔、波希米亚的风情、和伏尔塔瓦河一起流淌的美妙旋律。
        又是一个金秋，我和家人缓步于这个兴起于中世纪的城中，倘佯在‘千塔’脚下的大街小巷，浏览着被誉为‘建筑博物馆'里的一幢幢各个历史时期、风格迥异的建筑。到处弥漫的艺术氛围包裹着亲情、天伦，这段最明媚的时光使我终生难忘！
     <br><br>
          
     <table  style="border-style: dashed;" >
<tr ><td width="780px">回复：真棒！</td></tr>


</table>
  <button type="button" style="width:100px;height:30px;" onClick='showliu("liuyan")'>回复  </button>
<button type="button" style="width:100px;height:30px;" onClick='hideliu("liuyan")'>收起  </button><br>
<div id="liuyan"  style="width:760px;display:none">
 <textarea style="width:750px;height:80px;"></textarea> <br>
<button type="button" style="width:100px;height:30px;" onClick=''>评论  </button>
</div>
 
  </div>    
         

 <div id="first" name="第一块">

</div>
 
 



</body>

<script type="text/javascript">
function comeback(){
	window.location.href="MyBlog.jsp";
}

function showliu(id){
	var File=document.getElementById(id);   
    File.style.display='block';
	}
function hideliu(id){
	var File=document.getElementById(id);   
     File.style.display='none';
     }


function showhidediv(id){
	var File4=document.getElementById("fourth");   //bowen
	var File6=document.getElementById("sixth");   //liuyanban
	var File7=document.getElementById("seventh");   //message
	var File9=document.getElementById("nineth");   //bowenxq
 if(id=='bowen') {
	if (File4.style.display=='none') {
		File4.style.display='block';
		File6.style.display='none';
		File7.style.display='none';
		File9.style.display='none';
	}
	} 
	
	 else if(id=='liuyanban') {
			if (File6.style.display=='none') {
				File4.style.display='none';
				File6.style.display='block';
				File7.style.display='none';
				File9.style.display='none';
			}
			} 
	 else if(id=='message') {
			if (File7.style.display=='none') {
				File4.style.display='none';
				File6.style.display='none';
				File7.style.display='block';
				File9.style.display='none';
			}
			} 
	
	 else if(id=='bowenxq') {
			if (File9.style.display=='none') {
				File4.style.display='none';
				File6.style.display='none';
				File7.style.display='none';
				File9.style.display='block';
			}
			} 
	}
</script>
</html>