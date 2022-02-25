package com.company;

public class Assignment_6_B {
    public static void main(String[] args){
        int line_count = 10;
        int space_count = 0;
        int star_count = 10;
        for (int i = 0; i < line_count; i++){
            String line = "";
            for (int s = 0; s < space_count; s++){
                line = line + " ";
            }
            for (int t = 0; t < star_count; t++){
                line = line + "*";
            }
            System.out.println(line);
            space_count++;
            star_count--;
        }
    }
}
