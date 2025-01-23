package com.example.demo.controller;

public class PracticeSum {

    public class Calculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // ユーザー入力を受け取る
            System.out.print("1つ目の数値を入力してください: ");
            int num1 = scanner.nextInt();
    
            System.out.print("2つ目の数値を入力してください: ");
            int num2 = scanner.nextInt();
    
            System.out.print("演算子を入力してください (+, -, *, /): ");
            char operator = scanner.next().charAt(0);
    
            // 演算を実行
            int result = 0;
            boolean valid = true;
    
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("エラー: 0で割ることはできません。");
                        valid = false;
                    }
                    break;
                default:
                    System.out.println("エラー: 無効な演算子です。");
                    valid = false;
            }
    
            // 結果を出力
            if (valid) {
                System.out.println("計算結果: " + num1 + " " + operator + " " + num2 + " = " + result);
            }
        }
    }
}
