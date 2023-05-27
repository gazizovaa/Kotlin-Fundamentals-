import java.util.Scanner

fun main() {
    var con = Scanner(System.`in`)
    var n = con.nextLong()
    var m = con.nextLong()

    var hotelRooms = 3 * (n - 1) * m
    print(hotelRooms)
}