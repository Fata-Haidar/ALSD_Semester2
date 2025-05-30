public class SingleLinkedList { 
    NodeMahasiswa09 head; 
    NodeMahasiswa09 tail; 
    boolean isEmpty(){ 
        return (head==null); 
    }
    void print(){ 
        if(!isEmpty()){ 
            NodeMahasiswa09 tmp = head; 
            System.out.println("Isi Linked List:\t"); 
            while(tmp!=null){ 
                tmp.data.tampilInformasi(); 
                tmp = tmp.next; 
            } 
            System.out.println("");
        }else{ 
            System.out.println("Linked List kosong"); 
        } 
    }
    void addFirst(Mahasiswa09 input){ 
        NodeMahasiswa09 ndINput = new NodeMahasiswa09(input, null); 
        if(isEmpty()){ 
            head = ndINput; 
            tail = ndINput; 
        }else{ 
            ndINput.next = head; 
            head = ndINput; 
        }
    }
    void addLast(Mahasiswa09 input){ 
        Node ndINput = new NodeMahasiswa09(input, null); 
        if(isEmpty()){ 
            head = ndINput; 
            tail = ndINput; 
        }else{ 
            tail.next = ndINput; 
            tail = ndINput; 
        } 
    }
    void insertAfter(Mahasiswa09 input, String key){ 
        NodeMahasiswa09 ndInput = new Node(input, null); 
        NodeMahasiswa09 temp = head; 
        do { 
            if (temp.data.nama.equalsIgnoreCase(key)) { 
                ndInput.next = temp.next; 
                temp.next = ndInput; 
                if (ndInput.next == null) { 
                    tail = ndInput; 
                } break; 
            } 
            temp = temp.next; 
        } while (temp != null); 
    } 
     
} 
