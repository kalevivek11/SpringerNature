package main.scala

class Cart {
  var productQuantMap = scala.collection.mutable.Map[String, Long]()

  def addToCart(productCode: String, quantity: Int) = {
    if (!Repository.getProductByCode(productCode).isEmpty) {
      if (quantity > 0) {
        val inCartProductQuantity = productQuantMap.get(productCode)
        if (inCartProductQuantity.isDefined) {
          productQuantMap(productCode) = quantity + inCartProductQuantity.get
        } else {
          productQuantMap += (productCode -> quantity)
        }
        Some("product added successfully")
      }
    } else {
      None
    }
  }

  def getCart = {
    val pq = productQuantMap.map(f => (Repository.getProductByCode(f._1), f._2)).toList
    val cartProductAmountList = pq.map(f => CartProductAmount(f._1.head.getName, f._2, f._1.head.getPrice * f._2)).toList

    val discountAmount = (cartProductAmountList.map(f => f.productTotal).sum) - getTotalAmountWithDiscount(cartProductAmountList.map(f => f.productTotal).sum)
    Receipt(cartProductAmountList, (cartProductAmountList.map(f => f.productTotal).sum), discountAmount,
      getTotalAmountWithDiscount(cartProductAmountList.map(f => f.productTotal).sum))
  }

  def getTotalAmountWithDiscount(amount: Double) = {
    amount match {
      case am: Double if 100.0 < am && am <= 200.0 => {
        am * .90
      }
      case amt: Double if amt > 200 => {
        val amtFirstPart = 200
        val amtSecondPart = amt - 200
        (amtFirstPart * .90) + (amtSecondPart * .80)
      }
      case _ => amount
    }
  }

}

case class CartProductAmount(productName: String, count: Long, productTotal: Double)
case class Receipt(cartProductAmount: List[CartProductAmount], cartTotal: Double, discountAmount: Double, FinalAmount: Double)