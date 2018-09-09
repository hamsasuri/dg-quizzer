public class TriviaQuestionBuilderTest {

    @Test(expected = IllegalArgumentException.class)
    public void testBuildIdFail() {
        (new TriviaQuestionBuilder())
             .id(-1)
             .build();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBuildQuestionFail() {
        (new TriviaQuestionBuilder())
             .question(null)
             .build();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBuildAnswerAFail() {
        (new TriviaQuestionBuilder())
             .answerA(null)
             .build();
    }


    @Test(expected = IllegalArgumentException.class)
    public void testBuildAnswerBFail() {
        (new TriviaQuestionBuilder())
             .answerB(null)
             .build();
    }
    @Test(expected = IllegalArgumentException.class)
    public void testBuildAnswerCFail() {
        (new TriviaQuestionBuilder())
             .answerC(null)
             .build();
    }
    @Test(expected = IllegalArgumentException.class)
    public void testBuildAnswerDFail() {
        (new TriviaQuestionBuilder())
             .answerD(null)
             .build();
    }
    @Test(expected = IllegalArgumentException.class)
    public void testBuildCorrectAnswerFail() {
        (new TriviaQuestionBuilder())
             .correctAnswer(null)
             .build();
    }
    @Test(expected = IllegalArgumentException.class)
    public void testBuildLastUpdatedFail() {
        (new TriviaQuestionBuilder())
             .correctAnswer(null)
             .build();
    }
}
