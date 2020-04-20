
package main.scala
import scala.collection.mutable.ListBuffer

object Repository {
  private var TeaList = ListBuffer.empty[Tea]
  private var CoffeeList = ListBuffer.empty[Coffee]
  private var ColdDrinkList = ListBuffer.empty[ColdDrink]

  def addToMenu(list: List[Product]) = {
      for (p <- list) {
      p match {
        case p: Tea       => TeaList += p
        case p: Coffee    => CoffeeList += p
        case p: ColdDrink => ColdDrinkList += p
        case _            => println("not matched")
      }
    }
  }

  def getProductByCode(productCode: String) = {
    val catalogue = TeaList ++ CoffeeList ++ ColdDrinkList
    val catalogueMap = catalogue.map(f => (f.getCode, f))
    catalogueMap.toMap.get(productCode)
  }

}