package com.sck.account.common.entity

import com.sck.account.common.enums.Gender
import java.time.Instant

/**
 *
 *  @author  : cabbage
 */
data class User(
        var id: Long? = null,
        var username: String? = null,
        var password: String? = null,
        var nickname: String? = null,
        var age: Int? = null,
        var gender: Gender? = null,
        var create_time: Instant? = null,
        var modify_time: Instant? = null
)