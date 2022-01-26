<%@LANGUAGE="VBSCRIPT" CODEPAGE="936"%>
<%dbdns="../"%>
<!--#include file="../AppCode/Conn.asp"-->
<!--#include file="../AppCode/fun/md5.asp"-->
<!--#include file="../AppCode/Class/Ok3w_Admin.asp"-->
<%
action = Trim(Request.Form("action"))
If action = "login" Then
	sGetCode = Request.Form("getcode")
	If Session("GetCode") = "" Or Session("GetCode") <> sGetCode Then
		 ErrMsg = "验证码错误"
		 Else
			Set Admin = New Admin_Info
			username = Replace(Request.Form("username"),"'","")
			userpwd = MD5(Replace(Request.Form("userpwd"),"'",""))
			Select Case Admin.AdminLogin(username,userpwd,"IsLogin")
				Case 1
					ErrMsg = "用户名或密码错误"
				Case 2
					ErrMsg = "用户被锁定"
				Case -1
					Call CloseConn()
					Randomize
					Response.Redirect("ad_index.html?rnd=" & MD5(Cstr(Rnd())))
			End Select
			Set Admin = Nothing
	End If
End If
Call CloseConn()
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>管理员登陆</title>
<LINK href="images/css.css" type=text/css rel=stylesheet>
<link rel="stylesheet" type="text/css" href="images/Style.css">
<style type="text/css">
body,td{
	font-size:14px;
}
.input0{
	width:180px;
	height:16px;
}
.inputpwd{
	width:80px;
	height:16px;
}
#showMsg{
	width:200px;
	/*position:absolute;*/
	top:10px;
	right:10px;
	/*border:solid 1px #666666;*/
	padding:5px;
	color:#FF0000;
	z-index:1000px;
}
.STYLE1 {font-size: 12px}
</style>

<script language="javascript">
String.prototype.trim = function(){ return this.replace(/(^\s*)|(\s*$)/g, "");}
function ShowErrMsg(Info)
{
	document.getElementById("showMsg").innerHTML = Info;
}
function submitfrm(frm)
{
	if(frm.username.value.trim()=="")
	{
		 ShowErrMsg("用户名不能为空，请输入");
		 frm.username.focus();
		 return false;
	}
	if(frm.userpwd.value.trim()=="")
	{
		 ShowErrMsg("密码不能为空，请输入");
		 frm.userpwd.focus();
		 return false;
	}
	if(frm.getcode.value.trim()=="")
	{
		 ShowErrMsg("验证码不能为空，请输入");
		 frm.getcode.focus();
		 return false;
	}
	return true;
}
</script>
</head>

<body>

<p>
  <%If ErrMsg<>"" Then%>
  <script language="javascript">
ShowErrMsg("<%=ErrMsg%>");
  </script>
  <%End If%>
  <br />
  <br />
</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td height="200" align="center"><a href="http://www.huzhikun.cn" target="_blank"><img src="../ipimg/003.jpg" width="400" height="135" /></a></td>
  </tr>
  <tr>
    <td height="200" bgcolor="#FFCC00"><table cellspacing="0" cellpadding="0" width="420" align="center" border="0">
      <form id="form1" name="form1" method="post" action="" onsubmit="return submitfrm(this);">
        <tbody>
          <tr>
            <td width="420" height="137"><table width="341" border="0" align="center" cellpadding="0" cellspacing="0">
              <tr>
                <td height="25">管理员帐号</td>
                <td height="25"><input id="username" style="FONT-SIZE: 9pt; WIDTH: 120px; COLOR: black" maxlength="18" name="username" /></td>
                <td height="25"><input id="Button1" type="submit" value="管理登陆" name="Button1" /></td>
              </tr>
              <tr>
                <td height="25">管理员密码</td>
                <td height="25"><input id="userpwd" style="FONT-SIZE: 9pt; WIDTH: 120px; COLOR: black" type="password"  maxlength="18" name="userpwd" />
                  <input name="action" type="hidden" id="action" value="login" /></td>
                <td height="25"><input type="reset" name="Submit" value="清除再来" /></td>
              </tr>
              <tr>
                <td height="25">程序验证码</td>
                <td height="25"><table width="100%" border="0" cellspacing="0" cellpadding="0">
                  <tr>
                    <td width="19%"><input id="getcode" style="WIDTH: 40px" maxlength="4" name="getcode" /></td>
                    <td width="81%"><img src="../AppCode/GetCode.asp" width="80" height="20" border="0" style="cursor:hand;" title="没有看清？点击换一个..." onclick="javascript:this.src='../AppCode/GetCode.asp'" /></td>
                  </tr>
                </table></td>
                <td height="25"><span style="HEIGHT: 31px">
                  <input onclick="window.location='../'" type="button" value="返回首页" name="Submit3" />
                </span></td>
              </tr>
              <tr>
                <td colspan="3">&nbsp;</td>
              </tr>
            </table></td>
          </tr>
        </tbody>
      </form>
    </table></td>
  </tr>
</table>
</body>
</html>