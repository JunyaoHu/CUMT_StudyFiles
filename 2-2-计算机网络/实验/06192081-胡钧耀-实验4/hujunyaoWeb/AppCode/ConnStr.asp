<!--#include file="Const.asp"-->
<%
Dim sql_databasename,sql_password,sql_username,sql_localname

Dim SysSiteDbPath

If CMSDataBase = 0 Then
	SysSiteDbPath = "Db/huzhikun.ASP"		'�޸����ݿ����ƺ���Ҫ��Ӧ���޸�����
	ConnStr = "Provider=Microsoft.Jet.OLEDB.4.0;Data Source=" & Server.MapPath(dbdns & SysSiteDbPath)
Else
'
End If
%>