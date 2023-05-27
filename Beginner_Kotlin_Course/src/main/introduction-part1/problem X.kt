import java.util.Scanner

fun main() {
    var con = Scanner(System.`in`)
    var n = con.nextLong()
    var a = con.nextLong()
    var b = con.nextLong()

    var blueBalloon = (a + b) - n
    var yellowBalloon = a - blueBalloon
    var redBalloon = b - blueBalloon

    var result = "$blueBalloon " + "$redBalloon "  + "$yellowBalloon"
    print(result)
}