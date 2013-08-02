/*
 * Programmer: Stanley Wong
 * Class: HashTableDriver.java
 * Description: Driver File for HashTable.java
 */
public class HashTableDriver {

	public static void main(String[] args) {

		HashTableDriver hashTableProgram = new HashTableDriver();
		hashTableProgram.run();
	
	}
	
	public void run(){
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

		System.out.println(myHashTable.contains(30));	
		System.out.println(myHashTable.contains(67));	
		System.out.println("-------------------");
		System.out.println("Retreived value: " + myHashTable.get(20));
		
		myHashTable.delete(50);

		System.out.println("End program");
	}

}
