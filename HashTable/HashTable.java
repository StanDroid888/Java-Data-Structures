/*
 * Programmer: Stanley Wong
 * Class: HashTable.java
 * Description: A implementation of a Open Address Hash Table
 * 
 */
public class HashTable {

	HashNode[] hashTable;
	int hashTableSize;
	int usedLocations;

	/**
	 * Constructor
	 * 
	 * @param size
	 */
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

	/**
	 * Creates a hash index based on key value passed in as argument.
	 * 
	 * @param key
	 * @return
	 */
	private int getHash(int key) {

		return (key % hashTableSize);

	}

	/*
	 * Add a new element into the hash table.
	 */
	public void put(int key) {

		int index = 0;
		boolean added = false;

		index = getHash(key);

		while (!added) {

			switch (this.hashTable[index].getNodeStatus()) {
			case IN_USE:
				/*
				 * If the getHash() returns a index already in use, increment
				 * the index until a free slot is found.
				 */
				index++;
				break;
			case PREVIOUSLY_USED:
			case UNUSED:
				/*
				 * Create a new Hash Node with the key value as the data and
				 * place it in the hash table. Increment the number of used
				 * locations and set the "added" boolean flag to TRUE.
				 */
				this.hashTable[index] = new HashNode(key);
				this.hashTable[index].setNodeStatus(Status.IN_USE);
				usedLocations++;
				added = true;
				break;
			default:
				added = false;
				break;
			}

		}
	}

	/**
	 * This method returns TRUE if the key passed in as a argument is in the
	 * hash table. Otherwise, the method returns FALSE signaling that the
	 * particular key is not in the hash table at this time.
	 * 
	 * @param key
	 * @return
	 */
	public boolean contains(int key) {

		int index = getHash(key);

		/*
		 * Check all Hash Nodes starting at the index which are being used.
		 */
		while (this.hashTable[index].getNodeStatus() == Status.IN_USE
				|| this.hashTable[index].getNodeStatus() == Status.PREVIOUSLY_USED) {
			/*
			 * Return true if a particular Key is found.
			 */
			if (this.hashTable[index].getData() == key) {
				System.out.println("Key " + this.hashTable[index].getData()
						+ " found.");
				return true;

			}
			/*
			 * Increment index value
			 */
			index++;
		}
		return false;
	}

	/**
	 * This method returns the integer value associated with the key passed in
	 * as a argument. If they key doesn't match a element in the hash table,
	 * then a value of (-1) is returned.
	 * 
	 * @param key
	 * @return returnValue
	 */
	public int get(int key) {

		int index = getHash(key);
		int returnValue = -1;

		/*
		 * Check to see if key is in fact a element in the hash table.
		 */
		if (contains(key)) {

			/*
			 * Check all Hash Nodes starting at the index which are being used.
			 */
			while (this.hashTable[index].getNodeStatus() == Status.IN_USE
					|| this.hashTable[index].getNodeStatus() == Status.PREVIOUSLY_USED) {

				/*
				 * Return TRUE if a particular Key is found.
				 */
				if (this.hashTable[index].getData() == key) {
					return (int) this.hashTable[index].getData();
				}
				/*
				 * Increment index
				 */
				index++;
			}
		} else {
			System.out.println("This key is NOT in the Hash Table!!");
		}

		return returnValue;
	}

	/**
	 * This method will delete a element from the Hash Table based on the
	 * particular key passed in.
	 * 
	 * @param key
	 */
	public void delete(int key) {

		/*
		 * Get index to start searching at.
		 */
		int index = getHash(key);

		/*
		 * Check to see if key is in fact a element in the hash table.
		 */
		if (contains(key)) {

			/*
			 * Check all Hash Nodes starting at the index which are being used.
			 */
			while (this.hashTable[index].getNodeStatus() == Status.IN_USE
					|| this.hashTable[index].getNodeStatus() == Status.PREVIOUSLY_USED) {

				/*
				 * Change the Node Status to PREVIOUSLY_USED
				 */
				if (this.hashTable[index].getData() == key) {
					this.hashTable[index].setNodeStatus(Status.PREVIOUSLY_USED);
					this.hashTable[index].setData(-1);
					System.out.println("Element with KEY:" + key
							+ " deleted from LOCATION: " + index);
					return;
				}
				/*
				 * Increment index
				 */
				index++;
			}
		} else {
			System.out.println("KEY: " + key + " is NOT in the Hash Table!!");
		}

		return;

	}

	/*
	 * This method will print out the contents of the Hash Table to standard
	 * output.
	 */
	public void printHash() {

		for (int i = 0; i < this.hashTableSize; i++) {

			System.out.print("Location " + i + " "
					+ hashTable[i].getNodeStatus());
			System.out.print(" | Key Value : " + hashTable[i].getData());
			System.out.println();

		}

		System.out.println("\nNumber of Available Slots: "
				+ (hashTableSize - usedLocations));

	}
}// End class HashTable.java
