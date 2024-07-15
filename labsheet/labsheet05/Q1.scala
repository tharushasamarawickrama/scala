import scala.io.StdIn.readLine

object InventoryManagement {

  def getProductList(): List[String] = {
    var productList: List[String] = List()
    var continue = true
    
    println("Enter product names (type 'done' to finish):")

    while (continue) {
      val input = readLine()
      if (input.toLowerCase == "done") {
        continue = false
      } else {
        productList = productList :+ input
      }
    }
    
    productList
  }

  def printProductList(productList: List[String]): Unit = {
    println("\nList of products entered:")
    productList.zipWithIndex.foreach { case (product, index) => 
      println(s"${index + 1}. $product")
    }
  }

  def getTotalProducts(productList: List[String]): Int = {
    productList.size
  }

  def main(args: Array[String]): Unit = {
    val products = getProductList()
    printProductList(products)
    println(s"\nTotal number of products entered: ${getTotalProducts(products)}")
  }
}