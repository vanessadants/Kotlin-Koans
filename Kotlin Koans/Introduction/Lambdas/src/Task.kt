fun containsEven(collection: Collection<Int>): Boolean = collection.any {
    it : Int -> it % 2 == 0
}
