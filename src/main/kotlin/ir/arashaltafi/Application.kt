package ir.arashaltafi

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import ir.arashaltafi.plugins.configureDsl
import ir.arashaltafi.plugins.configureRouting

fun main() {
    val port = System.getenv("PORT")?.toInt() ?: 8003
    embeddedServer(Netty, port = port, host = "192.168.1.101") {
        configureRouting()
        configureDsl()
    }.start(wait = true)
}
