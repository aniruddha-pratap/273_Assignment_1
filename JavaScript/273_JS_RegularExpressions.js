/**
 * 
 */
function searchText() 
{
	var searchPattern = new RegExp(document.getElementsByName('searchThis')[0].value);
	if(document.getElementsByName('textEntered')[0].value.match(searchPattern))
		alert("Match Found");
	else
	{
		alert("Not Found");
	}
}

function replaceText()
{
	var searchPattern = new RegExp(document.getElementsByName('searchThis')[0].value, "g");
	document.getElementsByName('textEntered')[0].value = document.getElementsByName('textEntered')[0].value.replace(searchPattern,document.getElementsByName('replacebyThis')[0].value);
}