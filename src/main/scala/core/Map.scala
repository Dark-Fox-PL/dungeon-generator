package pl.darkfox.dungeongenerator
package core

import core.Tiles
import core.configuration.Map as MapConfig

import scala.collection.mutable.ArrayBuffer

class Map(config: MapConfig, level: Int):
  private val width: Int = config.generateMapWidth
  private val height: Int = config.generateMapHeight
  private var map: Array[Array[String]] = Array.ofDim[String](this.width, this.height)

  def get: Array[Array[String]] = this.map
  def create: Map = this.createEmptyMap.createRooms

  protected def createEmptyMap: Map =
    for
      x <- 0 until this.width
      y <- 0 until this.height
    do this.map(x)(y) = Tiles.Empty.tile

    this

  protected def createRooms: Map = this
