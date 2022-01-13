String.prototype.trim = function(){ return this.replace(/(^\s*)|(\s*$)/g, "");}
function chk(frm){
	if(frm.Content.value.trim()=="")
	{
		alert("请输入评论内容，谢谢！");
		frm.Content.focus();
		return false;
	}
	if(frm.Content.value.trim().length>250)
	{
		alert("评论内容不能超过250个字符，谢谢！");
		frm.Content.focus();
		return false;
	}
	if(frm.UserName.value.trim()=="")
	{
		alert("请输入您的名字，谢谢！");
		frm.UserName.focus();
		return false;
	}
	frm.bntSubmit.disabled = true;
	frm.submit();
}
window.onload = function(){
var h1 = document.body.scrollHeight;
var h2 = document.documentElement.scrollHeight;
var h = Math.max(h1, h2);
var obj = parent.document.getElementById("ifr_pl");
obj.style.height = h + "px";
}