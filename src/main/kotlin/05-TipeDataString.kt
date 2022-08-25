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
}