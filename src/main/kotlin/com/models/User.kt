package com.models

import com.entities.UserEntity
import java.sql.Timestamp
import java.time.Instant

class User {
    var userId: Int = 0
    var username: String? = null
    var password: String? = null
    var registerdate: Instant? = null
    var role: String? = null


    constructor() {}

    constructor(userId: Int, username: String, password: String, registerdate: Instant, role : String) {
        this.userId = userId
        this.username = username
        this.password = password
        this.registerdate = registerdate
        this.role = role
    }

    constructor(userEntity: UserEntity) {
        this.userId = userEntity.userId
        this.username = userEntity.username
        this.password = userEntity.password
        this.registerdate = userEntity.registerDate?.toInstant()
        this.role = userEntity.role
    }

    fun convertToEntity(): UserEntity {
        return UserEntity(userId, username, password, Timestamp.from(registerdate!!), role)
    }
}
