public class LinkedList {
    Node head, tail;
    int size;

    public LinkedList() {
        head = tail = null;
        size = 0;
    }

   

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }

    public void tampilkanAntrian() {
        Node current = head;
        int nomor = 1;
        while (current != null) {
            System.out.println("\nPasien #" + nomor++);
            current.data.tampilkanInformasi();
            current = current.next;
        }
    }
    void addFirst(Pasien input){ 
        Node ndINput = new Node(input, null); 
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
     public void enqueue(Pasien pasien) {
        Node newNode = new Node(pasien);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public Pasien dequeue() {
        if (head == null) return null;
        Pasien data = head.data;
        head = head.next;
        if (head == null) tail = null;
        size--;
        return data;
    }
}
