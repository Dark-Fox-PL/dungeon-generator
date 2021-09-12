package pl.darkfox.dungeongenerator
package core.configuration

class Map:
  var rooms: Array[Int] = Array( 40, 60 )
  var width: Array[Int] = Array( 128, 256 )
  var height: Array[Int] = Array( 128, 256 )
  val obstacles: Obstacles = new Obstacles
  val chests: Chests = new Chests

  def generateRoomsAmount: Int =
    return scala.util.Random.between(this.rooms.apply(0), this.rooms.apply(1))

  def generateMapWidth: Int =
    return scala.util.Random.between(this.width.apply(0), this.width.apply(1))

  def generateMapHeight: Int =
    return scala.util.Random.between(this.height.apply(0), this.height.apply(1))
