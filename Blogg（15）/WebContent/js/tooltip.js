var xPos;
var yPos;


function showToolTip(evt){
    if (evt) {
        var url = evt.target;
    }
    else {
        evt = window.event;
        var url = evt.srcElement;
    }
    xPos = evt.clientX;
    yPos = evt.clientY;
  
   var toolTip = document.getElementById("toolTip");
   toolTip.innerHTML = " <input type='text' style='height:25px;padding:5px;' placeholder='请输入用户名' name='YHM'> <br>"
   +" <input  type='password' style='height:25px;padding:5px;' placeholder='请输入密码' name='MM'><br>"
   +"<button type='button'style='width:80px;padding:5px;' onClick='DENGLU()'>登录 </button>&nbsp;"
   +"<button type='button'style='width:80px;padding:5px;' onClick='ZHUCE()'>注册 </button>"
   toolTip.style.top = parseInt(yPos)+2 + "px";
   toolTip.style.left = parseInt(xPos)+2 + "px";
   toolTip.style.visibility = "visible";
   
}

function showhidediv(id){
	
	var ONE=document.getElementById("one");
	var TWO=document.getElementById("two");
	if (id == one) {
		if (ONE.style.display=='none') {
		    ONE.style.display='block';   
		    TWO.style.display='none';    
		    }
		}
	else{
		if (TWO.style.display=='none') {
			TWO.style.display='block';   
			ONE.style.display='none';    
			}
	}
	
}

function DENGLU(){
	var uid="17826875887";
	window.location.href="MyBlog.jsp?pid=11&uid="+uid;
}
function ZHUCE(){
	window.location.href="ZhuCe.jsp";
}

function hideToolTip(){
   var toolTip = document.getElementById("toolTip");
   toolTip.style.visibility = "hidden";
}