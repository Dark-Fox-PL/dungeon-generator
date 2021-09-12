package pl.darkfox.dungeongenerator

import core.configuration.DungeonConfig

@main def dungeonGenerator(): Unit = {
  val config: DungeonConfig = new DungeonConfig

  println(s"Chests: ${config.map.chests.generateAmount}; ${config.map.chests.amount.mkString("Array(", ", ", ")")}")
  println(s"Obstacles: ${config.map.obstacles.generateAmount}; ${config.map.obstacles.amount.mkString("Array(", ", ", ")")}")
}
