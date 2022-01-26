<%
Class Ok3w_AdSense
    Public ID
	Public SN
    Public Title
    Public Code
    Public B_Time
    Public E_Time
    Public Hits
    Public Key
	
    '类初始化
    Private Sub Class_Initialize()
	
    End Sub
	
    '类终止
    Private Sub Class_Terminate()
	
    End Sub
	
    '添加记录
    Public Sub Add()
        Call GetFormData()
        Set clsRs = Server.CreateObject("Adodb.RecordSet")
        Sql = "select * from Ok3w_AdSense where 1=2"
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
        Set clsRs = Server.CreateObject("Adodb.RecordSet")
        Sql = "select * from Ok3w_AdSense where ID= " & ID
        clsRs.Open Sql,Conn,1,3
        Call UpdateRs(clsRs)
        clsRs.Update
        clsRs.Close
        Set Rs = Nothing
    End Sub
	
    '删除记录
    Public Sub Del()
        Call GetFormData()
        Sql = "delete from Ok3w_AdSense where ID=" & ID
        Conn.Execute Sql
    End Sub
	
    '接收表单
    Private Sub GetFormData()
        ID = Trim(Request.Form("ID"))
		SN = Trim(Request.Form("SN"))
        Title = Trim(Request.Form("Title"))
        Code = Trim(Request.Form("Code"))
        B_Time = Trim(Request.Form("B_Time"))
        E_Time = Trim(Request.Form("E_Time"))
        Hits = Trim(Request.Form("Hits"))
        Key = Trim(Request.Form("Key"))
    End Sub
	
    '更新记录集
    Private Sub UpdateRs(ByRef Rs)
        'Rs("ID") = ID
		Rs("SN") = SN
        Rs("Title") = Title
        Rs("Code") = Code
        Rs("B_Time") = B_Time
        Rs("E_Time") = E_Time
        Rs("Hits") = Hits
        Rs("Key") = Key
    End Sub
	
    '从记录集中读数据
    Private Sub GetRs(ByRef Rs)
        ID = Rs("ID")
		SN = Rs("SN")
        Title = Rs("Title")
        Code = Rs("Code")
        B_Time = Rs("B_Time")
        E_Time = Rs("E_Time")
        Hits = Rs("Hits")
        Key = Rs("Key")
    End Sub
	
	'取最大SN
    Public Function GetMaxSN()
        Set clsRs = Server.CreateObject("Adodb.RecordSet")
        Sql = "select max(SN) from Ok3w_AdSense"
        clsRs.Open Sql,Conn,0,1
        If IsNull(clsRs(0)) Then
        GetMaxSN = 0
            Else
                GetMaxSN = clsRs(0)
        End If
        clsRs.Close
        Set clsRs = Nothing
    End Function
End Class
%>
