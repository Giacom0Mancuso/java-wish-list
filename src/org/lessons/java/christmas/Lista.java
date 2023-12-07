package org.lessons.java.christmas;

import java.util.Scanner;

public class Lista {
    private int size = 0;

    private String[] list = new String[size];

    public Lista(int size, String[] list){
        this.list = list;
        this.size = size;
    }

    public String[] getList() {
        return list;
    }

    public void setList(String[] list) {
        this.list = list;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void writeIn(int size, String list[]){
        String newGift;
        list = new String[size];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i< size; i++){
            boolean notDone = true;
            System.out.println("Enter a new gift");
            newGift = scanner.nextLine();
            if (repetitionCheck(newGift, list)){
                list[i] = newGift;
            }
            else if (!repetitionCheck(newGift, list)){
                System.out.println("You have already enter this gift");
                i = i - 1;
                notDone = false;
            }
            if (notDone) {
                System.out.println("the size of the lis is of " + size);
                System.out.println("Do you want to add more? y/n");
                String yesOrNot = scanner.nextLine();
                if (yesOrNot.equals("yes") || yesOrNot.equals("y")) {
                    size = size + 1;
                    String[] temp = new String[size];
                    for (int j = 0; j < list.length; j++) {
                        temp[j] = list[j];
                    }
                    list = temp;
                }
            }
        }
        printArray(list);
    }
    private Boolean repetitionCheck (String Gift, String[] list){
        for (int i = 0; i< list.length; i++){
            if (Gift.equals(list[i])){
                return false;
            }
        }
        return true;
    }
    public void printArray(String[] list){
        String info = "";
        for (int i = 0; i < list.length; i++) {
            if (i< list.length-1) {
                info = info + list[i] + ", ";
            }else{
                info = info + list[i] + ".";
            }
        }
        System.out.println(info);
    }
}
