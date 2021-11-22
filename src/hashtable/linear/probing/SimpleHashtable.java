package hashtable.linear.probing;

import employee.Employee;

public class SimpleHashtable {

    private StoredEmployee[] hashtable;

    public SimpleHashtable() {
        hashtable = new StoredEmployee[10];
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);

        // check if value occupied in the array or not.
        if (occupied(hashedKey)) {
            int stopIndex = hashedKey;
            // check if the key is at the end of the array
            // true -> set hashedKey to start of the array
            if (hashedKey == hashtable.length - 1) {
                hashedKey = 0;
            }
            // false -> increment hashedKey to next value in the array
            else {
                hashedKey++;
            }
            // looping until it found a free space in the array.
            while (occupied(hashedKey) && hashedKey != stopIndex) {
                hashedKey = (hashedKey + 1) % hashtable.length;
            }
        }
        // if loop ends and no still the key is occupied then print array is full message.
        if (occupied(hashedKey)) {
            System.out.println("Sorry, there's already an employee at position " + hashedKey);
        }
        //  the key is not occupied then we assign the new value in the array.
        else {
            hashtable[hashedKey] = new StoredEmployee(key, employee);
        }
    }

    public Employee get(String key) {
        // searching for key using the findKey method
        int hashedKey = findKey(key);
        // if findKey method give us -1 -> the key is not in the array :(

        if (hashedKey == -1) {
            return null;
        }
        // if not -> we return the founded key.
        return hashtable[hashedKey].employee;
    }

    public void remove(String key) {
        // searching for key using the findKey method
        int hashedKey = findKey(key);
        // if findKey method give us -1 -> the key is not in the array :(
        if (hashedKey == -1) {
            return;
        }
        // if not -> we delete the founded key.
        hashtable[hashedKey] = null;

        // we re-hash all array again to avoid bugs.
        StoredEmployee[] oldHashtable = hashtable;
        hashtable = new StoredEmployee[oldHashtable.length];
        for (StoredEmployee storedEmployee : oldHashtable) {
            if (storedEmployee != null) {
                put(storedEmployee.key, storedEmployee.employee);
            }
        }

    }

    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }

    private int findKey(String key) {
        int hashedKey = hashKey(key);
        // check if the key matches the simple hashed value or not
        // true -> key founded!
        if (hashtable[hashedKey] != null &&
                hashtable[hashedKey].key.equals(key)) {
            return hashedKey;
        }
        // false -> we loop the entire array checking for values until we found the key.


        int stopIndex = hashedKey;
        if (hashedKey == hashtable.length - 1) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }

        while (hashedKey != stopIndex &&
                hashtable[hashedKey] != null &&
                !hashtable[hashedKey].key.equals(key)) {
            hashedKey = (hashedKey + 1) % hashtable.length;
        }
        // check after the loop if the key matches the new hash value.
        // true -> key founded!
        if (hashtable[hashedKey] != null &&
                hashtable[hashedKey].key.equals(key)) {
            return hashedKey;
        }
        // false -> key is not in the array :(
        else {
            return -1;
        }
    }

    private boolean occupied(int index) {
        return hashtable[index] != null;
    }

    public void printHashtable() {
        for (int i = 0; i < hashtable.length; i++) {
            if (hashtable[i] == null) {
                System.out.println("empty");
            } else {
                System.out.println("Position " + i + ": " + hashtable[i].employee);
            }
        }
    }

}
