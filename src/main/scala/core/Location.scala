package pl.darkfox.dungeongenerator
package core

import core.Tiles
import core.configuration.Location as LocationConfig
import containers.LocationContainer

class Location(config: LocationConfig, level: Int):
  private val width: Int = config.generateMapWidth
  private val height: Int = config.generateMapHeight
  private val location: LocationContainer = new LocationContainer

  def get: LocationContainer = this.location
  def create: Location = this.createEmptyMap.createRooms

  protected def createEmptyMap: Location =
    print(s"> creating an empty map #${level} [x: ${this.width}, y: ${this.height}]")
    this.location.create(this.width, this.height)
    println(" [done]")

    this

  protected def createRooms: Location = this
