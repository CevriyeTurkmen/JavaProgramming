package day32_CustomClassOverloading;

import java.util.concurrent.Callable;

public class ConstructorCalls {

    public ConstructorCalls(){
        System.out.println("Default Constructor");

    }

    public ConstructorCalls(int a){
        this();
        System.out.println("Constructor with int argument");
    }
    public ConstructorCalls (String str){
        this(10);
        System.out.println("Constructor with String argument");
    }


    public static void main(String[] args) {

        ConstructorCalls cons1= new ConstructorCalls();
        ConstructorCalls cons2= new ConstructorCalls(10);
        ConstructorCalls cons3=new ConstructorCalls("Java");


            }
        }
















