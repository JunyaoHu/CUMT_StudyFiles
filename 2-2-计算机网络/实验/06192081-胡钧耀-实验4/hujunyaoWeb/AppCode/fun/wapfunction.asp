<%
Function IsSelfRefer()
	server_v1=Lcase(Request.ServerVariables("HTTP_REFERER"))
	server_v2=Lcase(Request.ServerVariables("SERVER_NAME"))
	If InStr(server_v1,server_v2)<1 Then
		IsSelfRefer = False'不是
		Else 
			IsSelfRefer = True'是
	End If
End Function

Private Sub Page_Err(Msg)
	Response.Write(Msg)
	Response.End()
End Sub

Function myCdbl(str)
	If str = "" Or Not IsNumeric(str) Then
		Call Page_Err("参数错误：要求为数字型。")
		Else
			myCdbl = Cdbl(str)
	End If
End Function

Private Sub MessageBox(Msg,gotoUrl)
	Response.Write("<script language=""javascript"">")
	Response.Write("alert(""" & Msg & """);")
	If gotoUrl="" Then
		Response.Write("history.back();")
		Else
			Response.Write("document.URL='" & gotoUrl & "';")
	End If
	Response.Write("</script>")
	Response.End()
End Sub

Function LeftX(Str,N)
	Dim i,j,ch,StrTmp
	j = 0
	StrTmp = ""
	For i = 1 To Len(Str)
		ch = Mid(Str,i,1)
		StrTmp = StrTmp & ch
		If Asc(ch)<0 Then
			j = j + 2
			Else
				j = j + 1
		End If
		If j >= N Then Exit For
	Next
	LeftX = StrTmp
End Function

Function OutStr(Str)
  strer=Str
  if strer="" or isnull(strer) then
    OutStr="":exit function
  end if
  strer=replace(strer,"<","&lt;")
  strer=replace(strer,">","&gt;")
  strer=replace(strer,CHR(13) & Chr(10),"<br>")    '换行
  strer=replace(strer,CHR(32),"&nbsp;")    '空格
  strer=replace(strer,CHR(9),"&nbsp;")    'table
  strer=replace(strer,CHR(39),"&#39;")    '单引号
  strer=replace(strer,CHR(34),"&quot;")    '双引号
  OutStr = strer
End Function

Function filterhtml(fstring)
    if isnull(fstring) or trim(fstring)="" then
        filterhtml=""
        exit function
    end if
    set  re = new  regexp
    re.ignorecase=true
    re.global=true
    re.pattern="<(.+?)>"
    fstring = re.replace(fstring, "")
    set   re=nothing
	filterhtml = fstring
End Function

Function ExecSqlReturnOneValue(Sql)
	Set opRs = Server.CreateObject("Adodb.RecordSet")
	opRs.Open Sql,Conn,0,1
	If  opRs.Eof And opRs.Bof Then 
		ExecSqlReturnOneValue = ""
		Else
			ExecSqlReturnOneValue = opRs(0)
	End If
	opRs.Close
	Set opRs = Nothing
End Function

Function Format_Time(s_Time,n_Flag)
	Dim y, m, d, h, mi, s
	Format_Time = ""
	If IsDate(s_Time) = False Then Exit Function
	y = cstr(year(s_Time))
	m = cstr(month(s_Time))
	If len(m) = 1 Then m = "0" & m
	d = cstr(day(s_Time))
	If len(d) = 1 Then d = "0" & d
	h = cstr(hour(s_Time))
	If len(h) = 1 Then h = "0" & h
	mi = cstr(minute(s_Time))
	If len(mi) = 1 Then mi = "0" & mi
	s = cstr(second(s_Time))
	If len(s) = 1 Then s = "0" & s
	Select Case n_Flag
	Case 0
		Format_Time = m & "-" & d
	Case 1
		' yyyy-mm-dd hh:mm:ss
		Format_Time = y & "-" & m & "-" & d &  "T" & h & ":" & mi & ":" & s
	Case 2
		' yyyy-mm-dd
		Format_Time = y & "-" & m & "-" & d
	Case 3
		' hh:mm:ss
		Format_Time = h & ":" & mi & ":" & s
	Case 4
		' yyyy年mm月dd日
		Format_Time = y & "年" & m & "月" & d & "日"
	Case 5
		' yyyymmdd
		Format_Time = y & m & d
	Case 6
		' yyyy-mm-dd hh:mm
		Format_Time = y & "-" & m & "-" & d & " " & h & ":" & mi
	End Select
End Function

Function CmdSafeLikeSqlStr(Str)
	Str = Replace(Str,"'","''")
	Str = Replace(Str,"[","[[]")
	Str = Replace(Str,"%","[%]")
	Str = Replace(Str,"_","[_]")
	CmdSafeLikeSqlStr = Str
End Function

Function ReplaceTest(str,patrn, replStr)
  Dim regEx, str1 
  str1 = str
  Set regEx = New RegExp
  regEx.Pattern = patrn
  regEx.IgnoreCase = True
  regEx.global=true
  ReplaceTest = regEx.Replace(str1, replStr)
End Function

Function Format_TitleURL(HTML_Path,ID,Title,TitleColor,TitleURL,LeftN)
	oTitle = LeftX(Title,LeftN*2)
	If TitleColor<>"" Then oStyle = " style=""color:" & TitleColor & ";"""
	If TitleURL="" Then
		Target = " " & Base_Target
		TitleURL = Page_URL(ChannelID,"",ID)
		Else
			Target = " target=""_blank"""
	End If
	Format_TitleURL = "<a href=""" & TitleURL & """" & Target & oStyle & ">" & oTitle & "</a>"
End Function

Function GetPageUrlPath()
	SERVER_NAME = Request.ServerVariables("SERVER_NAME")
	SERVER_PORT = Request.ServerVariables("SERVER_PORT")
	PATH_INFO = Request.ServerVariables("PATH_INFO")
	PATH_TMP = Split(PATH_INFO,"/")
	PATH_INFO = Replace(PATH_INFO,PATH_TMP(Ubound(PATH_TMP)),"")
	URL = "http://" & SERVER_NAME
	If SERVER_PORT<>80 Then URL = URL & ":" & SERVER_PORT
	URL = URL & PATH_INFO
	GetPageUrlPath = URL
End Function

Function GetAdSense(SN)
	Response.Write("<script language=""javascript"" src=""" & Htmldns & "js/ok3w_" & SN & ".js""></script>")
End Function

'频道名称
Function GetChannelName(ChannelId)
	If ChannelId="" Then
		GetChannelName = "--------"
		Exit Function
	End If
	Sql = "select ChannelName from Ok3w_Channel where ChannelId=" & ChannelId
	GetChannelName = ExecSqlReturnOneValue(Sql)
End Function

'栏目名称
Function GetClassName(ClassId)
	If ClassId="0" Then
		GetClassName = "--------"
		Exit Function
	End If
	Sql = "select SortName from Ok3w_Class where ID=" & ClassId
	GetClassName = ExecSqlReturnOneValue(Sql)
End Function

Function GetSortPath(ClassId)
	If ClassId = "" Then
		GetSortPath = ""
		ClassId = -1
	Else
		ClassId = Cdbl(ClassId)
		GetSortPath = Conn.Execute("select SortPath from Ok3w_Class where ID=" & Cdbl(ClassID))(0)
	End If
End Function 

'父栏目名称
Function GetParentClassName(ClassId)
	Sql="select ParentID,SortName from Ok3w_Class where ID=" & ClassId
	Set oRs = Conn.Execute(Sql)
	a_ParentID = oRs(0)
	a_SortName = oRs(1)
	oRs.Close
	If a_ParentID <> 0 Then
		Sql="select ID,SortName from Ok3w_Class where ID=" & a_ParentID
		Set oRs = Conn.Execute(Sql)
		a_ParentID = oRs(0)
		a_SortName = oRs(1)
		oRs.Close
	End If
	Set oRs = Nothing
	GetParentClassName = a_SortName
End Function

Function IsHaveNextClass(ClassID)
	Sql="select count(ID) from Ok3w_Class where ParentID=" & ClassID & " and IsNav=1"
	If Conn.Execute(Sql)(0) = 0 Then
		IsHaveNextClass = False
	Else
		IsHaveNextClass = True
	End If
End Function

Function GetCommentsCount(TypeID,TableID)
	Sql="select count(ID) from Ok3w_Guest where TypeID=" & TypeID & " and TableID=" & TableID
	If Application(SiteID & "_Ok3w_SiteIsGuest")="1" Then Sql = Sql & " and IsPass=1"
	GetCommentsCount = ExecSqlReturnOneValue(Sql)
End Function

'分类ID下拉列表选择菜单
Private Sub InitClassSelectOption(ChannelId,ParentID,ChkID)
	Dim opRs,cTmp,cLen,cCount
	Set opRs = Server.CreateObject("Adodb.RecordSet")
	Sql = "select ID,SortName,SortPath from Ok3w_Class where ChannelId=" & ChannelId & " and ParentID=" & ParentID & " and gotoURL='' order by OrderID"
	opRs.Open Sql,Conn,0,1
	Do While Not opRs.Eof
		Response.Write("<option value=""" & opRs("ID") & """")
		If ChkID = opRs("ID") Then Response.Write(" selected=""selected""")
		Response.Write(">")
		cTmp = Split(opRs("SortPath"),",")
		cLen = Ubound(cTmp) - 2
		For cCount=1 To cLen
			Response.Write("│&nbsp;")
		Next
		Response.Write("├" & opRs("SortName") & "</option>")
		
		Call InitClassSelectOption(ChannelId,opRs("ID"),ChkID)
		opRs.MoveNext
	Loop
	opRs.Close
	Set opRs = Nothing
End Sub

Function ReplaceUpFilePath(uPath)
	If IsHtml Then

	End If
	ReplaceUpFilePath = uPath
End Function

Private Sub OutThisPageContent(aID,Content,PageType)
	thisPage = Request.QueryString("page")
	If thisPage<>"" Then thisPage = myCdbl(thisPage)
	If thisPage="" Then thisPage=1
	thisPage = Cint(thisPage)
	
	If InStr(Content,"[Ok3w_NextPage]")>0 Then
		Content_Tmp = Split(Content,"[Ok3w_NextPage]")
		Page_Count = Ubound(Content_Tmp)+1
		If thisPage> Page_Count Then thisPage = Page_Count
		OutContent = Content_Tmp(thisPage-1)
	Else
		OutContent = Content
'		cLen = Len(Content)
'		If cLen Mod 2000 = 0 Then
'			Page_Count = cLen \ 2000
'		Else
'			Page_Count = cLen \ 2000 + 1
'		End If
'		If thisPage> Page_Count Then thisPage = Page_Count
'		OutContent = Mid(Content,(thisPage-1)*2000+1,2000)
	End If
	
	OutContent = ReplaceTest(OutContent,"<img ","<img onload=""zoomIMG(this,700)"" ")
	
	If Trim(Application(SiteID & "_Ok3w_SitePublicKeyWords"))<>"" And Application(SiteID & "_Ok3w_SitePublicKeyWords")<>"0" Then
		kTmp = Split(Application(SiteID & "_Ok3w_SitePublicKeyWords"),vbCrLf)
		For kk=0 To Ubound(kTmp)
			uTmp = Split(kTmp(kk),"|")
			If Ubound(uTmp)=1 Then
				OutContent = ReplaceTest(OutContent,uTmp(0),"<span class=keyword><a href=" & uTmp(1) & " target=_blank>" & uTmp(0) & "<a></span>")
			End If
		Next
	End If
	
	Response.Write(OutContent)
	
	If Page_Count>1 Then
		Response.Write("<span></span><div class=""artpage"">")
		For iPage=1 To Page_Count
			If iPage = 1 Then
				If PageType="html" Then
					URL = "?id=" & aID
				Else
					URL = "?id=" & aID
				End If
			Else
				If PageType="html" Then
					URL = "?id=" & aID & "&page=" & iPage
				Else
					URL = "?id=" & aID & "&page=" & iPage
				End If
			End If
			If iPage = thisPage Then
				Response.Write("<strong style=""color:#FF0000;"">第" & iPage & "页</strong> ")
				Else
					Response.Write("<a href=""" & URL & """>第" & iPage & "页</a> ")
			End If
		Next
		Response.Write("</div>")
	End If
End Sub

Function GetUserDengjiValue(id,dj)
	SiteUserDengji = Application(SiteID & "_Ok3w_SiteUserDengji")
	If SiteUserDengji<>"" Then
		DJ1 = Split(SiteUserDengji,"|")
		DJ2 = Split(DJ1(id),",")
		GetUserDengjiValue = DJ2(dj-1)
	End If
End Function

Function GetUserDengjiID(Jifen)
	SiteUserDengji = Application(SiteID & "_Ok3w_SiteUserDengji")
	DJ1 = Split(SiteUserDengji,"|")
	DJ2 = Split(DJ1(1),",")
	Max_ADJ = Ubound(DJ2)
	For dj_item = Max_ADJ To 0 Step -1
		If DJ2(dj_item)<>"" Then
			If Jifen>=Cdbl(DJ2(dj_item)) Then
				GetUserDengjiID = dj_item + 1
				Exit Function
			End If
		End If
	Next
End Function

Private Sub InitUserDengjiSelectOption(dj)
	SiteUserDengji = Application(SiteID & "_Ok3w_SiteUserDengji")
	DJ_Tmp = Split(SiteUserDengji,"|")
	dj_Name = Split(DJ_Tmp(0),",")
	For dj_item = 0 To Ubound(dj_Name)
		If dj_Name(dj_item)="" Then Exit Sub
		Response.Write("<option value=""" & dj_item + 1 & """")
		If Cint(dj) = dj_item + 1 Then Response.Write(" selected=""selected""")
		Response.Write(">" & dj_Name(dj_item) & "</option>")
	Next
End Sub

Private Sub InitSoftBaseChkItem(ChkStr,objName,objType)
	ItemSTr = Application(SiteID & "_Ok3w_Site" & objName)
	ItmpTmp = Split(ItemSTr,"|")
	Select Case objType
		Case "checkbox"
			For II=0 To Ubound(ItmpTmp)
				Response.Write("<input name=""" & objName & """ type=""" & objType & """ value=""" & ItmpTmp(II) & """")
				If InStr("," & ChkStr & "," , "," & Trim(ItmpTmp(II)) & ",")>0 Then	Response.Write(" checked")
				Response.Write(">" & ItmpTmp(II) & " ")
			Next
		Case "select"
			For II=0 To Ubound(ItmpTmp)
				Response.Write("<option value=""" & ItmpTmp(II) & """")
				If Trim(ItmpTmp(II)) = ChkStr Then	Response.Write(" selected")
				Response.Write(">" & ItmpTmp(II) & "</option>")
			Next
	End Select
End Sub

Private Sub SoftstarImg(star)
	For II=1 To star
		'Response.Write("<img src=""" & Htmldns & "images/star.gif"" />")
		Response.Write("★")
	Next
End Sub

Private Sub Delete_ArticleHTML(IDS)
	Sql="select ID,Content from Ok3w_Article where ID in(" & IDS & ")"
	Set oRs = Conn.Execute(Sql)
	Set fso = CreateObject("Scripting.FileSystemObject")
	Do While Not oRs.Eof
		h_ID = oRs(0)
		Content = oRs(1)
		If InStr(Content,"[Ok3w_NextPage]")>0 Then
			Content_Tmp = Split(Content,"[Ok3w_NextPage]")
			Page_Count = Ubound(Content_Tmp)+1
		Else
			'cLen = Len(Content)
			'If cLen Mod 2000 = 0 Then
			'	Page_Count = cLen \ 2000
			'Else
			'	Page_Count = cLen \ 2000 + 1
			'End If
			Page_Count = 1
		End If
		For iPage=1 To Page_Count
			If iPage = 1 Then
				FilePath = dbdns & HTML_Article_Path & h_ID & ".html"
			Else
				FilePath = dbdns & HTML_Article_Path & h_ID & "_" & iPage & ".html"
			End If
						
			If fso.FileExists(Server.MapPath(FilePath)) Then
				Set f = fso.GetFile(Server.MapPath(FilePath))
				f.delete()
				Set f = Nothing
			End If
		Next
		oRs.MoveNext
	Loop
	Set fso = Nothing			
	oRs.Close
	Set oRs = Nothing
End Sub

Private Sub Delete_SoftHTML(IDS)
	Sql="select ID,Softintro from Ok3w_Soft where ID in(" & IDS & ")"
	Set oRs = Conn.Execute(Sql)
	Set fso = CreateObject("Scripting.FileSystemObject")
	Do While Not oRs.Eof
		h_ID = oRs(0)
		Content = oRs(1)
		If InStr(Content,"[Ok3w_NextPage]")>0 Then
			Content_Tmp = Split(Content,"[Ok3w_NextPage]")
			Page_Count = Ubound(Content_Tmp)+1
		Else
			'cLen = Len(Content)
			'If cLen Mod 2000 = 0 Then
			'	Page_Count = cLen \ 2000
			'Else
			'	Page_Count = cLen \ 2000 + 1
			'End If
			Page_Count = 1
		End If
		For iPage=1 To Page_Count
			If iPage = 1 Then
				FilePath = dbdns & HTML_Soft_Path & h_ID & ".html"
			Else
				FilePath = dbdns & HTML_Soft_Path & h_ID & "_" & iPage & ".html"
			End If
					
			If fso.FileExists(Server.MapPath(FilePath)) Then
				Set f = fso.GetFile(Server.MapPath(FilePath))
				f.delete()
				Set f = Nothing
			End If
		Next
		oRs.MoveNext
	Loop
	Set fso = Nothing			
	oRs.Close
	Set oRs = Nothing
End Sub

Function Page_URL(ChannelID,ClassID,ID)
	Select Case ChannelID
		Case 1
			If ClassID<>"" Then
				If IsHtml Then

				Else
					Page_URL = Htmldns & "waplist.asp?id=" & ClassID
				End If
			Else
				If IsHtml Then

				Else
					Page_URL = Htmldns & "wapshow.asp?id=" & ID
				End If
			End If
		Case 2
			If IsHtml Then

			Else
				Page_URL = Htmldns & "about.asp?id=" & ID
			End If
		Case 3
			If ClassID<>"" Then
				If IsHtml Then

				Else
					Page_URL = Htmldns & "soft_list.asp?id=" & ClassID
				End If
			Else
				If IsHtml Then
				
				Else
					Page_URL = Htmldns & "soft_show.asp?id=" & ID
				End If
			End If
	End Select
End Function

Private Sub Display_BookUserHead(imgW,imgH,xCount,cCount)
	tmp = 0
	For i=1 To xCount
		If tmp = cCount Then
			Response.Write("<br />")
			tmp = 1
		Else
			tmp = tmp + 1
		End If
		Response.Write("<input name=""pID"" type=""radio"" value=""" & i & """")
		If i=1 Then
			Response.Write(" checked=""checked""")
		End If
		Response.Write(" />")
        Response.Write("<a href=""javascript:;"" onclick=""frmBook.pID[" & i-1 & "].checked=true;""><img alt=""Ok3w.Net -- 点击选择"" src=""images/book/" & i & ".jpg"" width=""" & imgW & """ height=""" & imgH & """  border=""0"" /></a> ")
	Next
End Sub
%>
