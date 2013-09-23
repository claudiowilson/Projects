package Classes

class Product(id: String, price: Int, quantity: Int) {     
	def GetPrice():Int = { price }
	def GetQuantity():Int = { quantity }
	def GetID():String = { id }
	def GetValue():Int = { price * quantity }
}

class Inventory(products: List[Product]) {
	def GetTotalValue():Int =  {
		def GetTotalValueHelper(inventory: List[Product]):Int = inventory match {
			case x :: tail => x.GetValue() + GetTotalValueHelper(inventory.tail)
			case Nil => 0
		}
		GetTotalValueHelper(products)
	}
  
	def GetOne():Int = {
		products(0).GetValue()
	}
}