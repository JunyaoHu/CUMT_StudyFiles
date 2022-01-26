<%
Class TurnPage
	Dim sPageNo,sPageSize,sPageCount,sRecordCount,sAbsoluteRecord
	
	Private Sub Class_Initialize()
		sPageNo=Trim(Request.QueryString("PageNo"))
		If sPageNo<>"" Then
			sPageNo = Cdbl(sPageNo)
			Else
				sPageNo = 1
		End If
		sAbsoluteRecord = 1
	End Sub

	Public Sub GetRs(ByRef Conn,ByRef Rs,ByVal Sql,ByVal PageSize)
		Rs.Open Sql,Conn,1,1
		
		Rs.PageSize		= PageSize
		sPageSize		= Rs.PageSize
		sPageCount		= Rs.PageCount
		sRecordCount	= Rs.RecordCount
		
		If Not Rs.Eof Then Rs.AbsolutePage = sPageNo
	End Sub
	
	Public Function Eof()
		If sAbsoluteRecord<=sPageSize Then
			'sAbsoluteRecord = sAbsoluteRecord + 1
			Eof = False
			Else
				Eof = True
		End If
	End Function
	
	Public Sub MoveNext()
		sAbsoluteRecord = sAbsoluteRecord + 1
	End Sub
	
	
	Public Sub GetPageList()
		Dim sURL,sTmp,sQUERY_STRING,p,n,i,a,b
		
		sURL = Request.ServerVariables("URL")
		sQUERY_STRING = Request.ServerVariables("QUERY_STRING")
		sTmp = Split(sURL,"/")
		sURL = sTmp(Ubound(sTmp))
		If sQUERY_STRING <> "" Then	sQUERY_STRING=Replace(sQUERY_STRING,"PageNo=" & sPageNo,"")
		If sQUERY_STRING = "" Then
			sURL = sURL & "?"
			Else
				sURL = sURL & "?" & sQUERY_STRING & "&"
		End If
		sURL = Replace(sURL,"&&","&")
		
		p = sPageNo-1
		n = sPageNo+1
		If p<1 Then p = 1
		If n>sPageCount Then n = sPageCount
		
		a = sPageNo-3
		b = sPageNo+3
		If a<1 Then a = 1
		If b>sPageCount Then b = sPageCount
				
		Response.Write("<div class=""page_nav"">")
		
		Response.Write("<a href=""" & sURL & "PageNo=1"">Ê×Ò³</a> <a href=""" & sURL &"PageNo=" & p & """>ÉÏÒ³</a>")
		
		For i=a To b
			Response.Write(" <a href=""" & sURL & "PageNo=" & i & """")
			If i = sPageNo Then	Response.Write(" style=""font-weight:bold; color:#FF0000;""")
			Response.Write(">" & i & "</a>")
		Next
		Response.Write(" <a href=""" & sURL & "PageNo=" & n & """>ÏÂÒ³</a> <a href=""" & sURL & "PageNo=" & sPageCount & """>Ä©Ò³</a>")

		Response.Write("</div>")
	End Sub
	
	Public Sub GetPageHtmlList(BaseURL)		
		Dim p,n,i,a,b
				
		p = sPageNo-1
		n = sPageNo+1
		If p<1 Then p = 1
		If n>sPageCount Then n = sPageCount
		
		a = sPageNo-3
		b = sPageNo+3
		If a<1 Then a = 1
		If b>sPageCount Then b = sPageCount
				
		Response.Write("<div class=""page_nav"">")
		
		'If sPageNo>1 Then
			If p=1 Then
				Url = BaseURL
				Else
					Url = BaseURL & "_" & p
			End If
			Response.Write("<a href=""" & BaseURL & ".html"">Ê×Ò³</a> <a href=""" & Url & ".html"">ÉÏÒ³</a>")
		'End If
		
		For i=a To b
			If i=1 Then
				Url = BaseURL
				Else
					Url = BaseURL & "_" & i
			End If
			Response.Write(" <a href=""" & Url & ".html""")
			If i = sPageNo Then	Response.Write(" style=""font-weight:bold; color:#FF0000;""")
			Response.Write(">" & i & "</a>")
		Next
		'If sPageNo < sPageCount Then 
			If n=1 Then
				Url = BaseURL
				Else
					Url = BaseURL & "_" & n
			End If
			If sPageCount=1 Then
				Url2 = BaseURL
				Else
					Url2 = BaseURL & "_" & sPageCount
			End If
			Response.Write(" <a href=""" & Url & ".html"">ÏÂÒ³</a> <a href=""" & Url2 & ".html"">Ä©Ò³</a>")
		'End If
		
		Response.Write("</div>")
	End Sub
	
	Public Sub PageAspList(sURL)
		Dim p,n,i,a,b
		
		p = sPageNo-1
		n = sPageNo+1
		If p<1 Then p = 1
		If n>sPageCount Then n = sPageCount
		
		a = sPageNo-5
		b = sPageNo+5
		If a<1 Then a = 1
		If b>sPageCount Then b = sPageCount
				
		Response.Write("<div class=pager><UL>")
		Response.Write("<LI class=p_total>" & sPageNo & "/" & sPageCount & "</LI>")
		Response.Write("<li><a href=""" & sURL & "PageNo=1"">&laquo;</a></li><li><a href=""" & sURL &"PageNo=" & p & """>&#8249;</a></li>")
		
		For i=a To b
			If i = sPageNo Then
				Response.Write("<LI class=p_current> " & i & "</LI>")
			Else
				Response.Write("<li><a href=""" & sURL & "PageNo=" & i & """>" & i & "</a></li>")
			End If
		Next
		Response.Write("<li><a href=""" & sURL & "PageNo=" & n & """>&#8250;</a></li><li><a href=""" & sURL & "PageNo=" & sPageCount & """>&raquo;</a></li>")

		Response.Write("</UL></div>")
	End Sub
End Class
%>