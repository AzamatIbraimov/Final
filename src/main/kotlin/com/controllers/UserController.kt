package com.controllers


import com.models.User
import com.repositories.UserRepository
import com.services.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/user")
class UserController internal constructor(private val userRepository: UserRepository) {
    //private Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    private val userService: UserService? = null

    @RequestMapping("/")
    fun defaultUser(): String {
        //logger.info("You've hit the default endpoint");
        //logger.debug("This is a debugging message for the default endpoint");
        return "Default user endpoint"
    }

    @RequestMapping(method = [RequestMethod.GET])
    fun getUser(@RequestParam("id") id: Int): User {
        return userService!!.getUserById(id)
    }

    @RequestMapping(method = [RequestMethod.PUT])
    fun putUser(@RequestBody user: User) {
        userService!!.saveUser(user)
    }

    @RequestMapping(method = [RequestMethod.POST])
    fun postUser(@RequestBody user: User): User {
        return userService!!.saveUser(user)
    }

    @RequestMapping(method = [RequestMethod.DELETE])
//    fun deleteUser(@PathVariable id: Int) {
    fun deleteUser(@RequestParam id: Int) {

        userService!!.deleteUserById(id)
    }
}
