package org.shamoel

sealed trait Item {
  def price: Double
}

case class Apple() extends Item {
  override def price: Double = 60
}

case class Orange() extends Item {
  override def price: Double = 25
}