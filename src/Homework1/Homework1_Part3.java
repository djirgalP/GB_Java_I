package Homework1;

import java.util.Scanner;
import java.util.Stack;

public class Homework1_Part3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the expression using (, ), +, -, / or * -> ");
        String expression = scanner.nextLine();
        System.out.println(solveExpression(expression));
        scanner.close();
    }
    private static double solveExpression(String expression){
        String expressionPrepared = preparingExpression(expression);
        String polishExp = transformingExpressionToPolish(expressionPrepared);
        return calculatePolishExpression(polishExp);
    }
    /*Filling with additional '0' in case if expression starts with '-n' or contains negative numbers like '(-n' */
    private static String preparingExpression(String expression){
        String preparedExpression = new String();
        for (int i = 0; i < expression.length(); i++) {
            char symbol = expression.charAt(i);
            if (symbol == ' ') { //removing spaces
                continue;
            }
            else if (symbol == '-') {
                if (i == 0) {
                    preparedExpression += '0';
                    preparedExpression += symbol;
                }
                else if (expression.charAt(i - 1) == '(') {
                    preparedExpression += '0';
                    preparedExpression += symbol;
                }
                else
                    preparedExpression += symbol;
            }
            else
                preparedExpression += symbol;
        }
        return preparedExpression;
    }

    private static String transformingExpressionToPolish(String expression){

        String polishExpression = new String();
        Stack <Character> characterStack = new Stack<>();
        int priority;
        for (int i = 0; i < expression.length(); i++) {
            priority = getPriority(expression.charAt(i));
            if (priority == 0) { //if it's a digit [0-9]
                polishExpression += expression.charAt(i);
            }
            if (priority == 1) {//if it's '(' -> stack
                characterStack.push(expression.charAt(i));
            }
            if (priority > 1) {//if it's one of the operations: '+ - * /'
                polishExpression += " ";
                while (!characterStack.empty()) {
                    if (getPriority(characterStack.peek()) >= priority) {
                        polishExpression += characterStack.pop();
                    } else
                        break;
                }
                characterStack.push(expression.charAt(i));
            }
            if (priority == -1) {//if it's ')' -> stack
                polishExpression += " ";
                while (getPriority(characterStack.peek()) != 1) {
                    polishExpression += characterStack.pop();
                }
                characterStack.pop();
            }
        }
        while (!characterStack.empty()) {
            polishExpression += characterStack.pop();
        }
        return polishExpression;

    }

    private static double calculatePolishExpression(String polishExpression){
        String operand;
        Stack <Double> doubleStack = new Stack<>();
        for (int i = 0; i < polishExpression.length(); i++) {
            if (polishExpression.charAt(i) == ' ') continue;

            if (getPriority(polishExpression.charAt(i)) == 0) {
                operand = new String();
                while ((polishExpression.charAt(i) != ' ') && (getPriority(polishExpression.charAt(i)) == 0)) {
                    operand += polishExpression.charAt(i++);
                    if (i == polishExpression.length()) break;
                }
                doubleStack.push(Double.parseDouble(operand));
            }
            if ((getPriority(polishExpression.charAt(i)) > 1) && (!doubleStack.empty())) {
                double value1 = doubleStack.pop();
                double value2 = doubleStack.pop();
                if (polishExpression.charAt(i) == '+') doubleStack.push(value2+value1);
                if (polishExpression.charAt(i) == '-') doubleStack.push(value2-value1);
                if (polishExpression.charAt(i) == '*') doubleStack.push(value2*value1);
                if (polishExpression.charAt(i) == '/') doubleStack.push(value2/value1);
            }
        }
        return doubleStack.pop();
    }

    private static int getPriority(char operator) {
        int priority = 0; //by default for all digits

        if (operator == ')')
            priority = -1;
        else if (operator == '(')
            priority = 1;
        else if ((operator == '+') || (operator == '-'))
            priority = 2;
        else if ((operator == '*') || (operator == '/'))
            priority = 3;

        return priority;
    }

}
