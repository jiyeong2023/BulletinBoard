package com.teamsparta.bulletinboard

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BulletinBoardApplication

fun main(args: Array<String>) {
    runApplication<BulletinBoardApplication>(*args)
}
