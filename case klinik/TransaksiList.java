public class TransaksiList {
    private TransaksiLayanan[] data;
    private int size;

    public TransaksiList() {
        data = new TransaksiLayanan[10]; // kapasitas awal
        size = 0;
    }

    public void add(TransaksiLayanan transaksi) {
        if (size == data.length) {
            expandArray(); // jika penuh, perluas
        }
        data[size++] = transaksi;
    }

    private void expandArray() {
        TransaksiLayanan[] newData = new TransaksiLayanan[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    public int getSize() {
        return size;
    }

    public TransaksiLayanan get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Indeks tidak valid");
        }
        return data[index];
    }
}
