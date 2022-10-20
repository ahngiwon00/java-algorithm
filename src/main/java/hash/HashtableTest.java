package hash;

import java.util.LinkedList;
class HashTable{
    //해쉬테이블에 저장할 데이터를 노드에 담음
    class Node{
        String key; // 검색 할 키
        String value;// 검색 결과를 보여줄 결과값
        //노드를 생성할때 key와 value 값을 받아 객체에 할당 받음
        public Node(String key, String value){
            this.key = key;
            this.value = value;
        }
        //value를 가져오고 저장하는 겟셋 메소드 벨류라는 이름으로 선언
        String value(){
            return value;
        }
        void value(String value){
            this.value= value;
        }
    }
    //data를 저장할 링크드리스트를 배열로 선언
    LinkedList<Node>[] data;
    //해쉬테이블을 선언하는 순간 해쉬테이블 크기를 미리 정함
    HashTable(int size){
        this.data=new LinkedList[size];
    }

    // Key를 받아서 해쉬코드를 반환하는 함수
    int getHashCode(String key){
        int hashcode = 0;
        for(char c : key.toCharArray()){//입력받은 키 문자열을 돌면서 각 문자의 아스키코드값을 hashcode에 저장
            hashcode+=c;
        }
        return hashcode;
    }

    //해쉬코드를 받아서 배열방에 인덱스 변환해주는 함수
    int covertToIndex(int hashcode){
        return hashcode % data.length;
    }

    // 인덱스로 배열방을 찾은 이후에 배열방에 노드가 여러가지 있을때 검색 키를 가지고 해당 노드 찾아오는 함수
    Node searchKey(LinkedList<Node>list, String key){
        if(list == null) //배열값이 비워있으면 null
            return null;
        //배열방에 있는 list를 돌면서 노드의 키가 검색하는 키와 같은지를 비교 같으면 노드 반환 못찾으면 null
        for(Node node : list){
            if(node.key.equals(key)){
                return node;
            }

        }
        return null;
    }

    //데이터를 받아서 저장하는 함수
    void put(String key,String value){
        int hashcode = getHashCode(key);
        int index = covertToIndex(hashcode);
        LinkedList<Node> list = data[index];//배열방의 번호를 이용해서 기존 배열방에 있던 데이터를 가져옴
        if(list==null){
            list= new LinkedList<Node>(); //비워 있으면 새로운 링크드리스트노드를 만듬
            data[index]=list; //배열방에 넣어줌
        }
        Node node = searchKey(list,key);//배열방에 기존의 해당키로 데이터를 가지고 있는 노드를 받아옴
        if(node == null){
            list.addLast(new Node(key,value));
        }
        else{
            node.value(value); //널이 아닌경우 해당 노드값을 대체
        }
    }
    //key를 가지고 데이터를 가져옴
    String get(String key){
        int hashcode=getHashCode(key);
        int index = covertToIndex(hashcode);
        LinkedList<Node> list = data[index];
        Node node = searchKey(list,key);
        return node == null ? "Not found" : node.value();
    }
}


public class HashtableTest {

    public static void main(String[] args) {
        HashTable h= new HashTable(3);
        h.put("sung","she is pretty");
        h.put("Jin","she is model");
        h.put("hee","she is angel");
        h.put("min","she is cute");
        h.put("sung","she is beautiful");
        System.out.println(h.get("sung"));
        System.out.println(h.get("Jin"));
        System.out.println(h.get("hee"));
        System.out.println(h.get("min"));
        System.out.println(h.get("jae"));
    }
}


