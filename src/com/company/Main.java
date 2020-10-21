package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String vvelIma = sc.nextLine();
        System.out.println("Сколько вам лет? ");
        int vvelAge = sc.nextInt();
        System.out.println("Сколько градусов на улице? ");
        int temperatura = sc.nextInt();
        System.out.println(one(vvelIma, vvelAge, temperatura));

    }

    public static String one(String name, int age, int temperatureOne) {
        if ((age > 20 && age < 45) && (temperatureOne > -20 && temperatureOne < 30))
            return name + ", не выходишь гулять";
        else if (age < 20 && (temperatureOne > 0 && temperatureOne < 28))
            return name + ", не выходишь гулять";
        else if (age > 45 && (temperatureOne > -10 && temperatureOne < 25))
            return name + ", не выходишь гулять";
        else
            return name + ", иди в гости к другу"; 



    }
}


