public class TriviaQuestionArrayAccessTest {

    @Test
    public void testGetQuestion() {
    }

    @Test
    public void testGetRandomQuestion() {
       System.out.println("getQuestion");
       TriviaQuestionArrayAccess instance = new TriviaQuestionArrayAccess();
       TriviaQuestion result = instance.getRandomQuestion();
       assettNotNull("A random question was not returned in :: getRandomQuestion().", result);
    }

    /** 
     * Test of getQuestionList method of class TriviaQuestionArrayAccess.
     */
    @Test
    public void testGetQuestionList() {
        System.out.println("getQuestionList");
        long offset = 0L;
        TriviaQuestionArrayAccess instance = new TriviaQuestionArrayAccess();
        List<TriviaQuestion> result = instance.getQuestionList(offset);
        assertNotNull("Trivia question list not returned in :: getQuestionList.", result);
        assertEquals(10, result.size());
    }

    /**
     * Test of getQuestionListSize method of class TriviaQuestionArrayAccess.
     */
    @Test
    public void testGetQuestionListSize() {
        System.out.println("getQuestionListSize");
        TriviaQuestionArrayAccess instance = new TriviaQuestionArrayAccess();
        long expResult = 11;
        long result = instance.getQuestionListSize();
        assertEquals("There should be only 11 trivia questions in :: getQuestionListSize.", expResult, result);
    }

}
