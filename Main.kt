fun main(args: Array<String>) {
//atividade1()
//    atividade2()
}
fun atividade1(): Unit {

    println("Digite o número de crianças nacidadas:")
    val num1 = readLine()!!.toFloat()
    println("Digite o número de habitantes:")
    val num2 = readLine()!!.toFloat()
    println("Digite o número de óbito")
    val num3 = readLine()!!.toFloat()

    println("Calcule as taxas de:\n1 - Natalidade\n2 - Mortalidade")
    when(readLine()!!.toInt()) {
        1 -> println("A taxa de natalidade é ${num1 * 1000 / num2}")
        2 -> println("A taxa de mortalidade é ${num3 * 1000 / num2}")
    }

}

fun atividade2(): Unit{
    println("Digite o valor da compra:")
    val pagamento = readLine()!!.toFloat()

    println("Digite a forma de pagamento:\n1 - Á vista\n2 - Á prazo de 30 dias\n3 - Á prazo parcelado")

    when(readLine()!!.toInt()){
        1 -> println("Total do pagamento ${pagamento - pagamento * 0.10}")
        2 -> println("Total do pagamento ${pagamento - pagamento * 0.03}")
        3 -> println("Total do pagamento ${pagamento - pagamento * 0.015}")
    }
}