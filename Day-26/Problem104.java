//Quiz Application
import java.util.Scanner;

public class Problem104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Questions and answers
        String[] questions = {
            "Q1: What is the capital of India?\nA) Delhi\nB) Mumbai\nC) Kolkata\nD) Chennai",
            "Q2: Which language is used for Android development?\nA) Python\nB) Java\nC) C++\nD) Swift",
            "Q3: Who is known as the father of computers?\nA) Charles Babbage\nB) Alan Turing\nC) Bill Gates\nD) Steve Jobs"
        };

        char[] answers = {'A', 'B', 'A'};  // correct answers
        int score = 0;

        // Loop through questions
        for(int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print("Enter your answer (A/B/C/D): ");
            char userAns = Character.toUpperCase(sc.next().charAt(0));

            if(userAns == answers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! Correct answer: " + answers[i] + "\n");
            }
        }

        // Final score
        System.out.println("Quiz Over! Your score: " + score + "/" + questions.length);
    }
}