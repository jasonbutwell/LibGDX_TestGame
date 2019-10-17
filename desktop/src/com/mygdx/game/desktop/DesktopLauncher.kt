package com.mygdx.game.desktop

import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration
import com.mygdx.game.MyGdxGame

fun main(arg: Array<String>) {
        val config = LwjglApplicationConfiguration()

        config.width = 800
        config.height = 600
        config.title = "Test Game"

        LwjglApplication(MyGdxGame(), config)
}

