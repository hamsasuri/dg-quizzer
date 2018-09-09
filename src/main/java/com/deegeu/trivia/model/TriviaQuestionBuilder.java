


class TriviaQuestionBuilder {
    public TriviaQuestion build() {
        if ((id <0) 
            || (this.question.equals("") || this.question.trim().isEmpty())
            || (this.answerA.equals("") || this.answerA.trim().isEmpty())
            || (this.answerB.equals("") || this.answerB.trim().isEmpty())
            || (this.answerC.equals("") || this.answerC.trim().isEmpty())
            || (this.answerD.equals("") || this.answerD.trim().isEmpty())
            || (this.correctAnswer.equals("") || this.correctAnswer.trim().isEmpty())
            || (this.hint.equals("") || this.hint.trim().isEmpty())
            || (this.lastUpdated == null)) {

            throw new IllegalStateException("TriviaQuestion builder not in buildable state.");    

         }
         return new TriviaQuestion(
             this.id, 
             this.question,
             this.answerA,
             this.answerB,
             this.answerC,
             this.answerD,
             this.correctAnswer,
             this.hint,
             this.lastUpdated
        );
        
        public TriviaQuestionBuilder id(long id) {
            if (id < 0) 
               throw new IllegalArgumentException("Id cannot be less than 0");
            this.id = id;
            return this;
        }

        public TriviaQuestionBuilder question(String question) {
            if (question == null || question.trim().isEmpty()) {
               throw new IllegalArgumentException("Question cannot be null or empty");
            }
            this.question = question;
            return this;
        }

        public TriviaQuestionBuilder answerA(String answer) {
            if (answer == null || answer.trim().isEmpty()) {
               throw new IllegalArgumentException("AnswerA cannot be null or empty");
            }
            this.answerA = answer;
            return this;
        }

        public TriviaQuestionBuilder answerB(String answer) {
            if (answer == null || answer.trim().isEmpty()) {
               throw new IllegalArgumentException("AnswerB cannot be null or empty");
            }
            this.answerB = answer;
            return this;
        }


        public TriviaQuestionBuilder answerC(String answer) {
            if (answer == null || answer.trim().isEmpty()) {
               throw new IllegalArgumentException("AnswerC cannot be null or empty");
            }
            this.answerC = answer;
            return this;
        }


        public TriviaQuestionBuilder answerD(String answer) {
            if (answer == null || answer.trim().isEmpty()) {
               throw new IllegalArgumentException("AnswerD cannot be null or empty");
            }
            this.answerD = answer;
            return this;
        }

        public TriviaQuestionBuilder hint(String hint) {
            if (hint == null || hint.trim().isEmpty()) {
               throw new IllegalArgumentException("Hint cannot be null or empty");
            }
            this.hint = hint;
            return this;
        }

        public TriviaQuestionBuilder lastUpdated(Date lastUpdated) {
            if (lastUpdated == null) {
               throw new IllegalArgumentException("LastUpdated cannot be null or empty");
            }
            this.lastUpdated = lastUpdated;
            return this;
        }
    }
}
