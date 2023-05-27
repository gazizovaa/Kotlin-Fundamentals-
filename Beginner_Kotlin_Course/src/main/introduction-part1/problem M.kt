import java.util.Scanner

fun main() {
    var con = Scanner(System.`in`)
    var n = con.nextInt()
    var firstDigit = n / 10
    var secondDigit = n % 10

    var squareOfSum = (firstDigit + secondDigit) * (firstDigit + secondDigit)
    println(squareOfSum)
}