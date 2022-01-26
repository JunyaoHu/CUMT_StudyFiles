<%@LANGUAGE="VBSCRIPT" CODEPAGE="936"%>
<%Const dbdns="../"%>
<!--#include file="chk.asp"-->
<!--#include file="../AppCode/Pager.asp"-->
<!--#include file="../AppCode/fun/function.asp"-->
<!--#include file="../AppCode/Class/Ok3w_Article.asp"-->
<%
ChannelID = Request.QueryString("ChannelID")
Select Case ChannelID
	Case 1
		Call CheckAdminFlag(3)
	Case 2
		Call CheckAdminFlag(2)
	Case Else
		Response.End()
End Select
IsDelete = Request.QueryString("IsDelete")
If IsDelete = "" Then IsDelete = 0
IsUserAdd = Request.QueryString("IsUserAdd")

Set Article = New Ok3w_Article
Dim Cmd,CmdTmp
Cmd = Trim(Request.Form("Cmd"))
If Cmd <> "" Then
	CmdTmp = Split(Cmd,"|")
	Lid = Trim(Request.Form("Id"))
	Select Case CmdTmp(0)
		Case "pass"
			Call Article.Pass(CmdTmp(1),Lid)
			Set Article = Nothing
			Call SaveAdminLog("开通/关闭站内文章，Action=" & CmdTmp(1) & "，ID=" & Lid)
			Call ActionOk("Article_List.asp?ChannelID=" & ChannelID & "&IsDelete=" & IsDelete)
		Case "del"
			Call Article.Del(Lid)
			Set Article = Nothing
			Call SaveAdminLog("删除站内文章，ID=" & Lid)
			Call ActionOk("Article_List.asp?ChannelID=" & ChannelID & "&IsDelete=" & IsDelete)
		Case "top"
			Call Article.Top(CmdTmp(1),Lid)
			Set Article = Nothing
			Call SaveAdminLog("置顶/取消站内文章，Action=" & CmdTmp(1) & "，ID=" & Lid)
			Call ActionOk("Article_List.asp?ChannelID=" & ChannelID & "&IsDelete=" & IsDelete)
		Case "commend"
			Call Article.Commend(CmdTmp(1),Lid)
			Set Article = Nothing
			Call SaveAdminLog("推荐/取消站内文章，Action=" & CmdTmp(1) & "，ID=" & Lid)
			Call ActionOk("Article_List.asp?ChannelID=" & ChannelID & "&IsDelete=" & IsDelete)
		Case "Pic"
			Call Article.Pic(CmdTmp(1),Lid)
			Set Article = Nothing
			Call SaveAdminLog("图片/取消站内文章，Action=" & CmdTmp(1) & "，ID=" & Lid)
			Call ActionOk("Article_List.asp?ChannelID=" & ChannelID & "&IsDelete=" & IsDelete)
		Case "Okdel"
			Call Article.OkDel(Lid)
			Set Article = Nothing
			Call SaveAdminLog("彻底删除站内文章，ID=" & Lid)
			Call ActionOk("Article_List.asp?ChannelID=" & ChannelID & "&IsDelete=" & IsDelete)
		Case "Hf"
			Call Article.Resumption(CmdTmp(1),Lid)
			Set Article = Nothing
			Call SaveAdminLog("恢复，Action=" & CmdTmp(1) & "，ID=" & Lid)
			Call ActionOk("Article_List.asp?ChannelID=" & ChannelID & "&IsDelete=" & IsDelete)		
	End Select
End If
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>后台管理系统</title>
<link rel="stylesheet" type="text/css" href="images/Style.css">
<script type="text/javascript" src="images/js.js"></script>
<script type="text/javascript">
var IsChkAll = false;
var ChannelID = "<%=ChannelID%>";
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
                  <td 
                background="images/tab_active_bg.gif" class="tab"><strong class="mtitle">文章管理</strong></td>
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
ClassID = Trim(Request.QueryString("ClassID"))
IsPass = Trim(Request.QueryString("IsPass"))
IsPic = Trim(Request.QueryString("IsPic"))
IsTop = Trim(Request.QueryString("IsTop"))
IsCommend = Trim(Request.QueryString("IsCommend"))
IsMove = Trim(Request.QueryString("IsMove"))
IsPlay = Trim(Request.QueryString("IsPlay"))
IsIndexImg = Trim(Request.QueryString("IsIndexImg"))

Sql = "select * from Ok3w_Article where ChannelID=" & ChannelID & " and IsDelete=" & IsDelete

If keyword<>"" Then Sql = Sql & " and " & stype & " like '%" & keyword & "%'"
If ClassID<>"" Then
	ClassID = Cdbl(ClassID)
	Sql = Sql & " and SortPath like '%," & ClassID & ",%'"
End If
If IsPass<>"" Then Sql = Sql & " and IsPass=" & Cint(IsPass)
If IsPic<>"" Then Sql = Sql & " and IsPic=" & Cint(IsPic)
If IsTop<>"" Then Sql = Sql & " and IsTop=" & Cint(IsTop)
If IsCommend<>"" Then Sql = Sql & " and IsCommend=" & Cint(IsCommend)
If IsMove<>"" Then Sql = Sql & " and IsMove=" & Cint(IsMove)
If IsPlay<>"" Then Sql = Sql & " and IsPlay=" & Cint(IsPlay)
If IsIndexImg<>"" Then Sql = Sql & " and IsIndexImg=" & Cint(IsIndexImg)
If IsUserAdd<>"" Then Sql = Sql & " and IsUserAdd=" & Cint(IsUserAdd)

Sql = Sql & " order by Id desc"
Set Page = New TurnPage
Call Page.GetRs(Conn,Rs,Sql,20)
%>
                      <table width="98%" border="0" align="center" cellpadding="5" cellspacing="1" bgcolor="#CCCCCC">
                        <form id="Form" name="Form" method="get" action="">
                          <tr>
                            <td colspan="10" align="left" bgcolor="#EBEBEB"><select name="stype" id="stype">
                              <option value="Title">按标题</option>
                              <option value="Content">按内容</option>
                              </select>
							  <select name="ClassID"><option value="">点这里选择分类</option>
						  <%Call InitClassSelectOption(ChannelId,0,Article.ClassID)%></select>
                                <input name="keyword" type="text" id="keyword" size="25" />
                                <input name="Submit" type="submit" class="bntStyle" value="查 找" />
                                <input name="ChannelID" type="hidden" id="ChannelID" value="<%=ChannelID%>" />
                                <input name="IsDelete" type="hidden" id="IsDelete" value="<%=IsDelete%>" />
                                <a href="?ChannelID=<%=ChannelID%>">全部</a> <a href="?ChannelID=<%=ChannelID%>&IsPass=0">待审</a> <a href="?ChannelID=<%=ChannelID%>&IsTop=1">置顶</a> <a href="?ChannelID=<%=ChannelID%>&IsCommend=1">推荐</a> <a href="?ChannelID=<%=ChannelID%>&IsPic=1">图片</a> <a href="?ChannelID=<%=ChannelID%>&IsMove=1">滚动</a> <a href="?ChannelID=<%=ChannelID%>&IsPlay=1">轮播</a> <a href="?ChannelID=<%=ChannelID%>&IsIndexImg=1">略图</a> </td>
                          </tr>
                        </form>
						<form id="form2" name="form2" method="post" action="?ChannelID=<%=ChannelID%>&IsDelete=<%=IsDelete%>">
                        <tr>
                          <td colspan="10" align="left" bgcolor="#EBEBEB"><%If IsDelete=0 Then%><input name="bntEdit" type="button" class="bntStyle" id="bntEdit" onClick="a_edit(this.form)" value="修改/查看" />
						  <input name="bntDel" type="button" class="bntStyle" id="bntDel" onClick="a_action(this.form,'del|1')" value="删 除" />
                                 <input name="bntCopy" type="button" class="bntStyle" id="bntCopy" onClick="a_copy(this.form)" value="复 制" /> <input name="bntCopy" type="button" class="bntStyle" id="bntCopy" onClick="a_move(this.form)" value="转 移" />
                                  
                            <input name="bntPass" type="button" class="bntStyle" id="bntPass" onClick="a_action(this.form,'pass|1')" value="开 通" />
                            <input name="bntNotPass" type="button" class="bntStyle" id="bntNotPass" onClick="a_action(this.form,'pass|0')" value="关 闭" />
                            <input name="bntIsTop" type="button" class="bntStyle" id="bntIsTop" onClick="a_action(this.form,'top|1')" value="置 顶" />
                            <input name="bntNotIsTop" type="button" class="bntStyle" id="bntNotIsTop" onClick="a_action(this.form,'top|0')" value="取消置顶" />
                            <input name="bntIsCommend" type="button" class="bntStyle" id="bntIsCommend"  onclick="a_action(this.form,'commend|1')" value="推 荐" />
                            <input name="bntNotIsCommend" type="button" class="bntStyle" id="bntNotIsCommend" onClick="a_action(this.form,'commend|0')" value="取消推荐" /><!-- 
                            <input name="bntIsPic" type="button" class="bntStyle" id="bntIsPic" onClick="a_action(this.form,'Pic|1')" value="图 片" />
                            <input name="bntNotIsPic" type="button" class="bntStyle" id="bntNotIsPic" onClick="a_action(this.form,'Pic|0')" value="取消图片" />--><%End If%><%If IsDelete=1 Then%>
                            <input name="bntIsPack" type="button" class="bntStyle" id="bntIsPack" onClick="a_action(this.form,'Okdel|1')" value="彻底删除" />
                            <input name="bntNotIsPic2" type="button" class="bntStyle" id="bntNotIsPic2" onClick="a_action(this.form,'Hf|1')" value="恢 复" /><%End If%>
                            <input name="Cmd" type="hidden" id="Cmd" /></td>
                          </tr>
                        <tr>
                          <td width="4%" align="center" bgcolor="#EBEBEB"><img src="images/formcheckbox.gif" width="20" height="20" style="cursor:hand;" onClick="javascript:ChkAll(forms[1]);" /></td>
                          <td width="6%" align="center" bgcolor="#EBEBEB">编号</td>
                          <td width="32%" align="center" bgcolor="#EBEBEB">标题</td>
                          <td width="8%" align="center" bgcolor="#EBEBEB">栏目</td>
                          <td width="10%" align="center" bgcolor="#EBEBEB">属性</td>
                        
                          <td width="6%" align="center" bgcolor="#EBEBEB">阅读</td>
                          <td width="12%" align="center" bgcolor="#EBEBEB">添加时间</td>
                          </tr>
                          <%
If Not(Rs.Eof And Rs.Bof) Then						  
	Do While Not Rs.Eof And Not Page.Eof
	%>
                          <tr>
                            <td align="center" bgcolor="#FFFFFF"><input name="Id" type="checkbox" id="Id" value="<%=Rs("Id")%>" /></td>
                            <td align="center" bgcolor="#FFFFFF"><%=Rs("ID")%></td>
                            <td align="center" bgcolor="#FFFFFF"><a href="Article_Edit.asp?action=edit&Id=<%=Rs("ID")%>&ChannelID=<%=ChannelID%>"><%= Rs("Title")%></a></td>
                            <td align="center" bgcolor="#FFFFFF"><%=GetClassName(Rs("ClassID"))%></td>
                            <td align="center" bgcolor="#FFFFFF">
                              <%If Rs("IsTop") Then%>置顶 <%End If%>
                              <%If Rs("IsCommend") Then%>推荐 <%End If%>
                              <%If Rs("IsPic") Then%>图片 <%End If%> 
							  <%If Rs("IsMove") Then%>滚动 <%End If%>
                              <%If Rs("IsPlay") Then%>轮播 <%End If%>
							  <%If Rs("IsIndexImg") Then%>略图 <%End If%>
							  <%If Rs("IsDelete") Then%>已删除 <%End If%>                           </td>
                           
                            <td align="left" bgcolor="#FFFFFF"><%= Rs("Hits")%></td>
                            <td align="center" bgcolor="#FFFFFF"><%= Rs("AddTime")%></td>
                            </tr>
                          <%
		Rs.MoveNext
		Page.MoveNext
	Loop
	%>
                          
                          <tr>
                            <td height="25" colspan="10" align="right" bgcolor="#FFFFFF"><%Call Page.GetPageList()%></td>
                          </tr>
<%Else%>						  
						  <tr>
                            <td colspan="10" align="center" bgcolor="#FFFFFF">没有相关内容</td>
                          </tr>
<%
End If
Rs.Close
%>						  
                        </form>
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
</body>
</html>
<%
Set Article = Nothing
Set Rs = Nothing
Call CloseConn()
Set Admin = Nothing
%>

