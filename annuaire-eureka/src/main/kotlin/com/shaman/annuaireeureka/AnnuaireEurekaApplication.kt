package com.shaman.annuaireeureka

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class AnnuaireEurekaApplication

fun main(args: Array<String>) {
	runApplication<AnnuaireEurekaApplication>(*args)
}
