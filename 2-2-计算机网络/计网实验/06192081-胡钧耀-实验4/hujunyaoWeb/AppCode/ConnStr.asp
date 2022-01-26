<!--#include file="Const.asp"-->
<%
Dim sql_databasename,sql_password,sql_username,sql_localname

Dim SysSiteDbPath

If CMSDataBase = 0 Then
	SysSiteDbPath = "Db/huzhikun.ASP"		'修改数据库名称后，需要相应的修改这里
	ConnStr = "Provider=Microsoft.Jet.OLEDB.4.0;Data Source=" & Server.MapPath(dbdns & SysSiteDbPath)
Else
'
End If
%>