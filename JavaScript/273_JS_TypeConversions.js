/**
 * 
 */

function feeCalculator()
{
	var noOfCredits = document.getElementsByName('creditEnrolled')[0].value;
	var chargesPerCredit = document.getElementsByName('feesPerCredit')[0].value;
	var diningFees = document.getElementsByName('diningCharges')[0].value;
	var parkingFees = document.getElementsByName('parkingCharges')[0].value;
	var totalTuition = noOfCredits * chargesPerCredit;
	var totalDiningFees = diningFees * 2; 
	var totalAnnualFees =  Number(totalTuition) + Number(totalDiningFees) + Number(parkingFees);
	document.getElementsByName('totalFees')[0].value = totalAnnualFees;
}