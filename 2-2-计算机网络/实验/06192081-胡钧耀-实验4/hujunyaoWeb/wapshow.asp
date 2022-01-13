<%@LANGUAGE="VBSCRIPT" CODEPAGE="936"%>
<%
Const dbdns = "./"
Const Htmldns = "./"
Const Base_Target = ""
Const ChannelID = 1
%>
<!--#include file="AppCode/Conn.asp"-->
<!--#include file="AppCode/fun/wapfunction.asp"-->
<!--#include file="AppCode/Class/Ok3w_Article.asp"-->
<!--#include file="inc/vbswap.asp"-->
<%
id=myCdbl(Request.QueryString("id"))
Set Article = New Ok3w_Article
Call Article.HitsAdd(Id)
Call Article.Load(Id)
If Article.IsPass=0 Then Call Page_Err("文章已经关闭")
If Article.IsDelete=1 Then Call Page_Err("文章已经删除")
ClassID = Article.ClassID
SortPath = Article.SortPath
If InStr(Article.Content,"[Ok3w_NextPage]") = 0 Then
	PageTitle = ""
Else
	PageNo = Request.QueryString("page")
	If PageNo = "" Then PageNo = 1
	PageTitle = "（第" & PageNo & "页）"
End If
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" name="viewport">
<title><%=Article.Title & PageTitle%>_<%=Application(SiteID & "_Ok3w_SiteName")%></title>
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
        <td height="5" colspan="2" ></td>
      </tr>
      <tr>
        <td height="40" colspan="2" class="ip001"><h1 style="color:#333 ; font-size:20px; font-weight: bold;"><%=Article.Title & PageTitle%></h1></td>
      </tr>
      <tr>
        <td width="30" height="30" align="center" class="g010"><img src="<%=Application(SiteID & "_Ok3w_g05")%>" width="30" height="30" /></td>
        <td width="290" class="g010"> &nbsp;<a href="../"><font color="#FFCC00"><%=Application(SiteID & "_Ok3w_SiteCloseNote")%></font></a>&nbsp;&nbsp;<%=Format_Time(Article.AddTime,2)%>&nbsp;&nbsp;<%=Article.Hits%>关注</span></td>
      </tr>
     
    </table>
      <table width="320" border="0" align="center" cellpadding="0" cellspacing="0">
        <tr>
          <td  height="5"></td>
        </tr>
         <tr>
          <td align="center" ><%=Article.wapshipin%></td>
        </tr>
        <tr>
          <td valign="top" class="g011"><%Call OutThisPageContent(Article.ID,Article.Content,"asp")%></td>
        </tr>
        <tr>
          <td  height="20"></td>
        </tr>
      </table></td>
  </tr>
</table>
<table width="350" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td height="20" bgcolor="#FFFFFF" ></td>
  </tr>
  <tr>
    <td height="15" ></td>
  </tr>
  <tr>
    <td height="1" bgcolor="#FFCC00" ></td>
  </tr>
  <tr>
    <td height="5" bgcolor="#FFFFFF"></td>
  </tr>
  <tr>
    <td height="30" bgcolor="#FFFFFF"><table width="330" border="0" align="center" cellpadding="0" cellspacing="0">
      <tr>
        <td><%Call Ok3w_Article_PreNext(Article.ClassID,Article.ID)%></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td ></td>
  </tr>
  <tr>
    <td height="5" bgcolor="#FFFFFF"></td>
  </tr>
  <tr>
    <td height="2" bgcolor="#FFCC00" ></td>
  </tr>
</table>
<table width="350" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td>&nbsp;</td>
  </tr>
</table>

<table width="350" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td bgcolor="#FFFFFF"><table width="320" border="0" align="center" cellpadding="0" cellspacing="0">
      <tr>
        <td><div class="nr_bk_02 box002 summary_foot">
            <ul>
              <%Call Ok3w_Article_List("",5,16,False,False,False,0,True,"hot","li")%>
            </ul>
          </div></td>
      </tr>
      <tr>
        <td height="20">&nbsp;</td>
      </tr>
    </table></td>
  </tr>
</table>
<table width="350" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td>&nbsp;</td>
  </tr>
</table>
<!--#include file="wap/foot.asp"-->
</body>
</html>