package ru.vood.spring.integration.repository

import org.springframework.data.jpa.repository.JpaRepository
import ru.vood.spring.integration.entity.VBdObjectTypeEntity
import java.math.BigDecimal


interface VBdObjectTypeEntityRepository : JpaRepository<VBdObjectTypeEntity, BigDecimal> {
    fun findByCode(code: String): VBdObjectTypeEntity

    fun findByCodeLike(code: String): List<VBdObjectTypeEntity>

}