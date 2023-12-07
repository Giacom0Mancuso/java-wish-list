package org.lessons.java.christmas;

import java.util.Scanner;

public class Lista {
    private int size;
    private String[] list = new String[size];

    public Lista(){
        this.list = list;
        this.size = size;
    }

    public String[] getList() {
        return list;
    }

    public int getSize() {
        return size;
    }

    public void writeIn(){
        String newGift;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i<=list.length; i++){
            System.out.println("Enter a new gift");
            newGift = scanner.nextLine();
            if (repetitionCheck(newGift, list)){
                list[i] = newGift;
            }
            else{
                System.out.println("You have already enter this gift");
                size = size - 1;
            }
            if (i == list.length) {
                System.out.println("Do you want to add more? y/n");
                String yesOrNot = scanner.nextLine();
                if (yesOrNot.equals("yes") || yesOrNot.equals("y")) {
                    size++;
                }
            }
        }
    }

    private Boolean repetitionCheck (String Gift, String[] list){
        for (int i = 0; i<list.length; i++){
            if (Gift.equals(list[i])){
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString(){
        String info = "";
        for (int i = 0; i<list.length; i++){
            info = info + list[i] + ", ";
        }
        return info;
    }

}
