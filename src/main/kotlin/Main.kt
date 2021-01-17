const val TRANSFER_FEE = 0.0075
const val MINIMUM_COMISSION = 3_500.00

fun main(args: Array<String>) {
    val amount = 19_999

    val amountFee = calcAmountFee(amount, TRANSFER_FEE, MINIMUM_COMISSION)

    val finalAmountFee = Math.round(amountFee).toInt()

    println("\tСумма перевода: ${amount / 100}руб. ${amount % 100}коп." +
            "\n\tКомиссия к оплате: ${finalAmountFee / 100}руб. ${finalAmountFee % 100}коп.")
}

fun calcAmountFee(amount: Int, TRANSFER_FEE: Double, MINIMUM_COMISSION: Double): Double {
    return if (amount * TRANSFER_FEE <= MINIMUM_COMISSION) {
        MINIMUM_COMISSION
    } else {
        amount * TRANSFER_FEE
    }
}