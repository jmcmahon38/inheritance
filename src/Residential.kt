// residential class has an isSenior attribute to help calc pricing
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