<%
Class Vip_Xczs
    Public id
	Public User_Name
	Public xcTheme
	Public xcAim
	Public xcBudget
	Public xcTel
	Public xcPerson
	Public pubTime
    '���ʼ��
    Private Sub Class_Initialize()
    End Sub
	
    '����ֹ
    Private Sub Class_Terminate()
    End Sub
	
	'����¼
	Public Sub Load(ID)
		Set clsRs = Server.CreateObject("Adodb.RecordSet")
		Sql = "select * from Ok3w_User where ID=" & ID
        clsRs.Open Sql,Conn,1,1
		If Not(clsRs.Eof And clsRs.Bof) Then  Call GetRs(clsRs)
        clsRs.Close()
        Set clsRs = Nothing
	End Sub
	
    '���������Ϣ
    Public Sub InfoAdd(User_Name)
        xcTheme =  Trim(Request.Form("xcTheme"))
		xcAim =  Trim(Request.Form("xcAim"))
        xcBudget =  Trim(Request.Form("xcBudget"))
        xcTel =  Trim(Request.Form("xcTel"))
        xcPerson =  Trim(Request.Form("xcPerson"))
        pubTime =  Now()

		If InStr("|" & Lcase(Application(SiteID & "_Ok3w_SiteUserRegKillName")) & "|","|" & Lcase(User_Name) & "|")>0 Then
			Call MessageBox("Ok3w.Net--���û����ƽ�ֹʹ�ã�����������","")
			Response.End()
		End If
		
		Sql="select * from vip_xczs where User_Name='" & User_Name & "' and xcTheme='" & xcTheme & "'"

		Rs.Open Sql,Conn,1,3
		If Rs.Eof And Rs.Bof Then
			Rs.AddNew
			Else
				Call MessageBox("����Ϣ�Ѿ���������","")
				Response.End()
		End If

        Rs("User_Name") = User_Name
        Rs("xcTheme") = xcTheme
        Rs("xcAim") = xcAim
        Rs("xcBudget") = xcBudget
        Rs("xcTel") = xcTel
		Rs("xcPerson") = xcPerson
        Rs("pubTime") = pubTime
		
		Rs.Update
		Rs.Close

    End Sub
	
	'�û��޸�
	Public Sub UserEdit()
		User_Name = Replace(Session(SiteID & "_Ok3w.Net_User_Name"),"'","")
        User_Password = Replace(Request.Form("User_Password"),"'","")
		User_Password21 = Trim(Request.Form("User_Password21"))
        Name = Trim(Request.Form("Name"))
        Tel =  Trim(Request.Form("Tel"))
        Mail =  Replace(Trim(Request.Form("Mail")),"'","")
		QQ =  Trim(Request.Form("QQ"))
        Sex =  Trim(Request.Form("Sex"))
        Address =  Trim(Request.Form("Address"))
        Zip =  Trim(Request.Form("Zip"))
        Birthday =  Trim(Request.Form("Birthday"))
		'20180126 User������compName,compJob,compWeb,compOk
		compName =  Trim(Request.Form("compName"))
		compJob =  Trim(Request.Form("compJob"))
		compWeb =  Trim(Request.Form("compWeb"))
		
		If Birthday = "" Or Not IsDate(Birthday) Then Birthday = Null
        Content = Trim(Request.Form("Content"))
		
		if Mail<>"" then '20180126 ΪVIP������д������޸�
		   Sql="select count(ID) from Ok3w_User where Mail='" & Mail & "' and User_Name!='" & User_Name & "'"
		 else
		   Sql="select count(ID) from Ok3w_User where Mail='daixin' and User_Name='" & User_Name & "'"
		end if
		
		If Conn.Execute(Sql)(0)<>0 Then
			Call MessageBox("�������Ѿ����ڣ�����������","")
		Else
			Sql = "select * from Ok3w_User where User_Name='" & User_Name & "' and User_Password='" & MD5(User_Password) & "'"
			Rs.Open Sql,Conn,1,3
			If Rs.Eof And Rs.Bof Then
				Call MessageBox("ԭ���벻��ȷ������������","")
			End If
			If User_Password21<>"" Then
				Rs("User_Password") = MD5(User_Password21)
				Session(SiteID & "_Ok3w.Net_User_Password") = MD5(User_Password21)
			End If
			Rs("Name") = Name
			Rs("Tel") = Tel
			Rs("Mail") = Mail
			Rs("QQ") = QQ
			Rs("Sex") = Sex
			Rs("Address") = Address
			Rs("Zip") = Zip
			Rs("Birthday") = Birthday
			Rs("Content") = Content
			'20180126 ����
			Rs("compName") = compName
			Rs("compJob") = compJob
			Rs("compWeb") = compWeb
			Rs("compOk") = 1
			
			Rs.Update
			Rs.Close
		End If
	End Sub
	
	'��̨�޸�
	Public Sub AdminEdit()
		ID = Trim(Request.QueryString("ID"))
		User_Name = Replace(Trim(Request.Form("User_Name")),"'","")
		User_Password = Trim(Request.Form("User_Password"))
		Name = Trim(Request.Form("Name"))
        Tel =  Trim(Request.Form("Tel"))
        Mail =  Replace(Trim(Request.Form("Mail")),"'","")
		QQ =  Trim(Request.Form("QQ"))
        Sex =  Trim(Request.Form("Sex"))
        Address =  Trim(Request.Form("Address"))
        Zip =  Trim(Request.Form("Zip"))
        Birthday =  Trim(Request.Form("Birthday"))
		If Birthday = "" Then Birthday = Null
        Content = Trim(Request.Form("Content"))
		Jifen = Trim(Request.Form("Jifen"))
		Money = Trim(Request.Form("Money"))
		
		Sql="select count(ID) from Ok3w_User where Mail='" & Mail & "' and User_Name<>'" & User_Name & "'"
		If Conn.Execute(Sql)(0)<>0 Then
			Call MessageBox("�������Ѿ����ڣ�����������","")
		Else
			Sql = "select * from Ok3w_User where ID=" & ID
			Rs.Open Sql,Conn,1,3
			Rs("User_Name") = User_Name
			If User_Password<>"" Then
				Rs("User_Password") = MD5(User_Password)
			End If
			Rs("Name") = Name
			Rs("Tel") = Tel
			Rs("Mail") = Mail
			Rs("QQ") = QQ
			Rs("Sex") = Sex
			Rs("Address") = Address
			Rs("Zip") = Zip
			Rs("Birthday") = Birthday
			Rs("Content") = Content
			Rs("Jifen") = Jifen
			Rs("Money") = Money
			Rs.Update
			Rs.Close
		End If
	End Sub
	
   	'��ͨ/�ر�����
	Public Sub Pass(action,ID)
		If ID <> "" Then
			sql = "update Ok3w_User set IsLock=" & action & " where ID in(" & ID & ")"
			Conn.Execute sql
		End If
	End Sub
	
	'ɾ��
	Public Sub Del(ID)
		If ID <> "" Then
			Sql="delete from Ok3w_User where ID in(" & ID & ")"
			Conn.Execute Sql
		End If
	End Sub	
	
    '�Ӽ�¼���ж�����
    Private Sub GetRs(ByRef Rs)
        ID = Rs("ID")
        User_Name = Rs("User_Name")
        User_Password = Rs("User_Password")
        Name = Rs("Name")
        Tel = Rs("Tel")
        Mail = Rs("Mail")
		QQ = Rs("QQ")
        Sex = Rs("Sex")
        Address = Rs("Address")
        Zip = Rs("Zip")
        Birthday = Rs("Birthday")
		Jifen = Rs("Jifen")
        ClassID = Rs("ClassID")
        Money = Rs("Money")
        Photo = Rs("Photo")
        IsLock = Rs("IsLock")
        RegTime = Rs("RegTime")
        RegIp = Rs("RegIp")
        LastLoginIp = Rs("LastLoginIp")
        LastLoginTime = Rs("LastLoginTime")
        LoginCount = Rs("LoginCount")
		Content = Rs("Content")
    End Sub
	
	
	'��½��֤
	Public Function Login(sName,sPwd)
		Sql = "select * from Ok3w_User where User_Name=? and User_Password=?"
		Set clsCmd = Server.CreateObject("Adodb.Command")
		clsCmd.ActiveConnection = Conn
		clsCmd.CommandType = 1
		clsCmd.CommandText = Sql
		clsCmd.Parameters.Append(clsCmd.CreateParameter("@User_Name",200,1,50,sName))
		clsCmd.Parameters.Append(clsCmd.CreateParameter("@User_Password",200,1,50,sPwd))
		Set clsRs = Server.CreateObject("Adodb.RecordSet")
		Set clsRs = clsCmd.Execute
		Set clsCmd = Nothing
		If clsRs.Eof And clsRs.Bof Then
			Login = "0"'�û������������
			Else
				If clsRs("IsLock") = 1 Then
					Login = "1"'�û�������
					Else
						Call GetRs(clsRs)
						
						Session(SiteID & "_Ok3w.Net_User_Name") = clsRs("User_Name")
						
						If DateDiff("d",clsRs("LastLoginTime"),Date())=0 Then
							Sql="update Ok3w_User set LastLoginIp='" & Request.ServerVariables("REMOTE_ADDR") & "',LastLoginTime=" & Db_DateTime & ",LoginCount=LoginCount+1 where ID=" & clsRs("ID")
						Else
							Sql="update Ok3w_User set LastLoginIp='" & Request.ServerVariables("REMOTE_ADDR") & "',LastLoginTime=" & Db_DateTime & ",LoginCount=LoginCount+1,Jifen=Jifen+" & Application(SiteID & "_Ok3w_SiteUserLoginJifen") & " where ID=" & clsRs("ID")
						End If
						Conn.Execute Sql
						clsRs.Close
						Login = -1'�ɹ���½
				End If
		End If
		Set clsRs = Nothing
	End Function
	
	'�Ƿ��½
	Public Function IsLogin()
		User_Name = Trim(Session(SiteID & "_Ok3w.Net_User_Name"))
		If User_Name="" Then
			IsLogin = ""
		Else
			IsLogin = User_Name
		End If
	End Function
	
	'ȡ���ID
    Public Function GetMaxUserID()
        Set clsRs = Server.CreateObject("Adodb.RecordSet")
        Sql = "select max(ID) from Ok3w_User"
        clsRs.Open Sql,Conn,0,1
        If IsNull(clsRs(0)) Then
        GetMaxUserID = 0
            Else
                GetMaxUserID = clsRs(0)
        End If
        clsRs.Close
        Set clsRs = Nothing
    End Function
End Class
%>

