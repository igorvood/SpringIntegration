package ru.vood.spring.integration.entity

import ru.vood.spring.integration.entity.ParentForAll.Companion.SCHEMA
import java.math.BigDecimal
import javax.persistence.*

@Entity
@Table(name = "V_BD_OBJECT_TYPE", schema = SCHEMA, catalog = "")

data class VBdObjectTypeEntity(@Id
                               val id: BigDecimal

                               , @Basic
                               @Column(name = "CODE", nullable = false, length = 50)
                               val code: String

                               , @Basic
                               @Column(name = "NAME", nullable = false, length = 250)
                               val name: String)