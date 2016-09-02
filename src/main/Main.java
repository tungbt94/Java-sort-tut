package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by tungb on 9/3/2016.
 */
public class Main {
    public static void main(String[] args) {
        //init
        Scanner input = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<>();

        //get input
        System.out.println("Nhap so sinh vien trong lop: ");
        int n = input.nextInt();
        input.nextLine();//clear enter in cache
        String temp = null;
        for(int i = 0; i < n; i++) {
            temp = input.nextLine();
            nameList.add(temp);
        }

        //sort nameList
        Collections.sort(nameList);

        //print nameList
        System.out.println("Danh sach sinh vien da sap xep: " + nameList.toString());
    }
}
