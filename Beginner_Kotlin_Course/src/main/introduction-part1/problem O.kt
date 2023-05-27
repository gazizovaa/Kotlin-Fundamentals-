import java.util.Scanner

fun main() {
    var con = Scanner(System.`in`)
    var n = con.nextInt()
    var firstDigit = n / 100
    var lastDigit = n % 10

    var resultWithoutTheMiddle = (firstDigit * 10) + lastDigit
    println(resultWithoutTheMiddle)
}