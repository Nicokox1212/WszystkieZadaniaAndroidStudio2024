package com.example.listy

fun main(){

//    val listaStudentow = ArrayList<String>()
//    listaStudentow.add("Ewa")
//    listaStudentow.add("Jan")
//    listaStudentow.add("Tomasz")
//    println(listaStudentow)
//    listaStudentow.remove("Jan")
//    listaStudentow[0] = "Agnieszka"
//    println(listaStudentow)
//    listaStudentow[0] = "Jan"
//    println(listaStudentow)
//
//    val listaLiczb = ArrayList<Int>()
//    for (i in 1 .. 5){
//        listaLiczb.add(i)
//    }
//
//    println(listaLiczb)
//    listaLiczb.remove(5)
//    println(listaLiczb)
//    listaLiczb.add(0 , 10)
//    println(listaLiczb)



    arrayListOf(4, 6, 6, 9, 6, 6, 8, 8, 8, 2, 2, 2, 2, 7, 8, 8)
    val numbers = arrayListOf(4, 6, 6, 9, 6, 6, 8, 8, 8, 2, 2, 2, 2, 7, 8, 8)




    var maxLength = 1
    var longestNumber = numbers[0]
    var currentLength = 1


    for (i in 1 until numbers.size) {
        if (numbers[i] == numbers[i - 1]) {

            currentLength++
        } else {

            if (currentLength > maxLength) {
                maxLength = currentLength
                longestNumber = numbers[i - 1]
            }

            currentLength = 1
        }
    }


    if (currentLength > maxLength) {
        maxLength = currentLength
        longestNumber = numbers.last()
    }

    println("1. Najdluzszy podciag ma dlugosc: $maxLength")
    println("2. Liczba tworzaca ten podciag: $longestNumber")
    println("---")

//    3.

    val distinctCount = numbers.distinct().size
    println("3. Ilosc roznych liczb w liscie: $distinctCount")
    println("---")

    // 4.


    val newList = mutableListOf(numbers[0], numbers[1])


    for (i in 2 until numbers.size) {

        val sum = newList[i - 2] + newList[i - 1]
        newList.add(sum)
    }

    println("4. Nowa lista (kazdy element to suma dwoch poprzednich):")
    println(newList)

}