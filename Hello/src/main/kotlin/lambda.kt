
fun main(args: Array<String>) {
    var multiplyLambda: (Int, Int) -> Int
    multiplyLambda = { a,b -> Int
     a * b
    }

    val lambdaResult = multiplyLambda(4,5)

    println(lambdaResult)
}