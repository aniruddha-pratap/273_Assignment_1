/**
 * 
 */
function eventOnFocus(element) {
    element.style.background = "yellow";
}

function eventOnChange(element){
	element.style.background = "white";
}

function eventOnMouseOver(element) {
    element.style.width = "100px";
}

function eventOnMouseOut(element) {
    element.style.width = "70px";
}

function displayInfo()
{
	var make = document.getElementsByName('vehicle_make')[0].value;
	var model= document.getElementsByName('vehicle_model')[0].value;
	var year = document.getElementsByName('vehicle_year')[0].value;
	var mileage = document.getElementsByName('vehicle_mileage')[0].value;
	document.getElementById('result').innerHTML = "We found a match with the following specification:\n" + "Make : "+make+"\nModel: "+model+"\nYear: "+year+"\nMileage: "+mileage+"\nPlease visit us for more exciting offers";
	
}