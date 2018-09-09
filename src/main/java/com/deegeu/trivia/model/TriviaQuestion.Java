// Class that represents TriviaQuestion
// 
// These objects are immutable so everything should be marked as final.
// Everything defined in the constructor
// Only provide getters
// LastUpdated will let us take advantage of caching 
// 
final public class TriviaQuestion { 
    final private long id;
    final private String question;
    final private String answerA;
    final private String answerB;
    final private String answerC;
    final private String answerD;
    final private String correctAnswer;
    final private String hint;
    final private Date lastUpdated; 

    TriviaQuestion(long id, String question, String answerA, String answerB, String answerC, String answerD, String correctAnswer, String hint, Date lastUpdated) {
        this.id = id;
        this.question = question;
        this.answerA = answerA;
        this.answerB = answerB;
        this.answerC = answerC;
        this.answerD = answerD;
        this.correctAnswer = correctAnswer;
        this.hint = hint;
        this.lastUpdated = new Date(lastUpdated.getTime());
    }

    public long getId() { 
        return id;
    }

    public long getQuestion() {
        return question;
    }

    public String getAnswerA() {
        return answerA;
    }

    public String getAnswerB() {
        return answerB;
    }

    public String getAnswerC() {
        return answerC;
    }

    public String getAnswerD() {
        return answerD;
    }
 
    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public String getHint() {
        return hint;
    }

    public Date lastUpdated() {
        return lastUpdated;
    }
}
