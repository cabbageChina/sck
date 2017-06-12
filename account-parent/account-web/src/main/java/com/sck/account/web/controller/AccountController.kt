package com.sck.account.web.controller

import mu.KLogging
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 *
 *  @author  : cabbage
 */
@RestController
@RequestMapping("/account")
class AccountController {

    companion object: KLogging()

    @GetMapping("/sayHello")
    fun sayHello(): String {
        return "hello world"
    }


}