package com.company;



public class Main {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int number = 2;
        while (count <= 20) {
            if (isPrime(number)) {
                System.out.println(number);
            }
            count++;
            number++;
        }
    }

    public static boolean isPrime(int n) {
        boolean check = true;
        if (n <= 2) {
            check = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (Math.sqrt(n) % i == 0) {
                    check = false;
                    break;
                }
            }
        }
        return check;
    }
}

