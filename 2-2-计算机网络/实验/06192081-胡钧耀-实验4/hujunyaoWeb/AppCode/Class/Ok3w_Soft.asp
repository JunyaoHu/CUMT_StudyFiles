<%
Class Ok3w_Soft
    Public ID
    Public ChannelID
    Public ClassID
    Public SortPath
    Public SoftName
	Public TitleColor
    Public TitleURL
    Public Softver
    Public Softlanguage
    Public Softlicence
    Public Softproperty
    Public Softsize
    Public Softsizeunit
    Public SoftTos
    Public Softauthor
    Public Softauthorurl
    Public Softdemourl
    Public Softimageurl
    Public Softintro
    Public Softdownloadurl
	Public Softstar
    Public Updatetime
    Public Inputer
    Public IsPass
    Public IsTop
    Public IsDelete
    Public IsCommend
    Public IsMove
    Public IsPlay
    Public IsUserAdd
    Public GiveJifen
    Public vUserGroupID
    Public vUserMore
    Public vUserJifen
	Public Ding_Hits
    Public Cai_Hits
    Public Hits
	
	'类初始化
    Private Sub Class_Initialize()
		Softsize = 0
		Softsizeunit="KB"
		Softstar = 3
		vUserMore = 1
		vUserJifen = 0
		IsPass = 1
		Ding_Hits = 0
		Cai_Hits = 0
		Hits = 0
		Updatetime = Now()
		Inputer = Session(SiteID & "_Ok3w.Net_AdminName")
    End Sub
	
	Public Sub Load(Id)
		Set oRs = Server.CreateObject("Adodb.RecordSet")
		Sql = "select * from Ok3w_Soft where ID=" & Id
        oRs.Open Sql,Conn,1,1
		If oRs.Eof And oRs.Bof Then
			Response.Write("资源不存在")
			Response.End()
		End If
        Call GetRs(oRs)
        oRs.Close()
        Set oRs = Nothing
	End Sub
	
	Public Sub HitsAdd(Id)
		Sql = "update Ok3w_Soft set Hits = Hits + 1 where Id=" & Id
		Conn.Execute Sql
	End Sub
	
    '添加记录
    Public Sub Add()
        Call GetFormData()
        Set oRs = Server.CreateObject("Adodb.RecordSet")
        Sql = "select * from Ok3w_Soft where 1=2"
        oRs.Open Sql,Conn,1,3
        oRs.AddNew()
        Call UpdateRs(oRs)
        oRs.Update()
        oRs.Close()
        Set oRs = Nothing
    End Sub
	
    '修改记录
    Public Sub Edit()
        Call GetFormData()
        Set oRs = Server.CreateObject("Adodb.RecordSet")
        Sql = "select * from Ok3w_Soft where ID= " & ID
        oRs.Open Sql,Conn,1,3
        Call UpdateRs(oRs)
        oRs.Update
        oRs.Close
        Set Rs = Nothing
    End Sub
	
   '开通/关闭新闻
	Public Sub Pass(action,Id)
		If Id <> "" Then
			Sql = "update Ok3w_Soft set IsPass=" & action & " where Id in(" & Id & ")"
			Conn.Execute Sql
			
			'If action = 1 Then Call User_Give_Jifen(Id)
		End If
	End Sub
	
	'置顶/取消置顶
	Public Sub Top(action,Id)
		If Id <> "" Then
			sql = "update Ok3w_Soft set IsTop=" & action & " where Id in(" & Id & ")"
			Conn.Execute sql
		End If
	End Sub

	'推荐/取消推荐
	Public Sub Commend(action,Id)
		If Id <> "" Then
			sql = "update Ok3w_Soft set IsCommend=" & action & " where Id in(" & Id & ")"
			Conn.Execute sql
		End If
	End Sub
	
	'恢复
	Public Sub Resumption(action,Id)
		If Id <> "" Then
			sql = "update Ok3w_Soft set  IsDelete=0 where Id in(" & Id & ")"
			Conn.Execute sql
		End If
	End Sub

	'删除
	Public Sub Del(Id)
		If Id <> "" Then
			If IsHtml Then Call Delete_SoftHTML(ID)
			
			Sql = "update Ok3w_Soft set IsDelete=1 where Id in(" & Id & ")"
			Conn.Execute Sql
		
		End If
	End Sub
	
	'彻底删除
	Public Sub OkDel(Id)
		If Id <> "" Then
			sql = "delete from Ok3w_Soft where IsDelete=1 and Id in(" & Id & ")"
			Conn.Execute sql
			
			Sql = "delete from Ok3w_Guest where TypeID=3 and pID in(" & Id & ")"
			Conn.execute Sql
		End If
	End Sub
	
    '接收表单
    Private Sub GetFormData()
		Id = Request.QueryString("Id")
        If Id = "" Then Id=GetSoftMaxId()+1
        ChannelID = Request.QueryString("ChannelID")
        ClassID = Request.Form("ClassID")
		SortPath = GetSortPath(ClassID)
        SoftName = Trim(Request.Form("SoftName"))
		TitleColor = Trim(Request.Form("TitleColor"))
        TitleURL = Trim(Request.Form("TitleURL")) 
        Softver = Trim(Request.Form("Softver"))
        Softlanguage = Trim(Request.Form("Softlanguage"))
        Softlicence = Trim(Request.Form("Softlicence"))
        Softproperty = Trim(Request.Form("Softproperty"))
        Softsize = Trim(Request.Form("Softsize"))
        Softsizeunit = Trim(Request.Form("Softsizeunit"))
        SoftTos = Replace(Request.Form("SoftTos")," ","")
        Softauthor = Trim(Request.Form("Softauthor"))
        Softauthorurl = Trim(Request.Form("Softauthorurl"))
        Softdemourl = Trim(Request.Form("Softdemourl"))
        Softimageurl = Trim(Request.Form("Softimageurl"))
		
		For i = 1 To Request.Form("Softintro").Count 
			Softintro = Softintro & Request.Form("Softintro")(i) 
		Next
		If Request.Form("eWebEditorUpFile") = "1" Then
			ePATH_INFO = Request.ServerVariables("PATH_INFO")
			eTmp = Split(ePATH_INFO,"/")
			ePATH_INFO = ""
			For ee=0 To Ubound(eTmp)-2
				ePATH_INFO = ePATH_INFO + eTmp(ee) + "/"
			Next
			Softintro = Replace(Softintro,"../upfiles/","upfiles/")
			Softintro = Replace(Softintro,"../editor/","editor/")
			Softintro = Replace(Softintro,ePATH_INFO & "upfiles/","upfiles/")
			Softintro = Replace(Softintro,ePATH_INFO & "editor/","editor/")
		End If
		
        Softdownloadurl = Trim(Request.Form("Softdownloadurl"))
		Softstar = Trim(Request.Form("Softstar"))
        Updatetime = Trim(Request.Form("Updatetime"))
        Inputer = Trim(Request.Form("Inputer"))
        IsPass = Trim(Request.Form("IsPass"))
		If IsPass = "" Then IsPass = 0
        IsTop = Trim(Request.Form("IsTop"))
		If IsTop = "" Then IsTop = 0
        IsDelete = Trim(Request.Form("IsDelete"))
		If IsDelete = "" Then IsDelete = 0
        IsCommend = Trim(Request.Form("IsCommend"))
		If IsCommend = "" Then IsCommend = 0
        IsMove = Trim(Request.Form("IsMove"))
		If IsMove = "" Then IsMove = 0
        IsPlay = Trim(Request.Form("IsPlay"))
		If IsPlay = "" Then IsPlay = 0
        IsUserAdd = 0
        GiveJifen = 0
        vUserGroupID = Trim(Request.Form("vUserGroupID"))
		If vUserGroupID = "" Then vUserGroupID = 0
        vUserMore = Trim(Request.Form("vUserMore"))
		If vUserMore = "" Then vUserMore = 0
        vUserJifen = Trim(Request.Form("vUserJifen"))
		If vUserJifen = "" Then vUserJifen = 0
		Ding_Hits = Trim(Request.Form("Ding_Hits"))
		Cai_Hits = Trim(Request.Form("Cai_Hits"))
        Hits = Trim(Request.Form("Hits"))
    End Sub
	
    '更新记录集
    Private Sub UpdateRs(ByRef Rs)
        Rs("ID") = ID
        Rs("ChannelID") = ChannelID
        Rs("ClassID") = ClassID
        Rs("SortPath") = SortPath
        Rs("SoftName") = SoftName
		Rs("TitleColor") = TitleColor
        Rs("TitleURL") = TitleURL
        Rs("Softver") = Softver
        Rs("Softlanguage") = Softlanguage
        Rs("Softlicence") = Softlicence
        Rs("Softproperty") = Softproperty
        Rs("Softsize") = Softsize
        Rs("Softsizeunit") = Softsizeunit
        Rs("SoftTos") = SoftTos
        Rs("Softauthor") = Softauthor
        Rs("Softauthorurl") = Softauthorurl
        Rs("Softdemourl") = Softdemourl
        Rs("Softimageurl") = Softimageurl
        Rs("Softintro") = Softintro
        Rs("Softdownloadurl") = Softdownloadurl
		Rs("Softstar") = Softstar
        Rs("Updatetime") = Updatetime
        Rs("Inputer") = Inputer
        Rs("IsPass") = IsPass
        Rs("IsTop") = IsTop
        Rs("IsDelete") = IsDelete
        Rs("IsCommend") = IsCommend
        Rs("IsMove") = IsMove
        Rs("IsPlay") = IsPlay
        Rs("IsUserAdd") = IsUserAdd
        Rs("GiveJifen") = GiveJifen
        Rs("vUserGroupID") = vUserGroupID
        Rs("vUserMore") = vUserMore
        Rs("vUserJifen") = vUserJifen
		Rs("Ding_Hits") = Ding_Hits
        Rs("Cai_Hits") = Cai_Hits
        Rs("Hits") = Hits
    End Sub
    '从记录集中读数据
    Private Sub GetRs(ByRef Rs)
        ID = Rs("ID")
        ChannelID = Rs("ChannelID")
        ClassID = Rs("ClassID")
        SortPath = Rs("SortPath")
        SoftName = Rs("SoftName")
		TitleColor = Rs("TitleColor")
        TitleURL = Rs("TitleURL")
        Softver = Rs("Softver")
        Softlanguage = Rs("Softlanguage")
        Softlicence = Rs("Softlicence")
        Softproperty = Rs("Softproperty")
        Softsize = Rs("Softsize")
        Softsizeunit = Rs("Softsizeunit")
        SoftTos = Rs("SoftTos")
        Softauthor = Rs("Softauthor")
        Softauthorurl = Rs("Softauthorurl")
        Softdemourl = Rs("Softdemourl")
        Softimageurl = Rs("Softimageurl")
        Softintro = Rs("Softintro")
        Softdownloadurl = Rs("Softdownloadurl")
		Softstar = Rs("Softstar")
        Updatetime = Rs("Updatetime")
        Inputer = Rs("Inputer")
        IsPass = Rs("IsPass")
        IsTop = Rs("IsTop")
        IsDelete = Rs("IsDelete")
        IsCommend = Rs("IsCommend")
        IsMove = Rs("IsMove")
        IsPlay = Rs("IsPlay")
        IsUserAdd = Rs("IsUserAdd")
        GiveJifen = Rs("GiveJifen")
        vUserGroupID = Rs("vUserGroupID")
        vUserMore = Rs("vUserMore")
        vUserJifen = Rs("vUserJifen")
		Ding_Hits = Rs("Ding_Hits")
        Cai_Hits = Rs("Cai_Hits")
        Hits = Rs("Hits")
    End Sub
    '取最大ID
    Public Function GetSoftMaxId()
        Set oRs = Server.CreateObject("Adodb.RecordSet")
        Sql = "select max(ID) from Ok3w_Soft"
        oRs.Open Sql,Conn,0,1
        If IsNull(oRs(0)) Then
        GetSoftMaxId = 0
            Else
                GetSoftMaxId = oRs(0)
        End If
        oRs.Close
        Set oRs = Nothing
    End Function
End Class
%>
