<%@LANGUAGE="VBSCRIPT" CODEPAGE="936"%>
<%
Const dbdns = "./"
Const Htmldns = "./"
Const Base_Target = ""
Const ChannelID = 1
%>
<!--#include file="AppCode/Conn.asp"-->
<!--#include file="wap/functionwap.asp"-->
<!--#include file="AppCode/Class/Ok3w_Article.asp"-->
<!--#include file="inc/vbs.asp"-->
<%
id=myCdbl(Request.QueryString("id"))
Set Article = New Ok3w_Article
Call Article.HitsAdd(Id)
Call Article.Load(Id)
If Article.IsPass=0 Then Call Page_Err("文章已经关闭")
If Article.IsDelete=1 Then Call Page_Err("文章已经删除")
'ClassID = Article.ClassID
'SortPath = Article.SortPath
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" name="viewport">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="format-detection" content="telephone=no">
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title><%=Article.Title%>_<%=Application(SiteID & "_Ok3w_SiteName")%></title>
<meta name="keywords" content="<%=Application(SiteID & "_Ok3w_SiteKeyWords")%>">
<meta name="description" content="<%=Application(SiteID & "_Ok3w_SiteDescription")%>">
<link href="gaokao2.css" rel="stylesheet" type="text/css" />
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
    <td height="60" align="center" bgcolor="#3D3D4A" class="yyjs001"><%=Article.Title%></td>
  </tr>
</table>
<table width="350" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td bgcolor="#FFFFFF" class="xmt010"><%Call OutThisPageContent(Article.ID,Article.Content,"asp")%></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
  </tr>
</table>
<!--#include file="wap/foot.asp"-->
</body>
</html>
