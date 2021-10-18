fun main() {
	// notes
//	var person1 = Person("John", "Doe")
//	var person2 = Teacher("Math", "James", "Quick")
//	var person3 = BusinessPerson("Vandele Industries", "Cosmo", "Kramer")
	
	var customer1 = Residential(false, "James", "956-658-9586", "223 applebee st", 1000.00)
	
	var customer2 = Commercial(true,"The Downs",
		"George","956-658-9586", "1923 applebee st", 1000.00)
	
	var customer3 = Residential(true, "Jessica", "964-658-9586", "1823 applebee st", 2300.00)
	
	var customer4 = Commercial(true,"MagMile",
		"Beth","866-658-9586","8845 Taylor st",2500.00)
	
	println(customer1.getResidentialInfo())
	println(customer2.getCommercialInfo())
	println(customer3.getResidentialInfo())
	println(customer4.getCommercialInfo())
}