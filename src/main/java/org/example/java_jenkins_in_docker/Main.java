package org.example.java_jenkins_in_docker;

public class Main {

        public static void main(String[] args) {
            System.out.println(checkIfInputIsAnEvenNumber(122)); // Testing in the main method
        }
    
        public static boolean checkIfInputIsAnEvenNumber(int number){
            return number % 2 == 0;
        }
    
}
