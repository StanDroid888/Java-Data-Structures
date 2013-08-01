/*
 * Programmer: Stanley Wong
 * Class: HashTable.java
 * Description: This class contains the implementation of a Open Address Hash Table.
 * 
 */
public class HashTable {

	HashNode[] hashTable;
	int hashTableSize;
	int usedLocations;

	public HashTable(int size) {

		this.hashTableSize = size;
		this.hashTable = new HashNode[hashTableSize];

		/*
		 * Initialize
		 */

		HashNode initHashNode = new HashNode(-1);

		initHashNode.setNodeStatus(Status.UNUSED);
		initHashNode.setOccurances(0);

		for (int i = 0; i < hashTableSize; i++) {

			hashTable[i] = initHashNode;
			usedLocations = 0;

		}

	}

	/*
	 * Add a new element into the hash table.
	 */
	void put(int key) {

		int index = 0;

		/*
		 * Create a index based on the key.
		 */
		index = (key % hashTableSize);

		/*
		 * Create a new Hash Node with the key value as the data and place it in
		 * the hash table.
		 */
		this.hashTable[index] = new HashNode(key);

	}

	int get(int key) {
		return 0;
	}

	boolean contains(int key) {
		return false;
	}

	void delete(int key) {
	}

	void printHash() {

		for (int i = 0; i < this.hashTableSize; i++) {

			System.out.print("Location " + i + " " + hashTable[i].getNodeStatus());
			System.out.print(" | Key Value : " + hashTable[i].getData());
			System.out.println();

		}

	}
}
