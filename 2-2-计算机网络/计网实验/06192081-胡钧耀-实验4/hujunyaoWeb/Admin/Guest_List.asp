<%@LANGUAGE="VBSCRIPT" CODEPAGE="936"%>
<%Const dbdns="../"%>
<!--#include file="chk.asp"-->
<!--#include file="../AppCode/Pager.asp"-->
<!--#include file="../AppCode/fun/function.asp"-->
<!--#include file="../AppCode/fun/CreateHtml.asp"-->
<!--#include file="../AppCode/Class/Ok3w_Guest.asp"-->
<%
Call CheckAdminFlag(4)

PageNo = Request.QueryString("PageNo")
If PageNo="" Then PageNo = "1"
IsPass = Request.QueryString("IsPass")
IdList = Request.Form("IdList")

If IdList<>"" Then
	Set Guest = New Ok3w_Guest
	
	Select Case Trim(Request.Form("Cmd"))
		Case "ɾ��"
			Call Guest.Del(IdList)
			'Call Guest.ArticleHTML(IdList,1)
			Set Guest = Nothing
			Call SaveAdminLog("ɾ�����ԣ�ID=" & IdList)
			Call ActionOk("Guest_List.asp?IsPass=" & IsPass & "&PageNo=" & PageNo)
		Case "��ͨ"
				Call Guest.Pass(1,IdList)
				Call Guest.ArticleHTML(IdList,1)
				Set Guest = Nothing
				Call SaveAdminLog("�ظ�/��ͨ/�ر����ԣ�ID=" & IdList)
				Call ActionOk("Guest_List.asp?IsPass=" & IsPass & "&PageNo=" & PageNo)
		Case "�ر�"
				Call Guest.Pass(0,IdList)
				Call Guest.ArticleHTML(IdList,1)
				Set Guest = Nothing
				Call SaveAdminLog("�ظ�/��ͨ/�ر����ԣ�ID=" & IdList)
				Call ActionOk("Guest_List.asp?IsPass=" & IsPass & "&PageNo=" & PageNo)
		Case "�ö�"
				Call Guest.Top(1,IdList)
				Set Guest = Nothing
				Call SaveAdminLog("�ö����ԣ�ID=" & IdList)
				Call ActionOk("Guest_List.asp?IsPass=" & IsPass & "&PageNo=" & PageNo)
		Case "ȡ���ö�"
				Call Guest.Top(0,IdList)
				Set Guest = Nothing
				Call SaveAdminLog("ȡ���ö����ԣ�ID=" & IdList)
				Call ActionOk("Guest_List.asp?IsPass=" & IsPass & "&PageNo=" & PageNo)
	End Select
End If
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>��̨����ϵͳ</title>
<link rel="stylesheet" type="text/css" href="images/Style.css">
<script language="javascript">
function ChkAll()
{
	var obj = document.form2.IdList;
	for(var i=0;i<obj.length;i++)
		obj[i].checked = !obj[i].checked;
}
</script>
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
                background="images/tab_active_bg.gif">����/���۹���</td>
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
                valign="top" bgcolor="#fffcf7"><%
stype = Trim(Request.QueryString("stype"))
keyword = Trim(Request.QueryString("keyword"))
Sql = "select * from Ok3w_Guest where TypeID=100"
If IsPass<>"" Then Sql=Sql & " and IsPass=" & IsPass
If keyword<>"" Then Sql = Sql & " and " & stype & " like '%" & keyword & "%'"
Sql = Sql & " order by Id desc"
Set Page = New TurnPage
Call Page.GetRs(Conn,Rs,Sql,10)
%>
                      <table width="100%" border="0" align="center" cellpadding="3" cellspacing="1" bgcolor="#CCCCCC">
                        <form id="form1" name="form1" method="get" action="">
                          <tr>
                            <td height="30" colspan="6" align="left" bgcolor="#EBEBEB">&nbsp;
                              <select name="stype" id="stype">
                                <option value="UserName">���û�</option>
                              <option value="Title">������</option>
                              <option value="Content">������</option>
                              </select>
                                <input name="keyword" type="text" id="keyword" />
                                <input type="submit" name="Submit2" value="����" /></td>
                          </tr>
                        </form>
                        <tr>
                          <td height="25" align="center" bgcolor="#EBEBEB">��������Ϣ</td>
                          <td align="center" bgcolor="#EBEBEB">����</td>
                          <td align="center" bgcolor="#EBEBEB">״̬</td>
                          <td align="center" bgcolor="#EBEBEB">�ظ�������ظ���</td>
                          <td align="center" bgcolor="#EBEBEB">ѡ��<br>
                            <input type="checkbox" onClick="ChkAll()"></td>
                          </tr>
                        <form id="form2" name="form2" method="post" action="?IsPass=<%=IsPass%>&PageNo=<%=PageNo%>">
                          <%
	Do While Not Rs.Eof And Not Page.Eof
	%>
                          <tr>
                            <td height="25" align="center" bgcolor="#FFFFFF">
                              <div style="width:200px; height:100px; overflow:hidden; border:1px solid #CCC; text-align:left;">������<%= OutStr(Rs("UserName"))%><br />���⣺<%= OutStr(Rs("Title"))%><br />���䣺<%= OutStr(Rs("Mail"))%><br />��ҳ��<%= OutStr(Rs("Homepage"))%><br />OICQ��<%= OutStr(Rs("QQ"))%><br />ʱ�䣺<%= Rs("AddTime")%><br />IP��<%= Rs("Ip")%></div></td>
                            <td align="center" bgcolor="#FFFFFF"><div style="width:350px; height:100px; overflow:auto; border:1px solid #CCC; text-align:left;"><%= OutStr(Rs("Content"))%></div></td>
                            <td align="center" bgcolor="#FFFFFF"><%If Rs("IsTop")=1 Then%><font color="#0000FF">�ö�</font>&nbsp;<%End If%><%If Rs("IsPass")=1 Then%>��ͨ<%Else%><font color="#FF0000">�ر�</font><%End If%></td>
                            <td align="center" bgcolor="#FFFFFF"><a href="#" onClick="g_show(<%=Rs("ID")%>)"><%If Rs("Ad_Ask")="" Then%><font color="#FF0000">δ�ظ�</font><%Else%>�ѻظ�<%End If%></a></td>
                            <td align="center" bgcolor="#FFFFFF"><input name="IdList" type="checkbox" id="IdList" value="<%=Rs("ID")%>"></td>
                            </tr> 
                          <%
		Rs.MoveNext
		Page.MoveNext
	Loop
	Rs.Close
	%>
                         
                          <tr>
                            <td height="25" colspan="6" align="right" bgcolor="#FFFFFF"><input name="Cmd" type="submit" id="Cmd" value="��ͨ">
                                <input name="Cmd" type="submit" id="Cmd" value="�ر�">
								<input name="Cmd" type="submit" id="Cmd" value="�ö�">
                                <input name="Cmd" type="submit" id="Cmd" value="ȡ���ö�">
                                <input name="Cmd" type="submit" id="Cmd" onClick="if(!confirm('���Ҫɾ����')) return false;" value="ɾ��"></td>
                          </tr> </form>
                          <tr>
                            <td height="25" colspan="6" bgcolor="#FFFFFF"><%Call Page.GetPageList()%></td>
                          </tr>
                      </table></td>
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
<div id="g_edit" style="z-index:9999; position:absolute; top:85px; left:20px; display:none;">
<iframe scrolling="auto" id="g_url" name="g_url" width="500" height="400" frameborder="1"></iframe>
<script language="javascript">
function g_show(id)
{
	document.getElementById("g_edit").style.display = "";
	g_url.location.href = "Guest_Edit.asp?ID="+id+"&TypeID=100";
}
function g_hidde()
{
	document.getElementById("g_edit").style.display = "none";
}
</script>
</div>
</body>
</html>
<%
Set Guest = Nothing
Set Rs = Nothing
Call CloseConn()
Set Admin = Nothing
%>

