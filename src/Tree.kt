import javax.print.attribute.standard.MediaSize

enum class TreeType {
    FIR, BIRCH, PINE, OAK, MAPLE, WALNUT
}

class Tree(val type: TreeType) {
    override fun toString(): String {
        return type.toString()
    }

     val neighbours: MutableList<Tree> = mutableListOf()

    val Crown = Part()
    val Trunk = Part()
    val Roots = Part()

    companion object {
        fun setAsNeighbours(one: Tree, other: Tree) {
            if (!one.neighbours.contains(other)) {
                one.neighbours.add(other)
                other.neighbours.add(one)
            }
        }
    }

    fun update() {
        Crown.update()
        Trunk.update()
        Roots.update()
    }

    inner class Part {
        var food = World.MAX_TREE_FOOD

        fun update() {
            food = Math.min(food + World.FOOD_REGEN, World.MAX_TREE_FOOD)
        }
    }

    //inner class Crown

    //inner class Trunk

    //inner class Roots
}
