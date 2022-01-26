<%
Class Ok3w_Channel
    Public ChannelId
    Public ChannelName
    Public ChannelPicUrl
    Public ReadMe
    Public OrderID
    Public ChannelDir
    Public ModuleType
	
    '类初始化
    Private Sub Class_Initialize()
		OrderID = GetMaxOrderID() + 1
    End Sub
    '类终止
    Private Sub Class_Terminate()
    End Sub
	
	'读记录
	Public Sub Load(ChannelId)
		Set clsRs = Server.CreateObject("Adodb.RecordSet")
		Sql = "select * from Ok3w_Channel where ChannelId=" & ChannelId
        clsRs.Open Sql,Conn,1,1
		If clsRs.Eof And clsRs.Bof Then
			Response.Write("资源不存在")
			Response.End()
		End If
        Call GetRs(clsRs)
        clsRs.Close()
        Set clsRs = Nothing
	End Sub
	
    '添加记录
    Public Sub Add()
        Call GetFormData()
        Sql = "select count(*) from Ok3w_Channel where ChannelName='" & ChannelName & "'"
        If Conn.Execute(Sql)(0)<>0 Then
            Call CloseConn()
            Session("ErrMsg") = "相同的记录已经存在，请不要重复添加。"
            Call ActionOk()
        End If
        Set clsRs = Server.CreateObject("Adodb.RecordSet")
        Sql = "select * from Ok3w_Channel where 1=2"
        clsRs.Open Sql,Conn,1,3
        clsRs.AddNew()
        Call UpdateRs(clsRs)
        clsRs.Update()
        clsRs.Close()
        Set clsRs = Nothing
    End Sub
	
    '修改记录
    Public Sub Edit()
        Call GetFormData()
        Sql = "select count(*) from Ok3w_Channel where ChannelName='" & ChannelName & "' and ChannelId<>" & ChannelId
        If Conn.Execute(Sql)(0)<>0 Then
            Call CloseConn()
            Session("ErrMsg") = "相同的记录已经存在，该修改无效。"
            Call ActionOk()
        End If
        Set clsRs = Server.CreateObject("Adodb.RecordSet")
        Sql = "select * from Ok3w_Channel where ChannelId= " & ChannelId
        clsRs.Open Sql,Conn,1,3
        Call UpdateRs(clsRs)
        clsRs.Update
        clsRs.Close
        Set Rs = Nothing
    End Sub
	
    '删除记录
    Public Sub Del(ChannelId)
		Sql="select ModuleType from Ok3w_Channel where ChannelId=" & ChannelId
		Select Case Conn.Execute(Sql)(0)
			Case 1
				TableName = "Ok3w_Article"
			Case Else
				TableName = "Ok3w_Article"
		End Select
		
		Sql = "update " & TableName & " set ChannelId=0,IsDelete=1 where ChannelId=" & ChannelId
		Conn.Execute Sql
		
		Sql = "delete from Ok3w_Class where  ChannelId=" & ChannelId
		Conn.Execute Sql
		
        Sql = "delete from Ok3w_Channel where ChannelId=" & ChannelId
        Conn.Execute Sql
    End Sub
	
    '接收表单
    Private Sub GetFormData()
        ChannelId = Request.QueryString("ChannelId")
		If ChannelId = "" Then ChannelId = GetMaxChannelId() + 1
        ChannelName = Request.Form("ChannelName")
        ChannelPicUrl = Request.Form("ChannelPicUrl")
		For i = 1 To Request.Form("ReadMe").Count 
			ReadMe = ReadMe & Request.Form("ReadMe")(i) 
		Next
        OrderID = Request.Form("OrderID")
        ChannelDir = Request.Form("ChannelDir")
        ModuleType = Request.Form("ModuleType")
    End Sub
	
    '更新记录集
    Private Sub UpdateRs(ByRef Rs)
        Rs("ChannelId") = ChannelId
        Rs("ChannelName") = ChannelName
        Rs("ChannelPicUrl") = ChannelPicUrl
        Rs("ReadMe") = ReadMe
        Rs("OrderID") = OrderID
        Rs("ChannelDir") = ChannelDir
        Rs("ModuleType") = ModuleType
    End Sub
	
    '从记录集中读数据
	Private Sub GetRs(ByRef Rs)
        ChannelId = Rs("ChannelId")
        ChannelName = Rs("ChannelName")
        ChannelPicUrl = Rs("ChannelPicUrl")
        ReadMe = Rs("ReadMe")
        OrderID = Rs("OrderID")
        ChannelDir = Rs("ChannelDir")
        ModuleType = Rs("ModuleType")
    End Sub
	
    '取最大ChannelId
    Public Function GetMaxChannelId()
        Set clsRs = Server.CreateObject("Adodb.RecordSet")
        Sql = "select max(ChannelId) from Ok3w_Channel"
        clsRs.Open Sql,Conn,0,1
        If IsNull(clsRs(0)) Then
        	GetMaxChannelId = 0
            Else
                GetMaxChannelId = clsRs(0)
        End If
        clsRs.Close
        Set clsRs = Nothing
    End Function
	
	 '取最大OrderID
    Public Function GetMaxOrderID()
        Set clsRs = Server.CreateObject("Adodb.RecordSet")
        Sql = "select max(OrderID) from Ok3w_Channel"
        clsRs.Open Sql,Conn,0,1
        If IsNull(clsRs(0)) Then
        	GetMaxOrderID = 0
            Else
                GetMaxOrderID = clsRs(0)
        End If
        clsRs.Close
        Set clsRs = Nothing
    End Function
End Class
%>
