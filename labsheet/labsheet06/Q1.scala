object Inventry {
  
  def getAllProductNames(inventory: Map[Int, (String, Int, Double)]): List[String] = {
    inventory.values.map(_._1).toList
  }

  def calculateTotalValue(inventory: Map[Int, (String, Int, Double)]): Double = {
    inventory.values.map { case (_, quantity, price) => quantity * price }.sum
  }

  def isInventoryEmpty(inventory: Map[Int, (String, Int, Double)]): Boolean = {
    inventory.isEmpty
  }

  def mergeInventories(inventory1: Map[Int, (String, Int, Double)], inventory2: Map[Int, (String, Int, Double)]): Map[Int, (String, Int, Double)] = {
    // Create an empty map to store the merged inventory
    var mergedInventory = Map[Int, (String, Int, Double)]()

    // Add all items from inventory1 to the mergedInventory
    for ((id, (name, quantity, price)) <- inventory1) {
      mergedInventory += (id -> (name, quantity, price))
    }

    // Add or update items from inventory2 in the mergedInventory
    for ((id, (name2, quantity2, price2)) <- inventory2) {
      if (mergedInventory.contains(id)) {
        // If the item already exists in mergedInventory, update it
        val (name1, quantity1, price1) = mergedInventory(id) // Retrieves the existing entry from mergedInventory
        val updatedQuantity = quantity1 + quantity2
        val updatedPrice = price1 max price2
        mergedInventory += (id -> (name1, updatedQuantity, updatedPrice))
      } else {
        // If the item does not exist in mergedInventory, add it
        mergedInventory += (id -> (name2, quantity2, price2))
      }
    }

    mergedInventory
  }

  def checkProductExistence(inventory: Map[Int, (String, Int, Double)], productId: Int): Unit = {
    // Try to get the product details using the productId
    inventory.get(productId) match {
      // If the product exists, print its details
      case Some((name, quantity, price)) =>
        println(s"Product ID: $productId, Name: $name, Quantity: $quantity, Price: $price")
      // If the product does not exist, print a message saying so
      case None =>
        println(s"Product with ID $productId does not exist.")
    }
  }

  def main(args: Array[String]): Unit = {
    val inventory1: Map[Int, (String, Int, Double)] = Map(
      101 -> ("ProductA", 10, 50.0),
      102 -> ("ProductB", 5, 30.0),
      103 -> ("ProductC", 20, 15.0)
    )
    
    val inventory2: Map[Int, (String, Int, Double)] = Map(
      102 -> ("ProductB", 10, 35.0),
      104 -> ("ProductD", 15, 25.0)
    )

    println(getAllProductNames(inventory1))
    println(calculateTotalValue(inventory1))
    println(isInventoryEmpty(inventory1))
    println(mergeInventories(inventory1, inventory2))
    checkProductExistence(inventory1, 102) 
  }
}
