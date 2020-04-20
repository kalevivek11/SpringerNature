package test.scala
import org.scalatest.FunSuite
import main.scala._

class HelloSuite extends FunSuite {
Repository.addToMenu(List(Tea("TM", 10, "Tea - Masala"), Tea("TI", 15, "Tea - Ice"), Tea("TL", 15, "Tea - Leamon"),
      Coffee("CC", 15, "Cold - Coffe"), Coffee("CM", 30, "Cold - Mocha"), Coffee("CL", 40, "Coffee - Latte"),
      ColdDrink("CDC", 20, "ColdDrinks - Coke"), ColdDrink("CDP", 20, "ColdDrinks - Pepsi"), ColdDrink("CDS", 15, "ColdDrinks - Sprites")))
  
  test("Adding 2 Masala Tea and 3 ColdCoffee to cart") {
   
    
    val carObj = new Cart
        
    carObj.addToCart("TM", 2)
    carObj.addToCart("CC", 3)
        
    val cartDetails = carObj.getCart
    
    val total = cartDetails.cartTotal
    val discountAmount =cartDetails.discountAmount
    val finalAmount = cartDetails.FinalAmount
    assert(total== 65.0&&  discountAmount ==0.0  && finalAmount == 65.0)
    
  }

  test("Adding 2 Icetea and 1 MochaCoffe and 1 Icetea again to cart") {
   val carObj = new Cart
        
    carObj.addToCart("TI", 2)
    carObj.addToCart("CM", 1)
    carObj.addToCart("TI", 1)
        
    val cartDetails = carObj.getCart
    
    val total = cartDetails.cartTotal
    val discountAmount =cartDetails.discountAmount
    val finalAmount = cartDetails.FinalAmount
    assert(total== 75.0&&  discountAmount ==0.0  && finalAmount == 75.0)
    
  }
  
 test("Adding 4 Pepsi and 1 LatteCoffe to cart") {
   val carObj = new Cart
        
    carObj.addToCart("CDP", 4)
    carObj.addToCart("CL", 1)
        
    val cartDetails = carObj.getCart
    
    val total = cartDetails.cartTotal
    val discountAmount =cartDetails.discountAmount
    val finalAmount = cartDetails.FinalAmount
    assert(total== 120.0&&  discountAmount ==12.0  && finalAmount == 108.0)
    
  }
 
  test("Adding 2 MasalaTea and 5 LatteCoffe to cart") {
  val carObj = new Cart
        
    carObj.addToCart("TM", 2)
    carObj.addToCart("CL", 5)
        
    val cartDetails = carObj.getCart
    
    val total = cartDetails.cartTotal
    val discountAmount =cartDetails.discountAmount
    val finalAmount = cartDetails.FinalAmount
    assert(total== 220.0&&  discountAmount ==24  && finalAmount == 196.0)
    
  }

 }

