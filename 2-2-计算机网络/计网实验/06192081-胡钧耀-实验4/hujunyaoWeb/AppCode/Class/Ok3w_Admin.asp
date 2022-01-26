<%
Class Admin_Info
	Dim AdminId
	Dim AdminName
	Dim AdminPwd
	Dim GroupId
	Dim CookiesKey
	Dim CookiesTime
	
	Public Function AdminLogin(sAdminName,sAdminPwd,sType)
		Sql = "select * from Ok3w_Admin where AdminName=? and AdminPwd=?"
		Set oCmd = Server.CreateObject("Adodb.Command")
		oCmd.ActiveConnection = Conn
		oCmd.CommandType = 1
		oCmd.CommandText = Sql
		oCmd.Parameters.Append(oCmd.CreateParameter("@AdminName",200,1,50,sAdminName))
		oCmd.Parameters.Append(oCmd.CreateParameter("@AdminPwd",200,1,50,sAdminPwd))
		Set oRs = Server.CreateObject("Adodb.RecordSet")
		Set oRs = oCmd.Execute
		Set oCmd = Nothing
		If oRs.Eof And oRs.Bof Then
			AdminLogin = 1'�û������������
		Else
			If oRs("AdminLock") Then
				AdminLogin = 2'�û�������
			Else
				If oRs("AdminPwd")= sAdminPwd Then
					AdminId = Cdbl(oRs("AdminId"))
					AdminName = Trim(oRs("AdminName"))
					AdminPwd = Trim(oRs("AdminPwd"))
					GroupId = Trim(oRs("GroupId"))
					Randomize
					CookiesKey = "Ok3w.Net_" & MD5(Cstr(Rnd()))
					CookiesTime = Now()
					Sql = "update Ok3w_Admin set CookiesKey='" & CookiesKey & "',CookiesTime=" & Db_DateTime & " where AdminID=" & oRs("AdminId")
					Conn.Execute Sql
					
					Response.Cookies(SiteID & "Ok3w_Admin")("AdminId") = AdminId
					Response.Cookies(CookiesKey)("AdminName") = AdminName
					Response.Cookies(CookiesKey)("AdminPwd") = AdminPwd
					Response.Cookies(CookiesKey)("GroupId") = GroupId
					
					If sType="IsLogin" Then Call AdminActionLog("�ɹ���½")
					AdminLogin = -1'�ɹ���½
				Else
					Response.End()
				End If		
			End If
		End If
		oRs.Close
		Set oRs = Nothing
	End Function
	
	'����Ա������־
	Public Sub AdminActionLog(logInfo)
		Set logRs = Server.CreateObject("Adodb.RecordSet")
		Sql = "select * from Ok3w_Adlog where 1=2"
		logRs.Open Sql,Conn,1,3
		logRs.AddNew
		logRs("logUser") = AdminName
		logRs("logIp") = Request.ServerVariables("REMOTE_ADDR")
		logRs("LogTime") = Now()
		logRs("LogInfo") = logInfo
		logRs("LogType") = 0
		logRs.Update
		logRs.Close
		Set logRs = Nothing
	End Sub
	
	Public Function AdminIsLogin()
		AdminID = Cdbl(Request.Cookies(SiteID & "Ok3w_Admin")("AdminId"))
		Sql = "select * from Ok3w_Admin where AdminID=" & AdminID
		Set oRs = Conn.Execute(Sql)
		If oRs.Eof And oRs.Bof Then
			AdminIsLogin = 0'û�е�½
		Else
			CookiesKey = oRs("CookiesKey")
			CookiesTime = oRs("CookiesTime")
			If DateDiff("s",CookiesTime,Now()) <= CookiesTimeout * 60 Then
				AdminName = Request.Cookies(CookiesKey)("AdminName")
				AdminPwd = Request.Cookies(CookiesKey)("AdminPwd")
				GroupId = Request.Cookies(CookiesKey)("GroupId")
				If AdminName = oRs("AdminName") And AdminPwd = oRs("AdminPwd") And GroupId=oRs("GroupId") Then
					Sql = "update Ok3w_Admin set CookiesTime=" & Db_DateTime & " where AdminID=" & AdminID
					Conn.Execute Sql
					AdminIsLogin = -1'�Ѿ���½
				Else
					AdminIsLogin = 0'û�е�½
				End If
			Else
				AdminIsLogin = 0'û�е�½
			End If
		End If
		oRs.Close
		Set oRs = Nothing
	End Function
	
	Public Function AdminIsFlag(Flag)
		If InStr(GroupId,"," & Flag & ",") <= 0 Then
			AdminIsFlag = 0'û�и�Ȩ��
			Else
				AdminIsFlag = -1'�д�Ȩ��
		End If
	End Function
	
	Public Function AdminEditPassWord(oldpwd,newpwd)
		If AdminPwd <> MD5(oldpwd) Then
			AdminEditPassWord = 0'ԭ���벻��ȷ
			Else
				Sql = "select * from Ok3w_Admin where AdminId=" & AdminId
				Set oRs = Server.CreateObject("Adodb.RecordSet")
				oRs.Open Sql,Conn,1,3
				oRs("AdminPwd") = MD5(newpwd)
				oRs.Update
				oRs.Close
				Set oRs = Nothing
				AdminEditPassWord = -1'�޸ĳɹ�
		End If
	End Function
End Class
%>
	
