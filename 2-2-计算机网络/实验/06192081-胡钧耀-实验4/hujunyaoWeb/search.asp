<%@LANGUAGE="VBSCRIPT" CODEPAGE="936"%>
<%
Const dbdns = "./"
Const Htmldns = "./"
Const Base_Target = ""
Const ChannelID = 1
%>
<!--#include file="AppCode/Conn.asp"-->
<!--#include file="AppCode/fun/function.asp"-->
<!--#include file="AppCode/Pager.asp"-->
<!--#include file="inc/vbsnews.asp"-->
<%
Set Page = New TurnPage
ClassID=""
Keyword = Left(Trim(Request.QueryString("q")),50)
q = OutStr(CmdSafeLikeSqlStr(Keyword))
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title><%=q%>_<%=Application(SiteID & "_Ok3w_SiteName")%></title>
<link rel="stylesheet" type="text/css" href="ncss/style.css">
<link rel="stylesheet" type="text/css" href="ncss/gaokao2017.css">
</head>

<body>
<!--#include file="inc/head.asp"-->
<table width="1380" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td>&nbsp;</td>
  </tr>
</table>
<table width="900" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td height="80" align="center" class="g008">您刚才搜索的是 <u><font color="#E60012"><%=q%></font></u> ，以下是相关信息</td>
  </tr>
  <tr>
    <td height="5" bgcolor="#E60012"></td>
  </tr>
</table>
<table width="900" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td bgcolor="#FFFFFF"><table width="750" border="0" align="center" cellpadding="0" cellspacing="0">
      <tr>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td height="300" valign="top" bgcolor="#FFFFFF"><div class="wrapper">
          <div class="mm ">
            <%
Call Ok3w_Article_Search("","Title",Keyword,40)
Call Page.PageAspList("./search.asp?q=" & Keyword & "&")
%>
          </div>
        </div></td>
      </tr>
    </table></td>
  </tr>
</table>
<!--#include file="inc/foot.asp"-->
</body>
</html>