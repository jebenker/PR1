package uebung4;

//class for implement a dynamic array
public class Container {

	private int size;
	private char[] value;

	/*
	 * constructor for the class container size -> memory reserved; size is the size
	 * of the memory
	 */
	public Container(int size) {
		value = new char[size];
		this.size = size;
	}

	/*
	 * setter-method; function to write a value into the container array at the
	 * specified index
	 */
	public void setValue(int index, char value) {
		if (index < 0) {
			// System.out.println("Index zu klein!");
			return;
		} else {
			if (index >= this.size) {
				resize(index + 100);
			}
		}
		this.value[index] = value;
	}

	// getter-method; reads the value from the specified index
	char getValue(int index) {
		if (index < 0 || index >= this.size) {
			return 0;
		} else {
			return value[index];
		}
	}

	// method; enlarges the container by copying its contents
	public void resize(int newSize) {
		char value2[] = new char[newSize];
		for (int t = 0; t < size; t++) {
			value2[t] = value[t];
		}
		value = value2;
		size = newSize;
	}

}

