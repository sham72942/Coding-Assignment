package org.shamoel

class Checkout {
  def totalCost(items: List[Item]): Double = items.foldLeft(0.0) { (a, b) => a + offerPrice(b) }

  private val discountCache: Map[String, Double] = Map(Apple.toString ->.5, Orange.toString -> 2.0/3)

  private def offerPrice(itm: Item): Double = {
    discountCache.get(itm.toString).map(itm.price*_).getOrElse(itm.price)
  }
}

object Checkout {
  def prettyPrice(pence: Double): String = "£"+(pence/100).toString
}