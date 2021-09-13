package pl.darkfox.dungeongenerator
package core

import core.configuration.DungeonConfig

case class Dungeon(dungeonConfig: DungeonConfig):
  val dungeon: Array[String] = Array()
  val maps: Array[Array[String]] = Array()

  def generateMaps: Dungeon =
    for (currentLevel <- 1 to this.dungeonConfig.levels)
      val map: Map = new Map(this.dungeonConfig.map, currentLevel)
      map.create

    this
