<%@LANGUAGE="VBSCRIPT" CODEPAGE="936"%>
<%Const dbdns="../"%>
<!--#include file="chk.asp"-->
<!--#include file="../AppCode/fun/function.asp"-->

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>后台管理系统</title>
<link rel="stylesheet" type="text/css" href="images/Style.css">
</head>

<body>
<!--#include file="top.asp"-->
<br />
<table cellspacing="0" cellpadding="0" width="98%" align="center" border="0">
  <tbody>
    <tr>
      <td style="PADDING-LEFT: 2px; HEIGHT: 22px" 
    background="images/tab_top_bg.gif"><table cellspacing="0" cellpadding="0" width="477" border="0">
        <tbody>
          <tr>
            <td width="147"><table height="22" cellspacing="0" cellpadding="0" border="0">
              <tbody>
                <tr>
                  <td width="3"><img id="tabImgLeft__0" height="22" 
                  src="images/tab_active_left.gif" width="3" /></td>
                  <td 
                background="images/tab_active_bg.gif" class="tab"><strong class="mtitle">获取外部代用代码</strong></td>
                  <td width="3"><img id="tabImgRight__0" height="22" 
                  src="images/tab_active_right.gif" 
            width="3" /></td>
                </tr>
              </tbody>
            </table></td>
          </tr>
        </tbody>
      </table></td>
    </tr>
    <tr>
      <td bgcolor="#ffffff"><table cellspacing="0" cellpadding="0" width="100%" border="0">
        <tbody>
          <tr>
            <td width="1" background="images/tab_bg.gif"><img height="1" 
            src="images/tab_bg.gif" width="1" /></td>
            <td 
          style="PADDING-RIGHT: 10px; PADDING-LEFT: 10px; PADDING-BOTTOM: 10px; PADDING-TOP: 10px" 
          valign="top"><div id="tabContent__0" style="DISPLAY: block; VISIBILITY: visible">
              <table cellspacing="1" cellpadding="1" width="100%" align="center" 
            bgcolor="#8ccebd" border="0">
                <tbody>
                  <tr>
                    <td 
                style="PADDING-RIGHT: 10px; PADDING-LEFT: 10px; PADDING-BOTTOM: 10px; PADDING-TOP: 10px" 
                valign="top" bgcolor="#fffcf7">
                    <table border="0" cellpadding="5" cellspacing="1" bgcolor="#CCCCCC"><form name="form1" method="post" action="">
                      <tr>
                        <td align="right" bgcolor="#FFFFFF">分类ID：</td>
                        <td bgcolor="#FFFFFF"><input name="cid" type="text" id="cid" size="8"></td>
                      </tr>
                      <tr>
                        <td align="right" bgcolor="#FFFFFF">显示行数×列数：</td>
                        <td bgcolor="#FFFFFF"><input name="rx" type="text" id="rx" value="10" size="8">
                          ×
                          <input name="cx" type="text" id="cx" value="1" size="8"></td>
                      </tr>
                      <tr>
                        <td align="right" bgcolor="#FFFFFF">每一条最多字数：</td>
                        <td bgcolor="#FFFFFF"><input name="lx" type="text" id="lx" value="50" size="8"></td>
                      </tr>
                      
                      <tr>
                        <td align="right" bgcolor="#FFFFFF">是否推荐：</td>
                        <td bgcolor="#FFFFFF"><input name="cmd" type="checkbox" id="cmd" value="1"></td>
                      </tr>
                      <tr>
                        <td align="right" bgcolor="#FFFFFF">是否显示时间：</td>
                        <td bgcolor="#FFFFFF"><input name="dt" type="checkbox" id="dt" value="1"></td>
                      </tr>
                      <tr>
                        <td align="right" bgcolor="#FFFFFF">时间格式：</td>
                        <td bgcolor="#FFFFFF"><select name="ft" id="ft">
                          <option value="0" selected>0</option>
                          <option value="1">1</option>
                          <option value="2">2</option>
                          <option value="3">3</option>
                          <option value="4">4</option>
                          <option value="5">5</option>
                        </select>                        </td>
                      </tr>
                      <tr>
                        <td align="right" bgcolor="#FFFFFF">是否显示点击数：                          </td>
                        <td bgcolor="#FFFFFF"><input name="dh" type="checkbox" id="dh" value="1"></td>
                      </tr>
                      <tr>
                        <td align="right" bgcolor="#FFFFFF">排序方式：</td>
                        <td bgcolor="#FFFFFF"><select name="op" id="op">
                          <option value="new" selected>默认</option>
                          <option value="new">最新</option>
                          <option value="hot">热门</option>
                          <option value="rnd">随机</option>
                        </select>                        </td>
                      </tr>
                      <tr>
                        <td align="right" bgcolor="#FFFFFF">字体大小：</td>
                        <td bgcolor="#FFFFFF"><input name="size" type="text" id="size" value="14" size="8">
                          px</td>
                      </tr>
                      <tr>
                        <td align="right" bgcolor="#FFFFFF">链接字体颜色：</td>
                        <td bgcolor="#FFFFFF">#
                          <input name="color" type="text" id="color" value="0000FF" size="8"></td>
                      </tr>
                      <tr>
                        <td align="right" bgcolor="#FFFFFF">鼠标指向字体颜色：</td>
                        <td bgcolor="#FFFFFF">#
                          <input name="mcolor" type="text" id="mcolor" value="FF0000" size="8"></td>
                      </tr>
                      <tr>
                        <td align="right" bgcolor="#FFFFFF">链接是否有下划线：</td>
                        <td bgcolor="#FFFFFF"><input name="uline" type="checkbox" id="uline" value="1" checked></td>
                      </tr>
                      <tr>
                        <td align="right" bgcolor="#FFFFFF">每一行的高度：</td>
                        <td bgcolor="#FFFFFF"><input name="hline" type="text" id="hline" value="22" size="8">
                          px</td>
                      </tr>
                      <tr>
                        <td align="right" bgcolor="#FFFFFF">背景颜色：</td>
                        <td bgcolor="#FFFFFF">#
                          <input name="bcolor" type="text" id="bcolor" value="FFFFFF" size="8"></td>
                      </tr>
                      <tr>
                        <td align="right" bgcolor="#FFFFFF">调用框架Iframe大小：</td>
                        <td bgcolor="#FFFFFF">宽
                          <input name="iw" type="text" id="iw" value="100%" size="8">
                          ×高
                          <input name="ih" type="text" id="ih" value="200" size="8"></td>
                      </tr>
                      <tr>
                        <td align="right" bgcolor="#FFFFFF">&nbsp;</td>
                        <td bgcolor="#FFFFFF"><input type="button" name="Submit" value="生成代码" onClick="getcode(this.form)">                          </td>
                      </tr>
                      <tr>
                        <td align="right" bgcolor="#FFFFFF">调用代码：</td>
                        <td bgcolor="#FFFFFF"><textarea name="code" cols="80" rows="10"></textarea></td>
                      </tr>
                      <tr>
                        <td align="right" bgcolor="#FFFFFF">效果预览：</td>
                        <td bgcolor="#FFFFFF" id="view">&nbsp;</td>
                      </tr>
</form> 
                    </table>
                        </td>
                  </tr>
                </tbody>
              </table>
            </div></td>
            <td width="1" background="images/tab_bg.gif"><img height="1" 
            src="images/tab_bg.gif" width="1" /></td>
          </tr>
        </tbody>
      </table></td>
    </tr>
    <tr>
      <td background="images/tab_bg.gif" bgcolor="#ffffff"><img height="1" 
      src="images/tab_bg.gif" width="1" /></td>
    </tr>
  </tbody>
</table>
<script language="javascript">
function getcode(f)
{
	var s = "";
	s += "&cid=" + f.cid.value;
	s += "&rx=" + f.rx.value;
	s += "&cx=" + f.cx.value;
	s += "&lx=" + f.lx.value;
	s += "&cmd=" + f.cmd.checked;
	s += "&dt=" + f.dt.checked;
	s += "&ft=" + f.ft.value;
	s += "&dh=" + f.dh.checked;
	s += "&op=" + f.op.value;
	s += "&size=" + f.size.value;
	s += "&color=" + f.color.value;
	s += "&mcolor=" + f.mcolor.value;
	s += "&uline=" + f.uline.checked;
	s += "&hline=" + f.hline.value;
	s += "&bcolor=" + f.bcolor.value;
	
	var sPath = document.location.host + document.location.pathname;
	sPath = sPath.substr(0, sPath.length-16);
	var tmp = sPath.split("/");
	var url = "http://";
	for(var i=0;i<tmp.length-2;i++)
		url = url + tmp[i] + "/";
	f.code.value = '<iframe scrolling="no" src="' + url + "inc/a.asp?u=ok3w" + s + '" frameborder="0" width="' + f.iw.value + '" height="' + f.ih.value + '"></iframe>';
	view.innerHTML = f.code.value;
}
</script>
</body>
</html>
<%
Call CloseConn()
Set Admin = Nothing
%>

