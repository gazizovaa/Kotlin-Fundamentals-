import java.util.Scanner

fun main() {
    var con = Scanner(System.`in`)
    var n = con.nextInt()
    var firstDigit = n / 100
    var secondDigit = (n / 10) % 10
    var lastDigit = n % 10

    var result = (lastDigit * 100) + (secondDigit * 10) + firstDigit
    println(result)
}