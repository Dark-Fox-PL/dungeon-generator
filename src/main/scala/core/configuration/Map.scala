package pl.darkfox.dungeongenerator
package core.configuration

class Map:
  val rooms: Array[Int] = Array( 40, 60 )
  val width: Array[Int] = Array( 128, 256 )
  val height: Array[Int] = Array( 128, 256 )

  def generateRoomsAmount: Int =
    val random = scala.util.Random
    return random.between(this.rooms.apply(0), this.rooms.apply(1))

  def generateMapWidth: Int =
    val random = scala.util.Random
    return random.between(this.width.apply(0), this.width.apply(1))
  
  def generateMapHeight: Int =
    val random = scala.util.Random
    return random.between(this.height.apply(0), this.height.apply(1))