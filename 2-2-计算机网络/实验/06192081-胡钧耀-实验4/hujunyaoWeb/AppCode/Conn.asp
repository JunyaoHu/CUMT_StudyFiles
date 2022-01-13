<!--#include file="ConnStr.asp"-->
<%
Dim Ok3w_Public_StrTmp

Dim Conn,ConnStr,Rs

Call OpenConn()

Set Rs = Server.CreateObject("Adodb.RecordSet")

If Application(SiteID & "_Ok3w_SiteTitle") = "" Then
	Application.Lock()
	Sql = "select * from Ok3w_SiteConfig"
	Rs.Open Sql,Conn,1,1
	For i = 0 To Rs.Fields.Count - 1
		Application(SiteID & "_Ok3w_" & Rs.Fields(i).Name) = Rs(i).Value
	Next
	Rs.Close
	Application.UnLock()
End If

Private Sub CloseConn()
	Conn.Close
	Set Conn = Nothing
End Sub

Private Sub OpenConn()
	''On Error ReSume Next
	Set Conn = Server.CreateObject("ADODB.Connection")
	Conn.Open ConnStr
	If Err.Number<>0 Then
		Response.Write("数据库连接错误")
		Err.Clear
		Response.End()
		Else
			On Error Goto 0
	End If
End Sub
%>
