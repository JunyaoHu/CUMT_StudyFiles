<%@LANGUAGE="VBSCRIPT" CODEPAGE="936"%>
<%Const dbdns="../"%>
<!--#include file="chk.asp"-->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>后台管理系统</title>
<link rel="stylesheet" type="text/css" href="images/Style.css">
<meta http-equiv="refresh" content="<%=CookiesTimeout*60\2%>">
<style type="text/css">
<!--
.ttl {	CURSOR: hand; COLOR: #000000; PADDING-TOP: 4px
}
BODY {
	MARGIN-TOP: 5px; MARGIN-LEFT: 2px; BACKGROUND-COLOR: #fda700; TEXT-ALIGN: center
}
td{
	line-height:170%;
}
-->
</style>

<script language="javascript">
function showHide(obj)
{
	obj.style.display = obj.style.display == "none" ? "block" : "none";
}
</script>
</head>

<body>
<table cellspacing="1" cellpadding="2" width="150" align="center" bgcolor="#999999" 
border="0">
  <tbody>
    <tr>
      <td class="ttl" onClick="showHide(m0)" valign="top" align="left" background="images/top-bj3.jpg"><table cellspacing="0" cellpadding="0" width="127" border="0">
        <tbody>
          <tr>
            <td width="8">&nbsp;</td>
            <td align="left" width="117"><strong class="mtitle">常规操作</strong></td>
          </tr>
        </tbody>
      </table></td>
    </tr>
    <tr id="m0" style="display: block">
      <td valign="top" align="middle" bgcolor="#f3f5f1"><table width="100%" cellpadding="2">
        <tbody>
          
          <tr>
            <td align="left"><img height="7" hspace="5" src="images/arrow.gif" width="5" align="absmiddle" /><a  href="ad_right.asp" target="right">管理首页</a></td>
          </tr>
          <tr>
            <td align="left"><img height="7" hspace="5" src="images/arrow.gif" width="5" align="absmiddle" /><a  href="pass.asp" target="right">修改密码</a></td>
          </tr>
          
          <tr>
            <td align="left"><img height="7" hspace="5" src="images/arrow.gif" width="5" align="absmiddle" /><a  href="quit.asp" target="_parent" onClick="if(!confirm('真的要退出吗?')) return false;">安全退出</a></td>
          </tr>
        </tbody>
      </table></td>
    </tr>
  </tbody>
</table>
<br>
<%If InStr(Admin.GroupId,",3,")>=1 Then%>
<table cellspacing="1" cellpadding="2" width="150" align="center" bgcolor="#999999" 
border="0">
  <tbody>
    <tr>
      <td class="ttl" onClick="showHide(m2)" valign="top" align="left" background="images/top-bj3.jpg"><table cellspacing="0" cellpadding="0" width="127" border="0">
        <tbody>
          <tr>
            <td width="8">&nbsp;</td>
            <td align="left" width="117"><span class="mtitle">信息管理</span></td>
          </tr>
        </tbody>
      </table></td>
    </tr>
    <tr id="m2" style="display: block">
      <td valign="top" align="middle" bgcolor="#f3f5f1"><table width="100%" cellpadding="2">
        <tbody>
          <tr>
            <td align="left"><img height="7" hspace="5" src="images/arrow.gif" width="5" align="absmiddle" /><a  href="Article_Edit.asp?ChannelId=1" target="right">添加信息</a></td>
          </tr>
          <tr>
            <td align="left"><img height="7" hspace="5" src="images/arrow.gif" width="5" align="absmiddle" /><a  href="Article_List.asp?ChannelId=1" target="right">管理信息</a></td>
          </tr>
		  <tr>
            <td align="left"><img height="7" hspace="5" src="images/arrow.gif" width="5" align="absmiddle" /><a  href="Article_List.asp?ChannelId=1&amp;IsDelete=1" target="right">回收站</a></td>
          </tr>
        </tbody>
      </table></td>
    </tr>
  </tbody>
</table>
<br />
<%End If%>

<%If InStr(Admin.GroupId,",2,")>=1 Then%>
<table cellspacing="1" cellpadding="2" width="150" align="center" bgcolor="#999999" 
border="0">
  <tbody>
    <tr>
      <td class="ttl" onClick="showHide(m1)" valign="top" align="left" background="images/top-bj3.jpg"><table cellspacing="0" cellpadding="0" width="127" border="0">
        <tbody>
          <tr>
            <td width="8">&nbsp;</td>
            <td align="left" width="117"><span class="mtitle">其他</span></td>
          </tr>
        </tbody>
      </table></td>
    </tr>
    <tr id="m1" style="display: block">
      <td valign="top" align="middle" bgcolor="#f3f5f1"><table width="100%" cellpadding="2">
        <tbody>
         
<%
Sql="select * from Ok3w_Class where ChannelId=2 and gotoURL='' order by OrderID"
Set oRs = Conn.Execute(Sql)
Do While Not oRs.Eof
Sql="select * from Ok3w_Article where ClassID=" & oRs("ID")
Rs.Open Sql,Conn,1,3
If Rs.Eof And Rs.Bof Then
	Rs.AddNew
	
	oMaxID = Conn.Execute("select max(ID) from Ok3w_Article")(0)
	If IsNull(oMaxID) Then
		oMaxID = 0
	End If
	
	Rs("ID") =  oMaxID + 1
    Rs("ChannelID") = 2
    Rs("ClassID") = oRs("ID")
	Rs("SortPath") = "0," & oRs("ID") & ","
    Rs("Title") = oRs("SortName")
	Rs("TitleColor") = ""
	Rs("TitleURL") = ""
	Rs("Keywords") = ""
	Rs("Description") = ""
    Rs("Content") = oRs("SortName")
    Rs("Author") = "Systemp"
   	Rs("ComeFrom") = "Systemp"
    Rs("AddTime") = Now()
   	Rs("Inputer") = ""
    Rs("IsPass") = 1
    Rs("IsPic") = 0
    Rs("PicFile") = ""
   	Rs("IsTop") = 0
    Rs("IsCommend") = 0
	Rs("IsDelete") = 0
	Rs("IsMove") = 0
	Rs("IsPlay") = 0
	Rs("IsIndexImg") = 0
	Rs("IsUserAdd") = 0
	Rs("GiveJifen") = 0
	Rs("vUserGroupID") = 0
	Rs("vUserMore") = 1
	Rs("vUserJifen") = 0
    Rs("Hits") = 0
	Rs.Update
End If
ID = Rs("ID")
Rs.Close
%>
          <tr>
            <td align="left"><img height="7" hspace="5" src="images/arrow.gif" width="5" align="absmiddle" /><a  href="Article_Edit.asp?ChannelId=2&action=edit&ID=<%=ID%>" target="right"><%=oRs("SortName")%></a></td>
          </tr>
<%
	oRs.MoveNext
Loop
oRs.Close
Set oRs = Nothing
%>
        </tbody>
      </table></td>
    </tr>
  </tbody>
</table>
<p>
  <%If InStr(Admin.GroupId,",1,")>=1 Then%>
</p>
<table cellspacing="1" cellpadding="2" width="150" align="center" bgcolor="#999999" 
border="0">
  <tbody>
    <tr>
      <td class="ttl" onClick="showHide(menu6)" valign="top" align="left" background="images/top-bj3.jpg"><table cellspacing="0" cellpadding="0" width="127" border="0">
        <tbody>
          <tr>
            <td width="8">&nbsp;</td>
            <td align="left" width="117"><strong class="mtitle">系统管理</strong></td>
          </tr>
        </tbody>
      </table></td>
    </tr>
    <tr id="menu6" style="display: block">
      <td valign="top" align="middle" bgcolor="#f3f5f1"><table width="100%" cellpadding="2">
        <tbody>
          <tr>
            <td align="left"><img height="7" hspace="5" src="images/arrow.gif" width="5" align="absmiddle" /><a  href="Sys_Config.asp" target="right">站点信息配置</a></td>
          </tr>
          <%If Db_Type="ACC" Then%>
          <%End If%>
          <tr>
            <td align="left"><img height="7" hspace="5" src="images/arrow.gif" width="5" align="absmiddle" /><a  href="Sys_link.asp" target="right">友情连接管理</a></td>
          </tr>
          <tr>
            <td align="left"><img height="7" hspace="5" src="images/arrow.gif" width="5" align="absmiddle" /><a  href="ad_weblog.asp" target="right">后台日志</a></td>
          </tr>
           <tr>
             <td align="left">&nbsp;</td>
           </tr>
           <tr>
            <td align="left"><img height="7" hspace="5" src="images/arrow.gif" width="5" align="absmiddle" /><a  href="http://www.huzhikun.cn" target="_blank"><strong>系统开发：胡志坤</strong></a></td>
          </tr>
           <tr>
             <td height="50" align="center">如需二次开发<br>
              请联系我。<br>
              18709234002（同V）</td>
           </tr>
        </tbody>
      </table></td>
    </tr>
  </tbody>
</table>
<p><br />
  <%End If%>
    <%End If%>
</p>
<p><br />
</p>
</body>
</html>
<%
Set Rs = Nothing
Call CloseConn()
Set Admin = Nothing
%>
