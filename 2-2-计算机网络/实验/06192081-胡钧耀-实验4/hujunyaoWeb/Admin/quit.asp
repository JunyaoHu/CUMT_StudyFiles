<%dbdns="../"%>
<!--#include file="chk.asp"-->
<%
Call SaveAdminLog("��ȫ�˳�")
Call CloseConn()
Set Admin = Nothing

Session.Abandon()
						
Response.Write("<script language=""javascript"">")
Response.Write("parent.location.href=""ad_login.asp"";")
Response.Write("</script>")
Response.End()
%>
