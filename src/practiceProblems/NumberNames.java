package practiceProblems;

import java.util.Scanner;

public class NumberNames {
    public static void main(String[] args) {
        System.out.print("Please enter number between 0 to 100: ");
        Scanner object = new Scanner(System.in);
        int number = object.nextInt();
        object.close();
        String name = " ";
        int temp = number, flag = 0;
        while (temp != 0) {
            temp /= 10;
            flag++;
        }
        int onesDigit = number % 10;
        int tensDigit = number / 10;
        if (number == 1) {
            System.out.println("1 is written as One.");
        } else if (number == 2) {
            System.out.println("2 is written as Two.");
        } else if (number == 3) {
            System.out.println("3 is written as Three.");
        } else if (number == 4) {
            System.out.println("4 is written as Four.");
        } else if (number == 5) {
            System.out.println("5 is written as Five.");
        } else if (number == 6) {
            System.out.println("6 is written as Six.");
        } else if (number == 7) {
            System.out.println("7 is written as Seven.");
        } else if (number == 8) {
            System.out.println("8 is written as Eight.");
        } else if (number == 9) {
            System.out.println("9 is written as Nine.");
        } else if (number == 0) {
            System.out.println("0 is writteen as Zero.");
        } else if (number == 100) {
            System.out.println("100 is written as Hundred.");
        } else if (flag == 2) {
            switch (tensDigit) {
                case 1:
                    switch (onesDigit) {
                        case 1 -> {
                            System.out.println("11 is wriiten as Eleven.");
                        }
                        case 2 -> {
                            System.out.println("12 is written as Twelve.");
                        }
                        case 3 -> {
                            System.out.println("13 is written as Thirteen");
                        }
                        case 4 -> {
                            System.out.println("14 is written as Fourteen");
                        }
                        case 5 -> {
                            System.out.println("15 is written as Fifteen");
                        }
                        case 6 -> {
                            System.out.println("16 is written as Sixteen");
                        }
                        case 7 -> {
                            System.out.println("17 is written as Seventeen");
                        }
                        case 8 -> {
                            System.out.println("18 is written as Eighteen");
                        }
                        case 9 -> {
                            System.out.println("19 is written as Nineteen");
                        }
                        case 0 -> {
                            System.out.println("10 is written as Ten.");
                        }
                    }
                case 2: {
                    name = "Twenty";
                    break;
                }
                case 3: {
                    name = "Thirty";
                    break;
                }
                case 4: {
                    name = "Forty";
                    break;
                }
                case 5: {
                    name = "Fifty";
                    break;
                }
                case 6: {
                    name = "Sixty";
                    break;
                }
                case 7: {
                    name = "Seventy";
                    break;
                }
                case 8: {
                    name = "Eighty";
                    break;
                }
                case 9: {
                    name = "Ninety";
                    break;
                }
            }
            if (onesDigit == 1) {
                System.out.println(number + " is written as " + name + "-One.");
            } else if (onesDigit == 2) {
                System.out.println(number + " is written as " + name + "-Two.");
            } else if (onesDigit == 3) {
                System.out.println(number + " is written as " + name + "-Three.");
            } else if (onesDigit == 4) {
                System.out.println(number + " is written as " + name + "-Four.");
            } else if (onesDigit == 5) {
                System.out.println(number + " is written as " + name + "-Five.");
            } else if (onesDigit == 6) {
                System.out.println(number + " is written as " + name + "-Six.");
            } else if (onesDigit == 7) {
                System.out.println(number + " is written as " + name + "-Seven.");
            } else if (onesDigit == 8) {
                System.out.println(number + " is written as " + name + "-Eight.");
            } else if (onesDigit == 9) {
                System.out.println(number + " is written as " + name + "-Nine.");
            } else if (onesDigit == 0) {
                System.out.println(".");
            }
        } else {
            System.out.println("Number is out of asked range......");
        }
    }
}
