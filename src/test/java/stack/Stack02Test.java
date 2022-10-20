package stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Stack02Test {
    @BeforeEach//클래스 내에 존재하는 각각의 @Test 를 실행하기 전에 매번 실행
    void setUp() {

    }

    @Test
    @DisplayName("push가 잘되는지")
    void push(){
        Stack02 st = new Stack02();
        st.push(10);
        st.push(20);
        Integer[] arr = st.getArr();
        assertEquals(20,arr[1]);
        assertEquals(20,arr[0]);

    }
    @Test
    void pushAndPop(){
        Stack02 st = new Stack02();
        st.push(10);
        st.push(200);
        assertEquals(10,st.pop());
    }
}
