package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите натуральное число:");
        int inputNumber=scanner.nextInt();
        if(inputNumber<=0){
            System.out.println("Число не должно быть отрицательное или равно нулю.Введите другое число:");
            inputNumber=scanner.nextInt();
        }
        int primeTwo;
        for(int i=1;i<inputNumber;i++){
            if(isPrimeNumber(i)){
                primeTwo=i+2;
                if(isPrimeNumber(primeTwo)){
                    System.out.println(i+" "+primeTwo);
                }
            }
        }
    }
    public static boolean isPrimeNumber(int number){
        boolean isPrime=true;
        for(int i=2;i<number;i++){
            if(number%i==0){
                return false;
            }
        }
        return isPrime;
    }
}
