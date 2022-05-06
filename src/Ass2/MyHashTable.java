package Ass2;

import java.util.LinkedList;

public class MyHashTable {
    private LinkedList[] hashtable;

    public class LinkedList {
        String key;
        String value;
        LinkedList next;

        public LinkedList(String key, String value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    public MyHashTable() {
        hashtable = new LinkedList[10];
    }

    private int hashKey(String key) {
        return key.length() % hashtable.hashCode();
    }

    public void put(String key, String value) {

        int i=getIndex(key);

        //LinkedList Entry
        LinkedList entry = new LinkedList(key, value);

        if(hashtable[i]==null) {
            //if no entry add it
            hashtable[i]= entry;
        }

        //in case of collision add new entry to the end
        else {
            LinkedList entries=hashtable[i];
            while(entries.next!=null) {
                //go to the end of list
                entries=entries.next;
            }
            //adding new entry
            entries.next=entry;
        }
    }

    public String get(String key){
        int i=getIndex(key);

        LinkedList entries=hashtable[i];

        //in case of we already have entry with that key
        if(entries!=null){
            // go through chain and find our match
            while (!entries.key.equals(key) && entries.next !=null) {
                entries = entries.next;
            }
            return entries.value;
        }
        return null;
    }

    private int getIndex(String key) {
        int hashedCode=key.hashCode();
        return Math.abs(hashedCode)%hashtable.length;
    }


}
