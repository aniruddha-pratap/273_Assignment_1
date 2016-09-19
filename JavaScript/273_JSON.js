/**
 * 
 */
function fetchData()
{
	var url = "http://data.consumerfinance.gov/api/views.json";
	var jsXML = new XMLHttpRequest();
	
	
  jsXML.onreadystatechange = function(){
	  
	if(this.readyState == 4 && this.status==200)
	{
		retrieveData(this.responseText);
	}
  };
  
  jsXML.open("GET", url, true);
  jsXML.send();
  
  function retrieveData(fetchResponse)
  {
	  var info = "";
	  var retrieveInfo = JSON.parse(fetchResponse);
	  for(var i =1; i<retrieveInfo.length; i++)
	  {
		  info = info + "The heading of complaint is: "+retrieveInfo[i].name+"<br>Id: "+retrieveInfo[i].id+"  Created:  "+retrieveInfo[i].createdAt+"  Category: "+retrieveInfo[i].category+"<br>";
	  }  
	  document.getElementById('retrieve').innerHTML = info;
  }
  
}