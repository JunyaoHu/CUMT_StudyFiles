<%@LANGUAGE="VBSCRIPT" CODEPAGE="936"%>
<%Const dbdns="../"%>
<!--#include file="chk.asp"-->
<%
ID = Trim(Request.QueryString("id"))
sTitle = Trim(Request.QueryString("title"))
sTitle = Replace(sTitle,"'","''")

Sql = "select ID from Ok3w_Article where Title='" & sTitle & "'"
If ID<>"" Then Sql = Sql & " and ID<>" & ID
Rs.Open Sql,Conn,0,1
If Rs.Eof And Rs.Bof Then
Else
	Response.Write("<script>alert(""Ok3w.Net��ʾ����\n\n����Ϊ��" & sTitle & "���������Ѿ����ڡ�"");</script>")
End If

Call CloseConn()
Set Article = Nothing
Set Admin = Nothing
%>