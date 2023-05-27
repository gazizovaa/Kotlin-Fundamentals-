import java.util.Scanner

fun main() {
    var con = Scanner(System.`in`)
    var n = con.nextInt()
    var a = n / 100
    var b = (n / 10) % 10
    var c = n % 10

    var product = a * b * c
    println(product)
}