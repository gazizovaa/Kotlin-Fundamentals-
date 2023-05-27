import java.util.Scanner

fun main() {
    var con = Scanner(System.`in`)
    var n = con.nextInt()
    var middle1_digit = (n / 100) % 10
    var middle2_digit = (n % 100) / 10

    var sum = (middle1_digit * 10) + middle2_digit
    println(sum)
}