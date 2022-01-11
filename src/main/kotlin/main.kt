import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    println("- Калькулятор скидок -")
    while (true) {
        val discount: Int
        val additionalDdiscount: Int
        val finalDdiscount: Int
        val finalPrice: Int
        print("Введите сумму покупки или 0 для завершения: ")
        val price = scanner.nextInt()
        if (price == 0){
            break
        }else if (price > 10_000) {
            discount = price / 100 * 5
        } else if (10_001 > price && price > 1_000) {
            discount = 100
        } else discount = 0
        print("Клиент совершал за последний месяц покупки?(y/n): ")
        val meloman = readln()
        if (meloman == "y") {
            additionalDdiscount = (price - discount) / 100 * 1
            finalDdiscount = discount + additionalDdiscount
            finalPrice = price - finalDdiscount
        } else {
            finalDdiscount = discount
            finalPrice = price - finalDdiscount
        }
        println("Итого к оплате $finalPrice руб., скидка составила $finalDdiscount руб.")
        println()
        println("Нажмите Enter")
        readln()
    }
}