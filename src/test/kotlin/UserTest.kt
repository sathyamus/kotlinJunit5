import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class UserTest {
    var user = User(1, "Sathya")

    @Test
    fun should_increase_reputation() {
        user.changeReputation(10)
        Assertions.assertEquals(10, user.reputation)
    }
}