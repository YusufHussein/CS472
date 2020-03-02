package mum.cs472.quiz;

public class Quiz {
    public int qNumber;
    public int score;

    public Quiz() {
        score = 0;
        qNumber = 0;
    }

    public int getQNumber() {

        return qNumber;

    }

    public int getScore() {

        return score;

    }

    public void ourLogic(int answer) {

        if (this.qNumber == 5) {


        } else {
            if (answer == QuizDb.answers[qNumber]) {
                ++this.score;
                ++this.qNumber;
            } else {
                ++this.qNumber;
            }
        }

    }


}
