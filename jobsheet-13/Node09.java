public class Node09 {
    Mahasiswa09 data; 
    Node09 next;
    Node09 prev; 
    
    Node09(){
    }
    Node09(Mahasiswa09 data){
        thi.data=data;
        prev=null;
        next=null;
    }
    public Node09( Node09 prev, Mahasiswa09 data, Node09 next){ 
     this.data = data; 
     this.prev = prev; 
     this.next = next;
    } 
}