<%@LANGUAGE="VBSCRIPT" CODEPAGE="936"%>
<%
Const dbdns = "./"
Const Htmldns = "./"
Const Base_Target = ""
Const ChannelID = 1
%>
<!--#include file="AppCode/Conn.asp"-->
<!--#include file="AppCode/fun/function.asp"-->
<!--#include file="AppCode/Class/Ok3w_Article.asp"-->
<!--#include file="inc/vbsnews.asp"-->
<%
id=myCdbl(Request.QueryString("id"))
Set Article = New Ok3w_Article
Call Article.HitsAdd(Id)
Call Article.Load(Id)
If Article.IsPass=0 Then Call Page_Err("该文章在审核中...")
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
<title><%=Article.Title & PageTitle%>_<%=Application(SiteID & "_Ok3w_SiteName")%></title>
<link rel="stylesheet" type="text/css" href="ncss/style.css">
<link rel="stylesheet" type="text/css" href="ncss/gaokao2017.css">
<script type="text/javascript" src="js/js.js"></script>
<!--手机端识别跳转开始-->
<script type="text/javascript">
    try {
        var urlhash = window.location.hash;
        if (!urlhash.match("fromapp")) {
            if ((navigator.userAgent.match(/(iPhone|iPod|Android|ios|iPad)/i))) {
                window.location = "wapshow.asp?id=<%=Article.ID%>";
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
    <td width="830" valign="top" bgcolor="#FFFFFF"><table width="700" border="0" align="center" cellpadding="0" cellspacing="0">
      <tr>
        <td width="1100" height="50" valign="bottom" class="xmt012"><a href="<%=Htmldns%>">网站首页</a> &gt;&gt;
          <%Call Ok3w_Article_Class_Nav(Article.SortPath)%></td>
      </tr>
    </table>
      <table width="700" border="0" align="center" cellpadding="0" cellspacing="0">
     
      <tr>
        <td height="80" colspan="2" class="g009"><%=Article.Title & PageTitle%></td>
      </tr>
     
      <tr>
        <td width="50" height="30" align="left" ><a href="../"><img src="<%=Application(SiteID & "_Ok3w_g05")%>" width="35" height="35" /></a></td>
        <td width="700" align="left" class="cha003"><%=Article.ComeFrom%> / <%=Article.Author%> / <%=Format_Time(Article.AddTime,6)%> / 阅读<%=Article.Hits%>次</td>
      </tr>

    </table>
      <table width="700" border="0" align="center" cellpadding="0" cellspacing="0">
        <tr>
          <td height="0" align="center" >&nbsp;</td>
        </tr>
        <tr>
          <td height="0" align="center" ><%=Article.Keywords%></td>
        </tr>
        <tr>
          <td valign="top" class="g011"><%Call OutThisPageContent(Article.ID,Article.Content,"asp")%></td>
        </tr>
      </table>
      <table width="700" border="0" align="center" cellpadding="0" cellspacing="0">
        <tr>
          <td height="1" colspan="2" bgcolor="#E0E0E0" ></td>
        </tr>
         <tr>
          <td height="10" colspan="2" bgcolor="#F4F3F1"></td>
        </tr>
        <tr>
          <td width="21" height="30" bgcolor="#F4F3F1"></td>
          <td width="679" bgcolor="#F4F3F1"><div class="nearNews">
            <%Call Ok3w_Article_PreNext01(Article.ClassID,Article.ID)%>
          </div></td>
        </tr>
        <tr>
          <td colspan="2" ></td>
        </tr>
        <tr>
          <td height="10" colspan="2" bgcolor="#F4F3F1"></td>
        </tr>
        <tr>
          <td height="1" colspan="2" bgcolor="#E0E0E0" ></td>
        </tr>
        <tr>
          <td height="240" colspan="2" align="center" ><table width="700" border="0" cellspacing="0" cellpadding="0">
            <tr>
              <td height="390">
               <script language="JavaScript"> 
var how_many_ads = 3 
var now = new Date() 
var sec = now.getSeconds() 
var ad = sec % how_many_ads; 
ad +=1; 
 
if (ad==1){   
banner="<%=Application(SiteID & "_Ok3w_g02")%>"; 
width="700"; 
height="300"; 
} 

if (ad==2) {    
banner="<%=Application(SiteID & "_Ok3w_g03")%>";  
width="700"; 
height="300";  
} 
  
if (ad==3) {  
banner="<%=Application(SiteID & "_Ok3w_g04")%>"; 
width="700"; 
height="300"; 
}
  
document.write('<center>');  
document.write('<img src=\"' + banner + '\" width=') 
document.write(width + ' height=' + height + ' '); 
document.write('</center>'); 
--></script>
              </td>
            </tr>
          </table></td>
        </tr>
    </table></td>
  </tr>
</table>
<!--#include file="inc/foot.asp"-->
</body>
</html>