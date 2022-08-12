package com.emrepbu.appsouthparkcharacters

import java.io.Serializable

class SouthParkCharacter(
    val image: Int,
    val name: String,
    val gender: String,
    val hair: String,
    val age: Int,
    val birthday: String,
) : Serializable


val ericCartman = SouthParkCharacter(
    image = R.drawable.eric_cartman,
    name = "Eric Cartman",
    gender = "Male",
    hair = "Brown",
    age = 10,
    birthday = "July 1",
)

val kennyMcCormick = SouthParkCharacter(
    image = R.drawable.kenny_mccormick,
    name = "Kenny McCormick",
    gender = "Male",
    hair = "Blond",
    age = 9,
    birthday = "March 22",
)

val kyleBroflovski = SouthParkCharacter(
    image = R.drawable.kyle_broflovski,
    name = "Kyle Broflovski",
    gender = "Male",
    hair = "Red",
    age = 10,
    birthday = "May 26",
)

val stanMarsh = SouthParkCharacter(
    image = R.drawable.stan_marsh,
    name = "Stan Marsh",
    gender = "Male",
    hair = "Black",
    age = 10,
    birthday = "October 19",
)