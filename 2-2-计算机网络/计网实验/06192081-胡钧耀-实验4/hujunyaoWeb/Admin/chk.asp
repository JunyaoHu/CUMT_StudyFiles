<!--#include file="../AppCode/Conn.asp"-->
<!--#include file="../AppCode/Class/Ok3w_Admin.asp"-->
<%
Set Admin = New Admin_Info

'没有登陆
If Not Admin.AdminIsLogin() Then
	Response.Write("<script language=""javascript"">")
	Response.Write("alert(""你还没有登陆或是登已经超时，请重新登陆..."");")
	Response.Write("parent.location.href=""ad_login.asp"";")
	Response.Write("</script>")
	Response.End()
End If

'编辑器验证
Session("Ok3w_eWebEditor") = Admin.AdminName
'采集验证
Session("Ok3w_Caiji") = Admin.AdminName
'生成Html
Session("Ok3w_toHtml") = Admin.AdminName

Private Sub ActionOk(Back_Url)
	If Back_Url="" Then
		Back_Url = Request.ServerVariables("URL")
		Back_Query = Request.ServerVariables("QUERY_STRING")
		If Back_Query<>"" Then Back_Url = Back_Url & "?" & Back_Query
	End If
	Session("Back_URL") = Back_Url
	Response.Redirect("ok.asp")
End Sub

'检测权限
Private Sub CheckAdminFlag(Flag)
	If Not Admin.AdminIsFlag(Flag) Then
		Response.Write("<script language=""javascript"">")
		Response.Write("alert(""你没有此操作权限，请返回..."");")
		Response.Write("document.URL='ad_right.asp';")
		Response.Write("</script>")
		Response.End()
	End If
End Sub

'记录操作日志
Private Sub SaveAdminLog(Info)
	Call Admin.AdminActionLog(Info)
End Sub
%>

