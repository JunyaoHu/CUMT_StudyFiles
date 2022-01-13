<%@LANGUAGE="VBSCRIPT" CODEPAGE="936"%>
<%Const dbdns="../"%>
<!--#include file="chk.asp"-->
<!--#include file="../AppCode/fun/function.asp"-->
<!--#include file="../AppCode/fun/CreateHtml.asp"-->
<!--#include file="../AppCode/Class/Ok3w_Guest.asp"-->
<%
'Call CheckAdminFlag(4)

Id = Trim(Request.QueryString("Id"))
TypeID = Trim(Request.QueryString("TypeID"))
Set Guest = New Ok3w_Guest
Cmd = Trim(Request.Form("cmd"))
Select Case Cmd
	Case "ask"
		Cask = Trim(Request.Form("ask"))
		Call Guest.Ask(Cask,Id)
		Call Guest.ArticleHTML(ID,TypeID)
		Set Guest = Nothing
		Call SaveAdminLog("回复留言/评论，ID=" & Id)
%>
		<script language="javascript">
			parent.location.reload();
		</script>
<%
		Response.End()
End Select
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>后台管理系统</title>
<link rel="stylesheet" type="text/css" href="images/Style.css">
</head>

<body>
<%
Sql = "select * from Ok3w_Guest where Id=" & Id
Rs.Open Sql,Conn,1,1
%>
<br />
<table width="96%" border="0" align="center" cellpadding="5" cellspacing="1" bgcolor="#EBEBEB">
  <form id="form1" name="form1" method="post" action="?Id=<%=Id%>&TypeID=<%=TypeID%>">
    
    <tr>
      <td height="25" bgcolor="#FFFFFF">留言内容</td>
      <td height="25" bgcolor="#FFFFFF"><%=OutStr(Rs("Content"))%></td>
    </tr>
    
    <tr>
      <td height="25" bgcolor="#FFFFFF">回复内容</td>
      <td height="25" bgcolor="#FFFFFF"><textarea name="ask" cols="50" rows="8" id="ask"><%=Rs("Ad_Ask")%></textarea></td>
    </tr>
    <tr>
      <td height="25" bgcolor="#FFFFFF">&nbsp;</td>
      <td height="25" bgcolor="#FFFFFF"><input type="submit" name="Submit" value="提交" />
          <input type="button" name="Submit2" value="取消" onClick="parent.g_hidde();" />
          <input name="cmd" type="hidden" id="cmd" value="ask" /></td>
    </tr>
  </form>
</table><br />
<%
Rs.Close
%>
</body>
</html>
<%
Set Guest = Nothing
Set Rs = Nothing
Call CloseConn()
Set Admin = Nothing
%>

