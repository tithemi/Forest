class Chipmunk(currentTree: Tree) : Animal(currentTree) {

    val habitat = listOf(TreeType.FIR, TreeType.PINE, TreeType.WALNUT)

    override fun createChild() : Animal {
        return Badger(currentTree)
    }

    override fun getTreePart(): Tree.Part {
        return currentTree.Roots
    }

    override fun isNutritious(currentTree: Tree): Boolean {
        return currentTree.type in habitat
    }
}
