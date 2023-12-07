package org.lessons.java.christmas;

public class Main {
    public static void main(String[] args) {
        int size = 1;
        String[] list = new String[size];
        Lista userList = new Lista(size, list);
        userList.writeIn(size, list);
    }
}
