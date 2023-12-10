fun main(args: Array<String>) {
    val amount = 40000
    val transferFee = if ((amount * 0.0075) < 35) 35 else amount * 0.0075
    println(transferFee)
}