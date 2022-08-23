//import java.util.Scanner
fun main(){



//[ex-3]  open class Person(firstname:String,lastname:String){
//    var age:Int=-1
//    init{
//        println("First Name:$firstname")
//        println("Last Name:$lastname")
//    }
//    constructor(firstname: String,lastname: String,age:Int):this(firstname,lastname){
//        this.age=age
//        println("Age $age")
//    }
//}
//class Student(firstname:String,lastname:String,age: Int,eno:Long,branch:String,Class:String):Person(firstname,lastname,age){
//    var batch:String=""
//    init{
//        println("Branch $branch")
//        println("Class $Class")
//    }
//    constructor(firstname:String,lastname:String,age: Int,eno:Long,branch:String,Class:String,batch:String):this(firstname,lastname,age,eno,branch,Class){
//        this.batch=batch
//        println("Batch $batch")
//        println("--------------")
//    }
//
//}
//fun main(){
//    var s1=Student("Manav","Patel",21,20012011109,"CE","D","AB12")
//    var s2=Student("Dhruv","Patel",21,20012011086,"CE","D","AB12")
//    var s3=Student("Dharmik","Patel",20,20012011084,"CE","D","AB12")
//    var s4=Student("Kishan","Patel",20,20012011102,"CE","D","AB12")
//    var s5=Student("Anuj","Patel",20,20012011077,"CE","D","AB12")





// [ex-2]   open class Product(name: String,quantity: Int){
//        var p:Int=-1
//        init {
//            println("Product name :$name")
//            println("Quantity: $quantity")
//
//        }
//        constructor(name: String,quantity: Int,p: Int) : this(name,quantity){
//            this.p=p
//            println("Price :$p per piece")
//        }
//    }
//    class Laptop(name: String,quantity: Int,price : Int,cpu_n:String,RAM_s:String):Product(name,quantity,price){
//        var hdd:String=""
//        init{
//            println("CPU name:$cpu_n")
//            println("RAM_Size:$RAM_s")
//
//        }
//        constructor(name: String,quantity:Int,price: Int,cpu_n: String,RAM_s: String,hdd:String):this(name,quantity,price,cpu_n,RAM_s){
//            this.hdd=hdd
//            println("HDD_Size:$hdd")
//            println("---------------")
//        }
//
//    }
//
//    fun main(){
//        var l1=Laptop("ACER",2,80000,"8Core","16GB","1024")
//        var l2=Laptop("ASUS",5,70000,"8Core","32GB","512")
//        var l3=Laptop("HP",4,41000,"8Core","16GB","512")
//        var l4=Laptop("Lenovo",9,11000,"8Core","8GB","256")
//        var l5=Laptop("DELL",6,45000,"8Core","16GB","256")



//  [ex-1]  println("With Using Third Element")
//    print("Before Swapping :")
//    var a:Int = 109
//    var b:Int = 86
//    println("The Value of a is $a and Value of b is $b")
//    var temp:Int
//    temp=a
//    a=b
//    b=temp
//    print("After Swapping :")
//    println("The Value of a is $a and Value of b is $b")
//    println("*********")
//    println("Without Using Third Element")
//    print("Before Swapping :")
//    var c:Int = 84
//    var d:Int = 102
//    println("The Value of c is $c and Value of d is $d")
//    c=c+d
//    d=c-d
//    c=c-d
//    print("After Swapping :")
//    print("The Value of c is $c and Value of d is $d")



// [11.]   println("Please enter the elements in Array A")
//    val A = Array(3) { IntArray(3) }
//    val B = Array(3) { IntArray(3) }
//    val C = Array(3) { IntArray(3) }
//    val D = Array(3) { IntArray(3) }
//    for (i in 0..2) {
//        for (j in 0..2) {
//            print("A[$i][$j]=")
//            A[i][j] = readLine()!!.toInt()
//        }
//    }
//    println("---------------------------------")
//    println("Please enter the elements in Array B")
//
//    for (i in 0..2) {
//        for (j in 0..2) {
//            print("B[$i][$j]=")
//            B[i][j] = readLine()!!.toInt()
//        }
//    }
//
//    for (i in 0..2) {
//        for (j in 0..2) {
//            C[i][j] = A[i][j] + B[i][j]
//        }
//    }
//    for (i in 0..2) {
//        for (j in 0..2) {
//            D[i][j] = A[i][j] - B[i][j]
//        }
//    }
//    println("-----------------Addition----------------------")
//    for (i in 0..2) {
//        for (j in 0..2) {
//            print(A[i][j])
//            print(" ")
//
//        }
//        print("\n")
//    }
//    println(" + ")
//    for (i in 0..2) {
//        for (j in 0..2) {
//            print(B[i][j])
//            print(" ")
//        }
//        print("\n")
//    }
//    println("------")
//    println("------")
//    for (i in 0..2) {
//        for (j in 0..2) {
//            print(C[i][j])
//            print(" ")
//        }
//        print("\n")
//    }
//    println("-----------------Subtraction----------------------")
//    for (i in 0..2) {
//        for (j in 0..2) {
//
//            print(A[i][j])
//            print(" ")
//        }
//        print("\n")
//    }
//    println(" - ")
//    for (i in 0..2) {
//        for (j in 0..2) {
//            print(B[i][j])
//            print(" ")
//        }
//        print("\n")
//    }
//    println("------")
//    println("------")
//    for (i in 0..2) {
//        for (j in 0..2) {
//            print(D[i][j])
//            print(" ")
//        }
//        print("\n")
//    }
//    println("-----------------Multiplication----------------------")
//    for (i in 0..2) {
//        for (j in 0..2) {
//
//            print(A[i][j])
//            print(" ")
//        }
//        print("\n")
//    }
//    println(" * ")
//    for (i in 0..2) {
//        for (j in 0..2) {
//            print(B[i][j])
//            print(" ")
//        }
//        print("\n")
//    }
//    println("------")
//    println("------")
//    for (i in 0..2) {
//        for (j in 0..2) {
//            print(D[i][j])
//            print(" ")
//        }
//        print("\n")
//    }


// [10.]class Car(com:String, year:Long, price:Int, owner:String, miles:Int,cprice:Int){
//    var ty:String = com
//    var yr =year
//    var p:Int = price
//    var ow = owner
//    var m:Int = miles
//    var cp:Int=cprice
//
//    fun getCarPrice(){
//        println("$" + (p-m).toString())
//    }
//    fun getCarInformation(){
//        println("Car Information :$ty,$yr")
//        println("Car Owner :$ow")
//        println("Miles drive :$m")
//        println("Original Car Price : $p")
//        println("Current Car Price : $cp")
//    }
//}
//fun main() {
//    println("Creating class car object c1 in next line.")
//    println("Object is created and Init is called")
//    println("--------------")
//    var c1=Car("Maserati",2020,4000,"Manav",1500,3500)
//    c1.getCarInformation()
//
//    println("Creating class car object c2 in next line.")
//    println("Object is created and Init is called")
//    println("--------------")
//    var c2=Car("Aston Martin",2021,6000,"Manav",2000,5200)
//    c2.getCarInformation()


//[9.] fun fMax(arr:Array<Int>){
//    var max = arr[0]
//    for(i in arr){
//        if(i> max){
//            max = i
//        }
//    }
//    println("Maximum Element of the array is $max")
//}
//
//fun main() {
//    fun printArray(vararg nameArray:Int){
//        println(nameArray.joinToString())
//
//    }
//    fun<T> printArray(nameArray:Array<T>){
//        println(nameArray.contentDeepToString())
//    }
//    var arr = arrayOf(102,86,109,77,84)
//    print("Element of the array:")
//    printArray(arr)
//    fMax(arr)


//  [8.]  fun printArray(vararg nameArray:Int){
//        println(nameArray.joinToString())
//
//    }
//    fun<T> printArray(nameArray:Array<T>){
//        println(nameArray.contentDeepToString())
//    }
//
//    val arr1= arrayOf<Int>(10,90,60,80,100)
//    println("Create Array-1 using arrayOf() method:")
//    printArray(arr1)
//
//    val arr2= Array<Int>(5){0}
//    println("Create Array-2 using Array<>() method:")
//    printArray(arr2)
//
//    val arr3= Array(7){i:Int->i}
//    println("Create Array-3 using Array and Lambda Function method:")
//    printArray(arr3)
//
//    val arr4= IntArray(5)
//    println("Create Array-4 using intArray method:")
//    printArray(nameArray = arr4)
//
//    val arr5= intArrayOf(0,0,0,0,0)
//    println("Create Array-5 using intArrayOf method:")
//    printArray(nameArray = arr5)
//
//    var arr6 = arrayOf(intArrayOf(1, 2), intArrayOf(4, 5), intArrayOf(7, 8))
//    println("Create 2-D array-6 using arrayOf() and intArrayOf()")
//    printArray(nameArray = arr6)
//
//    var arr = arrayOfNulls<Int>(5)
//    var read= Scanner(System.`in`)
//    println("Enter array values")
//    for(i in 0..4)
//    {
//        print("array[$i]=")
//        arr[i] = read.nextInt()
//    }
//    println("The array is")
//    printArray(arr)
//
//    println("**With Built-in Function**")
//    arr.sort()
//    printArray(arr)
//
//    //USER DEFINED FUNCTION
//    println("**Without Built-in Function**")
//
//    fun sorting(arr:Array<Int>){
//        val len = arr.size
//        println(len)
//        var temp = 0
//        for (i in 0 until len-1){
//            for (j in i until len-1){
//                if (arr[i]> arr[j]){
//                    temp = arr[i]
//                    arr[i] = arr[j]
//                    arr[j] = temp
//                }
//            }
//        }
//    }
    //print("After sorting without built-in function")
    //printArray(arr)

//  [7.]  print("Enter Number: ")
//    val read = Scanner(System.`in`)
//    val n = read.nextInt()
//    println("Factorial of $n = ${simpleFactorial(n)}")
//    println("By TailRec Keyword, Factorial of $n = ${factorial(n)}")
//}
//
//fun simpleFactorial(n:Int): Long {
//    if (n >= 1)
//        return n * simpleFactorial(n-1)
//    else
//        return 1
//}
//
//tailrec fun factorial(n: Int, run: Int = 1): Long {
//    return if (n == 1) run.toLong() else factorial(n-1, run*n)

//  [6.]  arithmetic()
//}
//
//fun arithmetic() {
//    val a: Int = 111
//    val b: Int = 2222
//    val c: Int = -222
//
//    var ans = a + b + c
//    println("Addition of $a, $b, $c is $ans")
//
//    ans = a - b - c
//    println("Subtraction of $a, $b, $c is $ans")
//
//    ans = a * b * c
//    println("Multiplication of $a, $b, $c is $ans")
//
//    ans = b / a
//    println("Division of $a, $b is $ans")

// [5.]   print("Enter Month Number: ")
//    val read = Scanner(System.`in`)
//    val n:Int = read.nextInt()
//    when(n) {
//        1 -> print("January")
//        2 -> print("February")
//        3 -> print("March")
//        4 -> print("April")
//        5 -> print("May")
//        6 -> print("June")
//        7 -> print("July")
//        8 -> print("August")
//        9 -> print("September")
//        10 -> print("October")
//        11 -> print("November")
//        12 -> print("December")
//        else -> print("please enter proper number")
//    }

//    val read = Scanner(System.`in`)
//    println("Enter number")
//    val n = read.nextInt()
//    val ans = if (n % 2 == 0){
//        "Number is even"
//    } else {
//        "Number is odd"
//    }
//    println(ans)

// [3.]   print("Student Enrollment No: ")
//    var a = readLine()
//    print("Student Name: ")
//    var b = readLine()
//    print("Student Branch: ")
//    var c = readLine()
//    print("Student Class: ")
//    var d = readLine()
//    print("Student Batch: ")
//    var e = readLine()
//    print("Student College Name: ")
//    var f = readLine()
//    print("Student University Name: ")
//    var g = readLine()
//    print("Student Age: ")
//    var h = readLine()
//
//    println("****************")
//    println("Student Details")
//    println("****************")
//    println("Student Enrollment No: $a")
//    println("Student Name: $b")
//    println("Student Branch: $c")
//    println("Student Class: $d")
//    println("Student Class: $e")
//    println("Student Class: $f")
//    println("Student Class: $g")
//    println("Student Class: $h")


//  [2.]  val n: Int = 109
//    val d: Double = n.toDouble()
//    println("Integer value: $n")
//    println("Double value: $d")
//
//    val s: String = "109"
//    val i: Int = s.toInt()
//    println("String value: $s")
//    println("Double value (To string): $i")
//
//    val d1: Double = s.toDouble()
//    println("Double value (To String): $d1")


// [1.]   val a: Int = 10
//    val b: Float = 1.5F
//    val c: String = "Manav"
//    val d: Char = 'M'
//    val e: Boolean = false
//    val f: Double = 10.54
//    val g: Long = 84531797
//    val h: Short = -7
//    val i: Byte = 123
//    println("Integer value: $a")
//    println("Float value: $b")
//    println("String value: $c")
//    println("Character value: $d")
//    println("Boolean value: $e")
//    println("Double value: $f")
//    println("Long value: $g")
//    println("Short value: $h")
//    println("Byte value: $i")
}


