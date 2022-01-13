//window.onerror = function(){return true;}
String.prototype.trim = function(){ return this.replace(/(^\s*)|(\s*$)/g, "");}

function showLocale(objD)
{
	var str,colorhead,colorfoot;
	var yy = objD.getYear();
	if(yy<1900) yy = yy+1900;
	var MM = objD.getMonth()+1;
	if(MM<10) MM = '0' + MM;
	var dd = objD.getDate();
	if(dd<10) dd = '0' + dd;
	var hh = objD.getHours();
	if(hh<10) hh = '0' + hh;
	var mm = objD.getMinutes();
	if(mm<10) mm = '0' + mm;
	var ss = objD.getSeconds();
	if(ss<10) ss = '0' + ss;
	var ww = objD.getDay();
	if  ( ww==0 )  colorhead="<font color=\"#333333\">";
	if  ( ww > 0 && ww < 6 )  colorhead="<font color=\"#333333\">";
	if  ( ww==6 )  colorhead="<font color=\"#333333\">";
	if  (ww==0)  ww="星期日";
	if  (ww==1)  ww="星期一";
	if  (ww==2)  ww="星期二";
	if  (ww==3)  ww="星期三";
	if  (ww==4)  ww="星期四";
	if  (ww==5)  ww="星期五";
	if  (ww==6)  ww="星期六";
	colorfoot="</font>"
	str = colorhead + "您好！今天是：" + yy + "-" + MM + "-" + dd + " " + hh + ":" + mm + ":" + ss + "  " + ww + colorfoot;
	return(str);
}
function tick()
{
	var today;
	today = new Date();
	document.getElementById("localtime").innerHTML = showLocale(today);
	window.setTimeout("tick()", 1000);
}

function payflash(focus_width,swf_height,pics,links,texts){
	document.write('<object classid="clsid:d27cdb6e-ae6d-11cf-96b8-444553540000" codebase="http://fpdownload.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=6,0,0,0" width="'+ focus_width +'" height="'+ swf_height +'">');
	 document.write('<param name="allowScriptAccess" value="sameDomain"><param name="movie" value="images/focus.swf"><param name="quality" value="high"><param name="bgcolor" value="#FFFFFF">');
	 document.write('<param name="menu" value="false"><param name=wmode value="opaque">');
	 document.write('<param name="FlashVars" value="pics='+pics+'&links='+links+'&texts='+texts+'&borderwidth='+focus_width+'&borderheight='+focus_height+'&textheight='+text_height+'">');
	 document.write('</object>');
}

function ContentSize(size)
{
	var obj=document.getElementById("content");
	obj.style.fontSize=size>0 ? size+"px" : "";
}

function chkbook(frm){
	var _Content = Content___Frame.frames[0].document.body.innerHTML.trim();
	if(_Content=="" || _Content=="<P></P>" || _Content=="<P>&nbsp;</P>"){
		alert("您还没写要咨询的问题呢！");
		Content___Frame.frames[0].focus();
		return false;
	}
	if(frm.UserName.value.trim()==""){
		alert("请填写昵称");
		frm.UserName.focus();
		return false;
	}
	frm.bntSubmit.disabled = true;
	frm.submit();
}

function zoomIMG(img,max_width)
{ 
	var width = img.width;
	var height = img.height;
	if(width > max_width){
		img.width = max_width;
		img.height = height * max_width / width;
	}
}

function openURL(url)
{
	window.open(url);
}

function runCode(obj) {
    var winname = window.open('', "_blank", '');
    winname.document.open('text/html', 'replace');
	winname.opener = null;
    winname.document.write(obj.value);
    winname.document.close();
}

function saveCode(obj) {
    var winname = window.open('', '_blank', 'top=10000');
    winname.document.open('text/html', 'replace');
    winname.document.write(obj.value);
    winname.document.execCommand('saveas','','code.htm');
    winname.close();
}

function copyCode(obj) {
	var rng = document.body.createTextRange();
	rng.moveToElementText(obj);
	rng.scrollIntoView();
	rng.select();
	rng.execCommand("Copy");
	rng.collapse(false);
}

function Login(frm){	
	var patrn=/^[a-zA-Z0-9_\u4E00-\u9FA5]{4,20}$/;
	if(!patrn.test(frm.User_Name.value.trim()))
	{
		alert("用户名不正确：\n\n它应该是由4-20位的中文、英文、数字及下划线组成的字符");
		frm.User_Name.focus();
		return false;
	}
	var patrn=/^[a-zA-Z0-9_]{6,20}$/;
	if(!patrn.test(frm.User_Password.value.trim()))
	{
		alert("密码不正确：\n\n它应该是由6-20位的英文、数字及下划线组成的字符");
		frm.User_Password.focus();
		return false;
	}
	if(frm.ValidCode.value.trim().length!=4)
	{
		alert("验证码输错误，请重新输入。");
		frm.ValidCode.focus();
		return false;
	}
	frm.bntSubmit.disabled = true;
	frm.submit();	
}

function Reg(frm){
	var patrn=/^[a-zA-Z0-9_\u4E00-\u9FA5]{4,20}$/;
	if(!patrn.test(frm.User_Name.value.trim()))
	{
		frm.User_Name.focus();
		alert("用户名不正确：\n\n它应该是由4-20位的中文、英文、数字及下划线组成的字符");
		return false;
	}
	var patrn=/^[a-zA-Z0-9_]{6,20}$/;
	if(!patrn.test(frm.User_Password.value.trim()))
	{
		frm.User_Password.focus();
		alert("密码不正确：\n\n它应该是由6-20位的英文、数字及下划线组成的字符");
		return false;
	}
	if(frm.User_Password.value!=frm.User_Password2.value)
	{
		alert("两次输入的密码不一致，请重新输入");
		frm.User_Password2.focus();
		return false;
	}
	var patrn= /^[_a-zA-Z0-9\-]+(\.[_a-zA-Z0-9\-]*)*@[a-zA-Z0-9\-]+([\.][a-zA-Z0-9\-]+)+$/;
	if(!patrn.test(frm.Mail.value.trim()))
	{
		frm.Mail.focus();
		alert("邮箱地址格式错误，请重新输入");
		return false;
	}
	if(frm.ValidCode.value.trim().length!=4)
	{
		alert("验证码输错误，请重新输入。");
		frm.ValidCode.focus();
		return false;
	}
	frm.bntSubmit.disabled = true;
	frm.submit();
}