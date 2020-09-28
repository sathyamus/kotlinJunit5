class User(val id: Int, val name: String) {
    var reputation: Int = 0
        private set

    fun changeReputation(number: Int) {
        if (number == 0)
            throw Exception("Reputation change can't be ZERO")
        reputation+= number
    }

}