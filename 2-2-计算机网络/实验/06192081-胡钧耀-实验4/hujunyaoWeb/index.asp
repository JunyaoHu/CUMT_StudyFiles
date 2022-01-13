<%@LANGUAGE="VBSCRIPT" CODEPAGE="936"%>
<%
Const dbdns = "./"
Const Htmldns = "./"
Const Base_Target = ""
Const ChannelID = 1
%>
<!--#include file="AppCode/Conn.asp"-->
<!--#include file="AppCode/fun/function.asp"-->
<!--#include file="inc/vbsnews.asp"-->
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<link rel="stylesheet" type="text/css" href="ncss/style.css">
<link rel="stylesheet" type="text/css" href="ncss/gaokao2017.css">
<title><%=Application(SiteID & "_Ok3w_SiteTitle")%></title>
<meta name="keywords" content="<%=Application(SiteID & "_Ok3w_SiteKeyWords")%>">
<meta name="description" content="<%=Application(SiteID & "_Ok3w_SiteDescription")%>">
<!--手机端识别跳转开始-->
<script type="text/javascript">
    try {
        var urlhash = window.location.hash;
        if (!urlhash.match("fromapp")) {
            if ((navigator.userAgent.match(/(iPhone|iPod|Android|ios|iPad)/i))) {
                window.location = "wap.asp";
            }
        }
    } 
    catch (err) {
    }
</script>
<!--手机端识别跳转结束-->
<!--首页幻灯JS开始-->
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/jquery.cycle.js"></script>
<script type="text/javascript">
	$(function(){
		$('#banner').cycle({ 
				fx:'scrollLeft',
				pager:'#btn'
		});
	})
</script>
<style type="text/css">
	#banner
	{
		width:830px;
		margin:0px auto;
		height:356px;
		overflow:hidden;
		z-index:0;
	}
	#btn
	{	display: inline;
		width:190px;
		hegiht:18px;
		float:left;
		margin:-30px 0px 0px 10px;
		position:absolute;
		z-index:1;
	}
	#btn a
	{
		color:#AFAFAF;
		font:700 11px "Arial";
		background:url(js/ibbtn.png) no-repeat;
		float:left;
		width:18px;
		height:18px;
		line-height:18px;
		text-align:center;
		text-decoration:none;
		margin-left:5px;
	}
	#btn a.activeSlide
	{	
		color:#fff;
		background:url(js/ibhbtn.gif) no-repeat;
	}
	#btn a:hover
	{	
		color:#fff;
		background:url(js/ibhbtn.gif) no-repeat;
	}
#btn2 {display: inline;
		width:110px;
		hegiht:18px;
		float:left;
		margin:-30px 0px 0px 10px;
		position:absolute;
		z-index:1;
}
</style>
<!--首页幻灯JS结束-->
</head>

<body>
  <!--#include virtual="inc/head.asp"--> 
<table width="1180" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td width="830" height="500" valign="top" bgcolor="#FFFFFF"><table width="830" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td height="356"> <!--首页幻灯JS开始-->
            <div id="banner"> 
             <a href="<%=Application(SiteID & "_Ok3w_g11")%>" target="_blank"><img src="<%=Application(SiteID & "_Ok3w_g02")%>" width="830" height="356" border="0"/></a>
			 <a href="<%=Application(SiteID & "_Ok3w_g12")%>" target="_blank"><img src="<%=Application(SiteID & "_Ok3w_g03")%>" width="830" height="356" border="0"/></a>
             <a href="<%=Application(SiteID & "_Ok3w_g13")%>" target="_blank"><img src="<%=Application(SiteID & "_Ok3w_g04")%>" width="830" height="356" border="0"/></a>
              </div>
          <div id="btn"></div>
    <!--首页幻灯JS结束--></td>
      </tr>
      <tr>
        <td height="20" bgcolor="#E9EAEC">&nbsp;</td>
      </tr>
    </table>
      <table width="780" border="0" align="center" cellpadding="0" cellspacing="0">
        <tr>
          <td height="100" bgcolor="#FFFFFF">
            <%Call Ok3w_Article_IndexClassImg01(20,15,147,110)%>
         </td>
        </tr>
        <tr>
          <td height="30" bgcolor="#FFFFFF">&nbsp;</td>
        </tr>
    </table></td>
    <td width="20">&nbsp;</td>
    <td width="330" valign="top" bgcolor="#FFFFFF">
  <!--#include virtual="inc/you.asp"-->  
    </td>
  </tr>
</table>
<table width="1080" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td>&nbsp;</td>
  </tr>
</table>
<table width="1180" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td height="5" bgcolor="#35363A"></td>
  </tr>
  <tr>
    <td height="50" align="center" bgcolor="#FFFFFF" class="xmt003"><strong>友情链接</strong></td>
  </tr>
 
  <tr>
    <td height="1" bgcolor="#CCCCCC"></td>
  </tr>
  <tr>
    <td height="100" bgcolor="#FFFFFF"><table width="1140" border="0" align="center" cellpadding="0" cellspacing="0">
      <tr>
        <td><%Call  Ok3w_Site_Link(270,9,1,1)%></td>
      </tr>
    </table></td>
  </tr>
   <tr>
    <td height="1" bgcolor="#CCCCCC"></td>
  </tr>
  <tr>
    <td height="60" bgcolor="#FFFFFF" ><table width="1140" border="0" align="center" cellpadding="0" cellspacing="0">
      <tr>
        <td class="xmt008"><%Call  Ok3w_Site_Link(270,8,0,1)%></td>
      </tr>
    </table>
    </td>
  </tr>
</table>
<!--#include file="inc/foot.asp"-->
</body>
</html>
