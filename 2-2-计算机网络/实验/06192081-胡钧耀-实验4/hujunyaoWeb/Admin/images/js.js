/*���*/
function chkformdata(frm)
{
	if(frm.Title.value.trim()=="")
	{
		ShowErrMsg("���ⲻ��Ϊ�գ�������");
		frm.Title.focus();
		return false;
	}
	if(frm.ClassID.value=="")
	{
		ShowErrMsg("��Ŀ����Ϊ�գ���ѡ��");
		frm.ClassID.focus();
		return false;
	}
	var __Content = Content___Frame.frames[0].document.body.innerHTML.trim();
	if(__Content=="<P></P>" || __Content=="<P>&nbsp;</P>")
	{
		ShowErrMsg("���ݲ���Ϊ�գ�������");
		Content___Frame.frames[0].focus();
		return false;
	}
	if((frm.IsPlay.checked || frm.IsIndexImg.checked) && frm.PicFile.value.trim()=="")
	{
		ShowErrMsg("ͼƬ����Ϊ��,���ϴ�");
		frm.PicFile.focus();
		return false;
	}
	
	frm.action = frm.action + "&ClassID=" + frm.ClassID.value;
	
	frm.bntSubmit.disabled = true;
	frm.bntSubmit.value = "���Ժ�...";
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
/*����*/
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
		alert("��ѡ��һƪ����Ҫ�޸�/�鿴������");
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
		alert("��ѡ��һƪ����Ҫ���Ƶ�����");
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
		alert("��ѡ������Ҫת�Ƶ�����");
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
		alert("����Ҫ����ѡ��һƪ���½�����ز���");
		else
		{
			frm.Cmd.value = aStr;
			frm.submit();
		}
}