package stack;

import java.util.EmptyStackException;

public class Stack02 {
    private Integer[] arr;
    private int top=-1;

    public Stack02() {
        this.arr = new Integer[10000];
    }
    public Stack02(int size) {
        this.arr = new Integer[size];
    }

    public Integer[] getArr() {
        return arr;
    }

    public void push(int value) {
        this.arr[++this.top] = value;
    }

    public int pop() {
        if(this.isEmpty()){
            throw new RuntimeException("스택이 비었습니다");
            //throw new EmptyStackException();
        }

        int value = this.arr[this.top--];
        return value;

    }

    public boolean isEmpty() {
        if (top == -1)
            return true;
        else
            return false;
    }

    public int peek() {
        if(isEmpty()) {
            throw new RuntimeException("스택이 비었습니다");
        }
        return this.arr[this.top];
    }
}
