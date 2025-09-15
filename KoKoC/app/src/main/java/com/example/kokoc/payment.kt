package com.example.kokoc

// Базовый класс
open class Payment(val amount: Double) {
    open fun process() {
        println("Processing payment of $amount")
    }
}

// Наследники
class CreditCardPayment(amount: Double) : Payment(amount) {
    override fun process() {
        println("Paid $amount with credit card")
    }
}

class PaypalPayment(amount: Double) : Payment(amount) {
    override fun process() {
        println("Paid $amount via PayPal")
    }
}

class BankTransferPayment(amount: Double) : Payment(amount) {
    override fun process() {
        println("Paid $amount via bank transfer")
    }
}

// Функция для проведения транзакции
fun makeTransaction(payment: Payment) {
    payment.process()
}

// Тест
fun main() {
    val payments = listOf(
        CreditCardPayment(100.0),
        PaypalPayment(250.5),
        BankTransferPayment(500.0),
        Payment(75.0) // базовый класс
    )

    for (p in payments) {
        makeTransaction(p)
    }
}
