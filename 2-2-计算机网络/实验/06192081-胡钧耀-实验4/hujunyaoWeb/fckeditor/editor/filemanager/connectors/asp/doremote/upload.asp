<% Option Explicit %>
<!--#include file="../config.asp"-->
<%Server.ScriptTimeOut = 1800%>
<%
Dim sAction, sAllowExt, nAllowSize, sCusDir, sUploadDir, sPathFileName, sContentPath, nFileNum, sContent
sAllowExt = "bmp|gif|jpeg|jpg|png"
nAllowSize = 1024
sAction = UCase(Trim(Request.QueryString("action")))
sContent = ""
If sAction = "REMOTE" Then
	Call DoRemote()
End If

Sub DoRemote()
	Dim i
	For i = 1 To Request.Form("Content").Count 
		sContent = sContent & Request.Form("Content")(i) 
	Next
	Call DoCreateNewDir()
	sUploadDir = sCusDir
	sContentPath = sCusDir
	sContent = ReplaceRemoteUrl(sContent, sAllowExt)
End Sub

Sub DoCreateNewDir()
	Dim a, i
	oTmp = Split(ConfigUserFilesPath,"/")
	oUrl = ""
	For oI=2 To Ubound(oTmp)
		oUrl = oUrl & "/" & oTmp(oI)
	Next
	sCusDir = oUrl & "image/a/"
	Call CreateFolder(sCusDir)
	
	sCusDir = sCusDir & FormatTime(Now(), 0) & "/"
	Call CreateFolder(sCusDir)
End Sub

Sub CreateFolder(s_Folder)
	Dim fso, sUploadDir
	sUploadDir = Server.MapPath(s_Folder)
	Set fso = Server.CreateObject("Scripting.FileSystemObject")
	If fso.FolderExists(sUploadDir) = False Then
		fso.CreateFolder sUploadDir
	End If
	Set fso = Nothing
End Sub

Function ReplaceRemoteUrl(sHTML, sExt)
	Dim s_Content
	s_Content = sHTML
	Dim re, RemoteFile, RemoteFileurl, SaveFileName, SaveFileType
	Set re = new RegExp
	re.IgnoreCase  = True
	re.Global = True
	re.Pattern = "((http|https|ftp|rtsp|mms):(\/\/|\\\\){1}(([A-Za-z0-9_-])+[.]){1,}([A-Za-z0-9]{1,5})\/(\S+\.(" & sExt & ")))"
	Set RemoteFile = re.Execute(s_Content)
	Dim a_RemoteUrl(), n, i, bRepeat
	n = 0
	For Each RemoteFileurl in RemoteFile
		If n = 0 Then
			n = n + 1
			Redim a_RemoteUrl(n)
			a_RemoteUrl(n) = RemoteFileurl
		Else
			bRepeat = False
			For i = 1 To UBound(a_RemoteUrl)
				If UCase(RemoteFileurl) = UCase(a_RemoteUrl(i)) Then
					bRepeat = True
					Exit For
				End If
			Next
			If bRepeat = False Then
				n = n + 1
				Redim Preserve a_RemoteUrl(n)
				a_RemoteUrl(n) = RemoteFileurl
			End If
		End If		
	Next
	nFileNum = 0
	For i = 1 To n
		SaveFileType = Mid(a_RemoteUrl(i), InstrRev(a_RemoteUrl(i), ".") + 1)
		SaveFileName = GetRndFileName(SaveFileType)
		If SaveRemoteFile(SaveFileName, a_RemoteUrl(i)) = True Then
			nFileNum = nFileNum + 1
				If nFileNum > 1 Then
					sPathFileName = sPathFileName & "|"
				End If
			sPathFileName = sPathFileName & sContentPath & SaveFileName
			s_Content = Replace(s_Content, a_RemoteUrl(i), sContentPath & SaveFileName, 1, -1, 1)
		End If
	Next
	ReplaceRemoteUrl = s_Content
End Function

Function SaveRemoteFile(s_LocalFileName, s_RemoteFileUrl)
	Dim Ads, Retrieval, GetRemoteData
	Dim bError
	bError = False
	SaveRemoteFile = False
	''On Error ReSume Next
	Set Retrieval = Server.CreateObject("Microsoft" & ".XMLHTTP")
	With Retrieval
		.Open "Get", s_RemoteFileUrl, False, "", ""
		.Send
		GetRemoteData = .ResponseBody
	End With
	Set Retrieval = Nothing
	If LenB(GetRemoteData) > nAllowSize*1024 Then
		bError = True
	Else
		Set Ads = Server.CreateObject("Adodb." & "Stream")
		With Ads
			.Type = 1
			.Open
			.Write GetRemoteData
			.SaveToFile Server.MapPath(sUploadDir & s_LocalFileName), 2
			.Cancel()
			.Close()
		End With
		Set Ads=nothing
		
		Call Ok3w_AspJpeg(Server.MapPath(sUploadDir & s_LocalFileName))
	End If
	If Err.Number = 0 And bError = False Then
		SaveRemoteFile = True
	Else
		Err.Clear
	End If
End Function

Function GetRndFileName(sExt)
	Dim sRnd
	Randomize
	sRnd = Int(900 * Rnd) + 100
	GetRndFileName = FormatTime(Now(), 5) & sRnd & "." & sExt
End Function

Function FormatTime(s_Time, n_Flag)
	Dim y, m, d, h, mi, s
	FormatTime = ""
	If IsDate(s_Time) = False Then Exit Function
	y = cstr(year(s_Time))
	m = cstr(month(s_Time))
	If len(m) = 1 Then m = "0" & m
	d = cstr(day(s_Time))
	If len(d) = 1 Then d = "0" & d
	h = cstr(hour(s_Time))
	If len(h) = 1 Then h = "0" & h
	mi = cstr(minute(s_Time))
	If len(mi) = 1 Then mi = "0" & mi
	s = cstr(second(s_Time))
	If len(s) = 1 Then s = "0" & s
	Select Case n_Flag
		Case 0
			FormatTime = y & m
		Case 1
			FormatTime = y & "-" & m & "-" & d & " " & h & ":" & mi & ":" & s
		Case 2
			FormatTime = y & "-" & m & "-" & d
		Case 3
			FormatTime = h & ":" & mi & ":" & s
		Case 4
			FormatTime = y & m & d
		Case 5
			FormatTime = y & m & d & h & mi & s
	End Select
End Function
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>远程上传</title>
<style type="text/css">
body{ margin:0px; padding:0px; font-size:10px;}
form{ margin:0px; padding:0px;}
textarea{ display:none;}
input{ width:90px;}
</style>
</head>

<body>
<form id="form1" name="form1" method="post" action="?action=REMOTE">
  <textarea name="Content"><%=Server.HTMLEncode(sContent)%></textarea>
  <input type="button" name="Submit" value="上传远程文件" onclick="DoRemote()" />
</form>
<script type="text/javascript">
function DoRemote(){
	if(parent.Content___Frame.frames[0].document.body.innerHTML.indexOf("//") == -1){
		return false;
	}
	form1.Content.value = parent.Content___Frame.frames[0].document.body.innerHTML;
	form1.Submit.disabled = true;
	form1.Submit.value = "正在上传文件";
	form1.submit();
}
<%If sContent <> "" Then%>
parent.Content___Frame.frames[0].document.body.innerHTML = form1.Content.value;
<%End If%>
</script>
</body>
</html>