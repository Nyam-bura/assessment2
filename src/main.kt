fun main(){
  currentAccount(2022074,"Equity Bank",52000)
    var x = 11000 + 52000
    println(x)
    var a = 63000-30000
     println(a)
    var detail= ("account number and balance")
    println(detail)
    product("maize",50,1500,"")

   fruitname("Guava")





}



//create a classCurrentAccount with the following attributes:account
//number, account name, balance. It has the following functions:
//a.deposit(amount: Double) - Increments the balance bythe
//amount deposited
//b.withdraw(amount: Double) - Decrements the balanceby the
//amount withdrawn
//c.details() - Prints out the account number and balance and
//name in this format: “Account number x with balance y is
//operated by z”(5points)

class currentAccount(accountnumber:Int,accountname:String,balance:Int){
    fun deposit(amount:Int) {
        var deposited= 11000
        deposited++
        println(deposited)
    }
    fun withdraw(amount: Int) {
       var withdrawal= 63000-30000
        withdrawal--
        println(withdrawal)

    }
    fun details(accountnumber: Int,balance: Int){
        var detail= ("Account number is $accountnumber and balance is $balance ")
        println(detail)

    }


}

//2.Create another classSavingsAccount. It has the same functions and
//attributes as the current account except for one attribute,
//withdrawals: Int. Withdrawals is a counter variable that is used to
//keep track of how many withdrawals have been made from the account
//in a year. The only other difference is that the savings account
//withdraw() method first checks if the number of withdrawals is less
//than 4 for it to allow one to withdraw money from the account. It also
//increments the withdrawals attribute after a successful withdrawal
//(5points)
class SavingsAccount(accountnumber: Int,accountname: String,balance: Int,withdrawals:Int){
    fun withrawal(){
        var withdraw = withrawal()

    }




}





//3.A product is represented by a data class with these attributes: name,
//weight, price, category. Category can either be groceries, hygiene or
//other. Write a function that takes in a product and uses a when
//statement to assign each product to a list based on its category.
data class product(val name: String,val weight:Int,val price:Int,val category:String)
       var grocery =
           when("maize is $50kg and costs $1500"){

               else -> {
                   println("maize is $10kg and costs $1500")
               }
           }

//Write a function that given a string returns a string composed of only
//the characters in even indices. For example given “banana” it will return "bnn"
 fun fruitname(fruit:String): String {
    var fruits = fruitname("Guava")
    fruit[1]
    fruit[3]
    fruit[5]
    println(fruit)

    return fruit
 }

