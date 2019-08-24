package com.services

import com.entities.UserEntity
import com.models.User
import com.repositories.UserRepository
import javassist.NotFoundException
import org.hibernate.annotations.NotFound
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService {

    @Autowired
    private val userRepository: UserRepository? = null

    fun getUserById(userId: Int): User {
        return User(userRepository!!.findById(userId).orElseThrow { com.Exception.NotFound() })
    }

    fun saveUser(user: User): User {
        val saveResult = userRepository!!.save(user.convertToEntity())
        return User(saveResult)
    }

    fun deleteUserById(userId: Int) {
        userRepository!!.deleteById(userId)
    }
}
