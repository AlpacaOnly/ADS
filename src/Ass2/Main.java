package Ass2;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        MyHashTable hashTable = new MyHashTable();
        hashTable.put("Bottle", "Water");
        hashTable.put("Bottle", "Lemon-water");
        System.out.println(hashTable.get("Bottle"));
        hashTable.remove("Bottle");
        System.out.println(hashTable.get("Bottle"));
    }

}
