import java.util.*

fun main() {
    var con = Scanner(System.`in`)
    var a = con.nextLong()
    var b = con.nextLong()
    var c = ((a + 1) * a) / 2
    var d = ((b + 1) * b) / 2

    var sum = d - c + a
    print(sum)
}