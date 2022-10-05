package course_algo.homework5;

import java.util.Scanner;

class Exp {
        static Scanner sc = new Scanner(System.in);

        public static void main (String[] args){
            int number;
            int pow;

            System.out.print("Введите число - ");
            number = sc.nextInt();

            System.out.print("Введите степень - ");
            pow = sc.nextInt();

            if (pow < 0) {
                System.out.println("Result - " + 1/elevate (1, number, pow*-1));
            } else if (pow == 0) {
                System.out.println("Error");
            } else {
                System.out.println("Result - " + elevate (1, number, pow));
            }



        }

        static float elevate (float result, int num, int p) {
            if (p == 0) {
                return result;
            }
            return num*elevate (result, num, --p);
        }

    }

