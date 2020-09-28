class User(val id: Int, val name: String) {
    var reputation: Int = 0
        private set

    fun changeReputation(number: Int) {
        //reputation+= number
    }
}