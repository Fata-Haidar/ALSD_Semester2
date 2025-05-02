
public class StackTugasMahasiswa09 {

    Mahasiswa09[] stack;
    int size;
    int top;
    int bottom;

    public StackTugasMahasiswa09(int size) {
        this.size = size;
        stack = new Mahasiswa09[size];
        top = -1;
        bottom=0;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Mahasiswa09 mhs) {
        if (!isFull()) {
            stack[++top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Mahasiswa09 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa09 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }
    public Mahasiswa09 bottom(){
        if (!isEmpty()) {
            return stack[bottom];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }
    public int  jmltgs(){
        int tmp=0;
        for (int i = top; i >= 0; i--) {
            tmp +=1;
        }
        return tmp;
    }

    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println();
    }
    
}
