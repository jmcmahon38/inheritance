// Commerical has an isMultiProperty attribute to help determine price
/**
 * Class Commercial
 * @author Justin McMahon
 * date: 10/18/21
 * @param
 *
 * isMultiProperty determines a discount for the getWeeklyCharges
 * customer rate is constant at 5 should be val actually
 *
 * @method
 * getCommercialInfo info gets all fields for commercial customer
 * getWeeklyCharges calculates charges for the week for the customer.
 *
 */
class Commercial(
	isMultiProperty: Boolean, // add customer ID and property object to commercial class
	propertyName: String,
	customerName: String,
	customerPhone: String,
	customerAddress: String,
	squareFootage: Double,
	commercialRate: Int = 5):
	Customer(customerName, customerPhone, customerAddress, squareFootage) {
	var propertyName: String = propertyName
		get() = field
		set(value) {
			field = value
		}
	var isMultiProperty: Boolean = isMultiProperty
		get() = field
		set(value) {
			field = value
		}
	var commercialRate: Int = commercialRate
		get() = field
		set(value) {
			field = value
		}
	
	init {
		println("adding Commercial customer: $customerName")
		
	}
	fun getCommercialInfo(){
		println("*****" +
				"Customer name: $customerName\n" +
				"Property Name: $propertyName\n" +
				"Customer Phone: $customerPhone\n" +
				"Customer Address: $customerAddress\n" +
				"Square Footage: $squareFootage\n" +
				"Multiproperty Status: $isMultiProperty\n"+
				"Current Rate: ${getWeeklyCharges()}\n" +
				"*****")
	}
	
	fun getWeeklyCharges (): String {
		var weeklyCharges: Double = commercialRate * (squareFootage/1000.00)
		if (isMultiProperty) {
			weeklyCharges -= (weeklyCharges * 0.10)
			return "%.2f".format(weeklyCharges)
		}
		else {
			return "%.2f".format(weeklyCharges)
		}
	}
}
