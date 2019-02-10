package ru.vood.spring.integration.transformer

import org.springframework.messaging.handler.annotation.Headers
import org.springframework.stereotype.Component
import java.text.MessageFormat

@Component
open class TransformerOne(/*var vBdObjectTypeEntityService: VBdObjectTypeEntityService*/) {

    fun transform(code: String, @Headers headerMap: Map<String, Object>): String {
        for (key in headerMap.keys) {
            val value = headerMap[key]
            if (key !== "sequenceSize" && key !== "timestamp")
                print(MessageFormat.format("{0} : {1}. ", key, value))
        }
        println()
        println("${Thread.currentThread().name} ${this::class.java.name} -> Transform value $code")
        return "%${code.toUpperCase()}%"
    }
}