/**
 * 
 */
function AddtoCart()
{
	var item = document.getElementsByName('itemName')[0].value;
	var quantity = document.getElementsByName('quant')[0].value;
	localStorage.setItem(item, quantity);
}

function ModifyinCart() 
{
	var item = document.getElementsByName('itemName')[0].value;
	document.getElementsByName('quant')[0].value = localStorage.getItem(item);
}

function RemovefromCart() 
{
	var item = document.getElementsByName('itemName')[0].value;
	document.getElementsByName('quant')[0].value = localStorage.removeItem(item);
}

function showCart()
{
	var cart = "";
	for (var i = 0; i <= localStorage.length - 1; i++) 
	{
		var item = localStorage.key(i);
		var quantity = localStorage.getItem(item);
		cart = cart + "<br>" + "Item: " + item + " " + "Quantity: " + quantity;
	}
	document.getElementById('showCart').innerHTML = cart;
}

function clearCart()
{
	localStorage.clear();
	document.getElementById('showCart').innerHTML = "";
}