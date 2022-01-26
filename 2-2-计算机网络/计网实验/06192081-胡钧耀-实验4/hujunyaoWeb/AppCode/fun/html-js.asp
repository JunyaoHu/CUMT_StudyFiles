<script language=javascript runat=server>

function htmltojs(str){
str="document.writeln(\""+str.replace(/\\/g,"\\\\").replace(/\//g,"\\/").replace(/\'/g,"\\\'").replace(/\"/g,"\\\"").split('\r\n').join("\");\ndocument.writeln(\"")+"\");"
return(str);
 } 

function jstohtml(str){
str=str.replace(/document.writeln\("/g,"").replace(/"\);/g,"").replace(/\\\"/g,"\"").replace(/\\\'/g,"\"").replace(/\\\//g,"\/").replace(/\\\\/g,"\\")
return(str);
 }

</script>