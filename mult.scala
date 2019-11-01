
///////////////////////////////////////////////
//Basic Program in Scala
///////////////////////////////////////////////
//Multiplication
///////////////////////////////////////////////
//Implementar autostring (case)
///////////////////////////////////////////////

//Se usa solamente cuando un objeto almacena informacion
case class Divisas(x:Int,y:Double) {
	// Aquí se comprueba el denominador para instaciar
///////////////////////////////////////////////
	


	// Metodo para representar el valor racional desde el punto de vista decimal 
	def toDecimal():Double = x*y

	// Metodo para multiplicar dos racionales
	def multiplica(Divisas):Divisas = {
		val numer:Double = x*y
		return new Divisas(numer)	
	}
}
 //

///////////////////////////////////////////////

// main
object oPrincipal {
	def main(args:Array[String])={

		// Definiendo los valores para multiplicar
		val r1: Divisas = new Divisas(1000)
		println(r1)
		val r2: Divisas = new Divisas(4)
		println(r2)

		// Operacion
		val r3: Divisas = r1 multiplica r2 

		// Imprimir los resulados

		println("The multiplication is: "+ r3)
		println("The decimal value is "+ r3.toDecimal())
	}
}




/*
///////////////////////////////////////////////
//Basic Program in Scala
///////////////////////////////////////////////
//Multiplication
///////////////////////////////////////////////
//Implementar autostring (case)
///////////////////////////////////////////////

//Se usa solamente cuando un objeto almacena informacion
case class Money(x:Int,y:Double) {

	// Metodo para multiplicar 
	multiplica = x * y;
	}

// main
object oPrincipal {
	def main(args:Array[String])={

		// Definiendo los valores para multiplicar
		val r1: Money = new Money(10000)
		println(r1)
		val r2: Money = new Money(0.0521403)
		val r3: Money = new Money(0.0469002)
		val r4: Money = new Money(0.0759725)
		val r5: Money = new Money(0.0759725)

		// Operacion
		val r3: Money = r1 multiplica r2 
		val r4: Money = r1 multiplica r3 
		val r5: Money = r1 multiplica r4 
		val r6: Money = r1 multiplica r5 

		// Imprimir los reslados

		println("Dolar Americano = : "+ r3)
		println("Euro ="+ r4)
		println("Dolar Australiano = "+ r5)
		println("Dolar Canadiense = "+ r6)
	}
}*/
