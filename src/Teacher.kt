class Teacher (var Subject: String,
               firstName: String,
               lastName: String):
		Person(firstName, lastName){
	
	init {
	
	}
}

class BusinessPerson(var company: String,
                     firstName: String,
                     lastName: String):
		Person(firstName, lastName){
	init {
	
	}
}
