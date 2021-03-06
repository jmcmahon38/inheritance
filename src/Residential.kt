// residential class has an isSenior attribute to help calc pricing

/**
 * Class Residential
 * @author Justin McMahon
 * date: 10/18/21
 * @param
 * name, address, phone, and squarefoot are inhereted from Customer class
 *
 * isSenior determines a discount for the getWeeklyCharges
 * residential rate is constant at 6 should be val actually
 *
 * @method
 * getresidentail info gets all fields for residential customer
 * getWeeklyCharges calculates charges for the week for the customer.
 *
 */
class Residential(
	isSenior: Boolean,
	customerName: String,
	customerPhone: String,
	customerAddress: String,
	squareFootage: Double,
	residentialRate: Int = 6):
	Customer(customerName, customerPhone, customerAddress, squareFootage){
	var isSenior: Boolean = isSenior
		get() = field
		set(value) {
			field = value
		}
	var residentialRate: Int = residentialRate
		get() = field
		set(value) {
			field = value
		}
	init {
		println("Creating residential customer $customerName")
	}
	fun getResidentialInfo(){
		println("*****" +
				"Customer name: $customerName\n" +
				"Customer Phone: $customerPhone\n" +
				"Customer Address: $customerAddress\n" +
				"Square Footage: $squareFootage\n" +
				"Senior Status: $isSenior\n" +
				"Current Rate: ${getWeeklyCharges()}\n" +
				"*****")
	}
	fun getWeeklyCharges(): String {
		var weeklyCharges: Double = residentialRate * (squareFootage/1000.00)
		if (isSenior) {
			weeklyCharges -= (weeklyCharges * 0.15)
			return "%.2f".format(weeklyCharges)
		}
		else {
			return "%.2f".format(weeklyCharges)
		}
	}
}