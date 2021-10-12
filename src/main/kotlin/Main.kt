
fun main() {

    print("Enter the salary of employee : ")
    var salary = readLine()!!.toDouble()

    print("Perf rating by 1,2 or 3:")
    var perfo = readLine()!!.toInt()


    if (perfo == 1) {
        println("New salary of employee is " + salary+(salary*6)/100)
    }
    else if (perfo == 2) {
        println("New salary of employee is " + salary+(salary*4)/100)
    }
    else if (perfo == 3) {
        println("New salary of employee is " + salary+(salary*1.5)/100)
    }}


