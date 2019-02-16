package ru.vood.spring.integration.transformer

import org.springframework.messaging.handler.annotation.Headers
import org.springframework.stereotype.Component

@Component
open class TransformerOne(/*var vBdObjectTypeEntityService: VBdObjectTypeEntityService*/) {

    fun transform(code: String, @Headers headerMap: Map<String, Object>): String {
        println("${Thread.currentThread().name} ${this::class.java.name} -> Transform value $code headerMap-> ${transformHeaderMap(headerMap)} ")
        return "%${code.toUpperCase()}%"
    }

}

