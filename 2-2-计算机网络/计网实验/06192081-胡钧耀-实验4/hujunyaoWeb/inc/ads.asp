<%@LANGUAGE="VBSCRIPT" CODEPAGE="936"%>
<%dbdns="../"
Function htmltojs(Str)
	Tmp = Split(Str,Chr(13) & Chr(10))
	Str = ""
	For i=0 To Ubound(Tmp)
		s = Tmp(i)
		s = Replace(s,"/","\/",1,-1,1)
		s = Replace(s,"\\","\\\\",1,-1,1)
		s = Replace(s,"'","\'",1,-1,1)
		s = Replace(s,"""","\""",1,-1,1)
		Str = Str & "document.writeln(""" & s & """);"
		If i<>Ubound(Tmp) Then Str = Str & vbCrLf
	Next
	htmltojs = Str
End Function
%><!--#include file="../AppCode/Conn.asp"-->function ok3w_ads(id){
switch(id){
<%
Sql = "select * from Ok3w_AdSense order by SN,ID"
Rs.Open sql,Conn,1,1
Do While Not Rs.Eof
SN = Rs("SN")
SN = "s" & Right("000" & SN,3)
Title = Rs("Title")
Code = Rs("Code")
Code = htmltojs(Code)
%>//<%=Title%>
case "<%=SN%>":
<%=Code%>
break;
<%
	Rs.MoveNext
Loop
Rs.Close
Set Rs = Nothing
Call CloseConn()
%>}
}