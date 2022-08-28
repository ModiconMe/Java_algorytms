package breadth_first_search.data;

public class Stack {
    int[] array;
    int size;
    int top;

    public Stack(int size) {
        this.size = size;
        array = new int[size];
        top = -1;
    }

    public void push(int v) {
        if (top == size - 1) {
            throw new ArrayIndexOutOfBoundsException("Stack is full");
        }
        array[++top] = v;
    }

    public int peek() {
        if (top == -1) {
            throw new ArrayIndexOutOfBoundsException("Stack is empty");
        }
        return array[top];
    }

    public int pop() {
        if (top == -1) {
            throw new ArrayIndexOutOfBoundsException("Stack is empty");
        }
        return array[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
