package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        System.out.println("Введите длину забора: ");
        var scanner = new Scanner(System.in).nextInt();
        int count_letter=15;
        int count_space=3;
        int length_three_letter=62;
        int length_one_space=12;
        int l = (count_letter/3)*62+3*12;
        if (l<scanner)
            System.out.println("надпись длиною "+scanner+" см. не поместится");
        else
            System.out.println("надпись длиною "+scanner+" см. поместится");
    }
}