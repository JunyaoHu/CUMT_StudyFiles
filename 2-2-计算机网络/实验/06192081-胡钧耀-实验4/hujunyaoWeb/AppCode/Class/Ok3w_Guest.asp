<%
Class Ok3w_Guest
    Public Id
	Public pID
	Public Title
    Public UserName
    Public Mail
    Public Homepage
    Public Content
    Public QQ
    Public TypeID
	Public TableID
    Public AddTime
    Public Ip
	Public IsPass
	Public IsTop
	Public ReTime
	Public ReUser
	Public Ad_Ask
	
    '���ʼ��
    Private Sub Class_Initialize()
    End Sub
	
    '����ֹ
    Private Sub Class_Terminate()
    End Sub
	
    '��Ӽ�¼
    Public Sub Add()
        Call GetFormData()
        Set clsRs = Server.CreateObject("Adodb.RecordSet")
        Sql = "select * from Ok3w_Guest where 1=2"
        clsRs.Open Sql,Conn,1,3
        clsRs.AddNew()
        Call UpdateRs(clsRs)
        clsRs.Update()
        clsRs.Close()
        Set clsRs = Nothing
    End Sub
	
    '��ͨ/�ر�����
	Public Sub Pass(action,Id)
		If Id <> "" Then
			sql = "update Ok3w_Guest set IsPass=" & action & " where Id in(" & Id & ")"
			Conn.Execute sql
			
			sql = "update Ok3w_Guest set IsPass=" & action & " where pID in(" & Id & ")"
			Conn.Execute sql
		End If
	End Sub
	
	'�ö�/ȡ������
	Public Sub Top(action,Id)
		If Id <> "" Then
			sql = "update Ok3w_Guest set IsTop=" & action & " where Id in(" & Id & ")"
			Conn.Execute sql
			
			sql = "update Ok3w_Guest set IsTop=" & action & " where pID in(" & Id & ")"
			Conn.Execute sql
		End If
	End Sub
	
	'ɾ��
	Public Sub Del(Id)
		If Id <> "" Then		
			sql = "delete from Ok3w_Guest where Id in(" & Id & ")"
			Conn.Execute sql			
		End If
	End Sub
	
	'�ظ�
	Public Sub Ask(Cask,Id)
		Sql = "select ID,TypeID,pID,Ad_Ask,ReTime,ReUser from Ok3w_Guest where ID=" & ID
		Rs.Open Sql,Conn,1,3
		Rs("Ad_Ask") = Cask
		Rs("ReTime") = Now()
		Rs("ReUser") = "����Ա"
		TypeID = Rs("TypeID")
		pID = Rs("pID")
		Rs.Update
		Rs.Close
		
		If TypeID=100 And pID<>0 Then
			Sql = "update Ok3w_Guest set ReTime=" & Db_DateTime & ",ReUser='����Ա' where ID=" & pID
			Conn.Execute Sql
		End If
	End Sub
	
	Public Sub ArticleHTML(G_ID,TypeID)
		If TypeID=2 Then
			Sql = "select ID from Ok3w_Article where ID in(select TableID from Ok3w_Guest where ID in(" & G_ID & ")) and IsPass=1 and IsDelete=0"
			Set oRs = Conn.Execute(Sql)
			Do While Not oRs.Eof
				Call Article_Page_Html(oRs("ID"))
				oRs.MoveNext
			Loop
			oRs.Close
			Set oRs = Nothing
			
		Else
			If TypeID=3 Then 
				Sql = "select ID from Ok3w_Soft where ID in(select TableID from Ok3w_Guest where ID in(" & G_ID & ")) and IsPass=1 and IsDelete=0"
				Set oRs = Conn.Execute(Sql)
				Do While Not oRs.Eof
					Call Soft_Page_Html(oRs("ID"))
					oRs.MoveNext
				Loop
				oRs.Close
				Set oRs = Nothing
			End If
		End If
	End Sub
	
    '���ձ�
    Private Sub GetFormData()
		pID = Cdbl(Request.Form("pID"))
		If pID="" Then pID = 0
        Title = Trim(Request.Form("Title"))
        UserName = Trim(Request.Form("UserName"))
		
		If InStr("|" & Lcase(Application(SiteID & "_Ok3w_SiteUserRegKillName")) & "|","|" & Lcase(UserName) & "|")>0 Then
			Response.Write("��ֹʹ�ø��û����ԣ����������롣")
			Response.End()
		End If
		
        Mail = Trim(Request.Form("Mail"))
        Homepage = Trim(Request.Form("Homepage"))
        Content = Trim(Request.Form("Content"))
        QQ = Trim(Request.Form("QQ"))
        TypeID = Trim(Request.Form("TypeID"))
		If TypeID="" Then TypeID=1
		TableID = Trim(Request.Form("TableID"))
		If TableID="" Then TableID=0
        AddTime = Now()
        Ip = Request.ServerVariables("REMOTE_ADDR")
		IsPass = 0
		IsTop = 0
		Ad_Ask = ""
    End Sub
	
    '���¼�¼��
    Private Sub UpdateRs(ByRef Rs)
		Rs("pID") = pID
        Rs("Title") = Title
        Rs("UserName") = UserName
        Rs("Mail") = Mail
        Rs("Homepage") = Homepage
        Rs("Content") = Content
        Rs("QQ") = QQ
        Rs("TypeID") = TypeID
		Rs("TableID") = TableID
        Rs("AddTime") = AddTime
        Rs("Ip") = Ip
		Rs("IsPass") = IsPass
		Rs("IsTop") = IsTop
		Rs("ReTime") = AddTime
		Rs("ReUser") = UserName
		Rs("Ad_Ask") = Ad_Ask
    End Sub
End Class
%>

