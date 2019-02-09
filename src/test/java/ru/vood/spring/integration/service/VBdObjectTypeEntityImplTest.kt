package ru.vood.spring.integration.service

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import ru.vood.spring.integration.IntegrationApplication

@RunWith(SpringRunner::class)
@SpringBootTest(classes = [IntegrationApplication::class])
class VBdObjectTypeEntityImplTest {

    @Autowired
    lateinit var vBdObjectTypeEntityService: VBdObjectTypeEntityService

    @Test
    fun findByCode() {
        val code = "TABLE"
        val findByCode = vBdObjectTypeEntityService.findByCode(code)
        Assert.assertEquals(code, findByCode.code)
    }

    @Test
    fun getRepository() {
    }
}