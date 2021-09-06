package pl.darkfox.dungeongenerator
package core

enum DungeonType:
  case WithCorridors, WithoutCorridors

case class DefaultConfig(
  val levels: Int = 1,
) {

}
