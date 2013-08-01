/*
 * Programmer: Stanley Wong
 * Class: HashTableDriver.java
 * Description: Driver File for HashTable.java
 */
public class HashTableDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		HashTable myHashTable = new HashTable(20);

		myHashTable.put(15);
		myHashTable.put(3);
		myHashTable.put(22);
		myHashTable.put(20);
		myHashTable.put(24);
		myHashTable.put(44);
		myHashTable.put(18);
		myHashTable.put(100);
		myHashTable.put(30);
		myHashTable.put(50);



		myHashTable.printHash();

	}

}
