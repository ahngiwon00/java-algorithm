package stack;

public class Stack01 {
    private int[] arr = new int[10000]; //기본은 만개
    private int top=-1; //현재 위치를 가르킴(-1은 스택에 아무것도 안들어가 있는 것을 가르킴)
    public Stack01() { //생성자
    }

    public Stack01(int size) {  //파라미터로 크기를 받는 생성자
        this.arr = new int[size];
    }

    public void push(int value) { //삽입 하는 메소드
        this.top++;//현재 위치에 값을 하나 증가 시켜 다음 인덱스를 가르키게 함
        this.arr[this.top] = value; //포인터가 가르키는 인덱스에 value 값이 들어감

    }

    public int pop() {

        int value = this.arr[this.top];  //현재 가르키는 인덱스의 값을 value에 담음(삭제 될 값)
        this.top--; //삭제 후 인덱스를 1감소
        return value;

    }

    public int[] getArr(){ //배열 반환하는 메소드
        return arr;
    }
}
