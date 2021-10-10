package ru.dataart.academy.java;

public class ReverseInteger {
    /**
     * @param inputNumber - any integer value
     * @return - inputNumber in reversed order
     * Example: 1234 -> 4321
     * -23 -> -32
     * 120 -> 12
     * -2,147,483,648 -> exception, error message
     */

    public int reverse(int inputNumber) throws Exception {
        boolean minus = false;
        long reverseNumber = 0;
        if (0 > inputNumber) {
            inputNumber = inputNumber * -1;
            minus = true;
        }
        while (inputNumber > 0) {
            reverseNumber = 10 * reverseNumber;
            reverseNumber += inputNumber % 10;
            inputNumber = inputNumber / 10;
        }
        if (reverseNumber != (int) reverseNumber) {
            throw new Exception("Error");
        }
        if (minus) {
            return (int) reverseNumber * -1;
        }
        return (int) reverseNumber;
    }
}
