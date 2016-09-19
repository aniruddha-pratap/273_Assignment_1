/**
 * 
 */
function multiply(a,b)
{
	try
	{
		var result = 0;
		result = Number(a) * Number(b);
		var convertedResult = result.toString();
		if(convertedResult.length>10)
			throw "Digits Exceed: This calculation can give result only upto 10 digits";
		else
		{
			document.getElementById('result').innerHTML = "The result is: " + convertedResult;
		}
		
	}
	catch (e)
	{
		document.getElementById('result').innerHTML = e;
	}
	finally
	{
		document.getElementsByName('first')[0].value = "";
		document.getElementsByName('second')[0].value = "";
	}
		
}

function divide(a,b)
{
	try
	{
		var result = 0;
		result = Number(a) / Number(b);
		document.getElementById('result').innerHTML = "The result is: " + result;
	}
	catch (e)
	{
		document.getElementById('result').innerHTML = e;
	}
	finally
	{
		document.getElementsByName('first')[0].value = "";
		document.getElementsByName('second')[0].value = "";
	}
}

function add(a,b)
{
	try
	{
		var result = 0;
		result = Number(a) / Number(b);
		document.getElementById('result').innerHTML = "The result is: " + result;
	}
	catch (e)
	{
		document.getElementById('result').innerHTML = e;
	}
	finally
	{
		document.getElementsByName('first')[0].value = "";
		document.getElementsByName('second')[0].value = "";
	}
}

function subtract(a,b)
{
	try
	{
		var result = 0;
		result = Number(a) - Number(b);
		if(result<0)
			throw "First Numer should be greater than Second Number";
		else
		{
			document.getElementById('result').innerHTML = "The result is: " + result;
		}
		
	}
	catch (e)
	{
		document.getElementById('result').innerHTML = e;
	}
	finally
	{
		document.getElementsByName('first')[0].value = "";
		document.getElementsByName('second')[0].value = "";
	}
}