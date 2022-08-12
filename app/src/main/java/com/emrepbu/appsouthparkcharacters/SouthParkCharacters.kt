package com.emrepbu.appsouthparkcharacters

class SouthParkCharacters(
    val image: Int,
    val name: String,
    val gender: String,
    val hair: String,
    val age: Int,
    val birthday: String,
)


val ericCartman = SouthParkCharacters(
    image = R.drawable.Eric_Cartman,
    name = "Eric Cartman",
    gender = "Male",
    hair = "Brown",
    age = 10,
    birthday = "July 1",
)

val kennyMcCormick = SouthParkCharacters(
    image = R.drawable.Kenny_McCormick,
    name = "Kenny McCormick",
    gender = "Male",
    hair = "Blond",
    age = 9,
    birthday = "March 22",
)

val kyleBroflovski = SouthParkCharacters(
    image = R.drawable.Kyle_Broflovski,
    name = "Kyle Broflovski",
    gender = "Male",
    hair = "Red",
    age = 10,
    birthday = "May 26",
)

val stanMarsh = SouthParkCharacters(
    image = R.drawable.Stan_Marsh,
    name = "Stan Marsh",
    gender = "Male",
    hair = "Black",
    age = 10,
    birthday = "October 19",
)