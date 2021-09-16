package pl.darkfox.dungeongenerator
package containers

import pl.darkfox.dungeongenerator.core.Tiles

class LocationContainer:
  private var locked: Boolean = false
  private var location: IndexedSeq[IndexedSeq[String]] = _

  def create(width: Int, height: Int): LocationContainer =
    if (false == this.locked)
      this.location = (0 until width).map(x => ((0 until height).map(y => Tiles.Wall.tile)))
    this

  def set(x: Int, y: Int, tile: String): LocationContainer =
    this.location = this.location.updated(x, this.location(x).updated(y, s"${tile}"))
    this

  def get: IndexedSeq[IndexedSeq[String]] = this.location