package com.example;

public class Simple {
    public Simple() {
        super();
    }

    public void DoSomething() {
        System.out.println("Hello World!");
    }

    public void CalculateFibonnaci(){
        int n = 10;
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 0; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
    }

    public void CalculateFibonnaciRecursive(int n){
        if (n == 0) {
            System.out.println(0);
        } else if (n == 1) {
            System.out.println(1);
        } else {
            CalculateFibonnaciRecursive(n - 1);
            CalculateFibonnaciRecursive(n - 2);
            System.out.println(n);
        }
    }

    public boolean IsGreater(int a, int b){
        return a > b;
    }
    
}
