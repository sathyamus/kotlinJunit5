import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

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

        @ParameterizedTest
        @CsvSource(
                "' ', title",
                "'', title",
                "author, ' '",
                "author, ''")
        fun `throws an exception of title or author is invalid`(author: String, title: String) {
            Assertions.assertThrows(QuestionException::class.java) {
                Question(1, author, title, "question")
            }
        }


    }

}