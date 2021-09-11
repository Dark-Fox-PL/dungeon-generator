package pl.darkfox.dungeongenerator
package core.configuration

abstract class MapItems:
  var create: Boolean = true
  var separation: Int = 6
  val amount: Array[Int] = Array( 0, 60 )

  def generateAmount: Int =
    return scala.util.Random.between(this.amount.apply(0), this.amount.apply(1))
