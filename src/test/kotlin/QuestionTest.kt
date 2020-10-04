import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class QuestionTest {
    var user = User(1, "Sathya")

    @Nested
    inner class `should` {

        @Test
        fun `should throw exception if the title is empty`() {
            Assertions.assertThrows(QuestionException::class.java) {
                Question(1, "Sathya", "", "question 1")
            }
        }

        @Test
        fun `should not throw exception if the author is empty`() {
            Assertions.assertThrows(QuestionException::class.java) {
                Question(1, "", "Sathya", "question 2")
            }
        }
    }

}