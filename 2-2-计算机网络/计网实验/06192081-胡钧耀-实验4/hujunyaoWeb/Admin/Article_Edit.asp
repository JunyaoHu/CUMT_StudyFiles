<%@LANGUAGE="VBSCRIPT" CODEPAGE="936"%>
<%Const dbdns="../"%>
<!--#include file="chk.asp"-->
<!--#include file="../AppCode/Class/Ok3w_Article.asp"-->
<!--#include file="../AppCode/fun/function.asp"-->
<%
Set Article = New Ok3w_Article
action = Request.QueryString("action")
Id = Request.QueryString("Id")
ChannelID = Request.QueryString("ChannelID")
ClassID = Request.QueryString("ClassID")
Select Case ChannelID
	Case 1
		Call CheckAdminFlag(3)
	Case 2
		Call CheckAdminFlag(2)
	Case Else
		Response.End()
End Select

action_ok = Request.Form("action_ok")
If action = "" Then action = "add"

Select Case action_ok
	Case "add"
		Call Article.Add()
		Call SaveAdminLog("������£�" & Article.Title)
		Call ActionOk("Article_Edit.asp?ChannelID=" & ChannelID & "&ClassID=" & ClassID & "&action=" & action & "&ID=" & ID)
	Case "edit"
		Call Article.Edit()
		Call SaveAdminLog("�޸����£�Id=" & Article.Id)
		Call ActionOk("Article_Edit.asp?ChannelID=" & ChannelID & "&ClassID=" & ClassID & "&action=" & action & "&ID=" & ID)
End Select
If ClassID<>"" Then Article.ClassID = Cdbl(ClassID)
If action="edit" Or action="copy" Then Call Article.Load(Id)
If action="" Or action="copy" Then
	action = "add"
	Id = ""
End If

If action = "auto" Then
	action = "add"
	Article.Title = Trim(Request.Form("Title"))
	Article.ClassID = Cdbl(Request.Form("ClassID"))
	Article.PicFile = Trim(Request.Form("picpath"))
	For i = 1 To Request.Form("Content").Count 
		Content = Content & Request.Form("Content")(i) 
	Next
	Article.Content = Content
End If
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>��̨����ϵͳ</title>
<link rel="stylesheet" type="text/css" href="images/Style.css">
<script type="text/javascript" src="images/js.js"></script>
</head>

<body>
<!--#include file="top.asp"-->
<br />
<table cellspacing="0" cellpadding="0" width="98%" align="center" border="0">
  <tbody>
    <tr>
      <td style="PADDING-LEFT: 2px; HEIGHT: 22px" 
    background="images/tab_top_bg.gif"><table cellspacing="0" cellpadding="0" width="477" border="0">
        <tbody>
          <tr>
            <td width="147"><table height="22" cellspacing="0" cellpadding="0" border="0">
              <tbody>
                <tr>
                  <td width="3"><img id="tabImgLeft__0" height="22" 
                  src="images/tab_active_left.gif" width="3" /></td>
                  <td 
                background="images/tab_active_bg.gif" class="tab"><strong class="mtitle">���±༭</strong></td>
                  <td width="3"><img id="tabImgRight__0" height="22" 
                  src="images/tab_active_right.gif" 
            width="3" /></td>
                </tr>
              </tbody>
            </table></td>
          </tr>
        </tbody>
      </table></td>
    </tr>
    <tr>
      <td bgcolor="#ffffff"><table cellspacing="0" cellpadding="0" width="100%" border="0">
        <tbody>
          <tr>
            <td width="1" background="images/tab_bg.gif"><img height="1" 
            src="images/tab_bg.gif" width="1" /></td>
            <td 
          style="PADDING-RIGHT: 10px; PADDING-LEFT: 10px; PADDING-BOTTOM: 10px; PADDING-TOP: 10px" 
          valign="top"><div id="tabContent__0" style="DISPLAY: block; VISIBILITY: visible">
              <table cellspacing="1" cellpadding="1" width="100%" align="center" 
            bgcolor="#8ccebd" border="0">
                <tbody>
                  <tr>
                    <td 
                style="PADDING-RIGHT: 10px; PADDING-LEFT: 10px; PADDING-BOTTOM: 10px; PADDING-TOP: 10px" 
                valign="top" bgcolor="#fffcf7"><table width="100%" border="0" cellpadding="3" cellspacing="1" bgcolor="#EBEBEB">
                      <form id="Form" name="Form" method="post" action="?action=<%=action%>&Id=<%=Id%>&ChannelID=<%=ChannelID%>" onSubmit="return chkformdata(this);">
                        <tr bgcolor="#FFFFFF">
                          <td width="50" align="right">����<span class="red">*</span></td>
                          <td><input name="Title" type="text" id="Title" value="<%=Article.Title%>" size="50" maxlength="255" onBlur="chkTitle('<%=Id%>',this.value);" /><span id="Article_Chk"></span></td>
                        </tr>
                        
                        <tr bgcolor="#FFFFFF">
                          <td align="right">����<span class="red">*</span></td>
                          <td><select name="ClassID">
                            <option value="">������ѡ�����</option>
						  <%Call InitClassSelectOption(ChannelId,0,Article.ClassID)%>
						  </select>						</td>
                        </tr>
                         <tr bgcolor="#FFFFFF">
                          <td rowspan="2" align="right">��Ƶ��</td>
                          <td><table width="900" border="0" cellspacing="0" cellpadding="0">
                            
                          
                            <tr>
                              <td width="63" height="100" align="right" bgcolor="#FF6666">PC��&nbsp; </td>
                              <td width="837" bgcolor="#FF6666"><textarea name="Keywords" cols="70" rows="4" id="Keywords"><%=Article.Keywords%></textarea>                                        
                                �� width="640" height="498" ��û�пɲ���д��</td>
                            </tr>

                               </table></td>
                        </tr>
                         <tr bgcolor="#FFFFFF">
                          <td><table width="900" border="0" cellspacing="0" cellpadding="0">
                            
                            
                            <tr>
                              <td width="63" height="100" align="right" bgcolor="#FF6666">�ֻ���&nbsp; </td>
                              <td width="837" bgcolor="#FF6666"><textarea name="wapshipin" cols="70" rows="4" id="wapshipin"><%=Article.wapshipin%></textarea>                                        
                                �� width="300" height="240" ��û�пɲ���д��</td>
                              </tr>
                            
                          </table></td>
                        </tr>
                        <tr bgcolor="#FFFFFF">
                          <td align="right">��Ʒ���ԣ�</td>
                          <td><table width="1000" border="0" cellspacing="0" cellpadding="0">
                            <tr>
                              <td height="30" align="right" bgcolor="#FFCC00">&nbsp;</td>
                              <td height="60" bgcolor="#FFCC00"><h1>�ر�ע�⣺����ͼƬ��Ȳ�����700px,�߶Ȳ��ޣ��ϴ�ʱ�ѿ��ֵȥ�������ж���</h1></td>
                            </tr>
                           
                          </table></td>
                        </tr>
                        <tr bgcolor="#FFFFFF">
                          <td align="right">����<span class="red">*</span></td>
                          <td>
<div id="eWebEditor">
<div style=" position:absolute; z-index:9999; width:92px; height:25px; right:42px; padding-top:68px;">
<iframe id="DoRemote" src="../fckeditor/editor/filemanager/connectors/asp/doremote/upload.asp" width="92" height="25" scrolling="no" frameborder="0"></iframe>
</div>
<%
Content = Article.Content
s_NextPage = "<div style=""page-break-after: always""><span style=""display: none"">&nbsp;</span></div>"
Content = Replace(Content,"[Ok3w_NextPage]",s_NextPage)
%>
<script type="text/javascript" src="../fckeditor/fckeditor.js"></script>
<textarea name="Content" id="Content" style="display:none;"><%=Server.HTMLEncode(Content)%></textarea>
<script type="text/javascript">
Ok3w_CreateFCKeditor(2,"Content","Default","100%","350");
</script>
</div>                          </td>
                        </tr>
                        <tr bgcolor="#FFFFFF">
                          <td align="right">ժҪ</td>
                          <td><textarea name="Description" cols="49" rows="2" id="Description"><%=Article.Description%></textarea></td>
                        </tr>
                        <tr bgcolor="#FFFFFF">
                          <td align="right">��ɫ</td>
                          <td><input name="TitleColor" type="text" value="<%=Article.TitleColor%>" size="42" maxlength="7">
                            <select name="select" onChange="this.form.TitleColor.value=this.value;">
                              <option value="">ѡ��</option>
                              <option value="#FF0000">��ɫ</option>
                              <option value="#0000FF">��ɫ</option>
                              <option value="#008800">��ɫ</option>
                            </select></td>
                        </tr>
                        <tr bgcolor="#FFFFFF">
                          <td align="right">����</td>
                          <td><input name="TitleURL" type="text" id="TitleURL" value="<%=Article.TitleURL%>" size="50" maxlength="255" /></td>
                        </tr>
                        <tr bgcolor="#FFFFFF">
                          <td align="right">ͼƬ</td>
                          <td>
                          <input name="PicFile" type="text" id="PicFile" size="50" value="<%=Article.PicFile%>" />
                            <a href="#" target="_blank" onClick="upload(this,'PicFile');">�ϴ�/ѡ��</a>��ͼƬ�ߴ磺147px*110px��</td>
                        </tr>
                        <tr bgcolor="#FFFFFF">
                          <td align="right">����</td>
                          <td><input name="IsPass" type="checkbox" id="IsPass" value="1" <%If Article.IsPass Then%>checked="checked"<%End If%> />��ͨ
                            
                            <input name="IsIndexImg" type="checkbox" id="IsIndexImg" value="1" checked <%If Article.IsIndexImg Then%>checked="checked"<%End If%>>
                            ��ҳ��ʾ
                            <input name="IsCommend" type="checkbox" id="IsCommend" value="1" <%If Article.IsCommend Then%>checked="checked"<%End If%> />�Ƽ�
                            <input name="IsTop" type="checkbox" id="IsTop" value="1" <%If Article.IsTop Then%>checked="checked"<%End If%> />�ö�
                            <input name="IsPic" type="hidden" id="IsPic" value="<%=Article.IsPic%>">
                            <input name="IsDelete" type="hidden" id="IsDelete" value="<%=Article.IsDelete%>"></td>
                        </tr>
                        <tr bgcolor="#FFFFFF">
                          <td align="right">��Դ</td>
                          <td><input name="ComeFrom" type="text" id="ComeFrom" value="<%=Article.ComeFrom%>" size="20" />
                            ����
                            <input name="Author" type="text" id="Author" value="<%=Article.Author%>" size="20" />
                            ʱ��
                            <input name="AddTime" type="text" id="AddTime" value="<%=Article.AddTime%>" size="18" />
                            �鿴
                            <input name="Hits" type="text" id="Hits" value="<%=Article.Hits%>" size="4" />
                            ������
                            <input name="Inputer" type="text" id="Inputer" value="<%=Article.Inputer%>" size="20" readonly/>
                          </td>
                        </tr>
                        <tr bgcolor="#FFFFFF">
                          <td align="right">&nbsp;</td>
                          <td><input name="action_ok" type="hidden" id="action_ok" value="<%=action%>" />
                              <input name="IsUserAdd" type="hidden" id="IsUserAdd" value="<%=Article.IsUserAdd%>">
                              <input name="GiveJifen" type="hidden" id="GiveJifen" value="<%=Article.GiveJifen%>">
                              <input name="bntSubmit" type="submit" class="bnt14" id="bntSubmit"  value=" �������� "/>
                              <input name="Submit" type="button" class="bnt14" onClick="javascript:document.URL='Article_List.asp?ChannelID=<%=ChannelID%>';" value=" ȡ�� " /></td>
                        </tr>
                      </form>
                    </table>
</td>
                  </tr>
                </tbody>
              </table>
            </div></td>
            <td width="1" background="images/tab_bg.gif"><img height="1" 
            src="images/tab_bg.gif" width="1" /></td>
          </tr>
        </tbody>
      </table></td>
    </tr>
    <tr>
      <td background="images/tab_bg.gif" bgcolor="#ffffff"><img height="1" 
      src="images/tab_bg.gif" width="1" /></td>
    </tr>
  </tbody>
</table>
</body>
</html>
<%
Call CloseConn()
Set Article = Nothing
Set Admin = Nothing
%>