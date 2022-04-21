fun main(){
    var list = listOf("kotlin", "Python", "Java")
    var list1 = mutableListOf("kotlin", "Python", "Java")


    for (element in list ){
        println(element)
    }
    println(" ")

    list1.add("JavaScript")
    println(list1)
    list1.add(1, "C++")
    println(list1)

    for (index in 0..list.size - 3){
        println(list.get(0))
    }
    println(" ")
    var names = listOf("Jane", "Ruby", "Cate")
    println(names[0])
    println(" ")

    for (name in names){
        println(name)
    }
    println(" ")

    names.forEach{
        println(it)
    }
println(" ")

    var studentNames = mutableListOf("Judy", "Janet", "Jackline")
    studentNames.add("purity")
    studentNames.add(1, "Shalon")
    println(studentNames)
    println(" ")


}
