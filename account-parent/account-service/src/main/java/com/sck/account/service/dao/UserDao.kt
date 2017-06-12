package com.sck.account.service.dao

import com.sck.account.common.entity.User
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select

/**
 *
 *  @author  : cabbage
 */
@Mapper
interface UserDao {

    @Select("select * from user ")
    fun list(): List<User>


}