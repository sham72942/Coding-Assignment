package org.shamoel

sealed trait Item {
  def price: Double
}

object Apple extends Item {
  override def price: Double = 60
  override implicit def toString: String = "Apple"
}

object Orange extends Item {
  override def price: Double = 25
  override implicit def toString: String = "Orange"
}