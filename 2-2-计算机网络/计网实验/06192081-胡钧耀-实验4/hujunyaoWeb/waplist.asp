<%@LANGUAGE="VBSCRIPT" CODEPAGE="936"%>
<%
Const dbdns = "./"
Const Htmldns = "./"
Const Base_Target = ""
Const ChannelID = 1
%>
<!--#include file="AppCode/Conn.asp"-->
<!--#include file="AppCode/fun/wapfunction.asp"-->
<!--#include file="AppCode/Pager.asp"-->
<!--#include file="inc/vbswap.asp"-->
<%
Set Page = New TurnPage
ClassID=myCdbl(Request.QueryString("id"))
Sql="select * from Ok3w_Class where ID=" & ClassID
Rs.Open Sql,Conn,0,1
ClassID = Rs("ID")
SortPath = Rs("SortPath")
SortName = Rs("SortName")
IsPic = Rs("IsPic")
PageSize = Rs("PageSize")
Rs.Close 
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title><%=Application(SiteID & "_Ok3w_SiteCloseNote")%><%Call Ok3w_Article_Class_PageTitle(SortPath)%>_<%=Application(SiteID & "_Ok3w_SiteName")%></title>
<meta name="keywords" content="<%=Application(SiteID & "_Ok3w_SiteKeyWords")%>">
<meta name="description" content="<%=Application(SiteID & "_Ok3w_SiteDescription")%>">
<meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" name="viewport">
<link rel="stylesheet" type="text/css" href="ncss/wapstyle.css">
<link href="gaokao.css" rel="stylesheet" type="text/css" />
<link rel="shortcut icon" href="favicon.ico" /> 
</head>

<body>
<script>
(function(){
    var bp = document.createElement('script');
    var curProtocol = window.location.protocol.split(':')[0];
    if (curProtocol === 'https') {
        bp.src = 'https://zz.bdstatic.com/linksubmit/push.js';
    }
    else {
        bp.src = 'http://push.zhanzhang.baidu.com/push.js';
    }
    var s = document.getElementsByTagName("script")[0];
    s.parentNode.insertBefore(bp, s);
})();
</script>
<!--#include file="wap/head.asp"-->
<table width="350" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td bgcolor="#FFFFFF"><table width="320" border="0" align="center" cellpadding="0" cellspacing="0">
      <tr>
        <td height="50" class="g008"><%=Application(SiteID & "_Ok3w_SiteCloseNote")%><%Call Ok3w_Article_Class_Nav(SortPath)%></td>
      </tr>
      <tr>
        <td height="2" bgcolor="#333333"></td>
      </tr>
      
      <tr>
        <td align="left"><div class="wrapper">
          <div class="mm ">
            <%
If IsPic = 1 Then
	Call Ok3w_Article_pList(ClassID,100000000,PageSize,2,160,177,12)
Else
	Call Ok3w_Article_bList01(ClassID,PageSize)
End If
Call Page.PageAspList("./waplist.asp?id=" & ClassID & "&")
%>
          </div>
        </div></td>
      </tr>
      <tr>
        <td>&nbsp;</td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
  </tr>
</table>
<!--#include file="wap/foot.asp"-->
</body>
</html>