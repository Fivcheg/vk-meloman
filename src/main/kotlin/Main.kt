fun main(args: Array<String>) {
    val price = 150000
    val melomanDiscount = 1
    val standartDiscount = 10000
    val maxDiscount = 5
    val melomanUser: Boolean = true
    var standartDiscountRub = standartDiscount/100
    var priceRub = price/100
    var totalPrice = if (price < 100000) {price/100} else if (price >= 100100 && price < 1000000) {(price - standartDiscount)/100} else {(price-(price/100*maxDiscount))/100}
    if (melomanUser == true) {totalPrice -= totalPrice/100*melomanDiscount}
    var messageDiscount: String = if (price < 100000) {" не предоставлена скидка"} else if (price >= 100100 && price < 1000000) {" предоставлена скидка $standartDiscountRub рублей"} else {" предоставлена скидка $maxDiscount %"}
    var messageMelomanDiscount: String = if (melomanUser == true){"Также Вам предоставлена дополнительная меломанская скидка $melomanDiscount %"} else{""}
    println("""Вы хотите потратить $priceRub рублей
        | Вам $messageDiscount
        | $messageMelomanDiscount
        | С учетом скидки тотал прайс составляет $totalPrice рублей  
    """.trimMargin())
}