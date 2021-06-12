package com.ironhack.main;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world 2");
        long var2 = 23l;
        int a = 10;
        int b = 5;
        float var1 = 10.5f;
        System.out.println(var1);

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        if(a > 10){
            System.out.println("Mayor a 10");
        } else if (a == 10){
            System.out.println("Igual a 10");
        } else{
            System.out.println("Menor a 10");
        }

        int day = 8;

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend");
                break;
        }

        String result = "";

        if(day >= 1 && day <= 5){
            result = "Weekday";
        } else {
            result = "Weekend";
        }
        System.out.println("Today is " + result);

        // Operador ternario
        // variable = <condicion> ? <expr1> : <expr2>


        String resultTernario = (day >= 1 && day <= 5) ? "Weekday" : "Weekend";

        System.out.println(resultTernario);

        System.out.println(result.length());

        String productName = "   Producto uno";

        String date = "4-Ago";

        System.out.println(productFormatter(productName, date));


        String[] names ={"Pedro", "Alex", "Juan", "Patricia"};

        // For
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        //For each
        for (String name: names) {
            System.out.println(name);
        }

        int i = 0;
//        System.out.println(i++); Devuelve primero 0 porque imprime y luego hace la asignación
//        System.out.println(++i); Hace la asignación y luego devuelve el valor

        while(i < names.length){
            System.out.println(names[i++]);
        }

        // While verificas la condición antes de hacer la operación

        i = 0;
        do {
            System.out.println(names[i++]);
        } while (i < names.length);
        // Verificas la condición, lo que significa que al menos se va a ejecutar una vez....

        Arrays.stream(names).forEach(System.out::println); // Streams
        Arrays.stream(names).forEach(name -> System.out.println(name)); // Arrow Functions en Java


//
        int[] numbers = {5, 4, 3, 2, 1};

        int first = numbers[0];

        for (int j = 0; j < numbers.length ; j++) {

            if( j == numbers.length - 1){
                numbers[j] = numbers[j] * first;
            } else {
                numbers[j] = numbers[j] * numbers[j + 1];

            }

        }

        System.out.println(Arrays.toString(numbers));



        int[] numbers2 = {1, 2, 3, 4, 5};

        int[] results =new int[5];
        int element = numbers2.length - 1;
        for (int j = 0; j < numbers2.length; j++) {

            results[j] = numbers2[element];
            element = element - 1;
        }

        System.out.println(Arrays.toString(results));


//        int[] elements = {5, 4, 3, 2, 1};
//        multiplied(elements);
//        for (int index = 0; index< elements.length;index++){
//            System.out.println(elements[index]);
//        }
//
//
//
//
//        int[] elements2 = new int[5];
//        invert(elements,elements2);
//        for (int index= 0; index< elements2.length;index++){
//            System.out.println(elements2[index]);
//        }


        System.out.println(hello("Jose"));
    }


    public static String productFormatter(String productName, String date){
        String result = productName.trim().replace(" ", "_") + "_" + date;
        return result.toUpperCase();
    }




    public static void multiplied(int[] elements){
        int i = 0;
        int j = elements[0];
        while (i < elements.length){
            if (i == (elements.length - 1)) {
                elements[i] = elements[i] * j;
            } else {
                elements[i] = elements[i] * elements[i + 1];            }
            i++;
        }
    }
    public static void invert(int[] elements, int[] result){
        int i = elements.length;
        while (i > 0){
            result[i - 1] = elements[elements.length - i];
            i--;
        }
    }

    public static String hello(String name){
        return "Hello" + name;
    }

}
