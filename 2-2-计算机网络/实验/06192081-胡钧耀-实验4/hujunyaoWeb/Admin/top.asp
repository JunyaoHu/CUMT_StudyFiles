<style type="text/css">
#showMsg{
	width:200px;
	position:absolute;
	top:30px;
	right:28px;
	border:solid 1px #666666;
	padding:8px;
	color:#FF0000;
	background-color:#FFFFFF;
	z-index:1000;
}
</style>
<script language="javascript">
String.prototype.trim = function(){ return this.replace(/(^\s*)|(\s*$)/g, "");}

//显示错误信息
function ShowErrMsg(Info)
{
	document.getElementById("showMsg").innerHTML = Info;
}

window.onscroll = function()   
{   
	var t = document.body.scrollTop + 30;     
	document.getElementById("showMsg").style.top = t + "px";
}
</script>

<table cellspacing="0" cellpadding="5" width="100%" bgcolor="#fda700" 
border="0" style="border-bottom:2px solid #CCCCCC;border-top:2px solid #CCCCCC;">
  <tbody>
    <tr>
      <td nowrap="nowrap" width="2%"></td>
      <td nowrap="nowrap" width="2%"><a title="后退" href="javascript:history.back();"><img 
      height="15" src="images/jiantou-Control-a1.jpg" width="16" 
    border="0" /></a></td>
      <td nowrap="nowrap" width="89%"><table cellspacing="0" cellpadding="0" width="100%" border="0">
        <tbody>
          <tr>
            <td align="center">&nbsp;</td>
            </tr>
        </tbody>
      </table></td>
      <td valign="bottom" nowrap="nowrap" width="4%" height="22"><a title="前进" 
      href="javascript:history.go(1);"><img height="16" 
      src="images/jiantou-Control-b2.jpg" width="15" align="right" border="0" /> </a>&nbsp; </td>
      <td nowrap="nowrap" align="right" width="3%">&nbsp;</td>
    </tr>
  </tbody>
</table>
