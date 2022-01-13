<%
'文件操作函数:写文件
Private Sub WriteFile(FileName,Text)
	Dim fso,file
	Set fso = CreateObject("Scripting.FileSystemObject")
	Set file = fso.CreateTextFile(FileName, True)
  	file.Write(Text)
	file.Close
	Set file = Nothing
	Set fso = Nothing
End Sub

'文件操作函数:读文件
Function ReadFile(FileName)
	Dim fso,file
	Set fso = CreateObject("Scripting.FileSystemObject")
	Set file = fso.OpenTextFile(FileName, 1)
  	ReadFile = file.ReadAll()
	file.Close
	Set file = Nothing
	Set fso = Nothing
End Function

'测试文件夹是否存在
Function CheckFolder(Folder)
	Dim fso,Exists
  	Set fso = CreateObject("Scripting.FileSystemObject")
	CheckFolder = fso.FolderExists(Folder)
	Set fso = Nothing
End Function

'创建文件夹
Private Sub CreateFolder(Folder)
  Dim fso
  Set fso = CreateObject("Scripting.FileSystemObject")
  fso.CreateFolder(Folder)
  Set fso = Nothing
End Sub

'删除文件夹
Private Sub DeleteFolder(Folder)
  Dim fso
  Set fso = CreateObject("Scripting.FileSystemObject")
  fso.DeleteFolder(Server.MapPath(Folder))
  Set fso = Nothing
End Sub

'删除文件
Private Sub DeleteFile(fname)
  	Set fso = CreateObject("Scripting.FileSystemObject")
	If fso.FileExists(Server.MapPath(fname)) Then
		Set f = fso.GetFile(Server.MapPath(fname))
		f.delete()
		Set f = Nothing
	End If
	Set fso = Nothing
End Sub

'测试文件夹是否存在，不存在则建立
Private Sub CheckSavePath(FileSavePath)
	p_tmp = Split(FileSavePath,"/")
	Path = ""
	For i = 0 To Ubound(p_tmp)
		If p_tmp(i) = "" Then 
			Path = Path & "/"
			Else
				Path = Path & p_tmp(i) & "/"
				If Not CheckFolder(Server.MapPath(Path)) Then Call CreateFolder(Server.MapPath(Path))	
		End If
	Next
End Sub
%>
