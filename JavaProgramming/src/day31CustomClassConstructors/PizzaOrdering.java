package day31CustomClassConstructors;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrdering {
    public static void main(String[] args) {

        ArrayList<Pizza> pizzas = new ArrayList<>();

        for (int i = 0; i < 100; i++) {

            Pizza pizzaSmall = new Pizza('S', 2, 3);
            Pizza pizzaMedium = new Pizza('M', 3, 4);
            Pizza pizzaLarge = new Pizza('L', 4, 5);

            pizzas.addAll(Arrays.asList(pizzaSmall, pizzaMedium, pizzaLarge));

        }
            System.out.println("total number of pizza :"+ pizzas.size());
            double totalPrice=0;
            for (Pizza pizza : pizzas) {
                totalPrice+=pizza.calcCost();

            }
            System.out.println(totalPrice);



        }








    }





