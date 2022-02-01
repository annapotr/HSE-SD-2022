package ru.hse.sd.cmd

import ru.hse.sd.IO

interface Command {
    fun eval(env: Map<String, String>, args: List<String>, io: IO): CommandResult
}

