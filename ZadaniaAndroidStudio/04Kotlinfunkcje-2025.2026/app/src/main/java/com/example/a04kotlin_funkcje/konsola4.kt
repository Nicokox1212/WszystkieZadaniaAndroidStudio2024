package com.example.a04kotlin_funkcje

fun main() {
    // --- Zadanie 1 ---
    println("--- Zadanie 1: Wypisanie powitania 3 razy ---")
    printWelcome()

    // --- Zadanie 2 ---
    println("\n--- Zadanie 2: Wypisanie podanego tekstu ---")
    printMessage("To jest tekst do zadania drugiego.")

    // --- Zadanie 3 ---
    println("\n--- Zadanie 3: Mnożenie dwóch liczb ---")
    val result = multiply(7, 6)
    println("Wynik mnożenia 7 * 6 to: $result")

    // --- Zadanie 4 ---
    println("\n--- Zadanie 4: Sześcian liczby ---")
    val cubedValue = cube(4)
    println("Sześcian liczby 4 to: $cubedValue")

    // --- Zadanie 5 ---
    println("\n--- Zadanie 5: Formatowanie profilu ---")
    val userProfile = formatProfile("Kamil", 31)
    println(userProfile)

    // --- Zadanie 8 ---
    println("\n--- Zadanie 8: Przetwarzanie listy z filter i map ---")
    val numbers = listOf(1, 3, 6, 8, 9, 12, 15)
    println("Lista początkowa: $numbers")

    // Wybieramy liczby podzielne przez 3, a następnie mnożymy je przez 4
    val processedNumbers = numbers.filter { it % 3 == 0 }.map { it * 4 }

    println("Wynik (podzielne przez 3 i pomnożone przez 4): $processedNumbers")
}

//zad 1
fun printWelcome() {
    repeat(3) {
        println("Hello, Kotlin!")
    }
}

// zad 2
fun printMessage(message: String) {
    println(message)
}

// zad 3
fun multiply(a: Int, b: Int): Int {
    return a * b
}

// zad 4
fun cube(x: Int) = x * x * x

// zad 5
fun formatProfile(name: String, age: Int): String {
    return "Imię: $name, Wiek: $age"
}