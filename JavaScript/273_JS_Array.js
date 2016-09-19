/**
 * 
 */

function sortAray()
{
	var textInputted = document.getElementsByName('sortNumbers')[0].value;
	var unsortedArray = textInputted.split(" ");
	var arrayLength = unsortedArray.length;
	var temp;
	for(var a = (arrayLength -1); a >= 0; a--)
	{
		for(var b = (arrayLength - a); b >0 ; b-- )
		{
			pt = unsortedArray[b];
			st = unsortedArray[b-1];
			if(Number(unsortedArray[b])<Number(unsortedArray[b-1]))
			{
				temp = unsortedArray[b];
				unsortedArray[b] = unsortedArray[b-1];
				unsortedArray[b-1] = temp;
			}	
		}
		
	}
	document.getElementsByName('sortedNumbers')[0].value = unsortedArray;
}