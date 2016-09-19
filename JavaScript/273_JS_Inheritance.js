/**
 * 
 */
var Vehicles = function (type,distance,time){	
	this.type = type;
	this.distance= distance;
	this.time= time;
	};

Vehicles.prototype.speed = function(){
	
	this.speed= this.distance/this.time;
	return this.speed;
};

var speedofVehicle = function(){};

function calcSpeed(){
	
	var inputDistance= document.getElementsByName('Distance')[0].value;
	var inputTime= document.getElementsByName('Time')[0].value;
	var inputType = document.getElementsByName('Type')[0].value;
	
	speedofVehicle.prototype = new Vehicles(inputType,inputDistance,inputTime);
	var vehSpeed = new speedofVehicle();
	document.getElementsByName('Speed')[0].value = vehSpeed.speed();
	
}