// Array Implementation of Trivia Question list


public class TriviaQuestionArrayAccess implements TriviaQuestionAccessible {
    private ArrayList<TriviaQuestion> questionList;
    static private final int MAX_NUMBER_OF_QUESTIONS_PER_PAGE = 10;

    public TriviaQuestionArrayAccess() {
        this.loadQuestionArray();
    }

    private void loadQuestionArray() {
        questionList = new ArrayList<>();
        questionList.add((new TriviaQuestionBuilder())
             .id(0)
             .question("How many feet are there in a mile?")
             .answerA("5260")
             .answerB("5270")
             .answerC("5280")
             .answerD("5290")
             .correctAnswer("C")
             .hint("The altitude of Denver, Colorado")
             .lastUpdated(new Date())
             .build()
        );
        questionList.add(new TriviaQuestionBuilder(1, "How many fingers does a normal human have per hand?", "5", "6", "4", "3", "2", "C", "The number is prime", new Date()).build());
    }

    @Override
    public TriviaQuestion getQuestionByIndex(long index) {
        // force conversion from long to an int intentionally
        return ((int) index < questionList.size()) ? questionList.get((int) index) : null;
    }	

    @Override 
    public TriviaQuestion getQuestionById(long id) {
        for(TriviaQuestion question: questionList) {
           if(question.getId() == id) {
              return question;
           }
        }
        return null;
    }

    @Override
    public TriviaQuestion getRandomQuestion() {
       int index = (new Random().nextInt(questionList.size());
       return questionList.get(index);
    }

    @Override
    public List<TriviaQuestion> getQuestionList(long offset) {
        long start = offset;
        if (start < 0) {
           start = 0;
        }
        if (start >= questionList.size()) { 
           start = questionList.size();
        }
        long end = start + MAX_NUMBER_OF_PERSONS_PER_PAGE;
        if (end >= questionList.size()) {
           end = questionList.size();
        }
        return questionList.subList((int) start, (int) end);
    }
   
    @Override
    public List<TriviaQuestion> getSpecifiedQuestionList(long... ids) {
        List<TriviaQuestion> returnList = new ArrayList<>();
        for (long currentId: ids) {
            returnList.add(getQuestionById(currentId);
        }
    }

    @Override
    public long getQuestionListSize() {
        return questionList.size();
    }
}




