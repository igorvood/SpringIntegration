package ru.vood.spring.integration.transformer

import org.springframework.stereotype.Component

@Component
open class TransformerOne(/*var vBdObjectTypeEntityService: VBdObjectTypeEntityService*/) {

    fun transform(code: String): String {
        println("${Thread.currentThread().name} ${this::class.java.name} -> Transform value $code")
        return "%${code.toUpperCase()}%"
    }
}