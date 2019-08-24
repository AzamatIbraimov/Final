package com.entities

import java.sql.Timestamp
import javax.persistence.*

@Entity
@Table(name = "user")
data class      UserEntity

/*
CREATE TABLE IF NOT EXISTS `user` (
  `user_id` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(255) NOT NULL,
  `password` VARCHAR(255) NOT NULL,
  `register_date` TIMESTAMP NOT NULL,
  `role` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`user_id`)
);
);
 */
(
        @get:Id
        @get:GeneratedValue(strategy = GenerationType.AUTO)
        @get:Column(name = "user_id")
        var userId: Int = 0,
        @get:Basic
        @get:Column(name = "username")
        var username: String? = null,
        @get:Basic
        @get:Column(name = "password")
        var password: String? = null,
        @get:Basic
        @get:Column(name = "register_date")
        var registerDate: Timestamp? = null,
        @get:Basic
        @get:Column(name = "role")
        var role: String? = null)

