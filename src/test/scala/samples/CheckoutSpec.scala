package samples

import org.scalatest.FunSpec
import org.scalatest.Matchers.convertToAnyShouldWrapper
import org.shamoel.{Apple, Checkout, Item, Orange}

class CheckoutSpec extends FunSpec {
  val checkout: Checkout = new Checkout()

  def precision(value: Double, precision: Int): Double =
    BigDecimal(value).setScale(precision, BigDecimal.RoundingMode.HALF_UP).toDouble

  describe("totalCost") {
    it("should return correct item cost") {
      val items: List[Item] = List[Item](Apple, Apple, Orange, Apple)
      val pence = 60*3*.5 + 25*2.0/3
      precision(checkout.totalCost(items),2) shouldBe precision(pence, 2)
    }
  }

  describe("prettyPrice") {
    it("should return correct pretty price"){
      Checkout.prettyPrice(100) shouldBe "£1.0"
    }
  }
}
