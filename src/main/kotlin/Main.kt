fun main(args: Array<String>) {

    val sumBye = 11_236_63
    val coins = 100
    val discount = 100
    val discountPercent = 0.05
    val discountRegular = 0.01
    val regularClient = true
    var check = sumBye

    if (sumBye/coins > 1000) check = sumBye - discount * coins
    if (sumBye/coins > 10000) check = (check - check * discountPercent).toInt()
    if (regularClient) check = (check - check * discountRegular).toInt()

    println("Чек на сумму: ${check/coins} руб. ${check%coins} коп.\nСкидка: "
            + "${(sumBye - check)/coins} руб. ${(sumBye - check)%coins} коп.")

}
