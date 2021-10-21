fun main() {
	
	/**
	 * @author Justin McMahon
	 * date: 10/18/21
	 *
	 * @fun
	 * addNewCustomer: asks user what type of customer
	 * to select and runs res or commerc function based on selction
	 *
	 * getResideentialData(): Residential: Residential asks user residential information
	 * and returns a Residential class object
	 *
	 * getCommercialData(): Commercial - Commercial asks user residential information
	 * and returns a Commercial class object
	 */
	// notes
//	var person1 = Person("John", "Doe")
//	var person2 = Teacher("Math", "James", "Quick")
//	var person3 = BusinessPerson("Vandele Industries", "Cosmo", "Kramer")
	
	val customer1 = Residential(false, "James", "956-658-9586", "223 applebee st", 1000.00)
	
	val customer2 = Commercial(true,"The Downs",
		"George","956-658-9586", "1923 applebee st", 1000.00)
	
	val customer3 = Residential(true, "Jessica", "964-658-9586", "1823 applebee st", 2300.00)
	
	val customer4 = Commercial(true,"MagMile",
		"Beth","866-658-9586","8845 Taylor st",2500.00)
	
	println(customer1.getResidentialInfo())
	println(customer2.getCommercialInfo())
	println(customer3.getResidentialInfo())
	println(customer4.getCommercialInfo())
	
	addNewCustomer()
}

fun addNewCustomer() {
	print("Adding a new Customer. Please choose:")
	println("\n1. Residential\n" +
			"2. Commercial\n")
	val selectionNum: Int = readLine()!!.toInt()

	when(selectionNum) {
		1 -> println(getResideentialData().getResidentialInfo())
		2 -> println(getCommercialData().getCommercialInfo())
	}
}

fun getResideentialData(): Residential {
	val senior: Boolean
	print("Is this customer a Senior? please enter Y or N\n")
	val answer = readLine().toString().uppercase()
	senior = answer == "Y"
	print("Name\n")
	val name = readLine()!!.toString()
	print("Phone\n")
	val phone = readLine()!!.toString()
	print("Address\n")
	val address = readLine()!!.toString()
	print("Square footage\n")
	val squareFootage  = readLine()!!.toDouble()
	val customer = Residential(senior, name, phone, address, squareFootage)
	return customer
}

fun getCommercialData(): Commercial {
	print("Does this customer own multiple properties? please enter Y or N\n")
	val multiProp: Boolean = readLine().toString().uppercase() == "Y"
	print("property name:\n")
	val propName = readLine()!!.toString()
	print("Name\n")
	val name = readLine()!!.toString()
	print("Phone\n")
	val phone = readLine()!!.toString()
	print("Address\n")
	val address = readLine()!!.toString()
	print("Square footage\n")
	val squareFootage  = readLine()!!.toDouble()
	val customer = Commercial(multiProp, propName, name, phone, address, squareFootage)
	return customer
}