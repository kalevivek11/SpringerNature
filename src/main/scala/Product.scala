package main.scala

trait Product {
  def getPrice: Double
  def getName: String
  def getCode: String
}

case class Tea(code: String, price: Double, name: String) extends Product {
  override def getPrice = price
  override def getName = name
  override def getCode = code
}
case class Coffee(code: String, price: Double, name: String) extends Product {
  override def getPrice = price
  override def getName = name
  override def getCode = code
}
case class ColdDrink(code: String, price: Double, name: String) extends Product {
  override def getPrice = price
  override def getName = name
  override def getCode = code
}


  
  
