/*添加*/
function chkformdata(frm)
{
	if(frm.Title.value.trim()=="")
	{
		ShowErrMsg("标题不能为空，请输入");
		frm.Title.focus();
		return false;
	}
	if(frm.ClassID.value=="")
	{
		ShowErrMsg("栏目不能为空，请选择");
		frm.ClassID.focus();
		return false;
	}
	var __Content = Content___Frame.frames[0].document.body.innerHTML.trim();
	if(__Content=="<P></P>" || __Content=="<P>&nbsp;</P>")
	{
		ShowErrMsg("内容不能为空，请输入");
		Content___Frame.frames[0].focus();
		return false;
	}
	if((frm.IsPlay.checked || frm.IsIndexImg.checked) && frm.PicFile.value.trim()=="")
	{
		ShowErrMsg("图片不能为空,请上传");
		frm.PicFile.focus();
		return false;
	}
	
	frm.action = frm.action + "&ClassID=" + frm.ClassID.value;
	
	frm.bntSubmit.disabled = true;
	frm.bntSubmit.value = "请稍候...";
}

function SetUrl(url,input_name){
	if(input_name!="PicFile")
	{
		document.getElementById(input_name).value=url;
	}else
	{
		Form.PicFile.value = url;
		Form.IsPic.value = "1";	
	}
	
}

function upload(a,input_name){
	var url =document.location.host + document.location.pathname;
	var tmp = url.split("/");
	url = "http://"
	for(var i=0;i<tmp.length-2;i++){
		url = url+ tmp[i] + "/" ;
	}
	url = url + "fckeditor/";
	var url = url + "editor/filemanager/browser/default/browser.html?Type=Image&input_name="+input_name+"&Connector="+encodeURIComponent(url)+"editor%2Ffilemanager%2Fconnectors%2Fasp%2Fconnector.asp";
	a.href = url;	
}

function chkTitle(id,title){
	if(title == ""){
		return false;
	}
	Article_Chk.innerHTML = '<iframe style="display:none;" src="Article_Chk.asp?id='+id+'&title='+title+'"></iframe>';
}
/*管理*/
function ChkAll(frm)
{
	IsChkAll = !IsChkAll;
	for(var i=0; i<frm.elements.length; i++)
		if (frm.elements[i].type == "checkbox")
			frm.elements[i].checked = IsChkAll;
}

function a_edit(frm)
{
	var a_id=0;
	var a_count=0;
	for(var i=0; i<frm.elements.length; i++)
		if(frm.elements[i].name=="Id" && frm.elements[i].checked)
		{
			a_id = frm.elements[i].value;
			a_count ++;
		}
	if(a_count!=1)
		alert("请选择一篇你需要修改/查看的文章");
		else
			document.URL="Article_Edit.asp?action=edit&Id=" + a_id + "&ChannelID=" + ChannelID;	
}

function a_copy(frm)
{
	var a_id=0;
	var a_count=0;
	for(var i=0; i<frm.elements.length; i++)
		if(frm.elements[i].name=="Id" && frm.elements[i].checked)
		{
			a_id = frm.elements[i].value;
			a_count ++;
		}
	if(a_count!=1)
		alert("请选择一篇你需要复制的文章");
		else
			document.URL="Article_Edit.asp?action=copy&Id=" + a_id + "&ChannelID=" + ChannelID;
}

function a_move(frm)
{
	var a_id="";
	var a_count=0;
	for(var i=0; i<frm.elements.length; i++)
		if(frm.elements[i].name=="Id" && frm.elements[i].checked)
		{
			a_id = a_id + frm.elements[i].value + ",";
			a_count ++;
		}
	if(a_count==0)
		alert("请选择你需要转移的文章");
		else
			document.URL="Article_Move.asp?strClassID=" + a_id + "&ChannelID=" + ChannelID + "&toClass=";
}

function a_action(frm,aStr)
{
	var a_count=0;
	for(var i=0; i<frm.elements.length; i++)
		if(frm.elements[i].name=="Id" && frm.elements[i].checked)
			a_count ++;
	if(a_count==0)
		alert("你需要至少选择一篇文章进行相关操作");
		else
		{
			frm.Cmd.value = aStr;
			frm.submit();
		}
}