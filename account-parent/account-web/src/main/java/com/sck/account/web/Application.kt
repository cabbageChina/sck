package com.sck.account.web

import org.springframework.boot.SpringApplication
import org.springframework.cloud.client.SpringCloudApplication

/**
 *
 *  @author  : cabbage
 */
@SpringCloudApplication
open class Application {

}

fun main(vararg args: String) {
    SpringApplication.run(Application::class.java, *args)
}