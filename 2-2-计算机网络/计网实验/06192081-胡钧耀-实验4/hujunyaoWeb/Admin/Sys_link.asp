<%@LANGUAGE="VBSCRIPT" CODEPAGE="936"%>
<%dbdns="../"%>
<!--#include file="chk.asp"-->
<%
Call CheckAdminFlag(1)

Set Link = New clsSys_Link
Select Case Trim(Request.Form("action"))
	Case "add"
		Call Link.Add()
		Call SaveAdminLog("添加友情连接：" & Link.Lname)
		Call CloseConn()
		Call ActionOk("Sys_link.asp")
	Case "edit"
		Call Link.Edit()
		Call SaveAdminLog("修改友情连接(ID=" & Link.Lid & ")为：" & Link.Lname)
		Call CloseConn()
		Call ActionOk("Sys_link.asp")
	Case "del"
		Call Link.Del()
		Call SaveAdminLog("删除友情连接(ID=" & Link.Lid & ")")
		Call CloseConn()
		Call ActionOk("Sys_link.asp")
End Select
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>后台管理系统</title>
<link rel="stylesheet" type="text/css" href="images/Style.css">
<style type="text/css">
.noB{
	border:0px;
	background-color:#FFFFFF;
	cursor:pointer;
}
.STYLE1 {color: #0000FF}
</style>
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
                background="images/tab_active_bg.gif">友情连接管理</td>
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
				      <table width="100%" border="0" cellpadding="8" cellspacing="1" bgcolor="#CCCCCC">
                        <tr  bgcolor="#EBEBEB">
                          <td align="center">名称</td>
                          <td align="center">网址</td>
                          <td align="center">Logo地址</td>
                          <td align="center">图片连接</td>
                          <td align="center">顺序</td>
                          <td align="center">操作</td>
                        </tr>
											<form name="form2" method="post" action="">
                        <tr bgcolor="#FFFFFF" onMouseOver="this.style.backgroundColor='#EFEFEF';" onMouseOut="this.style.backgroundColor='#FFFFFF';">
                          <td><input name="Lname" type="text" id="Lname" size="10" /></td>
                          <td><input name="Lurl" type="text" id="Lurl" size="20" /></td>
                          <td><input name="Lpic" type="text" id="Lpic" size="15" /></td>
                          <td><input name="Ltype" type="checkbox" id="Ltype" value="1"></td>
                          <td><input name="Lorder" type="text" id="Lorder" value="<%=Link.GetMaxOrder()+1%>" size="2" /></td>
                          <td><input name="Ctype" type="hidden" id="Ctype" value="1">
                            <input name="Lnote" type="hidden" id="Lnote">
                            <input name="Lid" type="hidden" id="Lid" />
                            <input name="action" type="hidden" id="action" />
                            <input name="Submit" type="button" onClick="javascript:formsubmit(this.form,'add');" value="添 加" /></td>
                        </tr> </form>
<%
Sql = "select * from Ok3w_Link  order by Ltype desc,Lorder asc"
Rs.Open Sql,Conn,1,1
Do While Not Rs.Eof
%>						<form name="form2" method="post" action="">
                        <tr bgcolor="#FFFFFF" onMouseOver="this.style.backgroundColor='#EFEFEF';" onMouseOut="this.style.backgroundColor='#FFFFFF';">
                          <td><input name="Lname" type="text" id="Lname" value="<%=Rs("Lname")%>" size="10" /></td>
                          <td><input name="Lurl" type="text" id="Lurl" value="<%=Rs("Lurl")%>" size="20" /></td>
                          <td><input name="Lpic" type="text" id="Lpic" value="<%=Rs("Lpic")%>" size="15" /></td>
                          <td><input name="Ltype" type="checkbox" id="Ltype" value="1" <%If Rs("Ltype")=1 Then%>checked<%End If%>></td>
                          <td><input name="Lorder" type="text" id="Lorder" value="<%=Rs("Lorder")%>" size="2" /></td>
                          <td><input name="Ctype" type="hidden" id="Ctype" value="1">
                            <input name="Lnote" type="hidden" id="Lnote" value="<%=Rs("Lnote")%>">
                            <input name="Lid" type="hidden" id="Lid" value="<%=Rs("Lid")%>" />
                            <input name="action" type="hidden" id="action" />
                            <input name="Submit2" type="button" onClick="javascript:formsubmit(this.form,'edit');" value="修 改" />
                            <input name="Submit22" type="button" onClick="javascript:if(!confirm('真的要删除吗？')) return false;formsubmit(this.form,'del');" value="删 除" /></td>
                        </tr> </form>
<%
	Rs.MoveNext
Loop
Rs.Close
%>						
                      </table>
                          <!--Begin function-->
<script language="JavaScript" type="text/javascript">
function formsubmit(frm,action)
{
	if(frm.Lname.value.trim()=="")
	{
		ShowErrMsg("名称不能为空，请输入");
		frm.Lname.focus();
		return false;
	}
	 
	if(isNaN(parseInt(frm.Lorder.value.trim())))
	{
		ShowErrMsg("排序只能是数字，请输入");
		frm.Lorder.focus();
		return false;
	}
	
	frm.action.value = action;
	frm.submit();
}
</script>
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
</body>
</html>
<%
Call CloseConn()
Set Rs = Nothing
Set Admin = Nothing
%>

<%
Class clsSys_Link
	Public Lid
	Public Lname
	Public Lpic
	Public Lurl
	Public Lnote
	Public Lorder
	Public Ltype
	Public Ctype
	
	Public Sub Add()
		Call GetFormData()
		Set clsRs = Server.CreateObject("Adodb.RecordSet")
		Sql = "select * from Ok3w_Link where 1=2"
		clsRs.Open Sql,Conn,1,3
		clsRs.AddNew()
		Call UpdateRs(clsRs)
		clsRs.Update()
		clsRs.Close()
		Set clsRs = Nothing
	End Sub

	Public Sub Edit()
		Call GetFormData()
		Set clsRs = Server.CreateObject("Adodb.RecordSet")
		Sql = "select * from Ok3w_Link where Lid=" & Lid
		clsRs.Open Sql,Conn,1,3
		Call UpdateRs(clsRs)
		clsRs.Update
		clsRs.Close
		Set clsRs = Nothing
	End Sub
	
	Public Sub Del()
		Call GetFormData()
		sql = "delete from Ok3w_Link where Lid=" & Lid
		Conn.Execute sql
	End Sub
	
	Private Sub GetFormData()
		Lid = Trim(Request.Form("Lid"))
		Lname = Trim(Request.Form("Lname"))
		Lpic = Trim(Request.Form("Lpic"))
		Lurl = Trim(Request.Form("Lurl"))
		Lnote = Trim(Request.Form("Lnote"))
		Lorder = Trim(Request.Form("Lorder"))
		Ltype = Trim(Request.Form("Ltype"))
		If Ltype="" Then Ltype = 0
		Ctype = Trim(Request.Form("Ctype"))
		If Ctype="" Then Ltype = 1
	End Sub
	
	Private Sub UpdateRs(ByRef clsRs)
		'clsRs("Lid") = Lid
		clsRs("Lname") = Lname
		clsRs("Lpic") = Lpic
		clsRs("Lurl") = Lurl
		clsRs("Lnote") = Lnote
		clsRs("Lorder") = Lorder
		clsRs("Ltype") = Ltype
		clsRs("Ctype") = Ctype
	End Sub
	
	Public Sub GetRs(ByRef clsRs)
		Lid = clsRs("Lid")
		Lname = clsRs("Lname")
		Lpic = clsRs("Lpic")
		Lurl = clsRs("Lurl")
		Lnote = clsRs("Lnote")
		Lorder = clsRs("Lorder")
		Ltype = clsRs("Ltype")
		Ctype = clsRs("Ctype")
	End Sub
	
	'取最大统号
    Public Function GetMaxOrder()
        Set clsRs = Server.CreateObject("Adodb.RecordSet")
        Sql = "select max(Lorder) from Ok3w_Link"
        clsRs.Open Sql,Conn,0,1
        If IsNull(clsRs(0)) Then
        GetMaxOrder = 0
            Else
                GetMaxOrder = clsRs(0)
        End If
        clsRs.Close
        Set clsRs = Nothing
    End Function
End Class
%>