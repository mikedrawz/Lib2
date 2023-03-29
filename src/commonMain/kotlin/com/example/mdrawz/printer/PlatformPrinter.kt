package com.example.mdrawz.printer

import com.example.mdrawz.*

class PlatformPrinter {
    private val printer = Printer()
    private val platform = Platform()

    fun printPlatform() {
        printer.print(platform)
    }
}