package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KbootNativeApplication

fun main(args: Array<String>) {
	runApplication<KbootNativeApplication>(*args)
}
