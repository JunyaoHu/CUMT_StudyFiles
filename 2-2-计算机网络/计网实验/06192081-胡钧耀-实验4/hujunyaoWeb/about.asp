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
<!--#include file="inc/vbsnews.asp"-->
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
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title><%=Article.Title%>_<%=Application(SiteID & "_Ok3w_SiteName")%></title>
<link rel="stylesheet" type="text/css" href="ncss/style.css">
<link rel="stylesheet" type="text/css" href="ncss/gaokao2017.css">
<!--手机端识别跳转开始-->
<script type="text/javascript">
    try {
        var urlhash = window.location.hash;
        if (!urlhash.match("fromapp")) {
            if ((navigator.userAgent.match(/(iPhone|iPod|Android|ios|iPad)/i))) {
                window.location = "about_wap.asp?id=<%=Article.ID%>";
            }
        }
    } 
    catch (err) {
    }
</script>
</head>

<body>
<!--#include file="inc/head.asp"-->

<table width="1180" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td>&nbsp;</td>
  </tr>
</table>
<table width="1180" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td width="330" height="300" valign="top" bgcolor="#FFFFFF"><!--#include file="inc/you.asp"--></td>
    <td width="20">&nbsp;</td>
    <td width="830" valign="top" bgcolor="#FFFFFF"><table width="750" border="0" align="center" cellpadding="0" cellspacing="0">
      <tr>
        <td width="1100" height="40" valign="bottom" class="xmt012">&nbsp;</td>
      </tr>
    </table>
      <table width="700" border="0" align="center" cellpadding="0" cellspacing="0">
        <tr>
          <td height="80" colspan="2" class="g009"><%=Article.Title%></td>
        </tr>
      </table>
      <table width="700" border="0" align="center" cellpadding="0" cellspacing="0">
        <tr>
          <td class="g011"><%Call OutThisPageContent(Article.ID,Article.Content,"asp")%></td>
        </tr>
    </table></td>
  </tr>
</table>
<!--#include file="inc/foot.asp"-->
</body>
</html>
