package samples

import org.scalatest.FunSpec
import org.scalatest.Matchers.convertToAnyShouldWrapper
import org.shamoel.{Apple, Checkout, Item, Orange}

class CheckoutSpec extends FunSpec {
  val checkout: Checkout = new Checkout()

  describe("totalCost") {
    it("should return correct item cost") {
      val items: List[Item] = List[Item](Apple(), Apple(), Orange(), Apple())
      val pence = 60*3 + 25*1
      checkout.totalCost(items) shouldBe pence.toDouble
    }
  }

  describe("prettyPrice") {
    it("should return correct pretty price"){
      Checkout.prettyPrice(100) shouldBe "£1.0"
    }
  }
}
