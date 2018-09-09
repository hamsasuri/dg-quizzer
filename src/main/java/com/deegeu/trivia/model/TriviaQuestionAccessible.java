// Interface to hold data in a list
// decouple classes 
// will put in database later


public interface TriviaQuestionAccessible {
  TriviaQuestion getQuestionByIndex(long index);
  TriviaQuestion getQuestionById(long id);
  TriviaQuestion getRandomQuestion();
  List<TriviaQuestion> getQuestionList(long offset);
  List<TriviaQuestion> getSpecifiedQuestionList(long... id);
  long getQuestionListSize();
}
