<%@LANGUAGE="VBSCRIPT" CODEPAGE="936"%>
<%dbdns="../"%>
<!--#include file="chk.asp"-->
<!--#include file="../AppCode/Pager.asp"-->
<%
Call CheckAdminFlag(1)

action = Trim(Request.Form("action"))
Select Case action
	Case "del"
		Call Del()
	Case "clear"
		Call clearLog()
End Select

Private Sub Del()
	logId = Trim(Request.Form("logId"))
	If logId<>"" Then
		sql="delete from Ok3w_Adlog where logId in(" & logId & ")"
		Conn.Execute sql
		Call SaveAdminLog("删除后台日志，ID=" & logId)
		Call ActionOk("ad_weblog.asp")
	End If
End Sub

Private Sub clearLog()
	If Db_Type="ACC" Then
		Sql = "delete from Ok3w_Adlog where DateDiff('d',LogTime,Date())>=7"
		Else
			Sql = "delete from Ok3w_Adlog where DateDiff(d,LogTime,getdate())>=7"
	End If
	Conn.Execute Sql
	Call SaveAdminLog("清空后台日志")
	Call ActionOk("ad_weblog.asp")
End Sub
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>后台管理系统</title>
<link rel="stylesheet" type="text/css" href="images/Style.css">
</head>

<body>
<!--#include file="top.asp"-->
<br />
<table cellspacing="0" cellpadding="0" width="98%" align="center" border="0">
  <tbody>
    <tr>
      <td style="PADDING-LEFT: 2px; HEIGHT: 22px" 
    background="images/tab_top_bg.gif"><table cellspacing="0" cellpadding="0" width="477" border="0">
        <tbody>
          <tr>
            <td width="147"><table height="22" cellspacing="0" cellpadding="0" border="0">
              <tbody>
                <tr>
                  <td width="3"><img id="tabImgLeft__0" height="22" 
                  src="images/tab_active_left.gif" width="3" /></td>
                  <td class="mtitle" 
                background="images/tab_active_bg.gif">后台日志管理</td>
                  <td width="3"><img id="tabImgRight__0" height="22" 
                  src="images/tab_active_right.gif" 
            width="3" /></td>
                </tr>
              </tbody>
            </table></td>
          </tr>
        </tbody>
      </table></td>
    </tr>
    <tr>
      <td bgcolor="#ffffff"><table cellspacing="0" cellpadding="0" width="100%" border="0">
        <tbody>
          <tr>
            <td width="1" background="images/tab_bg.gif"><img height="1" 
            src="images/tab_bg.gif" width="1" /></td>
            <td 
          style="PADDING-RIGHT: 10px; PADDING-LEFT: 10px; PADDING-BOTTOM: 10px; PADDING-TOP: 10px" 
          valign="top"><div id="tabContent__0" style="DISPLAY: block; VISIBILITY: visible">
              <table cellspacing="1" cellpadding="1" width="100%" align="center" 
            bgcolor="#8ccebd" border="0">
                <tbody>
                  <tr>
                    <td 
                style="PADDING-RIGHT: 10px; PADDING-LEFT: 10px; PADDING-BOTTOM: 10px; PADDING-TOP: 10px" 
                valign="top" bgcolor="#fffcf7">
                      <table width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="#CCCCCC">
						<form id="form2" name="form2" method="get" action="">
						<tr>
						  <td height="25" colspan="7" align="center" bgcolor="#EBEBEB"><select name="stype" id="stype">
						    <option value="logUser">管理员</option>
						    <option value="logInfo">内容</option>
						    </select>
						  <input name="keyword" type="text" id="keyword" />
						    <input type="submit" name="Submit2" value=" 搜 索 " />						  </td>
						  </tr>
						  </form>
						<form id="form1" name="form1" method="post" action="">
						<tr>
                          <td height="25" align="center" bgcolor="#EBEBEB">ID</td>
                          <td height="25" align="center" bgcolor="#EBEBEB">管理员</td>
                          <td height="25" align="center" bgcolor="#EBEBEB">Ip</td>
                          <td height="25" align="center" bgcolor="#EBEBEB">时间</td>
                          <td height="25" align="center" bgcolor="#EBEBEB">内容</td>
                          <td align="center" bgcolor="#EBEBEB">类别</td>
                          <td height="25" align="center" bgcolor="#EBEBEB"><input type="checkbox" name="checkbox" value="checkbox" onClick="javascript:chkall(this,this.form);" /></td>
                        </tr>
                        
                        <%
keyword = Trim(Request.QueryString("keyword"))	
stype = Trim(Request.QueryString("stype")) 
Sql = "select * from Ok3w_Adlog where 1=1"
If keyword<>"" Then Sql = Sql & " and " & stype & " like '%" & keyword & "%'"
Sql = Sql & " order by logId desc"
Set Page = New TurnPage
Call Page.GetRs(Conn,Rs,Sql,20)
Do While Not Rs.Eof And Not Page.Eof
%>
                        <tr>
                          <td height="25" align="center" bgcolor="#FFFFFF"><%=Rs("logId")%></td>
                          <td height="25" align="center" bgcolor="#FFFFFF"><%=Rs("logUser")%></td>
                          <td height="25" align="center" bgcolor="#FFFFFF"><%=Rs("logIp")%></td>
                          <td height="25" align="center" bgcolor="#FFFFFF"><%=Rs("logTime")%></td>
                          <td height="25" align="center" bgcolor="#FFFFFF"><%=Rs("logInfo")%></td>
                          <td height="25" align="center" bgcolor="#FFFFFF"><%=Rs("logType")%></td>
                          <td height="25" align="center" bgcolor="#FFFFFF"><input name="logId" type="checkbox" id="logId" value="<%=Rs("logId")%>" /></td>
                        </tr>
                        <%
	Rs.MoveNext
	Page.MoveNext
Loop
Rs.Close
%>
                        <tr>
                          <td height="25" colspan="7" align="right" bgcolor="#FFFFFF"><input name="clear" type="checkbox" id="clear" value="1" onClick="javascript:if(this.form.clear.checked) this.form.action.value='clear';else this.form.action.value='del';"/>
                          仅保留最近7天的数据
                            <input name="action" type="hidden" id="action" value="del" />
                            <input type="submit" name="Submit" value=" 删 除 " onClick="if(!confirm('真的要删除吗？')) return false;" />
                            &nbsp;</td>
                        </tr>
                        <tr>
                          <td height="25" colspan="7" align="right" bgcolor="#FFFFFF"><%Call Page.GetPageList()%>
                            &nbsp;</td>
                        </tr>
						</form>
                      </table>
                                       
                    </td>
                  </tr>
                </tbody>
              </table>
            </div></td>
            <td width="1" background="images/tab_bg.gif"><img height="1" 
            src="images/tab_bg.gif" width="1" /></td>
          </tr>
        </tbody>
      </table></td>
    </tr>
    <tr>
      <td background="images/tab_bg.gif" bgcolor="#ffffff"><img height="1" 
      src="images/tab_bg.gif" width="1" /></td>
    </tr>
  </tbody>
</table>
<script language="javascript">
function chkall(obj,frm)
{
	for(var i=0;i<frm.logId.length;i++)
		frm.logId[i].checked = obj.checked;
}
</script>
</body>
</html>
<%
Call CloseConn()
Set Rs = Nothing
Set Admin = Nothing
%>

