<%
'�ļ���������:д�ļ�
Private Sub WriteFile(FileName,Text)
	Dim fso,file
	Set fso = CreateObject("Scripting.FileSystemObject")
	Set file = fso.CreateTextFile(FileName, True)
  	file.Write(Text)
	file.Close
	Set file = Nothing
	Set fso = Nothing
End Sub

'�ļ���������:���ļ�
Function ReadFile(FileName)
	Dim fso,file
	Set fso = CreateObject("Scripting.FileSystemObject")
	Set file = fso.OpenTextFile(FileName, 1)
  	ReadFile = file.ReadAll()
	file.Close
	Set file = Nothing
	Set fso = Nothing
End Function

'�����ļ����Ƿ����
Function CheckFolder(Folder)
	Dim fso,Exists
  	Set fso = CreateObject("Scripting.FileSystemObject")
	CheckFolder = fso.FolderExists(Folder)
	Set fso = Nothing
End Function

'�����ļ���
Private Sub CreateFolder(Folder)
  Dim fso
  Set fso = CreateObject("Scripting.FileSystemObject")
  fso.CreateFolder(Folder)
  Set fso = Nothing
End Sub

'ɾ���ļ���
Private Sub DeleteFolder(Folder)
  Dim fso
  Set fso = CreateObject("Scripting.FileSystemObject")
  fso.DeleteFolder(Server.MapPath(Folder))
  Set fso = Nothing
End Sub

'ɾ���ļ�
Private Sub DeleteFile(fname)
  	Set fso = CreateObject("Scripting.FileSystemObject")
	If fso.FileExists(Server.MapPath(fname)) Then
		Set f = fso.GetFile(Server.MapPath(fname))
		f.delete()
		Set f = Nothing
	End If
	Set fso = Nothing
End Sub

'�����ļ����Ƿ���ڣ�����������
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
