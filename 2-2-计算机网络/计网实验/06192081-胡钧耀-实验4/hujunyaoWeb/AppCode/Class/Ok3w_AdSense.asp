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
        Sql = "select * from Ok3w_AdSense where 1=2"
        clsRs.Open Sql,Conn,1,3
        clsRs.AddNew()
        Call UpdateRs(clsRs)
        clsRs.Update()
        clsRs.Close()
        Set clsRs = Nothing
    End Sub
	
    '�޸ļ�¼
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
	
    'ɾ����¼
    Public Sub Del()
        Call GetFormData()
        Sql = "delete from Ok3w_AdSense where ID=" & ID
        Conn.Execute Sql
    End Sub
	
    '���ձ�
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
	
    '���¼�¼��
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
	
    '�Ӽ�¼���ж�����
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
	
	'ȡ���SN
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
