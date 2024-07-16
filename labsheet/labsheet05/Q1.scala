import scala.io.StdIn.readLine

object InventoryManagement {

  def getProductList(): List[String] = {
    var productList: List[String] = List()// Initialize an empty list to store product names
    var continue = true// Variable to control the loop
    
    println("Enter product names (type 'done' to finish):")

    while (continue) {
      val input = readLine()// Read input from the user
      if (input.toLowerCase == "done") { // Check if the input is 'done
        continue = false // Exit the loop if the user types 'done'
      } else {
        productList = productList :+ input // Append the entered product name to the list
      }
    }
    
    productList // Return the list of product names
  }

  def printProductList(productList: List[String]): Unit = {
    println("\nList of products entered:")
    productList.zipWithIndex.foreach { case (product, index) => //get both the product name and its index.
      println(s"${index + 1}. $product")  // Print each product with its position in the list
    }
  }

  def getTotalProducts(productList: List[String]): Int = {
    productList.size  //Return the total number of products in the list
  }

  def main(args: Array[String]): Unit = {
    val products = getProductList() // Get the list of products from the user
    printProductList(products)  // Print the list of products
    println(s"\nTotal number of products entered: ${getTotalProducts(products)}") // Print the total number of products
  }
}