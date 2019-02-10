package ru.vood.spring.integration.transformer

import org.springframework.stereotype.Component

@Component
class TransformerTwo {
    fun transform(code: String): String {
        println("${Thread.currentThread().name} ${this::class.java.name} -> Second Transform value $code")
        return code.toUpperCase()
    }

}