<%@LANGUAGE="VBSCRIPT" CODEPAGE="936"%>
<%dbdns="../"
Application(SiteID & "_Ok3w_SiteTitle") = ""%>
<!--#include file="chk.asp"-->
<!--#include file="../AppCode/Class/Ok3w_SiteConfig.asp"-->
<!--#include file="../AppCode/fun/function.asp"-->
<%
Call CheckAdminFlag(1)

Select Case Trim(Request.Form("action"))
	Case "edit"
		Set SiteConfig = New Ok3w_SiteConfig
		Call SiteConfig.Edit()
		Call SaveAdminLog("�༭ϵͳ����")
		Call CloseConn()
		Call ActionOk("Sys_Config.asp")
End Select

Function IsObjInstalled(ObjName)
	On Error ReSume Next
	Set Obj = Server.CreateObject(ObjName)
	If Err.Number<>0 Then
		Err.Clear
		IsObjInstalled = False
		Else
			IsObjInstalled = True
	End If
	On Error Goto 0
End Function
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>��̨����ϵͳ</title>
<link rel="stylesheet" type="text/css" href="images/Style.css">
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
                background="images/tab_active_bg.gif" class="tab"><strong class="mtitle">��̨����ϵͳ</strong></td>
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
                valign="top" bgcolor="#fffcf7"><table width="100%" border="0" cellpadding="5" cellspacing="1" bgcolor="#CCCCCC">
                      <form id="form1" name="form1" method="post" action="">
                        <tr>
                          <td colspan="2" align="left" bgcolor="#EBEBEB"><strong>��վ��������</strong></td>
                        </tr>
                        <tr>
                          <td height="30" align="right" bgcolor="#FFFFFF">����</td>
                          <td bgcolor="#FFFFFF"><input name="SiteCloseNote" type="text" value="<%=Application(SiteID & "_Ok3w_SiteCloseNote")%>" size="50" /></td>
                        </tr>
                        <tr>
                          <td height="30" align="right" bgcolor="#FFFFFF">IP��λ</td>
                          <td bgcolor="#FFFFFF"><input name="SiteCoName" type="text" id="SiteCoName" value="<%=Application(SiteID & "_Ok3w_SiteCoName")%>" size="50" /></td>
                        </tr>
                        <tr>
                          <td height="30" align="right" bgcolor="#FFFFFF">��վ����</td>
                          <td bgcolor="#FFFFFF"><input name="SiteName" type="text" value="<%=Application(SiteID & "_Ok3w_SiteName")%>" size="50" /></td>
                        </tr>
                        <tr>
                          <td height="30" align="right" bgcolor="#FFFFFF">��վ����</td>
                          <td bgcolor="#FFFFFF"><input name="SiteTitle" type="text" value="<%=Application(SiteID & "_Ok3w_SiteTitle")%>" size="50" /></td>
                        </tr>
                        <tr>
                          <td height="30" align="right" bgcolor="#FFFFFF">��վ�ؼ���</td>
                          <td bgcolor="#FFFFFF"><input name="SiteKeyWords" type="text" value="<%=Application(SiteID & "_Ok3w_SiteKeyWords")%>" size="50" /></td>
                        </tr>
                        <tr>
                          <td height="30" align="right" bgcolor="#FFFFFF">��վ����</td>
                          <td bgcolor="#FFFFFF"><textarea name="SiteDescription" cols="80" rows="3"><%=Application(SiteID & "_Ok3w_SiteDescription")%></textarea></td>
                        </tr>
                        <tr>
                          <td height="30" align="right" bgcolor="#FFFFFF">��վ��ַ</td>
                          <td bgcolor="#FFFFFF"><input name="SiteUrl" type="text" value="<%=Application(SiteID & "_Ok3w_SiteUrl")%>" size="50" /></td>
                        </tr>
                        <tr>
                          <td height="30" align="right" bgcolor="#FFFFFF">&nbsp;TCP/IP������</td>
                          <td bgcolor="#FFFFFF"><input name="SiteTCPIP" type="text" id="SiteTCPIP" value="<%=Application(SiteID & "_Ok3w_SiteTCPIP")%>" size="50" /></td>
                        </tr>
                        <tr>
                          <td align="right" bgcolor="#FFFFFF">����ͳ�ƴ���</td>
                          <td bgcolor="#FFFFFF"><textarea name="SiteTongji" cols="48" rows="3" id="SiteTongji"><%=Application(SiteID & "_Ok3w_SiteTongji")%></textarea></td>
                        </tr>
                        <tr style="display:none">
                          <td align="right" bgcolor="#FFFFFF">��վ����Ŀ¼</td>
                          <td bgcolor="#FFFFFF"><input name="SitePath" type="text" id="SitePath" value="<%=Application(SiteID & "_Ok3w_SitePath")%>" size="20" /></td>
                        </tr>
                        <tr style="display:none">
                          <td align="right" bgcolor="#FFFFFF">���ݿ�����Ŀ¼</td>
                          <td bgcolor="#FFFFFF"><input name="SiteDbPath" type="text" id="SiteDbPath" value="<%=Application(SiteID & "_Ok3w_SiteDbPath")%>" size="20" /></td>
                        </tr>
                        <tr style=" display:none">
                          <td align="right" bgcolor="#FFFFFF">��̨��ַ</td>
                          <td bgcolor="#FFFFFF"><input name="SiteAdminPath" type="text" value="<%=Application(SiteID & "_Ok3w_SiteAdminPath")%>" size="20" /></td>
                        </tr>
                         <tr>
                          <td colspan="2" bgcolor="#EBEBEB"><strong>�������ã��ϴ�ͼƬ�����&ldquo;�����Ϣ&rdquo;��&ldquo;�ϴ�/ѡ��&rdquo;��ɲ���ȡͼƬ��ַ</strong></td>
                        </tr>
                        <tr>
                          <td align="right" bgcolor="#FFFFFF">LOGO</td>
                          <td bgcolor="#FFFFFF"><input name="g01" type="text" id="g01" value="<%=Application(SiteID & "_Ok3w_g01")%>" size="50" />
                            ��100px*100px��<a href="../ipimg/logo.psd" target="_blank">PSDģ��</a></td>
                        </tr>
                         <tr>
                          <td align="right" bgcolor="#FFFFFF">�Ķ�ҳLOGO</td>
                          <td bgcolor="#FFFFFF"><input name="g05" type="text" id="g05" value="<%=Application(SiteID & "_Ok3w_g05")%>" size="50" />
                            ��100px*100px��<a href="../ipimg/yuedulogo.psd" target="_blank">PSDģ��</a></td>
                        </tr>
                        <tr>
                          <td align="right" bgcolor="#FFFFFF">��ҳ������</td>
                          <td bgcolor="#FFFFFF"><input name="g06" type="text" id="g06" value="<%=Application(SiteID & "_Ok3w_g06")%>" size="50" />
                            ��300px*300px��</td>
                        </tr>
                        <tr>
                          <td align="right" bgcolor="#FFFFFF">�ֻ�����ҳ�������Լ��</td>
                          <td bgcolor="#FFFFFF"><textarea name="g07" cols="50" rows="4" id="g07"><%=Application(SiteID & "_Ok3w_g07")%></textarea>
                            ��Ҫ����4��</td>
                        </tr>
                         <tr>
                          <td align="right" bgcolor="#FFFFFF">PC���Ҳ���</td>
                          <td bgcolor="#FFFFFF"><textarea name="g08" cols="50" rows="6" id="g08"><%=Application(SiteID & "_Ok3w_g08")%></textarea></td>
                        </tr>
                         <tr>
                          <td align="right" bgcolor="#FFFFFF">��ҳ�õ�ͼ1</td>
                          <td bgcolor="#FFFFFF"><input name="g02" type="text" id="g02" value="<%=Application(SiteID & "_Ok3w_g02")%>" size="50" />
                            ��830px*356px��</td>
                        </tr> 
                         <tr>
                           <td align="right" bgcolor="#FFFFFF">ͼ1����</td>
                           <td bgcolor="#FFFFFF"><input name="g11" type="text" id="g11" value="<%=Application(SiteID & "_Ok3w_g11")%>" size="50" /></td>
                         </tr>
                         <tr>
                          <td align="right" bgcolor="#FFFFFF">ͼ2</td>
                          <td bgcolor="#FFFFFF"><input name="g03" type="text" id="g03" value="<%=Application(SiteID & "_Ok3w_g03")%>" size="50" />
                            </td>
                        </tr>
                         <tr>
                           <td align="right" bgcolor="#FFFFFF">ͼ2����</td>
                           <td bgcolor="#FFFFFF"><input name="g12" type="text" id="g12" value="<%=Application(SiteID & "_Ok3w_g12")%>" size="50" /></td>
                         </tr>
                         <tr>
                          <td align="right" bgcolor="#FFFFFF">ͼ3</td>
                          <td bgcolor="#FFFFFF"><input name="g04" type="text" id="g04" value="<%=Application(SiteID & "_Ok3w_g04")%>" size="50" />
                            </td>
                        </tr>
                         <tr>
                          <td align="right" bgcolor="#FFFFFF">ͼ3����</td>
                          <td bgcolor="#FFFFFF"><input name="g13" type="text" id="g13" value="<%=Application(SiteID & "_Ok3w_g13")%>" size="50" />
                            </td>
                        </tr>
                        <tr>
                          <td colspan="2" bgcolor="#EBEBEB"><strong>��ϵ��ʽ����</strong></td>
                        </tr>
                        <tr>
                          <td align="right" bgcolor="#FFFFFF">��ϵ��</td>
                          <td bgcolor="#FFFFFF"><input name="SiteLinkMan" type="text" id="SiteLinkMan" value="<%=Application(SiteID & "_Ok3w_SiteLinkMan")%>" size="20" /></td>
                        </tr>
                        <tr>
                          <td align="right" bgcolor="#FFFFFF">�绰</td>
                          <td bgcolor="#FFFFFF"><input name="SiteTel" type="text" value="<%=Application(SiteID & "_Ok3w_SiteTel")%>" size="20" /></td>
                        </tr>
                         <tr>
                          <td align="right" bgcolor="#FFFFFF">��ַ</td>
                          <td bgcolor="#FFFFFF"><input name="SiteAddress" type="text" value="<%=Application(SiteID & "_Ok3w_SiteAddress")%>" size="50" /></td>
                        </tr>
                        <tr>
                          <td align="right" bgcolor="#FFFFFF">΢��</td>
                          <td bgcolor="#FFFFFF"><input name="SiteFax" type="text" value="<%=Application(SiteID & "_Ok3w_SiteFax")%>" size="20" /></td>
                        </tr>
                        <tr>
                          <td align="right" bgcolor="#FFFFFF">΢�Ŷ�ά��</td>
                          <td bgcolor="#FFFFFF"><input name="SiteZip" type="text" value="<%=Application(SiteID & "_Ok3w_SiteZip")%>" size="50" />
                            ΢�Ŷ�ά�루240px*240px��</td>
                        </tr>
                        <tr>
                          <td align="right" bgcolor="#FFFFFF">����</td>
                          <td bgcolor="#FFFFFF"><input name="SiteEmail" type="text" value="<%=Application(SiteID & "_Ok3w_SiteEmail")%>" size="50" /></td>
                        </tr>
                        <tr>
                          <td align="right" bgcolor="#FFFFFF">QQ</td>
                          <td bgcolor="#FFFFFF"><input name="SiteQQ" type="text" value="<%=Application(SiteID & "_Ok3w_SiteQQ")%>" size="20" /></td>
                        </tr>
                                             
                        <tr>
                          <td align="right" bgcolor="#FFFFFF">&nbsp;</td>
                          <td bgcolor="#FFFFFF"><input name="SiteUserDengji" type="hidden" id="SiteUserDengji" value="<%=Application(SiteID & "_Ok3w_SiteUserDengji")%>">
                          <input name="action" type="hidden" id="action" value="edit" />
                              <input type="submit" name="Submit" value="�� ��" style="font-size:14px;" /></td>
                        </tr>
                      </form>
                    </table></td>
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
Set Admin = Nothing
Set SiteConfig = Nothing
%>

