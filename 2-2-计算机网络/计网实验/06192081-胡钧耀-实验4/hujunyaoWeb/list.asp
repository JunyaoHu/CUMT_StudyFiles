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
<title><%Call Ok3w_Article_Class_PageTitle(SortPath)%>_<%=Application(SiteID & "_Ok3w_SiteName")%></title>
<link rel="stylesheet" type="text/css" href="ncss/style.css">
<link rel="stylesheet" type="text/css" href="ncss/gaokao2017.css">
<!--手机端识别跳转开始-->
<script type="text/javascript">
    try {
        var urlhash = window.location.hash;
        if (!urlhash.match("fromapp")) {
            if ((navigator.userAgent.match(/(iPhone|iPod|Android|ios|iPad)/i))) {
                window.location = "waplist.asp?id=<%=ClassID%>";
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
    <td width="330" height="500" valign="top">
      <!--#include virtual="inc/you.asp"-->  
    </td>
    <td width="20">&nbsp;</td>
    <td width="830" valign="top" bgcolor="#FFFFFF"><table width="750" border="0" align="center" cellpadding="0" cellspacing="0">
      <tr>
        <td height="80" align="center" class="g008"><%=Application(SiteID & "_Ok3w_SiteCloseNote")%><%Call Ok3w_Article_Class_Nav(SortPath)%></td>
      </tr>
      <tr>
        <td height="5" bgcolor="#35363A"></td>
      </tr>
    </table>
      <table width="750" border="0" align="center" cellpadding="0" cellspacing="0">
        <tr>
          <td height="20"></td>
        </tr>
        <tr>
          <td ><div class="wrapper">
            <div class="mm ">
              <%
If IsPic = 1 Then
	Call Ok3w_Article_pList(ClassID,100000000,PageSize,3,200,150,22)
Else
	Call Ok3w_Article_bList01(ClassID,PageSize)
End If
Call Page.PageAspList("./list.asp?id=" & ClassID & "&")
%>
            </div>
          </div></td>
        </tr>
        <tr>
          <td height="10"></td>
        </tr>
        <tr>
          <td height="1" bgcolor="#E0E0E0" ></td>
        </tr>
    </table></td>
  </tr>
</table>
<!--#include file="inc/foot.asp"-->
</body>
</html>