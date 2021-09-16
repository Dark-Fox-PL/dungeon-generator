package pl.darkfox.dungeongenerator

import core.configuration.DungeonConfig
import core.Dungeon

@main def dungeonGenerator(): Unit =
  val config: DungeonConfig = new DungeonConfig
  val dungeon: Dungeon = Dungeon(config)

  dungeon.generateMaps