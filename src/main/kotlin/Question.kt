
class Question(id: Int, var author: String, var title: String, question: String) {

    init {
        if(!isValid())
            throw QuestionException("Question either has no title or body")
    }

    private fun isValid(): Boolean {
            // title and question is valid
            // should not be empty
            // can refactor to have a Title and Body type that can
            // then have it's own validation
            return !(title.isNullOrBlank() || author.isNullOrBlank())
        }


    var answered = false
        private set

    var closed = false
        private set

    var closedReason = ""
        private set

}



