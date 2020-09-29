import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class UserTest {
    var user = User(1, "Sathya")

    @Test
    fun `should increase reputation`() {
        user.changeReputation(10)
        Assertions.assertEquals(10, user.reputation)
    }

    @Test
    fun `should decrease reputation`() {
        user.changeReputation(10)
        user.changeReputation(-5)
        Assertions.assertEquals(5, user.reputation)
    }

    @Test
    fun `should throw exception when my reputation is ZERO`() {
        Assertions.assertThrows(Exception::class.java) {
            user.changeReputation(0)
        }
    }

    @Test
    fun `should not throw exception when my reputation is non ZERO`() {
        user.changeReputation(5)
        Assertions.assertDoesNotThrow {
            println(this)
        }
    }

}