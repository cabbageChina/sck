package com.sck.account.web.controller

import com.sck.account.common.entity.User
import com.sck.account.service.UserService
import mu.KLogging
import org.mybatis.spring.annotation.MapperScan
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 *
 *  @author  : cabbage
 */
@RestController
@RequestMapping("/account")
class AccountController(
        val userService: UserService) {

    companion object: KLogging()

    @GetMapping("/list")
    fun list(): List<User> = userService.list()


    @GetMapping("/sayHello")
    fun sayHello(): String {
        return "hello world"
    }


}