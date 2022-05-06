package Ass2;

public class MyHashTable {
    private LinkedList[] hashtable;
    private int num;

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
            while(entries != null) {
                //go to the end of list
                if (entries.key.equals(key)) {
                    entries.value = value;
                    return;
                }
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

    public void remove(String key) {
        int i=getIndex(key);
        if(hashtable[i]==null) return;
        if (hashtable[i].key.equals(key)) {
            hashtable[i]=hashtable[i].next;
            num++; //remove num of items in the table
            return;
        }
        while(hashtable[i].next!=null && !hashtable[i].next.key.equals(key)) {
            hashtable[i].next=hashtable[i].next.next;
            hashtable[i]=hashtable[i].next;
        }
        if (hashtable[i].next!=null) {
            hashtable[i].next=hashtable[i].next.next;
            num--;
        }
    }
}
