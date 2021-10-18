open class Person (
    firstName: String,
    lastName: String) {
    var firstName: String = ""
        get() = field
        set(value) {
            field = value
            fullName = setFullName()
        }
    var lastName: String = ""
        get() = field
        set(value) {
            field = value
            fullName = setFullName()
        }

    var fullName: String = ""

    init {
        this.firstName = firstName
        this.lastName = lastName
        fullName = fullName
    }

    fun setFullName(): String {
        return "$firstName $lastName"
    }
}