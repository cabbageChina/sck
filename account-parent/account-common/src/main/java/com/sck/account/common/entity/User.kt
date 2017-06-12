package com.sck.account.common.entity

import com.sck.account.common.enums.Gender
import java.time.Instant

/**
 *
 *  @author  : cabbage
 */
data class User(
        var id: Long? = null,
        var username: String,
        var password: String,
        var nickname: String? = null,
        var age: Int? = null,
        var gender: Gender? = null,
        var createTime: Instant? = null,
        var modifyTime: Instant? = null
)