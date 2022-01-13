<%
Class Ok3w_SiteConfig
	Public Sub Edit()
		Sql = "select * from Ok3w_SiteConfig"
		Rs.Open Sql,Conn,1,3
		For i = 0 To Rs.Fields.Count - 1
			If Left(Rs.Fields(i).Name,8)="SiteSoft" Then
			Else
				v = Request.Form(Rs.Fields(i).Name)
				If v="" Then v="0"
				Rs(Rs.Fields(i).Name) = v
			End If
		Next
		Rs.Update
		Rs.Close
		
		Application(SiteID & "_Ok3w_SiteTitle") = ""
	End Sub
	
	Public Sub SiteUserDengji()
		name = Replace(Request.Form("name")," ","")
		jifen = Replace(Request.Form("jifen")," ","")
		pic = Replace(Request.Form("pic")," ","")
		Str = name & "|" & jifen & "|" & pic
		Sql = "select SiteUserDengji from Ok3w_SiteConfig"
		Rs.Open Sql,Conn,1,3
		Rs("SiteUserDengji") = Str
		Rs.Update
		Rs.Close
				
		Application(SiteID & "_Ok3w_SiteTitle") = ""
	End Sub
	
	Public Sub SoftEdit()
		Sql = "select * from Ok3w_SiteConfig"
		Rs.Open Sql,Conn,1,3
		For i = 0 To Rs.Fields.Count - 1
			If Left(Rs.Fields(i).Name,8)="SiteSoft" Then
				v = Request.Form(Rs.Fields(i).Name)
				Rs(Rs.Fields(i).Name) = v
			End If
		Next
		Rs.Update
		Rs.Close
		
		Application(SiteID & "_Ok3w_SiteTitle") = ""
	End Sub
End Class
%>
