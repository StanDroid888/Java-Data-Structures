
public class HashTableDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		HashTable myHashTable = new HashTable(20);
		
		myHashTable.put(22);
		myHashTable.put(3);
		
		myHashTable.printHash();
		
	}

}
