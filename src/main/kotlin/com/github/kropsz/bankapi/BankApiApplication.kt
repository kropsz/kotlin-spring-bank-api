package com.github.kropsz.bankapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BankApiApplication

fun main(args: Array<String>) {
	runApplication<BankApiApplication>(*args)
}
