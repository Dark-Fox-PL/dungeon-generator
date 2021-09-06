package pl.darkfox.dungeongenerator
package core

enum Tiles(val tile: String):
  case Empty      extends Tiles(" ")
  case Floor      extends Tiles(".")
  case Wall       extends Tiles("#")
  case Chest      extends Tiles("C")
  case Store      extends Tiles("$")
  case Boss       extends Tiles("B")
  case MiniBoss   extends Tiles("V")
  case Decorative extends Tiles("D")

object Tiles:
  val surfaceTiles: List[String] = List(
    Tiles.Floor.tile,
    Tiles.Boss.tile,
    Tiles.MiniBoss.tile,
    Tiles.Chest.tile,
    Tiles.Store.tile,
    Tiles.Decorative.tile,
  )
