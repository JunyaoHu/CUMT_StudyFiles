<%
Class Ok3w_Article
    Public Id
    Public ChannelID
    Public ClassID
	Public SortPath
    Public Title
	Public TitleColor
	Public TitleURL
	Public Keywords
	Public Description
    Public Content
    Public Author
    Public ComeFrom
    Public AddTime
    Public Inputer
    Public IsPass
    Public IsPic
    Public PicFile
    Public IsTop
    Public IsCommend
	Public IsDelete
	Public IsMove
	Public IsPlay
	Public IsIndexImg
	Public IsUserAdd
	Public GiveJifen
	Public vUserGroupID
	Public vUserMore
	Public vUserJifen
	Public pMoodStr
    Public Hits
	Public pro_name
	Public price_name
	Public shop_price
	Public web_price
	Public inventory
	Public shuxing_xx
	Public shuxing_rl
	Public shuxing_ds
	Public shuxing_nf
	Public packs_num
	Public promotion1
	Public promotion2
	Public else_promotion
	Public product_pic
	Public recommend
    '类初始化
    Private Sub Class_Initialize()
		vUserMore = 1
		vUserJifen = 0
		IsPass = 1
		pMoodStr = "0,0,0,0,0,0,0,0"
		Hits = 0
		AddTime = Now()
		If Session(SiteID & "_Ok3w_Tmp_ComeFrom") = "" Then
			Session(SiteID & "_Ok3w_Tmp_ComeFrom") = Application(SiteID & "_Ok3w_SiteName")
		End If
		If Session(SiteID & "_Ok3w_Tmp_Author") = "" Then
			Session(SiteID & "_Ok3w_Tmp_Author") = Application(SiteID & "_Ok3w_SiteName")
		End If
		Inputer = Session(SiteID & "_Ok3w.Net_AdminName")
		ComeFrom = Session(SiteID & "_Ok3w_Tmp_ComeFrom")
		Author = Session(SiteID & "_Ok3w_Tmp_Author")
    End Sub
    '类终止
    Private Sub Class_Terminate()
    End Sub
	
	'读记录
	Public Sub Load(Id)
		Set clsRs = Server.CreateObject("Adodb.RecordSet")
		Sql = "select * from Ok3w_Article where Id=" & Id
        clsRs.Open Sql,Conn,1,1
		If clsRs.Eof And clsRs.Bof Then
			Response.Write("资源不存在")
			Response.End()
		End If
        Call GetRs(clsRs)
        clsRs.Close()
        Set clsRs = Nothing
	End Sub
	
	Public Sub HitsAdd(Id)
		Sql = "update Ok3w_Article set Hits = Hits + 1 where Id=" & Id
		Conn.Execute Sql
	End Sub
	
    Public Sub Add()
        Call GetFormData()
        Set clsRs = Server.CreateObject("Adodb.RecordSet")
        Sql = "select * from Ok3w_Article where 1=2"
        clsRs.Open Sql,Conn,1,3
        clsRs.AddNew()
        Call UpdateRs(clsRs)
        clsRs.Update()
        clsRs.Close()
        Set clsRs = Nothing
    End Sub

    Public Sub Edit()
        Call GetFormData()
        Set clsRs = Server.CreateObject("Adodb.RecordSet")
        Sql = "select * from Ok3w_Article where Id= " & Id
        clsRs.Open Sql,Conn,1,3
        Call UpdateRs(clsRs)
        clsRs.Update
        clsRs.Close
        Set Rs = Nothing
		
		If IsPass=1 And IsUserAdd=1 And GiveJifen=0 Then Call User_Give_Jifen(Id)
    End Sub
    
    Private Sub GetFormData()
        Id = Request.QueryString("Id")
		If Id = "" Then Id=GetMaxArticleID()+1
        ChannelID = Request.QueryString("ChannelID")
        ClassID = Request.Form("ClassID")
		SortPath = GetSortPath(ClassId)
        Title = Request.Form("Title")
		pro_name = Request.Form("pro_name")
		price_name = Request.Form("price_name")
		shop_price = Request.Form("shop_price")
		web_price = Request.Form("web_price")
		inventory = Request.Form("inventory")
		shuxing_xx = Request.Form("shuxing_xx")
		shuxing_rl = Request.Form("shuxing_rl")
		shuxing_ds = Request.Form("shuxing_ds")
		shuxing_nf = Request.Form("shuxing_nf")
		packs_num = Request.Form("packs_num")
		promotion1 = Request.Form("promotion1")
		promotion2 = Request.Form("promotion2")
		else_promotion = Request.Form("else_promotion")
		product_pic = Request.Form("product_pic")
		recommend = Request.Form("recommend")

		TitleColor = Request.Form("TitleColor")
		TitleURL = Request.Form("TitleURL")
		Keywords = Request.Form("Keywords")
		Description = Request.Form("Description")
		
		For i = 1 To Request.Form("Content").Count 
			Content = Content & Request.Form("Content")(i) 
		Next
		s_URL = "http://" & Request.ServerVariables("SERVER_NAME") & "/upfiles/"
		Content = Replace(Content,s_URL,"/upfiles/")
		s_NextPage = "<div style=""page-break-after: always""><span style=""display: none"">&nbsp;</span></div>"
		Content = Replace(Content,s_NextPage,"[Ok3w_NextPage]")
				
        Author = Request.Form("Author")
		If Author<>Session(SiteID & "_Ok3w_Tmp_Author") Then
			Session(SiteID & "_Ok3w_Tmp_Author") = Author
		End If
        ComeFrom = Request.Form("ComeFrom")
		If ComeFrom<>Session(SiteID & "_Ok3w_Tmp_ComeFrom") Then
			Session(SiteID & "_Ok3w_Tmp_ComeFrom") = ComeFrom
		End If
		
        AddTime = Request.Form("AddTime")
		Inputer = Request.Form("Inputer")
		If Inputer="" Then Inputer = Admin.AdminName
        IsPass = Request.Form("IsPass")
		If IsPass = "" Then IsPass = 0
        IsPic = Request.Form("IsPic") 
        PicFile = Request.Form("PicFile")
		If PicFile = "" Then
			IsPic = 0
		Else
			IsPic = 1
		End If
        IsTop = Request.Form("IsTop")
		If IsTop = "" Then IsTop = 0
        IsCommend = Request.Form("IsCommend")
		If IsCommend = "" Then IsCommend = 0
		IsDelete = Request.Form("IsDelete")
		If IsDelete = "" Then IsDelete = 0
		IsMove = Request.Form("IsMove")
		If IsMove = "" Then IsMove = 0
		IsPlay = Request.Form("IsPlay")
		If IsPlay = "" Then IsPlay = 0
		IsIndexImg = Request.Form("IsIndexImg")
		If IsIndexImg = "" Then IsIndexImg = 0
		IsUserAdd = Request.Form("IsUserAdd")
		If IsUserAdd = "" Then IsUserAdd = 0
		GiveJifen = Request.Form("GiveJifen")
		If GiveJifen = "" Then GiveJifen = 0
		vUserGroupID = Request.Form("vUserGroupID")
		If vUserGroupID = "" Then vUserGroupID = 0
		vUserMore = Request.Form("vUserMore")
		If vUserMore = "" Then vUserMore = 0
		vUserJifen = Request.Form("vUserJifen")
		If vUserJifen = "" Then vUserJifen = 0
		pMoodStr = Request.Form("pMoodStr")
		If pMoodStr = "" Then pMoodStr = "0,0,0,0,0,0,0,0"
        Hits = Request.Form("Hits")
    End Sub
	
    '更新记录集
    Private Sub UpdateRs(ByRef Rs)
		Rs("ID") = Id
        Rs("ChannelID") = ChannelID
        Rs("ClassID") = ClassID
		Rs("SortPath") = SortPath
        Rs("Title") = Title
		Rs("TitleColor") = TitleColor
        Rs("TitleURL") = TitleURL
		Rs("Keywords") = Keywords
        Rs("Description") = Description
        Rs("Content") = Content
        Rs("Author") = Author
        Rs("ComeFrom") = ComeFrom
        Rs("AddTime") = AddTime
        Rs("Inputer") = Inputer
        Rs("IsPass") = IsPass
        Rs("IsPic") = IsPic
        Rs("PicFile") = PicFile
        Rs("IsTop") = IsTop
        Rs("IsCommend") = IsCommend
		Rs("IsDelete") = IsDelete
		Rs("IsMove") = IsMove
		Rs("IsPlay") = IsPlay
		Rs("IsIndexImg") = IsIndexImg
		Rs("IsUserAdd") = IsUserAdd
		Rs("GiveJifen") = GiveJifen
		Rs("vUserGroupID") = vUserGroupID
		Rs("vUserMore") = vUserMore
		Rs("vUserJifen") = vUserJifen
		Rs("pMoodStr") = pMoodStr
		Rs("Hits") = Hits
        Rs("pro_name") = pro_name
		if shop_price<>"" then Rs("shop_price") = shop_price
		Rs("price_name") = price_name
		if web_price<>"" then Rs("web_price") = web_price

		Rs("inventory") = inventory
		Rs("shuxing_xx") = shuxing_xx
		Rs("shuxing_rl") = shuxing_rl
		Rs("shuxing_ds") = shuxing_ds
		Rs("shuxing_nf") = shuxing_nf
		if packs_num<>"" then Rs("packs_num") = packs_num
		Rs("promotion1") = promotion1
		Rs("promotion2") = promotion2
        Rs("else_promotion") = else_promotion
		Rs("product_pic") = product_pic
		Rs("recommend") = recommend

    End Sub
    '从记录集中读数据
    Private Sub GetRs(ByRef Rs)
        Id = Rs("Id")
        ChannelID = Rs("ChannelID")
        ClassID = Rs("ClassID")
		SortPath = Rs("SortPath")
        Title = Rs("Title")
		TitleColor = Rs("TitleColor")
        TitleURL = Rs("TitleURL")
		Keywords = Rs("Keywords")
        Description = Rs("Description")
        Content = Rs("Content")
        Author = Rs("Author")
        ComeFrom = Rs("ComeFrom")
        AddTime = Rs("AddTime")
        Inputer = Rs("Inputer")
        IsPass = Rs("IsPass")
        IsPic = Rs("IsPic")
		PicFile = Rs("PicFile")
        IsTop = Rs("IsTop")
        IsCommend = Rs("IsCommend")
		IsDelete = Rs("IsDelete")
		IsMove = Rs("IsMove")
		IsPlay = Rs("IsPlay")
		IsIndexImg = Rs("IsIndexImg")
		IsUserAdd = Rs("IsUserAdd")
		GiveJifen = Rs("GiveJifen")
		vUserGroupID = Rs("vUserGroupID")
		vUserMore = Rs("vUserMore")
		vUserJifen = Rs("vUserJifen")
		pMoodStr = Rs("pMoodStr")
        Hits = Rs("Hits")
		pro_name = Rs("pro_name")
		shop_price = Rs("shop_price")
		price_name = Rs("price_name")
		web_price = Rs("web_price")
		
		inventory = Rs("inventory")
		shuxing_xx = Rs("shuxing_xx")
		shuxing_rl = Rs("shuxing_rl")
		shuxing_ds = Rs("shuxing_ds")
		shuxing_nf = Rs("shuxing_nf")
		packs_num = Rs("packs_num")
		promotion1 = Rs("promotion1")
        promotion2 = Rs("promotion2")
		else_promotion = Rs("else_promotion")
		product_pic = Rs("product_pic")
		recommend = Rs("recommend")
		
    End Sub
	
	'开通/关闭新闻
	Public Sub Pass(action,Id)
		If Id <> "" Then
			Sql = "update Ok3w_Article set IsPass=" & action & " where Id in(" & Id & ")"
			Conn.Execute Sql
			
			If action = 1 Then Call User_Give_Jifen(Id)
		End If
	End Sub
	
	'置顶/取消置顶
	Public Sub Top(action,Id)
		If Id <> "" Then
			sql = "update Ok3w_Article set IsTop=" & action & " where Id in(" & Id & ")"
			Conn.Execute sql
		End If
	End Sub

	'推荐/取消推荐
	Public Sub Commend(action,Id)
		If Id <> "" Then
			sql = "update Ok3w_Article set IsCommend=" & action & " where Id in(" & Id & ")"
			Conn.Execute sql
		End If
	End Sub
	
	'图片/取消图片
	Public Sub Pic(action,Id)
		If Id <> "" Then
			sql = "update Ok3w_Article set IsPic=" & action & " where Id in(" & Id & ")"
			Conn.Execute sql
		End If
	End Sub
	
	'恢复
	Public Sub Resumption(action,Id)
		If Id <> "" Then
			sql = "update Ok3w_Article set  IsDelete=0 where Id in(" & Id & ")"
			Conn.Execute sql
		End If
	End Sub

	'删除
	Public Sub Del(Id)
		If Id <> "" Then
			If IsHtml Then Call Delete_ArticleHTML(ID)
			
			Sql = "update Ok3w_Article set IsDelete=1 where Id in(" & Id & ")"
			Conn.Execute Sql
		
		End If
	End Sub
	
	'彻底删除
	Public Sub OkDel(Id)
		If Id <> "" Then
			sql = "delete from Ok3w_Article where IsDelete=1 and Id in(" & Id & ")"
			Conn.Execute sql
			
			Sql = "delete from Ok3w_Guest where TypeID=2 and pID in(" & Id & ")"
			Conn.execute Sql
			
			conn.execute "delete from agency_cx where pro_ID in(" & Id & ")"
		End If
	End Sub
	
	'取最大ArticleID
    Public Function GetMaxArticleID()
        Set clsRs = Server.CreateObject("Adodb.RecordSet")
        Sql = "select max(ID) from Ok3w_Article"
        clsRs.Open Sql,Conn,0,1
        If IsNull(clsRs(0)) Then
        GetMaxArticleID = 0
            Else
                GetMaxArticleID = clsRs(0)
        End If
        clsRs.Close
        Set clsRs = Nothing
    End Function
	
	Public Sub User_Give_Jifen(ID)
		Sql = "update Ok3w_User set Jifen=Jifen+" & Application(SiteID & "_Ok3w_SiteUserTGJifen") & " where User_Name in(select Inputer from Ok3w_Article where ID in(" & ID & ") and IsUserAdd=1 and GiveJifen=0)"
		Conn.Execute Sql
		
		Sql = "update Ok3w_Article set GiveJifen=" & Application(SiteID & "_Ok3w_SiteUserTGJifen") & " where ID in(" & ID & ") and IsUserAdd=1 and GiveJifen=0"
		Conn.Execute Sql	
	End Sub
	
	Public Sub User_Article_Save(a_ID)
		ID = a_ID
		If ID = "" Then ID=GetMaxArticleID()+1
        ChannelID = 1
        ClassID = Cdbl(Request.Form("ClassID"))
		SortPath = GetSortPath(ClassId)
        Title = Request.Form("Title")
		TitleColor = ""
		TitleURL = ""
		Keywords = ""
		Description = ""
		For i = 1 To Request.Form("Content").Count 
			Content = Content & Request.Form("Content")(i) 
		Next
        Author = Request.Form("Author")
        ComeFrom = Request.Form("ComeFrom")
        AddTime = Now()
		Inputer = Replace(Session(SiteID & "_Ok3w.Net_User_Name"),"'","")
		IsPass = 0
		IsPic = 0
        PicFile = ""
        IsTop = 0
        IsCommend = 0
		IsDelete = 0
		IsMove = 0
		IsPlay = 0
		IsIndexImg = 0
		IsUserAdd = 1
		GiveJifen = 0
		vUserGroupID = 0
		vUserMore = 1
		vUserJifen = 0
        Hits = 0
		pro_name = ""
		shop_price = 0
		price_name = ""
		web_price = 0
		
		
		inventory = ""
		shuxing_xx = 0
		shuxing_rl = 0
		shuxing_ds = 0
		shuxing_nf = 0
		packs_num = 0
		promotion1 = ""
        promotion2 = ""
		else_promotion = ""
		product_pic = ""
		recommend = ""
		Set clsRs = Server.CreateObject("Adodb.RecordSet")
		If a_ID="" Then
			Sql = "select * from Ok3w_Article where 1=2"
			clsRs.Open Sql,Conn,1,3
			clsRs.AddNew()
			Else
				Sql = "select * from Ok3w_Article where IsPass=0 and ID=" & Cdbl(a_ID)
				clsRs.Open Sql,Conn,1,3
		End If
        Call UpdateRs(clsRs)
        clsRs.Update()
        clsRs.Close()
	End Sub
	
	Public Sub User_Article_Del(a_ID,User_Name)
		Sql = "delete from Ok3w_Article where ID=" & Cdbl(a_ID) & " and IsPass=0 and Inputer='" & User_Name & "'"
		Conn.Execute Sql
	End Sub
End Class
%>

