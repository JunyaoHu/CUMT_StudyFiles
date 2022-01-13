<%@LANGUAGE="VBSCRIPT" CODEPAGE="936"%>
<%
Const dbdns = "./"
Const Htmldns = "./"
Const Base_Target = ""
Const ChannelID = 1
%>
<!--#include file="AppCode/Conn.asp"-->
<!--#include file="AppCode/fun/functionm.asp"-->
<!--#include file="inc/vbs.asp"-->
<head>
<meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" name="viewport">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="format-detection" content="telephone=no">
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title><%=Application(SiteID & "_Ok3w_SiteTitle")%></title>
<meta name="keywords" content="<%=Application(SiteID & "_Ok3w_SiteKeyWords")%>">
<meta name="description" content="<%=Application(SiteID & "_Ok3w_SiteDescription")%>">
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
    <td width="175" height="200" bgcolor="#FFFFFF"><table width="120" border="0" align="center" cellpadding="0" cellspacing="0">
      <tr>
        <td height="140"><a href="about_wap.asp?id=1"><img src="<%=Application(SiteID & "_Ok3w_g06")%>" width="140" height="140" class="ip008" alt="<%=Application(SiteID & "_Ok3w_SiteCloseNote")%>"></a></td>
      </tr>
    </table></td>
    <td width="175" bgcolor="#FFFFFF" class="ip007"><%=Application(SiteID & "_Ok3w_g07")%>
     </td>
  </tr>
  <tr>
    <td colspan="2">&nbsp;</td>
  </tr>
</table>
<table width="350" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td height="50" bgcolor="#FFFFFF">
      <table width="320" border="0" align="center" cellpadding="0" cellspacing="0">
        <tr>
          <td colspan="2">&nbsp;</td>
        </tr>
        <tr>
          <td width="90" height="35" class="ip010"><%=Application(SiteID & "_Ok3w_SiteCloseNote")%>说</td>
          <td width="230">&nbsp;</td>
        </tr>
      </table>
      <table width="320" border="0" align="center" cellpadding="0" cellspacing="0">
        <tr>
          <td height="10"></td>
        </tr>
        <tr>
          <td> <%Call Ok3w_Article_IndexClassImg02(20,10,80,60)%></td>
        </tr>
        <tr>
          <td height="50" align="center" valign="bottom"><table width="80" border="0" cellspacing="0" cellpadding="0">
            <tr>
              <td height="35" align="center" bgcolor="#FFAE02"><a href="waplist.asp?id=20">看更多&gt;</a></td>
            </tr>
          </table></td>
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
  <tr>
    <td bgcolor="#FFFFFF"><table width="320" border="0" align="center" cellpadding="0" cellspacing="0">
      <tr>
        <td colspan="2">&nbsp;</td>
      </tr>
      <tr>
        <td width="90" height="35" class="ip010">友情链接</td>
        <td width="230">&nbsp;</td>
      </tr>
    </table></td>
  </tr>
</table>
<table width="350" border="0" align="center" cellpadding="0" cellspacing="0">
  
  <tr>
    <td height="50" bgcolor="#FFFFFF"><%Call  Ok3w_Site_Link(270,8,0,1)%></td>
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
