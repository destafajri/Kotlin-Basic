fun main() {
    var age: Byte = 30
    var int: Int = 200
    var long: Long= 200000000
    var float: Float= 20.22F
    var double: Double= 90.9999999999

    println("age " + age)
    println("int " + int)
    println("long " + long)
    println("float " + float)
    println("double " + double)

    //literal
    var hexadecimal: Int = 0x0000ABCFF
    var binary: Int = 0b01010001

    println("hexadecimal " + hexadecimal)
    println("binary " + binary)


    //casting atau convertion

    var ageInt: Int= age.toInt()
    var ageLong: Long= ageInt.toLong()

    println("conversion age byte to int " + ageInt)
    println("conversion age int to long " + ageLong)


}