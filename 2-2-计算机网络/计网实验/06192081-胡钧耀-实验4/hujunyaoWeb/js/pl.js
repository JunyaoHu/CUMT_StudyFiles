String.prototype.trim = function(){ return this.replace(/(^\s*)|(\s*$)/g, "");}
function chk(frm){
	if(frm.Content.value.trim()=="")
	{
		alert("�������������ݣ�лл��");
		frm.Content.focus();
		return false;
	}
	if(frm.Content.value.trim().length>250)
	{
		alert("�������ݲ��ܳ���250���ַ���лл��");
		frm.Content.focus();
		return false;
	}
	if(frm.UserName.value.trim()=="")
	{
		alert("�������������֣�лл��");
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