/**
 * 
 */
function withoutStrict()
{
	tempF = document.getElementsByName('tempfahren')[0].value;
	document.getElementsByName('tempCelsius')[0].value = (tempF - 32) / 1.8; 
}


function withStrict()
{
	"use strict";
	tempF = document.getElementsByName('tempfahren')[0].value;
	document.getElementsByName('tempCelsius')[0].value = (tempF - 32) / 1.8; 
}