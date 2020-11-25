/* testScoresArray.java
CSCI 111-900
Last edited by Pat Doyle 11/12/19
 */
import java.util.Scanner;
public class testScoresArray {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        double[] testScores = new double [5];
        int i;

        System.out.println("Enter " + testScores.length + " test scores.");

        for (i=0; i < testScores.length; i++){
            System.out.println("Score: ");
            testScores[i] = scnr.nextDouble();
            System.out.println(testScores[i]);
        }

        double sum = 0;
        for(i = 0; i < testScores.length; i++) {
            sum = testScores[i] + sum;
        }
        
        i = 0;
        double min = testScores[i];
        double max = testScores[i];
        double avg = sum/testScores.length;

        for(i = 1; i < testScores.length; i++) {
            if (testScores[i] < min)
                min = testScores[i];
            if (testScores[i] > max)
                max = testScores[i];
        }

        System.out.println("Average: " + avg);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);



        }





    }

