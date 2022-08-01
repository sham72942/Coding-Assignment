package org.shamoel

class Checkout {
  def totalCost(items: List[Item]): Double = items.foldLeft(0.0) { (a, b) => a + b.price }
}

object Checkout {
  def prettyPrice(pence: Double): String = "£"+(pence/100).toString
}