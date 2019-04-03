package com.example.monaquiz;


import android.support.v7.app.AppCompatActivity;

public class QuestionLibrary extends AppCompatActivity {

//list of question
    private String mQuestion[] = {
            "Who was the first man to fly around the earth with a spaceship?",
            "what color is cobalt?",
            "Which device do we use to look at the stars?",
            "Which planet is nearest the sun?",
            "What is the capital city of Spain?",
            "A single unit of information in A computer Short for Binary digit typically represented as A1 OR 0? ",
            "A way of representing information using only two states:",
        "Colonized in the 16th century, what country took its name from the first name of the king of Spain?",
        "A message that can only have one of two possible values:",
        "What typ of food is spaghetti?"




    };
//list of answers
    private String mChoices[][] = {
            { "Aziz","John","Abdul","Gagarin"},
            {"Yellow", "Blue", "Black", "Pink"},
            {"Project", "Telescope", "TV","Radio "},
            { "Mercury","Earth", "Saturn", "Pluto"},
            {"New York", "New Jersy", "London", "Paris"},
            {"Bit","Bit Rate", "Binary","Protocol"},
            {"Protocol", "Binary Massege","Latence", "Binary"},
        {"Edwardor", "Venezuela", "The Philippines", "America"},
        {"Binary Massage", "Abstraction", "Binary", "Binary Question"},
        {"Orange","Pasta", "Rice","fish "},
    };
//check correct answer array
    public String mCorrectAnswers[] = {"Gagarin", "Blue", "Telescope", "Mercury",  "London", "Bit", "Latence", "The Philippines", "Binary","Pasta"};

    public int getLength() {
        return mQuestion.length;
    }

//return question number
    public String getQuestion(int a) {
        String question = mQuestion[a];
        return question;

    }
//return first choice
    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }
    //return second choice
    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }
    //return thirs choice
    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }
    //return fourth choice
    public String getChoice4(int a) {
        String choice3 = mChoices[a][3];
        return choice3;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }


}
