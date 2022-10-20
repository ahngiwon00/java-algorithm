package stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        assertEquals(200,st.pop());
        //st.pop() 비어 있을땐?
        assertThrows(RuntimeException.class,()->{
            st.pop();
        });
        /*new Interface01(){
            public void runSth(){

            }
        }*/
    }

/* 존재하지 않는 빈의 이름으로 빈을 가져오려고 할 때 예외가 발생되는 상황을 테스트 하기 위한 메소드이다.
파라미터(발생이 예상되는 예외의 타입, 예외가 발생될 수 있는 코드 블록) 인 것이다!
() -> ac.getBean("xxxxx", MemberService.class) 를 실행 후 예외가 발생한다면
NoSuchBeanDefinitionException.class의 예외 타입과 일치하는지 확인하여 맞다면 테스트 성공이다~!*/
    @Test
    void isEmpty(){

        Stack02 st = new Stack02();
        assertTrue(st.isEmpty());
        st.push(10);
        /*assertFalse(st.isEmpty());
        st.pop();
        assertTrue(st.isEmpty());*/

    }

    @Test
    void peek(){
        Stack02 st = new Stack02();
        assertThrows(RuntimeException.class,
                ()->{
            st.peek();
        });
        st.push(10);
        int peeked = st.peek();
        assertEquals(10, peeked);
    }
}
