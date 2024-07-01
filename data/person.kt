package data

class person {
    var firstname: String = "Aji"
    var middlename: String? = null
    var lastname: String = "saputra"

//    membuat sebuah function
    fun sayHello(name:String){
        println("Hello $name my name is $firstname")
    }
    fun run(){
        println("I'an run")
    }
    fun getfullname(): String{
        return "$firstname $middlename $lastname"
    }

}