<!--#include file="../AppCode/Conn.asp"-->
<!--#include file="../AppCode/Class/Ok3w_Admin.asp"-->
<%
Set Admin = New Admin_Info

'û�е�½
If Not Admin.AdminIsLogin() Then
	Response.Write("<script language=""javascript"">")
	Response.Write("alert(""�㻹û�е�½���ǵ��Ѿ���ʱ�������µ�½..."");")
	Response.Write("parent.location.href=""ad_login.asp"";")
	Response.Write("</script>")
	Response.End()
End If

'�༭����֤
Session("Ok3w_eWebEditor") = Admin.AdminName
'�ɼ���֤
Session("Ok3w_Caiji") = Admin.AdminName
'����Html
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

'���Ȩ��
Private Sub CheckAdminFlag(Flag)
	If Not Admin.AdminIsFlag(Flag) Then
		Response.Write("<script language=""javascript"">")
		Response.Write("alert(""��û�д˲���Ȩ�ޣ��뷵��..."");")
		Response.Write("document.URL='ad_right.asp';")
		Response.Write("</script>")
		Response.End()
	End If
End Sub

'��¼������־
Private Sub SaveAdminLog(Info)
	Call Admin.AdminActionLog(Info)
End Sub
%>

