package ru.vood.spring.integration.splitter

import org.springframework.stereotype.Component
import ru.vood.spring.integration.service.VBdObjectTypeEntityService
import java.util.*

@Component
class SplitterOne(var vBdObjectTypeEntityService: VBdObjectTypeEntityService) {

    fun split(code: String): Collection<String> {

        println("${Thread.currentThread().name} ${this::class.java.name} -> Split value $code")

        val toList1 = vBdObjectTypeEntityService.findCodeLike(code).asSequence()
                .map { it.code }
                .toList()
        val toList: ArrayList<String> = ArrayList<String>(toList1)

        return toList
    }

}