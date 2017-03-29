class Squirrel(currentTree: Tree) : Animal(currentTree) {
    override fun createChild() : Animal {
        return Squirrel(currentTree)
    }

    override fun getTreePart(): Tree.Part {
        return currentTree.Crown
    }

    override fun isNutritious(currentTree: Tree): Boolean {
        return currentTree.type in listOf(TreeType.PINE, TreeType.WALNUT, TreeType.FIR)
    }
}