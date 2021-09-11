package pl.darkfox.dungeongenerator

import core.configuration.DungeonConfig

@main def dungeonGenerator(): Unit = {
  val config: DungeonConfig = new DungeonConfig

  println(s"Chests: ${config.chests.generateAmount}; ${config.chests.amount.mkString("Array(", ", ", ")")}")
  println(s"Obstacles: ${config.obstacles.generateAmount}; ${config.obstacles.amount.mkString("Array(", ", ", ")")}")
}
