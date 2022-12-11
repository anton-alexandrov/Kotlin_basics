fun main (args:Array<String>) {
    println ("Hello Kotlin");

    val name: String = "Anton"
    println("Your name is $name")

    val integerVariable = 1598520 //compilator can understand variable type from context and we can skip type
    println(integerVariable)

    val booleanVariable: Boolean = true
    println (booleanVariable)

    val booleanVariable2: Boolean = false
    println (booleanVariable2)

    val sum:Int = 45+18
    println(sum)



    fun mult(a: Int, b:Int): Int {
        return a*b;
    }

    println (mult(2, 3))

    fun sum(a: Int, b:Int) = a+b; //when you return simple expression, you can skip return, type and {}

    println (sum(5,6))




}