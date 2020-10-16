package com.company;

public class Main {

    public static void main(String[] args) {
        subtraction(10,7,"apples");
        subtraction(88,3,"bananas");
        subtraction(-14,7,"tomatoes");
        subtraction(233,-4,"cherries");
        subtraction(378,5,"apricots");

    }

    public static int giveMe(){
        int ageOfPerson = 15;
        int temperature = 21;
        int butter // не знаю как и что тут указать



        if ((ageOfPerson > 20 && ageOfPerson < 45) && (temperature > -20 && temperature < 30)) {
            System.out.println("Можно идти гулять");
        } else if ((ageOfPerson < 20) && (temperature > 0 && temperature < 28)) {
            System.out.println("Можно идти гулять");
        } else if ((ageOfPerson > 45) && (temperature > -10 && temperature < 25)) {
            System.out.println("Можно идти гулять");
        } else {
            System.out.println("Оставайтесь дома");
        }

        return butter;
    }




    public static void subtraction(int num1, int num2, String text){
        System.out.println(num1 - num2);
        System.out.println(text);
    }
    public static int generateRandomAge(){
        int a = 0;
        int b = 90;
        int numb = a + (int) (Math.random() * b);
        System.out.println("Можно ли идти гулять" + numb);
        return numb;

    }




}
