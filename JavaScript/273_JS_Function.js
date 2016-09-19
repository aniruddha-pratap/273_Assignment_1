/**
 * 
 */
function expenditure(){
	var totalCost = 0;
	for(var i=0; i<arguments.length; i++)
	{
		totalCost = Number(totalCost) + Number(arguments[i]);
	}	
	return totalCost;
}


