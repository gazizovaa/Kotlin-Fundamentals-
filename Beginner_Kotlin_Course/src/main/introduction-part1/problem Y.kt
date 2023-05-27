import java.util.*

fun main() {
    var con = Scanner(System.`in`)
    var a = con.nextLong()
    var b = con.nextLong()
    var c = con.nextLong()

    var numberOfBatteries = c / (a - b)
    print(numberOfBatteries)
}