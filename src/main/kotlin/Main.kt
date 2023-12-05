fun main(args: Array<String>) {
    val amount = 1000
    val transferFee = if (amount < 35) amount * 0.0075 else 35
    println(transferFee)
}