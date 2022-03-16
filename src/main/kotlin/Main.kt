fun main(){
    var result = multiplyArray(arrayOf(23,45,67,4,3))
    println(result)
    var sum= sumArrays(arrayOf(34,5.6,7.8f,true,7.3,12,4))
    println(sum)
    var add= characterArrays(arrayOf('d','a','t','e','u','r','o','p','i'))
    println(add)

}
fun multiplyArray(nums:Array<Int>):Int{
    var multiply = 1
    nums.forEach { num->
        multiply*=num
    }
    return multiply
}
fun sumArrays(mixedInts:Array<Any>):Double{
    var sum = 0.0
    mixedInts.forEach { nums->
        if (nums is Double)
            sum+=nums
    }
    return sum
}
fun characterArrays(words:Array<Char>):Int {
    var total = 0
    words.forEach { word ->
        if (word == 'a' || word == 'e' || word == 'i' || word == 'o' || word == 'u') {
            total++
        }
    }
    return total
}

