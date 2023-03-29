package com.example.mdrawz.printer

actual class Printer {
    actual fun print(text: String) {
        System.out.println(text)
    }
}