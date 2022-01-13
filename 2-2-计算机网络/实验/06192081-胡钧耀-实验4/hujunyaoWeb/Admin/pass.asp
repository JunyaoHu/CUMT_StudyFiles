<%@LANGUAGE="VBSCRIPT" CODEPAGE="936"%>
<%dbdns="../"%>
<!--#include file="chk.asp"-->
<!--#include file="../AppCode/fun/md5.asp"-->
<%
action = Trim(Request.Form("action"))
If action = "edit" Then
	If Not Admin.AdminEditPassWord(Trim(Request.Form("oldpwd")),Trim(Request.Form("newpwd"))) Then
		Session("ErrMsg") = "原密码输入有误。"
		Else
			Call SaveAdminLog("成功修改个人密码")
	End If
	Call ActionOk("pass.asp")
End If
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>后台管理系统</title>
<link rel="stylesheet" type="text/css" href="images/Style.css">
<style type="text/css">
<!--
.STYLE1 {color: #FFFFFF}
-->
</style>
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
                  <td class="mtitle" 
                background="images/tab_active_bg.gif">修改密码</td>
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
                valign="top" bgcolor="#fffcf7">
                      <table border="0" cellpadding="0" cellspacing="1" bgcolor="#EBEBEB">
                        <form id="form1" name="form1" method="post" action="">
						<tr>
                          <td width="117" height="25" align="right" bgcolor="#FFFFFF">原密码&nbsp;</td>
                          <td width="263" height="25" align="left" bgcolor="#FFFFFF">&nbsp;
                            <input name="oldpwd" type="password" class="input1" id="oldpwd" /></td>
                        </tr>
                        <tr>
                          <td width="117" height="25" align="right" bgcolor="#FFFFFF">新密码&nbsp;</td>
                          <td height="25" align="left" bgcolor="#FFFFFF">&nbsp;
                            <input name="newpwd" type="password" class="input1" id="newpwd" /></td>
                        </tr>
                        <tr>
                          <td width="117" height="25" align="right" bgcolor="#FFFFFF">确认新密码&nbsp;</td>
                          <td height="25" align="left" bgcolor="#FFFFFF">&nbsp;
                            <input name="newpwd1" type="password" class="input1" id="newpwd1" /></td>
                        </tr>
                        <tr>
                          <td height="25" colspan="2" align="center" bgcolor="#FFFFFF"><input name="action" type="hidden" id="action" value="edit" />
                          <input type="button" name="Submit" value="修改" onClick="javascript:formsubmit(this.form);" /></td>
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
<script language="javascript">
function formsubmit(frm)
{
	if(frm.oldpwd.value.trim()=="")
	{
		ShowErrMsg("原密码不能为空，请输入")
		frm.oldpwd.focus();
		return false;
	}
	if(frm.newpwd.value.trim()=="")
	{
		ShowErrMsg("新密码不能为空，请输入")
		frm.newpwd.focus();
		return false;
	}
	if(frm.newpwd.value.trim()!=frm.newpwd1.value.trim())
	{
		ShowErrMsg("两次输入的新密码不一致，请输入")
		frm.newpwd1.focus();
		return false;
	}
	frm.submit();
}
</script>
</body>
</html>
<%
Call CloseConn()
Set Admin = Nothing
%>

