package com.shaman.commande.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.math.BigDecimal

@RestController
@RequestMapping("/panier")
class PanierQueryController {

    @GetMapping("/{numero}")
    fun getPanier(@PathVariable numero: String) = Panier(numero = numero, montantTotal = 38.toBigDecimal())

}

data class Panier(val numero: String, val montantTotal: BigDecimal)

