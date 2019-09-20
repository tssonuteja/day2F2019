package com.lambton;

public class Arithmetic
{
    int add(int a,int b)
    {
        int c;
        c=a+b;
        return c;
    }

    int sub(int a, int b)
    {
        int c;
        c=a-b;
        return c;
    }

    int mul(int a, int b)
    {
        int c;
        c=a*b;
        return c;
    }
    int div(int a,int b)
    {
        int c;
        c=a/b;
        return c;
    }

    int mod(int a, int b)
    {
        int c;
        c=a%b;
        return c;
    }

    public static class collegeExample
    {
        public static void main(String[] args)
        {
            Arithmetic  arithmetic = new Arithmetic();


        }
    }
}
