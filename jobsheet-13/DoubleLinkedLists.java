public class DoubleLinkedLists {
    Node09 head;
    Node09 tail;

    DoubleLinkedLists(){
        head = null;
        tail=null;
    }
    boolean isEmpty(){
        return head=null;
    }
    void addFirst(Mahasiswa09 data){ 
        Node09 newNode = new Node9(data);   
        if(isEmpty()){ 
            head = tail = newNode; 
        }else{
            newNode.next = head; 
            head.prev = newNode; 
            head = newNode; 
        } 
    }
    void addLast(Mahasiswa09 data){ 
        Node09 newNode = new Node09(data); 
        if(isEmpty()){ 
            head = tail = newNode; 
        }else{ 
            tail.next = newNode; 
            newNode.prev = tail; 
            tail = newNode; 
        }
        public void insertAfter(String key, Mahasiswa09 data){  
        Node09 current = head; 
        while(temp!=null){ 
            if(current.data.nim.equalsIgnoreCase(key)){ 
               if(current == tail){ 
                    addLast(data); 
               }else{ 
                    newNode.next = current.next; 
                    newNode.prev = temp; 
                    temp.next.prev = newNode; 
                    temp.next = newNode; 
               } 
            } 
            temp = temp.next; 
        } 
        if(temp == null){ 
            System.out.println("Insertion failed. Data ("+key+") not found!!"); 
        } 
    }  
    }   
    
}