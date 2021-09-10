package pl.darkfox.dungeongenerator

import core.configuration.DungeonConfig

@main def dungeonGenerator(): Unit = {
  val config: DungeonConfig = new DungeonConfig

  println(s"Rooms: ${config.map.generateRoomsAmount}")
  println(s"Width: ${config.map.generateMapWidth}")
  println(s"Height: ${config.map.generateMapHeight}")
}
