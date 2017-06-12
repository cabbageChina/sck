package com.sck.account.service

import com.sck.account.common.entity.User
import com.sck.account.service.dao.UserDao
import org.springframework.stereotype.Service

/**
 *
 *  @author  : cabbage
 */
interface UserService {

    fun list(): List<User>
}

@Service
open class UserServiceImpl(val userDao: UserDao): UserService {

    override fun list(): List<User> = userDao.list()

}
