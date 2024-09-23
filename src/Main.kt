import javax.sound.midi.MetaMessage

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Задание 1")
    val num1 = 6 sum 4
    val num2 = 8 sub 3
    val num3 = 13 multi 2
    val num4 = 25 divis 5
    println("Сумма: $num1\nВычитание: $num2\nУмножения: $num3\nДеления: $num4")

    println("\nЗадание 2")
    val person = Person("Ира")
    person say "Привет";

    println("\nЗадание 3")
    val point1 = Point(3,8)
    val point2 = Point(7,2)

    val b1 = point1 isAbove point2
    println("Точка 1 выше Точки 2 - $b1")
    val b2 = point1 isRightOf point2
    println("Точка 1 правее Точки 2 - $b2")
}
//Задание 1
infix fun Int.sum(b:Int):Int{
    return this+b
}
infix fun Int.sub(b:Int):Int{
    return this-b
}
infix fun Int.multi(b:Int):Int{
    return this*b
}
infix fun Int.divis(b:Int):Int{
    return this/b
}

//Задание 2
data class Person(val name:String){
    infix fun say(message: String){
        println("$name - $message")
    }
}

//Задание 3
data class Point(val x:Int, val y:Int){
    infix fun isAbove(point:Point):Boolean{
        return this.y > point.y
    }
    infix fun isRightOf(point:Point):Boolean{
        return this.x > point.x
    }
}