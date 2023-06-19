package classes;

public class Calculator {

    public Calculator() {

    }

    public int add(int num,int nums){
        return (num+nums);
    }

    public int subtract(int num,int nums){
        return (num-nums);
    }

    public int multiply(int num,int nums){
        return (num*nums);
    }

    public double divide(double num,double nums){

        return (num/nums);
    }

}
//This should have functions for Add, Subtract, Multiply and Divide.
//Your methods should take in two ints to perform the calculations on (except the Divide method. This should take two doubles as arguments).