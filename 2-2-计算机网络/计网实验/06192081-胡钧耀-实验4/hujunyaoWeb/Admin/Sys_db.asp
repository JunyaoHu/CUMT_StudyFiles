<%@LANGUAGE="VBSCRIPT" CODEPAGE="936"%>
<%dbdns="../"%>
<!--#include file="chk.asp"-->
<%
Call CheckAdminFlag(1)

Select Case Trim(Request.Form("action"))
	Case "backup"
		Call CloseConn()
		ss = dbdns & SysSiteDbPath'Trim(Request.Form("ss"))
		tt = Trim(Request.Form("tt"))
		Call backupDb(ss,tt)
		Call OpenConn()
		Call SaveAdminLog("备份数据库：" & ss & " >> " & tt)
		Call CloseConn()
		Call ActionOk("Sys_db.asp")
	Case "hf"
		Call CloseConn()
		ss = Trim(Request.Form("ss"))
		Tmp = Split(Replace(ss,"..",""),".")
		If Ubound(Tmp)<>1 Then
			Response.Write("Err")
			Response.End()
		End If
		If Tmp(Ubound(Tmp))<>"asp" Then
			Response.Write("Err")
			Response.End()
		End If
		tt = dbdns & SysSiteDbPath'Trim(Request.Form("tt"))
		If ss<>"" Then
		Call backupDb(ss,tt)
		Call OpenConn()
		Call SaveAdminLog("恢复数据库：" & ss & " >> " & tt)
		Call CloseConn()
		End If
		Call ActionOk("Sys_db.asp")
	Case "ys"
		Call CloseConn()
		ss = dbdns & SysSiteDbPath'Trim(Request.Form("ss"))
		Call CompactDB(Server.MapPath(ss),False)
		Call OpenConn()
		Call SaveAdminLog("压缩数据库：" & ss )
		Call CloseConn()
		Call ActionOk("Sys_db.asp")
End Select
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>后台管理系统</title>
<link rel="stylesheet" type="text/css" href="images/Style.css">
<style type="text/css">
<!--
.STYLE1 {color: #FF0000}
-->
</style>
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
                background="images/tab_active_bg.gif">数据库备份/恢复</td>
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
                valign="top" bgcolor="#fffcf7">
				

当前数据库大小为：<span class="STYLE1"><%=Round(DbSize("../" & SysSiteDbPath) / 1024 / 1024,2)%></span>M				
<br>
<br>
<fieldset style="padding:10px;">
<legend>备份</legend>
<br />
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <form id="form1" name="form1" method="post" action="">
  <tr>
    <td>
数据库：
<select name="ss" id="ss">
  <option value="<%="../" & SysSiteDbPath%>"><%=SysSiteDbPath%></option>
</select>
备份到：
<select name="tt" id="tt">
<%
Fname = "backup/#db" & Year(Date()) & Month(Date()) & Day(Date()) & Hour(Time()) & Minute(Time()) & Second(Time()) & ".asp"
%>
  <option value="<%="../" & Fname%>"><%=Fname%></option>
</select>
            <input name="action" type="hidden" id="action" value="backup" />
            <input type="submit" name="Submit" value="提交" />
    
    </td>
  </tr>
  </form>
</table>
</fieldset>
<br><br>
<fieldset style="padding:10px;">
<legend>恢复</legend>
<Br />
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <form id="form1" name="form1" method="post" action="">
  <tr>
    <td>
数据库：
<select name="ss" id="ss">
  <%Call ShowFolderList()%>
</select>
恢复到：
<select name="tt" id="tt">
  <option value="<%="../" & SysSiteDbPath%>"><%=SysSiteDbPath%></option>
</select>            <input name="action" type="hidden" id="action" value="hf" />
            <input type="submit" name="Submit" value="提交" />
    
    </td>
  </tr>
  </form>
</table>
</fieldset>
<br><br>
<fieldset style="padding:10px;">
<legend>压缩数据库</legend>
<br />
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <form id="form1" name="form1" method="post" action="">
  <tr>
    <td>
数据库：
<select name="ss" id="ss">
  <option value="<%="../" & SysSiteDbPath%>"><%=SysSiteDbPath%></option>
</select>
<input name="action" type="hidden" id="action" value="ys" />
            <input type="submit" name="Submit" value="提交" />
    
    </td>
  </tr>
  </form>
</table>
</fieldset>
				
				
				</td>
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
Call CloseConn()
Set Rs = Nothing
Set Admin = Nothing
%>

<%
Function CompactDB(dbPath, boolIs97)
Dim fso, Engine, strDBPath
dim  JET_3X
JET_3X = 4
strDBPath = server.mappath("../backup") & "/"
Set fso = CreateObject("Scripting.FileSystemObject")

If fso.FileExists(dbPath) Then
Set Engine = CreateObject("JRO.JetEngine")

If boolIs97 = True Then
Engine.CompactDatabase "Provider=Microsoft.Jet.OLEDB.4.0;Data Source=" & dbpath, _
"Provider=Microsoft.Jet.OLEDB.4.0;Data Source=" & strDBPath & "temp.mdb;" _
& "Jet OLEDB:Engine Type=" & JET_3X
Else
Engine.CompactDatabase "Provider=Microsoft.Jet.OLEDB.4.0;Data Source=" & dbpath, _
"Provider=Microsoft.Jet.OLEDB.4.0;Data Source=" & strDBPath & "temp.mdb"
End If
fso.CopyFile strDBPath & "temp.mdb",dbpath
fso.DeleteFile(strDBPath & "temp.mdb")
Set fso = nothing
Set Engine = nothing
CompactDB = True
Else
CompactDB = False
End If
End Function

Function backupDb(ss,tt)
	Set fso = CreateObject("Scripting.FileSystemObject")
	fso.CopyFile Server.MapPath(ss),Server.MapPath(tt)
	Set fso = Nothing
End Function

Function DbSize(FileName)
	Set fso = CreateObject("Scripting.FileSystemObject")
	Set f = fso.GetFile(Server.MapPath(FileName))
	DbSize = f.Size
	Set f = Nothing
	Set fso = Nothing
End Function

Function ShowFolderList()
    Dim fso, f, f1, fc, s
    Set fso = CreateObject("Scripting.FileSystemObject")
    Set f = fso.GetFolder(Server.MapPath("../backup/"))
    Set fc = f.Files
    For Each f1 in fc
        If  Right(f1.Name,3)="asp" Then Response.Write "<option value=" & "../backup/" & f1.Name & ">" & "backup/" & f1.Name & "</option>"
    Next
	Set fc = Nothing
	Set f = Nothing
	Set fso = Nothing
End Function
%>