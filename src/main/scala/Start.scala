package main.scala

object Solution {

  def main(args: Array[String]) = {

    Repository.addToMenu(List(Tea("TM", 10, "Tea - Masala"), Tea("TI", 15, "Tea - Ice"), Tea("TL", 15, "Tea - Leamon"),
      Coffee("CC", 15, "Cold - Coffe"), Coffee("CM", 30, "Cold - Mocha"), Coffee("CL", 40, "Coffee - Latte"),
      ColdDrink("CDC", 20, "ColdDrinks - Coke"), ColdDrink("CDP", 20, "ColdDrinks - Pepsi"), ColdDrink("CDS", 15, "ColdDrinks - Sprites")))

    val carObj = new Cart

    carObj.addToCart("TM", 2)
    carObj.addToCart("CL", 5)
    val cartDetails = carObj.getCart

    println("Item Name     Count      Price(INR)");
    val rtn = cartDetails.cartProductAmount.map(f => {
      println(f.productName + "     " + f.count + "     " + f.productTotal)

    })
    println("Total " + cartDetails.cartTotal)
    println("Discount: " + cartDetails.discountAmount)
    println("Final Amount :" + cartDetails.FinalAmount)
  }
}  
