import java.security.SecureRandom

fun main(args: Array<String>) {
    for (i in 1..1000)
        forest.newTree()

    val rnd = SecureRandom()

    for (i in 0 until 1000)
        for (j in 1..2)
            Tree.setAsNeighbours(forest.trees[i], forest.trees[rnd.nextInt(1000)])

    for (i in 1..1000)
        forest.newAnimal()

    print(forest)

    while (!forest.animals.isEmpty()) {
        forest.update()

        for ((key, value) in forest.animals.groupBy { animal->animal.javaClass })
            println("$key: ${value.size}")
        println("Total: ${forest.animals.size}")
    }
}