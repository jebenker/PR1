package uebung4;

public class Stack {

	// an object of the class Container is implement with the size 10
	Container CArray = new Container(10);
	private int pointer = 0;

	// push method
	public void push(char a) {

		// setter-method is called up that you can writing a value in CArray
		CArray.setValue(pointer, a);

		pointer += 1;
	}

	// pop method
	public char pop() {

		pointer--;

		// the value which is read by using the getter method is stored in a
		char a = CArray.getValue(pointer);

		// setter-method is called up that you can write 0 in CArray
		CArray.setValue(pointer, '0');

		return a;
	}
}

