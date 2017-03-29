class FlyingSqurrel(currentTree: Tree) : Animal(currentTree) {

    val habitat = listOf(TreeType.MAPLE)

    override fun createChild() : Animal {
        return Badger(currentTree)
    }

    override fun getTreePart(): Tree.Part {
        return currentTree.Crown
    }

    override fun isNutritious(currentTree: Tree): Boolean {
        return currentTree.type in habitat
    }
}
