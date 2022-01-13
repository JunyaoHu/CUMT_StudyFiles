<%
Private Sub Ok3w_Article_List(ClassID,TopN,LeftN,IsCommend,DisClass,DisTime,TimeFormat,DisHits,OrderType,LableID)
	Sql="select top " & TopN & " Id,ClassID,Title,TitleColor,TitleURL,AddTime,Hits from Ok3w_Article where ChannelID=1 and IsPass=1 and IsDelete=0"
	If ClassID<>"" Then Sql=Sql & " and SortPath like '%," & ClassID & ",%'"
	If IsCommend Then Sql=Sql & " and IsCommend=1"
	Select Case OrderType
		Case "hot"
			Sql = Sql & " order by Hits desc,AddTime desc,ID desc"
		Case "rnd"
			If Db_Type = "Sql" Then
				Sql = Sql & " order by newid(),ID desc"
			Else
				Randomize
				Sql = Sql & " order by Rnd(-(ID+"&Rnd()&")),ID desc"
			End If
		Case "new"
			Sql = Sql & " order by AddTime desc,ID desc"
		Case Else
			Sql = Sql & " order by IsTop desc,IsCommend desc,AddTime desc,ID desc"
	End Select
	Rs.Open Sql,Conn,0,1
	Do While Not Rs.eof
		Response.Write("<" & LableID & ">")
		If DisClass Then
			Response.Write("<span>[" & GetClassName(Rs("ClassID")) & "]</span>")
		End If
		If DisTime Then
			Response.Write("<span>" & Format_Time(Rs("AddTime"),TimeFormat) & "</span>")
		End If
		If DisHits Then
			Response.Write("<span>" & "热度\65" & Rs("Hits") & "</span>")
		End If
		Response.Write(Format_TitleURL(HTML_Article_Path,Rs("ID"),Rs("Title"),Rs("TitleColor"),Rs("TitleURL"),LeftN))
		Response.Write("</" & LableID & ">")
		Rs.MoveNext
	Loop
	Rs.Close
End Sub

Private Sub Ok3w_Article_List001(ClassID,TopN,LeftN,IsCommend,DisClass,DisTime,TimeFormat,DisHits,OrderType,LableID)
	Sql="select top " & TopN & " Id,ClassID,Title,TitleColor,TitleURL,AddTime,Hits from Ok3w_Article where ChannelID=1 and IsPass=1 and IsDelete=0"
	If ClassID<>"" Then Sql=Sql & " and SortPath like '%," & ClassID & ",%'"
	If IsCommend Then Sql=Sql & " and IsCommend=1"
	Select Case OrderType
		Case "hot"
			Sql = Sql & " order by Hits desc,AddTime desc,ID desc"
		Case "rnd"
			If Db_Type = "Sql" Then
				Sql = Sql & " order by newid(),ID desc"
			Else
				Randomize
				Sql = Sql & " order by Rnd(-(ID+"&Rnd()&")),ID desc"
			End If
		Case "new"
			Sql = Sql & " order by AddTime desc,ID desc"
		Case Else
			Sql = Sql & " order by IsTop desc,IsCommend desc,AddTime desc,ID desc"
	End Select
	Rs.Open Sql,Conn,0,1
	Do While Not Rs.eof
		Response.Write("<" & LableID & ">")
		If DisClass Then
			Response.Write("<span>[" & GetClassName(Rs("ClassID")) & "]</span>")
		End If
		If DisTime Then
			Response.Write("<span>" & Format_Time(Rs("AddTime"),TimeFormat) & "</span>")
		End If
		If DisHits Then
			Response.Write("<span>" & "热度\" & Rs("Hits") & "</span>")
		End If
		Response.Write(Format_TitleURL(HTML_Article_Path,Rs("ID"),Rs("Title"),Rs("TitleColor"),Rs("TitleURL"),LeftN))
		Response.Write("</" & LableID & ">")
		Rs.MoveNext
	Loop
	Rs.Close
End Sub

Private Sub Ok3w_Article_PreNext(ClassID,ID)
	Sql="select ID,Title,TitleColor,TitleURL from Ok3w_Article where SortPath like '%," & ClassID & ",%' and IsPass=1 and IsDelete=0 and ID>" & ID & " order by ID asc"
	Set oRs = Conn.Execute(Sql)
	Response.Write("<DIV class=prevNews>")
	If oRs.Eof And oRs.bof Then
		Response.Write("Front：没有了")
		Else
			Response.Write(Format_TitleURL(HTML_Article_Path,oRs("ID"),"上一条：" & oRs("Title"),oRs("TitleColor"),oRs("TitleURL"),50))
	End If
	Response.Write("</DIV>")
	Sql="select ID,Title,TitleColor,TitleURL from Ok3w_Article where SortPath like '%," & ClassID & ",%' and IsPass=1 and IsDelete=0 and ID<" & ID & " order by ID desc"
	Set oRs = Conn.Execute(Sql)
	Response.Write("<DIV class=nextNews>")
	If oRs.Eof And oRs.bof Then
		Response.Write("Next：没有了")
		Else
			Response.Write(Format_TitleURL(HTML_Article_Path,oRs("ID"),"下一条：" & oRs("Title"),oRs("TitleColor"),oRs("TitleURL"),50))
	End If
	Response.Write("</DIV>")
End Sub

Private Sub Ok3w_Article_PreNext01(ClassID,ID)
	Sql="select ID,Title,TitleColor,TitleURL from Ok3w_Article where SortPath like '%," & ClassID & ",%' and IsPass=1 and IsDelete=0 and ID>" & ID & " order by ID asc"
	Set oRs = Conn.Execute(Sql)
	Response.Write("<table width= 100%  border= 0  cellspacing= 0  cellpadding= 0 >")
	Response.Write("<tr class= xmt016 >")
	Response.Write("<td height= 30 >")
	If oRs.Eof And oRs.bof Then
		Response.Write("&nbsp;前：没有了")
		Else
			Response.Write(Format_TitleURL(HTML_Article_Path,oRs("ID"),"&nbsp;上一条：" & oRs("Title"),oRs("TitleColor"),oRs("TitleURL"),50))
	End If
	Response.Write("</td>")
	Response.Write("</tr>")
	Sql="select ID,Title,TitleColor,TitleURL from Ok3w_Article where SortPath like '%," & ClassID & ",%' and IsPass=1 and IsDelete=0 and ID<" & ID & " order by ID desc"
	Set oRs = Conn.Execute(Sql)
	Response.Write("<tr class= xmt016 >")
	Response.Write("<td height= 30 >")
	If oRs.Eof And oRs.bof Then
		Response.Write("&nbsp;后：没有了")
		Else
			Response.Write(Format_TitleURL(HTML_Article_Path,oRs("ID"),"&nbsp;下一条：" & oRs("Title"),oRs("TitleColor"),oRs("TitleURL"),50))
	End If
	Response.Write("</td>")
	Response.Write("</tr>")
	Response.Write("</table>")
End Sub

Private Sub Ok3w_Article_Gundong(ClassID,TopN,Width,Height,Speed)
Randomize
RndID = Int(Rnd()*10000)
RndFun = "__Ok3w_Article_Gundong__00" & RndID
Sql="select top " & TopN & " Id,Title,TitleColor,TitleURL from Ok3w_Article where ChannelID=1 and IsPass=1 and IsDelete=0 and IsMove=1"
If ClassID<>"" Then Sql=Sql & " and SortPath like '%," & ClassID & ",%'"
Sql=Sql & " order by IsTop desc,IsCommend desc,Id desc"
Rs.Open Sql,Conn,0,1
StrTmp = ""
Do While Not Rs.Eof
	StrTmp = StrTmp & "·" & Format_TitleURL(HTML_Article_Path,Rs("ID"),Rs("Title"),Rs("TitleColor"),Rs("TitleURL"),50) & "&nbsp;&nbsp;"
	Rs.MoveNext
Loop
Rs.Close
StrTmp = Replace(StrTmp,"'","\'")

Response.Write("<script language=""javascript"">")
Response.Write("function " & RndFun & "()")
Response.Write("{")
Response.Write("	var RndID = 'pro" & RndID & "';")
Response.Write("	var StrGD = '" & StrTmp & "';")
Response.Write("	Ok3w_Marquee(RndID,StrGD," & Width & "," & Height & "," & Speed & ");")
Response.Write("}")
Response.Write(RndFun & "();")
Response.Write("</script>")
End Sub

Private Sub Ok3w_Article_ImgGD(ClassID,TopN,Width,Height,ImgW,ImgH,CharX,Speed)
	Sql="select top " & TopN & " Id,Title,TitleColor,TitleURL,PicFile from Ok3w_Article where ChannelID=1 and IsPass=1 and IsDelete=0 and IsPic=1 and IsMove=1 order by ID desc"
	Rs.Open Sql,Conn,0,1		
	Response.Write("<div id=""demo"" style=""overflow:hidden; width:" & Width & "px; height:" & Height & "px;"">" & vbCrLf)
	Response.Write("  <table cellspacing=""0"" cellpadding=""0"" align=""left"" border=""0"" cellspace=""0"">" & vbCrLf)
	Response.Write("    <tr>" & vbCrLf)
	Response.Write("      <td id=""demo1"" valign=""top""><table border=""0"" cellpadding=""0"" cellspacing=""0"">" & vbCrLf)
	Response.Write("        <tr>" & vbCrLf)
	Do While Not Rs.Eof
			If Rs("TitleURL")="" Then
				TitleURL = Page_URL(ChannelID,"",Rs("ID"))
			Else
				TitleURL = Rs("TitleURL")
			End If
			Title = Rs("Title")
			PicFile = Rs("PicFile")
	Response.Write("          <td><ul><li><a  href=""" & TitleURL & """><img height=""" & ImgH & """ alt=""" & Title & """ src=""" & PicFile & """ width=""" & ImgW & """>" & LeftX(Title,CharX*2) & "</a></li></ul></td>" & vbCrLf)
		Rs.MoveNext
	Loop
	Rs.Close
	Response.Write("        </tr>" & vbCrLf)
	Response.Write("      </table></td>" & vbCrLf)
	Response.Write("      <td id=""demo2"" valign=""top"">&nbsp;</td>" & vbCrLf)
	Response.Write("    </tr>" & vbCrLf)
	Response.Write("  </table>" & vbCrLf)
	Response.Write("</div>" & vbCrLf)
	Response.Write("<script type=""text/javascript"">" & vbCrLf)
	Response.Write("var speed3=" & Speed & ";" & vbCrLf)
	Response.Write("demo2.innerHTML=demo1.innerHTML;" & vbCrLf)
	Response.Write("function Marquee(){" & vbCrLf)
	Response.Write("if(demo2.offsetWidth-demo.scrollLeft<=0)" & vbCrLf)
	Response.Write("demo.scrollLeft-=demo1.offsetWidth;" & vbCrLf)
	Response.Write("else{" & vbCrLf)
	Response.Write("demo.scrollLeft++;" & vbCrLf)
	Response.Write("}" & vbCrLf)
	Response.Write("}" & vbCrLf)
	Response.Write("var MyMar=setInterval(Marquee,speed3);" & vbCrLf)
	Response.Write("demo.onmouseover=function() {clearInterval(MyMar);}" & vbCrLf)
	Response.Write("demo.onmouseout=function() {MyMar=setInterval(Marquee,speed3);}" & vbCrLf)
	Response.Write("</script>" & vbCrLf)
End Sub

Private Sub Ok3w_Article_ImgFlash(ClassID,Width,Height)
	Sql="select top 5 Id,Title,PicFile,TitleURL from Ok3w_Article where ChannelID=1 and IsPass=1 and IsPlay=1 and IsDelete=0"
	If ClassID<>"" Then Sql=Sql & " and SortPath like '%," & ClassID & ",%'"
	Sql=Sql & " order by Id desc"
	Rs.Open Sql,Conn,0,1
	i = 0
	Do While Not Rs.Eof
		ID = Rs("ID")
		Title = Rs("Title")
		PicFile = Rs("PicFile")
		TitleURL = Rs("TitleURL")
		If TitleURL = "" Then TitleURL = Page_URL(ChannelID,"",ID)
		imags = imags & PicFile & "|"
		links = links & TitleURL & "|"
		texts = texts & Title & "|"
		Rs.MoveNext
	Loop
	Rs.Close
	If imags<>"" Then imags = Left(imags,Len(imags)-1)
	If links<>"" Then links = Left(links,Len(links)-1)
	If texts<>"" Then texts = Left(texts,Len(texts)-1)
	
	Response.Write("<script type=""text/javascript"">" & vbCrLf)
	Response.Write("var focus_width=" & Width & ";" & vbCrLf)
	Response.Write("var focus_height=" & Height - 18 & ";" & vbCrLf)
	Response.Write("var text_height=18;" & vbCrLf)
	Response.Write("var swf_height = focus_height+text_height;" & vbCrLf)
	Response.Write("var pics=""" & imags & """;" & vbCrLf)
	Response.Write("var links=""" & links & """;" & vbCrLf)
	Response.Write("var texts=""" & texts & """;" & vbCrLf)
	
	Response.Write("payflash(focus_width,swf_height,pics,links,texts);" & vbCrLf)
	Response.Write("</script>" & vbCrLf)
End Sub

Private Sub Ok3w_Article_bList(ClassID,PageSize)
	Sql="select Id,Title,TitleColor,TitleURL,AddTime from Ok3w_Article where IsPass=1 and IsDelete=0 and SortPath like '%," & ClassID & ",%' order by AddTime desc,ID desc"
	Call Page.GetRs(Conn,Rs,Sql,PageSize)
	oCount = 0
	Response.Write("<div class=""box201""><ul>")
	Do While Not Rs.Eof And Not Page.Eof
		oCount = oCount + 1
		Response.Write("<li><span class=""dateR"">" & Format_Time(Rs("AddTime"),2) & "</span>" & Format_TitleURL(HTML_Article_Path,Rs("ID"),Rs("Title"),Rs("TitleColor"),Rs("TitleURL"),50) & "</li>")
     	If oCount Mod 5 = 0 And oCount < PageSize Then
			Response.Write("<li class=sep></li>")
		End If
		Rs.MoveNext
		Page.MoveNext
	Loop
	Rs.Close
	Response.Write("</ul></div>")
End Sub

Private Sub Ok3w_Article_pList(ClassID,TopN,PageSize,Cels,ImgW,ImgH,CharX)
	Response.Write("<div class=imgList>")
	Response.Write("<table width=""100%"" border=""0"" align=""center"" cellpadding=""0"" cellspacing=""0"">")
	Sql="select top " & TopN & " Id,Title,TitleColor,TitleURL,PicFile from Ok3w_Article where IsPass=1 and IsDelete=0 and SortPath like '%," & ClassID & ",%' order by AddTime desc,ID desc"
	Call Page.GetRs(Conn,Rs,Sql,PageSize)
	Do While Not Rs.Eof And Not Page.Eof
	Response.Write("<tr>")
	For iCount = 1 To Cels  
	Response.Write("<td width=""" & 100\Cels & "%"" align=""center""><ul><li>")
	If Rs.Eof Or Page.Eof Then
		Response.Write("&nbsp;")
	Else
		If Rs("TitleURL")="" Then
			uTmp = Page_URL(ChannelID,"",Rs("ID"))
		Else
			uTmp = Rs("TitleURL")
		End If
		Response.Write("<a href=""" & uTmp & """>")
		Response.Write("<img src=""" & Rs("PicFile") & """ alt=""" & Rs("Title") & """ width=""" & ImgW & """ height=""" & ImgH & """ border=""0"" />")
		Response.Write(LeftX(Rs("Title"),CharX * 2) & "</a>")
		Rs.MoveNext
		Page.MoveNext
	End If
	Response.Write("</li></ul></td>")
	Next
	Response.Write("</tr>")
	Loop
	Rs.Close
	Response.Write("</table>")
	Response.Write("</div>")
End Sub

Private Sub Ok3w_Article_Search(ClassID,sType,Keyword,PageSize)
	Response.Write("<div class=""box2""><ul>")
	If Keyword = "" Then
		Response.Write("<li>请输入关键字查询</li>")
	Else
		Sql="select Id,Title,TitleColor,TitleURL,AddTime from Ok3w_Article where IsPass=1 and IsDelete=0 and ChannelID=1"
		Select Case sType
			Case "Content"
				Sql = Sql & " and Content like '%" & Keyword & "%'"
			Case Else
				Sql = Sql & " and Title like '%" & Keyword & "%'"
		End Select
		Sql = Sql & " order by ID desc"
		Call Page.GetRs(Conn,Rs,Sql,PageSize)
		oCount = 0
		If Rs.Eof And Rs.Bof Then
			Response.Write("<li>抱歉，没有找到相关记录</li>")
		Else
			Do While Not Rs.Eof And Not Page.Eof
				oCount = oCount + 1
				Response.Write("<li><span class=""dateR"">" & Format_Time(Rs("AddTime"),2) & "</span>" & Format_TitleURL(HTML_Article_Path,Rs("ID"),Rs("Title"),Rs("TitleColor"),Rs("TitleURL"),50) & "</li>")
				If oCount Mod 5 = 0 And oCount < PageSize Then
					Response.Write("<li class=sep></li>")
				End If
				Rs.MoveNext
				Page.MoveNext
			Loop
		End If
		Rs.Close
	End If
	Response.Write("</ul></div>")
End Sub

Private Sub Ok3w_Article_Class_Nav(SortPath)
cTmp = Left(SortPath,Len(SortPath)-1)
Sql="select ID,SortName from Ok3w_Class where ID in(" & cTmp & ") order by ID"
Set oRs = Conn.Execute(Sql)
Do While Not oRs.Eof
	Response.Write("<a href=""" & Page_URL(ChannelID,oRs("ID"),"") & """>" & oRs("SortName") & "</a>")
	oRs.MoveNext
	If Not oRs.Eof Then Response.Write(" &gt;&gt; ")
Loop
oRs.Close
Set oRs = Nothing
End Sub


Private Sub Ok3w_Article_Class_PageTitle(SortPath)
cTmp = Left(SortPath,Len(SortPath)-1)
Sql="select ID,SortName from Ok3w_Class where ID in(" & cTmp & ") order by ID desc"
Set oRs= Conn.Execute(Sql)
Do While Not oRs.Eof
	Response.Write(oRs("SortName"))
	oRs.MoveNext
	If Not oRs.Eof Then Response.Write(" - ")
Loop
oRs.Close
Set oRs = Nothing
End Sub

Private Sub Ok3w_Article_IndexClassImg(ClassID,TopN,WW,HH)
	Sql="select top " & TopN & " Id,Title,TitleColor,TitleURL,Description,PicFile from Ok3w_Article where ChannelID=1 and IsPass=1 and IsDelete=0 and IsIndexImg=1"
	If ClassID<>"" Then Sql=Sql & " and SortPath like '%," & ClassID & ",%'"
	Sql=Sql & " order by IsTop desc,IsCommend desc,AddTime desc,Id desc"
	Rs.Open Sql,Conn,0,1
	If Rs.Eof And Rs.Bof Then
	Else
		Do While Not Rs.Eof
			If Rs("TitleURL")="" Then
				TitleURL = Page_URL(ChannelID,"",Rs("ID"))
			Else
				TitleURL = Rs("TitleURL")
			End If
			Title = Rs("Title")
			PicFile = Rs("PicFile")
			Description = Rs("Description")
			Response.Write("<div class=imgDiv style=""FLOAT: left""><A class=imgLink href=""" & TitleURL & """><IMG height=""" & HH & """ src=""" & PicFile & """ width=""" & WW & """></A></div>")
            Response.Write("<div class=cont>")
           	Response.Write("    <div class=title><A class=nLink href=""" & TitleURL & """ >" & Title & "</A></div>")
            Response.Write("	<div class=sum>" & Description & "</div>")
            Response.Write("</div>")
			Rs.MoveNext
		Loop
	End If
	Rs.Close
End Sub

Private Sub Ok3w_Article_IndexClassImg02(ClassID,TopN,WW,HH)
	Sql="select top " & TopN & " Id,Title,TitleColor,TitleURL,Description,Hits,Author,ComeFrom,AddTime,PicFile from Ok3w_Article where ChannelID=1 and IsPass=1 and IsDelete=0 and IsIndexImg=1"
	If ClassID<>"" Then Sql=Sql & " and SortPath like '%," & ClassID & ",%'"
	Sql=Sql & " order by IsTop desc,IsCommend desc,AddTime desc,Id desc"
	Rs.Open Sql,Conn,0,1
	If Rs.Eof And Rs.Bof Then
	Else
		Do While Not Rs.Eof
			If Rs("TitleURL")="" Then
				TitleURL = Page_URL(ChannelID,"",Rs("ID"))
			Else
				TitleURL = Rs("TitleURL")
			End If
			Title = Rs("Title")
			PicFile = Rs("PicFile")
			Hits = Rs("Hits")
			ComeFrom = Rs("ComeFrom")
			AddTime = Rs("AddTime")
			Author = Rs("Author")
			Description = Rs("Description")
			Response.Write("<div class=""summary002"">")
			Response.Write("<div class=imgDiv002 style=""FLOAT:right""><A href=""" & TitleURL & """ target=_blank><IMG height=""" & HH & """ src=""" & PicFile & """ width=""" & WW & """ alt=""" & Author & """></A></div>")
            Response.Write("<div class=cont002>")
           	Response.Write("<div class=title002><A class=nLink002 href=""" & TitleURL & """ target=_blank>" & Title & "</A></div>")
			 Response.Write("<div class=sum>" & Description & "</div>")
            Response.Write("</div>")
			Response.Write("</div>")
			Rs.MoveNext
		Loop
	End If
	Rs.Close
End Sub

Private Sub Ok3w_Article_IndexTop()
	Sql="select top 1 Id,Title,TitleColor,TitleURL,Description from Ok3w_Article where ChannelID=1 and IsPass=1 and IsDelete=0 and IsTop=1 order by AddTime desc,ID desc"
	Rs.Open Sql,Conn,0,1
	If Rs.Eof And Rs.Bof Then
	Else
		Response.Write("<LI class=""hot_news""><A href=""" & Page_URL(ChannelID, "",Rs("ID")) & """>" & Rs("Title") & "</A></LI>")
		Response.Write("<LI class=""hot_news_txt"">" & Rs("Description") & "<A href=""" & Page_URL(ChannelID, "",Rs("ID")) & """>[查看全文]</A></LI>")
	End If
	Rs.Close
End Sub

Private Sub Ok3w_DisNextClass(ChannelID,ClassID)
	Sql="select ID,SortName,gotoURL from Ok3w_Class where ChannelID=" & ChannelID & "and  ParentID=" & ClassID & " and IsNav=1 order by OrderID"
	Rs.Open Sql,Conn,0,1
	If Rs.Eof And Rs.Bof Then
		Sql = "select ParentID from Ok3w_Class where ChannelID=" & ChannelID & " and ID=" & ClassId
		a_ParentID = ExecSqlReturnOneValue(Sql)
		Rs.Close
		Sql="select ID,SortName,gotoURL from Ok3w_Class where ChannelID=" & ChannelID & " and ParentID=" & a_ParentID & " and IsNav=1 order by OrderID"
		Rs.Open Sql,Conn,0,1
	End If
	Do While Not Rs.Eof
		gotoURL = Rs("gotoURL")
		If gotoURL = "" Then gotoURL = Page_URL(ChannelID,Rs("ID"),"")
		Response.Write("<li><a href=""" & gotoURL & """")
		If Rs("ID") = ClassID Then Response.Write(" class=sOpen")
		Response.Write(">" & Rs("SortName") & "</a></li>")
		Rs.MoveNext
	Loop
	Rs.Close
End Sub

Private Sub Ok3w_Site_Link(TopN,LeftN,oT,cT)
StrTmp = ""
If oT = 1 Then
Sql = "select top " & TopN & " * from Ok3w_Link where Ltype=1 and Ctype=" & cT & " order by Lorder,Lid"
Rs.Open Sql,Conn,0,1
Do While Not Rs.Eof
	StrTmp = StrTmp & "&nbsp;&nbsp;&nbsp;&nbsp;<a href=""" & Rs("Lurl") & """ target=""_blank""><img src=""" & Rs("Lpic") & """ alt=""" & Rs("Lname") & """ width=""160"" height=""60"" border=""0"" /></a> "
	Rs.MoveNext
Loop
Rs.Close
End If
If oT=0 Then
Sql = "select top " & TopN & " * from Ok3w_Link where Ltype=0 and Ctype=" & cT & "  order by Lorder,Lid"
Rs.Open Sql,Conn,0,1
Do While Not Rs.Eof
	StrTmp = StrTmp & "&nbsp;&nbsp;&nbsp;&nbsp;<a href=""" & Rs("Lurl") & """ target=""_blank"">" & Rs("Lname") & "</a> "
	Rs.MoveNext
Loop
Rs.Close
End If
Response.Write(StrTmp)
End Sub

Private Sub Ok3w_HearNav(ChannelID)
	Sql="select ID,SortName,gotoURL from Ok3w_Class where ChannelID=" & ChannelID & " and ParentID=0 and IsNav=1 order by OrderID"
	Rs.Open Sql,Conn,0,1
	If ClassID = "" Then
		Response.Write("<a class=""first"" href=""" & Htmldns & """>网站首页</a>")
	Else
		Response.Write("<a href=""" & Htmldns & """>网站首页</a>")
	End If
	Do While Not Rs.Eof
		If Rs("gotoURL") = "" Then
			gotoURL = Page_URL(ChannelID,Rs("ID"),"")
			Target = ""
		Else
			gotoURL = Rs("gotoURL")
			Target = " target=""_blank"""
		End If
		If InStr(SortPath,"," & Rs("ID") & ",") = 0 Then
			oClass = ""
		Else
			oClass = " class=""first"""
		End If
		Nav_SortName = Rs("SortName")
		Response.Write("<a" & oClass & " href=""" & gotoURL & """" & Target & ">" & Nav_SortName & "</a>")
		Rs.MoveNext
	Loop
	Rs.Close
End Sub

Private Sub Ok3w_FooterNav()
	Sql="select ID,SortName,gotoURL,(select max(ID) from Ok3w_Article as a where a.ClassID=c.ID) as ArtID from Ok3w_Class as c where ChannelID=2 and IsNav=1 order by OrderID"
	Rs.Open Sql,Conn,0,1
	Do While Not Rs.Eof
	If Rs("gotoURL") = "" Then
		pageURL = Page_URL(2,"",Rs("ArtID"))
		Response.Write("<a href=""" & pageURL & """>" & Rs("SortName") & "</a>")
	Else
		Response.Write("<a href=""" & Rs("gotoURL") & """ target=""_blank"">" & Rs("SortName") & "</a>")
	End If
	Rs.MoveNext
	If Not Rs.Eof Then Response.Write(" | ")
	Loop
	Rs.Close
End Sub

Function Ok3w_Site_Tongji()
	Response.Write(Application(SiteID & "_Ok3w_SiteTongji"))
End Function

If Application(SiteID & "_Ok3w_SiteIsClose")="1" And Not IsHtml Then
	Response.Write(Application(SiteID & "_Ok3w_SiteCloseNote"))
	Set Rs = Nothing
	Call CloseConn()
	Response.End()
End If
%>