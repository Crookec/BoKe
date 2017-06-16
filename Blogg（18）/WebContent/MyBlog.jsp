<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Info.Passage"%>
<%@page import="Operation.PassageOP"%>
<%@page import="Operation.FriendOP"%>
<%@page import="Operation.BloggerInfo"%>
<%@page import="Info.User" %>
<%@page import="Operation.CommentOP"%>
<%@page import="Info.Comment"%>
<%@page import="Info.Anser"%>
<%@page import="Operation.AnserOP"%>
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
#third{width:80%; height:360px; margin:1em auto; position:relative; overflow:hidden;margin-left: auto;
margin-right: auto;}
#fourth{width:80%; height:360px; margin:1em auto; position:relative; overflow:hidden; margin-left: auto;
margin-right: auto;}
#fivth{width:80%; height:360px; margin:1em auto; position:relative; overflow:hidden; margin-left: auto;
margin-right: auto;}
#sixth{width:75%;  margin:1em auto; position:relative; overflow:hidden; margin-left: auto;
margin-right: auto;}
#seventh{width:75%; height:360px; margin:1em auto; position:relative; overflow:hidden; margin-left: auto;
margin-right: auto;}
#eighth{width:75%; height:360px; margin:1em auto; position:relative; overflow:hidden; margin-left: auto;
margin-right: auto;background:url(img/5-120601094K4-51.gif)}
#nineth{width:75%; height:360px; margin:1em auto; position:relative; overflow:hidden; margin-left: auto;
margin-right: auto;}
#third_1{width:200px; height:360px; float:left;background:url(img/back_2.gif)}
#third_2{width:620px; height:360px; float:left;overflow:auto;}
#third_3{width:200px; height:360px; float:left;background:url(img/back_2.gif)}
#fourth_1{width:200px; height:360px; float:left;text-align: center;background:url(img/back_3.gif);  }
#fourth_2{width:840px; height:360px; float:right;background:url(img/back_4.gif); overflow:auto; }
#fivth_1{width:460px; height:360px; float:left;}
#fivth_2{width:580px; height:360px; float:right;background-color:white;overflow:auto;}

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
<table id="choose" border="2" style="margin: 0 auto";><tr height="50px">
<td  width="180px" onClick='showhidediv("shouye")'> <img  src="img/six.gif" height="20px" width="20" />首页</td>
<td width="180px" onClick='showhidediv("mybowen")'><img  src="img/four.gif" height="20px" width="20" />我的博文</td>
<td width="180px" onClick='showhidediv("boyou")'><img  src="img/five.gif" height="20px" width="20" />博友</td>
<td width="180px" onClick='showhidediv("liuyanb")'><img  src="img/three.gif" height="20px" width="20" />留言板</td>
<td width="180px" onClick='showhidediv("myxinxi")'><img  src="img/two.gif" height="20px" width="20" />个人信息</td>
</tr></table> 
 </div>


 <div id="third" name="首页" style="display: ">                                                                                   <!-- 首页 -->
 <div id="third_1"></div>
<div id="third_2">
 <table class="stable"  style="border-style: dashed;"   >
 <%
String req=request.getParameter("req");
String _uid="17826875887";//当前登录的账号id
ArrayList<Passage> _allPassages=new ArrayList<Passage>();
PassageOP passageop=new PassageOP();
passageop.get_allPassages(_allPassages, _uid);
Iterator<Passage> iter=_allPassages.iterator();
while(iter.hasNext())
{
	
	Passage passage=(Passage) iter.next();
	BloggerInfo bloggerinfo=new BloggerInfo();
	String nick=bloggerinfo.get_Nick(passage.get_uid());
%>
 <tr><td width="500px"><%=passage.get_title()%></td><td width="120px"><%=passage.get_time()%></td><td width="120px"><%=nick%></td> </tr>
 <%
	System.out.println(passage.get_id()+passage.get_title()+passage.get_time());
}
 %>
  </table>
</div>
<div id="third_3"></div>


    
 </div>
 
  <div id="fourth" name="我的博文" style="display:none">                                                                       <!-- 我的博文 -->
  
  <div id="fourth_1">
<br><br><br><button type="button" style="width:100px;height:30px;" onClick='showhidediv("xiebowen")'>写日志  </button>
 </div>
<div id="fourth_2">
 <table class="stable"  style="border-style: dashed;"   > 
 <%
ArrayList<Passage> _myPassages=new ArrayList<Passage>();
passageop.get_myPassages(_myPassages, _uid);
iter=_myPassages.iterator();
while(iter.hasNext())
{
	Passage passage=(Passage) iter.next();

%>

  <tr style="height:30px;" >
    <td width="100px"><%=passage.get_time() %><br>-----------</td>
  <td width="580px"><%=passage.get_title() %><br>------------------------------------------------------------------------</td>
  <td width="100px"><button type="button" value="<%=passage.get_id() %>" onClick='BowenXq(this)'>阅读全文>></button> <br>-----------</td>
<%
System.out.println(passage.get_id()+passage.get_title()+passage.get_time());
}
%>
  </table>
 </div>
    
  </div>
  
    <div id="fivth" name="博友" style="display:none">                                                                            <!-- 博友 -->
    <div id="fivth_1">
   <img  src="img/back_7.jpg" height="400px" width="460"  />
 </div>
<div id="fivth_2">
 <table  class="stable"  border="2"> 
 <%
 ArrayList<String> friends=new ArrayList<String>();
	FriendOP friendop=new FriendOP();
	friendop.ReadById(friends, _uid);
	Iterator<String> siter=friends.iterator();
	while(siter.hasNext())
	{
		String friend=(String) siter.next();
		BloggerInfo bloggerinfo=new BloggerInfo();
		String nick=bloggerinfo.get_Nick(friend);
 %>
  <tr style="height:30px;">
  <td width="400px"><%=friend %></td><td><button type="button" value=<%=friend %> style="width:100px;height:25px" onClick='QuGuan(this)'>取关</button></td>
  <td width="100px"><button type="button" style="width:100px;height:25px" value= "<%=friend %>" onClick='Toother(this)'>进入他的博客</button> </td>
  </tr>
<%
System.out.println(friend);
}
%>  
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


</table>  
     </div>
     
     
      
     <div id="seventh" name="个人信息" style="display:none">  
<form name="gerenxinxi">                                                <!--  个人信息 -->
     <table border="2" >
<%
String _id,_name,_nick,_address,_sex,_workaddress,_job,
_birth,_blogname,_pwd;
int _flag;
String jieguo="";//传入后台后传回结果
//先读出所有信息，除了id,pwd,flag
User user=new User();
BloggerInfo bloggerinfo=new BloggerInfo();
user=bloggerinfo.getById(_uid);
_name=user.get_name();
_nick=user.get_nick();
_address=user.get_address();
_sex=user.get_sex();
_workaddress=user.get_workaddress();
_job=user.get_job();
_birth=user.get_birth();
_blogname=user.get_blogname();
System.out.println(_name+","+_nick+","+_address+","+_sex+","+_workaddress+","
+_job+","+_birth+","+_blogname);
//输入修改后信息
%>
<tr>
<td width="200px" style="text-align: center;"> <img  src="img/minion.png" height="60px" width="60px"  /><br>
 <span style="font-size:16px;font-weight:bold;">李银河  </span> </td>
<td width="800px">
<div style="width:780px;background-color:#FFD700">基本资料</div>
<table border="2">
<tr ><td width="200px">昵称：</td><td width="580px"><input type="text" name="nick" value='<%=_nick %>'></td></tr>
<tr ><td width="200px">真实姓名：</td><td width="580px"><input type="text" name="name" value='<%=_name %>'> </td></tr>
<tr ><td width="200px">生日：</td><td width="580px"><input type="text" name="birth" value='<%=_birth %>'> </td></tr>
<tr ><td width="200px">性别：</td><td width="580px"><input type="text" name="sex" value='<%=_sex %>'> </td></tr>
<tr ><td width="200px">家庭住址：</td><td width="580px"><input type="text" name="address" value='<%=_address %>'> </td></tr>
<tr ><td width="200px">职业：</td><td width="580px"><input type="text"  name="job" value='<%=_job %>'> </td></tr>
<tr ><td width="200px">工作单位：</td><td width="580px"><input type="text" name="workaddress" value='<%=_workaddress %>'> </td></tr>

</table>
</td>
</tr>

</table>  
</form>


<button type="button" style="width:100px;height:30px;"  onClick='Xiugaixinxi()'>确认修改 </button>
</div>
     
<form name="xierizhi">     
     <div id="eighth" name="写日志" style="display:none">                                               <!--  写日志 -->
    <input type='text' name='title' style='width:990px;height:25px;padding:5px;' placeholder='请输入标题' name=''><br>
     <textarea name='article' style="width:1000px;height:280px;"></textarea> <br>
     <button type="button"  style="width:100px;height:30px;" onClick='WritePassage()'>发表博文  </button>
     </div> 
 </form> 
 <form name="bowenliuyan">   
<%
String spid=request.getParameter("pid");
int pid=Integer.parseInt(spid);
Passage nowp=passageop.getById(pid);
System.out.println(nowp.get_title()+nowp.get_time()+nowp.get_article());
%>
     
     <div id="nineth" name="日志详情" style="display:none">                                           <!-- 日志详情 -->
  <br> <span style="font-size:32px;font-weight:bold; font-family:Microsoft YaHei"> <%=nowp.get_title() %>    </span> <br><br>
<%=nowp.get_article() %>
     <br><br>

 <div id="liuyan"  style="width:760px;display:none">
 <textarea style="width:750px;height:80px;" name="words"></textarea> <br>
<button type="button" style="width:100px;height:30px;" onClick='Fabiaopinglun()'>发表  </button><button type="button" style="width:100px;height:30px;" onClick='hideliu("liuyan")'>收起  </button>
</div> 

<button type="button" style="width:100px;" onClick='PinglunBowen()'>评论  </button><button type="button" style="width:100px;" onClick='ShanchuBenwen()'>删除本文 </button>

<%
CommentOP commentop=new CommentOP();
ArrayList<Comment> comments=new ArrayList<Comment>();
commentop.get_Comments(comments, pid);
Iterator<Comment> citer=comments.iterator();
while(citer.hasNext())
{
	Comment comment=(Comment)citer.next();
	BloggerInfo cbloggerinfo=new BloggerInfo();
	String nick=bloggerinfo.get_Nick(comment.get_send());
	System.out.println(nick+"评论："+comment.get_words()+"----------"+comment.get_time());
	String pp=nick+"评论："+comment.get_words()+"----------"+comment.get_time();
	int sid=comment.get_id();
%>
<table  style="border-style: dashed;" >
<tr ><td width="780px"><%=pp %> </td><td><button type="button" style="width:100px;" value="<%=sid %>"  onClick='HuifuBowen(this)'>回复  </button></td></td><td><button type="button" style="width:100px; " value="<%=sid %>" onClick='Shanchupinglun(this)'>删除 </button></td></tr>

<%
ArrayList<Anser> ansers=new ArrayList<Anser>();
AnserOP anserop=new AnserOP();
anserop.get_cAnser(ansers,sid);
Iterator<Anser> aiter=ansers.iterator();
while(aiter.hasNext())
{
	Anser anser=(Anser) aiter.next();
	String anick=bloggerinfo.get_Nick(anser.get_aid());
	String app="   "+anick+"回复："+anser.get_anser()+"----------"+anser.get_time();
	%>
<tr ><td width="780px"><%=app %></td></tr>
	<% 
	System.out.println(anick+"回复："+anser.get_time()+anser.get_anser());

}
%>
</table>
<%
}
%>
  </div>    
  </form>
 <div id="first" name="第一块">

</div>
 
 



</body>

<script type="text/javascript">
var reqs=<%=req%>
if(reqs=="bowenxiangqing")
{
	showhidediv("bowenxq");
}
else if(reqs=="boyou")
{
	showhidediv("boyou");
}
else if(reqs=="mybowen")
	{
	showhidediv("mybowen");
	}
var  xmlhttp;
var pin=0;
var ppid=0;

function Toother(tt)
{
	var uid=tt.value;
	window.location.href="OtherBlog.jsp?uid="+uid;
	}
function PinglunBowen()
{
	showliu("liuyan")
	pin=1;
	}

function HuifuBowen(dd)
{
	showliu("liuyan")
	pin=2;
	ppid=dd.value;
	}
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

function proc_add(){
	 // alert( "处理ajax" );
}

function proc_change(){
	 // alert( "处理ajax" );
	 if (xmlhttp.readyState==4 && xmlhttp.status==200){
	     // ajax_code.jsp处理完毕，并且返回了数据
	     var repeat = xmlhttp.responseXML.getElementsByTagName(
	    		 "repeat")[0].firstChild.nodeValue;
	    	 alert(repeat);
	 }
}

function Shanchupinglun(ss)
{
	var sid=ss.value;
	loadXMLDoc("DleteBPinglun_Code.jsp?sid="+sid, proc_add );
	 window.location.href="MyBlog.jsp?pid="+pid+"&req='bowenxiangqing'";
}

function ShanchuBenwen()
{
	var pid=<%=pid%>;
	loadXMLDoc("DeleteBowen_Code.jsp?pid="+pid, proc_add );
	 window.location.href="MyBlog.jsp?pid="+pid+"&req='mybowen'";
}

function Fabiaopinglun()
{
	if(pin==1)
		{
		var uid="<%=_uid%>";//当前登录的账号id	
		var pid=<%=pid%>;
		var words=document.bowenliuyan.words.value;
	 loadXMLDoc("Fabiaopinglun_Code.jsp?uid="+uid+"&pid="+pid+"&words="+words, proc_add );
	 window.location.href="MyBlog.jsp?pid="+pid+"&req='bowenxiangqing'";
		}
	else if(pin==2)
		{
		var uid="<%=_uid%>";//当前登录的账号id	
		var sid=ppid;
		var pid=<%=pid%>;
		var words=document.bowenliuyan.words.value;
	 loadXMLDoc("Huifupinglun_Code.jsp?uid="+uid+"&sid="+sid+"&words="+words, proc_add );
	 window.location.href="MyBlog.jsp?pid="+pid+"&req='bowenxiangqing'";
		}
	
}

function WritePassage()
{
	var uid="<%=_uid%>";//当前登录的账号id	
	var title=document.xierizhi.title.value;
	var article=document.xierizhi.article.value;
	 loadXMLDoc("WPassage_Code.jsp?uid="+uid+"&title="+title+"&article="+article, proc_add );
	 showhidediv("mybowen");
}

function QuGuan(dd)
{
	var uid=<%=_uid%>;
	var fid=dd.value;
	loadXMLDoc("Quguan_Code.jsp?uid="+uid+"&fid="+fid, proc_add );
	window.location.href="MyBlog.jsp?pid=11&req='boyou'";
}

function Xiugaixinxi()
{
	var uid="<%=_uid%>";//当前登录的账号id	
	var name=document.gerenxinxi.name.value;
	var nick=document.gerenxinxi.nick.value;
	var address=document.gerenxinxi.address.value;
	var sex=document.gerenxinxi.sex.value;
	var workaddress=document.gerenxinxi.workaddress.value;
	var job=document.gerenxinxi.job.value;
	var birth=document.gerenxinxi.birth.value;
	var blogname="";
	alert(uid+name+nick+address+sex+workaddress+job+birth);
	loadXMLDoc("Xiugaixinxi_Code.jsp?uid="+uid+"&=name="+name+
			"&nick="+nick+"&address="+address+"&sex="+sex+"&workaddress="
			+workaddress+"&job="+job+"&birth="+birth+"&blogname="+blogname, proc_change );
}
s
function comeback(){
	window.location.href="Home_Page.jsp";
}

function showliu(id){
	var File=document.getElementById(id);   
    File.style.display='block';
	}
function hideliu(id){
	var File=document.getElementById(id);   
     File.style.display='none';
     }

function BowenXq(dd)
{
	var id=dd.value;
	window.location.href="Data.jsp?pid="+id;
}

	function showhidediv(id) {
		var File3 = document.getElementById("third"); //shouye
		var File4 = document.getElementById("fourth"); //mybowen
		var File5 = document.getElementById("fivth"); //boyou
		var File6 = document.getElementById("sixth"); //liuyanb
		var File7 = document.getElementById("seventh"); //myxinxi
		var File8 = document.getElementById("eighth"); //xiebowen
		var File9 = document.getElementById("nineth"); //bowenxq
		if (id == 'shouye') {
			if (File3.style.display == 'none') {
				File3.style.display = 'block';
				File4.style.display = 'none';
				File5.style.display = 'none';
				File6.style.display = 'none';
				File7.style.display = 'none';
				File8.style.display = 'none';
				File9.style.display = 'none';
			}
		} else if (id == 'mybowen') {
			if (File4.style.display == 'none') {
				File3.style.display = 'none';
				File4.style.display = 'block';
				File5.style.display = 'none';
				File6.style.display = 'none';
				File7.style.display = 'none';
				File8.style.display = 'none';
				File9.style.display = 'none';
			}
		} else if (id == 'boyou') {
			if (File5.style.display == 'none') {
				File3.style.display = 'none';
				File4.style.display = 'none';
				File5.style.display = 'block';
				File6.style.display = 'none';
				File7.style.display = 'none';
				File8.style.display = 'none';
				File9.style.display = 'none';
			}
		} else if (id == 'liuyanb') {
			if (File6.style.display == 'none') {
				File3.style.display = 'none';
				File4.style.display = 'none';
				File5.style.display = 'none';
				File6.style.display = 'block';
				File7.style.display = 'none';
				File8.style.display = 'none';
				File9.style.display = 'none';
			}
		} else if (id == 'myxinxi') {
			if (File7.style.display == 'none') {
				File3.style.display = 'none';
				File4.style.display = 'none';
				File5.style.display = 'none';
				File6.style.display = 'none';
				File7.style.display = 'block';
				File8.style.display = 'none';
				File9.style.display = 'none';
			}
		} else if (id == 'xiebowen') {
			if (File8.style.display == 'none') {
				File3.style.display = 'none';
				File4.style.display = 'none';
				File5.style.display = 'none';
				File6.style.display = 'none';
				File7.style.display = 'none';
				File8.style.display = 'block';
				File9.style.display = 'none';
			}
		} else if (id == 'bowenxq') {
			if (File9.style.display == 'none') {
				File3.style.display = 'none';
				File4.style.display = 'none';
				File5.style.display = 'none';
				File6.style.display = 'none';
				File7.style.display = 'none';
				File8.style.display = 'none';
				File9.style.display = 'block';
			}
		}
	}
</script>
</html>