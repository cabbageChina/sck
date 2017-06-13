package com.sck.account.web

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.SpringApplication
import org.springframework.cloud.client.SpringCloudApplication
import org.springframework.context.annotation.ComponentScan

/**
 *
 *  @author  : cabbage
 */
@SpringCloudApplication
@ComponentScan("com.sck.account")
@MapperScan("com.sck.account.service.dao")
open class Application {

    companion object {
        fun main(vararg args: String) {
            SpringApplication.run(Application::class.java, *args)
        }
    }
}

fun main(vararg args: String) {
    SpringApplication.run(Application::class.java, *args)
}
