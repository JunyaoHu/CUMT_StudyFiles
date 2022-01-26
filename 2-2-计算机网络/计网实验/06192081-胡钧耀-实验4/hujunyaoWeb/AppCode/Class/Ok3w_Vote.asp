<%
Class Ok3w_Vote
	Public ID
	Public pID
	Public Title
	Public Content
	Public Value
	Public Xu
	Public bTime
	Public eTime
	
	Public Sub Load(ID)
		Sql = "select * from Ok3w_Vote where ID=" & ID
        Rs.Open Sql,Conn,1,1
		If Rs.Eof And Rs.Bof Then
			Response.Write("资源不存在")
			Response.End()
		End If
        Call GetRs(Rs)
        Rs.Close()
	End Sub
	
	Public Sub Add()
		Call GetFormData()
		Sql = "select * from Ok3w_Vote where 1=2"
		Rs.Open Sql,Conn,1,3
		Rs.AddNew()
		Call UpdateRs(Rs)
		Rs.Update()
		Rs.Close()
	End Sub

	Public Sub Edit()
		Call GetFormData()
		Sql = "select * from Ok3w_Vote where ID=" & ID
		Rs.Open Sql,Conn,1,3
		Call UpdateRs(Rs)
		Rs.Update
		Rs.Close
	End Sub
	
	Public Sub Del()
		Call GetFormData()
		sql = "delete from Ok3w_Vote where ID=" & ID
		Conn.Execute sql
	End Sub
	
	Private Sub GetFormData()
		ID = Trim(Request.Form("ID"))
		pID = Trim(Request.Form("pID"))
		If pID= "" Then pID = 0
		Title = Trim(Request.Form("Title"))
		Content = Trim(Request.Form("Content"))
		Value = Trim(Request.Form("Value"))
		If Value="" Then Value = 0
		Xu = Trim(Request.Form("Xu"))
		If Xu="" Then Xu = 0
		bTime = Trim(Request.Form("bTime"))
		If bTime="" Then bTime = Now()
		eTime = Trim(Request.Form("eTime"))
		If eTime="" Then eTime = Now() + 365
	End Sub
	
	Private Sub UpdateRs(ByRef Rs)
		Rs("pID") = pID
		Rs("Title") = Title
		Rs("Content") = Content
		Rs("Value") = Value
		Rs("Xu") = Xu
		Rs("bTime") = bTime
		Rs("eTime") = eTime
	End Sub
	
	Public Sub GetRs(ByRef Rs)
		ID = Rs("ID")
		pID = Rs("pID")
		Title = Rs("Title")
		Content = Rs("Content")
		Value = Rs("Value")
		Xu = Rs("Xu")
		bTime = Rs("bTime")
		eTime = Rs("eTime")
	End Sub
	
	Public Sub Tou(ID)
		If Request.Cookies("Ok3w")("IsVote")="1" Then
			Call MessageBox("谢谢，你已经投过票了！","./vote.asp?id=" & ID & "&kan=yes")
		Else
			Response.Cookies("Ok3w")("IsVote") = "1"
		End If		
		
		vID = Trim(Request.Form("vID"))
		If vID = "" Then
			Call MessageBox("请选择你的投票","./vote.asp?id=" & ID & "&kan=yes")
		End If
		
		Sql = "select bTime,eTime from Ok3w_Vote where ID =" & ID
		Rs.Open Sql,Conn,0,1
		bTime = Rs("bTime")
		eTime = Rs("eTime")
		Rs.Close
		nTime = Now()
		If nTime>=bTime And nTime<=eTime Then
			Else
				Call MessageBox("投票时间为" & bTime & " - " & eTime & "，当前不可投票！","./vote.asp?id=" & ID & "&kan=yes")
		End If
		
		RIP = Request.ServerVariables("HTTP_X_FORWARDED_FOR")
 		PIP = Request.ServerVariables("REMOTE_ADDR")
		If RIP = "" Then RIP = PIP
		Sql="select max(vTime) as vTime from Ok3w_Votelog where vIP='" & RIP & "'"
		Rs.Open Sql,Conn,0,1
		If Not(Rs.Eof And Rs.Bof) Then
			If DateDiff("d",Rs("vTime"),Date())=0 Then
				Call MessageBox("谢谢，你已经投过票了！","./vote.asp?id=" & ID & "&kan=yes")
			End If
		End If
		Rs.Close
		
		Sql = "update Ok3w_Vote set [Value]=[Value]+1 where ID in(" & vID & ") and pID=" & ID
		Conn.Execute Sql
		
		Sql = "insert into Ok3w_Votelog(pID,vID,vIP,vTime) values(" & ID & ",'" & vID & "','" & RIP & "'," & Db_DateTime & ")"
		Conn.Execute Sql
	End Sub
End Class
%>