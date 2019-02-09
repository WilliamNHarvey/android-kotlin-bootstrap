package com.williamnharvey.bootstrap.domain.commands

interface Command<out T> {
    suspend fun execute(): T
}