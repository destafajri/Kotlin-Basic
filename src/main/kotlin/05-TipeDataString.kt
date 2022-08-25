fun main() {
    var name: String= "Desta"

    //multi lane
    var address: String="""
        Purwokerto,
        Cantral Java,
        Indonesia.
        """

    var addressTrim: String="""
        |Purwokerto,
        |Cantral Java,
        |Indonesia.
        """.trimMargin()

    println(name)
    println(address)
    println(addressTrim)

    //String Template
    var firstName: String= "Desta"
    var lastName: String= "Fajri"
    var fullName: String= "$firstName $lastName"

    var description: String= "$fullName, length string ${fullName.length}"

    println(fullName)
    println(description)
}