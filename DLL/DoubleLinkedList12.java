package DLL;

public class DoubleLinkedList12 {
    Node12 head, tail;

    public DoubleLinkedList12() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        int count = 0;
        Node12 current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
        

    public void addFirst(Mahasiswa12 data) {
        Node12 newNode12 = new Node12(data);
        if (isEmpty()) {
            head = tail = newNode12;
        } else {
            newNode12.next = head;
            head.prev = newNode12;
            head = newNode12;
        }
    }

    public void addLast(Mahasiswa12 data) {
        Node12 newNode12 = new Node12(data);
        if (isEmpty()) {
            head = tail = newNode12;
        } else {
            tail.next = newNode12;
            newNode12.prev = tail;
            tail = newNode12;
        }
    }

    public void add(int index, Mahasiswa12 data) {
        if (index < 0 || index > size()) {
            System.out.println("Indeks di luar batas!");
            return;
        }
        if (index == 0) {
            addFirst(data);
        } else if (index == size()) {
            addLast(data);
        } else {
            Node12 current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            Node12 newNode12 = new Node12(data);
            newNode12.next = current.next;
            newNode12.prev = current;
            current.next.prev = newNode12;
            current.next = newNode12;
            System.out.println("Node berhasil ditambahkan pada indeks " + index);
        }
    }    

    public void insertAfter(String keyNim, Mahasiswa12 data) {
        Node12 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak dapat ditemukan.");
            return;
        }
        Node12 newNode12 = new Node12(data);
        if (current == tail) {
            current.next = newNode12;
            newNode12.prev = current;
            tail = newNode12;
        } else {
            newNode12.next = current.next;
            newNode12.prev = current;
            current.next.prev = newNode12;
            current.next = newNode12;

        }
        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);  
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong!");
            return;
        }
        Node12 current = head;
        System.out.println("Isi Linked List:");
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        } 
        Mahasiswa12 dataTerhapus = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah:");
        dataTerhapus.tampil();
    }
    
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        } 
        Mahasiswa12 dataTerhapus = tail.data; 
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah:");
        dataTerhapus.tampil();
    }  

    public void removeAfter(String keyNim) {
        Node12 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            System.out.println("Node setelah NIM " + keyNim + " tidak ditemukan atau tidak ada.");
            return;
        }
        Node12 toDelete = current.next;
        current.next = toDelete.next;
        if (toDelete.next != null) {
            toDelete.next.prev = current;
        } else {
            tail = current;
        }
        System.out.println("Node setelah NIM " + keyNim + " berhasil dihapus:");
        toDelete.data.tampil();
    }
    
    public void remove(int index) {
        if (index < 0 || index >= size()) {
            System.out.println("Indeks di luar batas!");
            return;
        }
        if (index == 0) {
            removeFirst();
            return;
        }
        if (index == size() - 1) {
            removeLast();
            return;
        }
        Node12 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.prev.next = current.next;
        current.next.prev = current.prev;
        System.out.println("Node pada indeks " + index + " berhasil dihapus:");
        current.data.tampil();
    }    

    public Node12 search(String nim) {
        Node12 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

public void getFirst() {
    if (isEmpty()) {
        System.out.println("List kosong.");
    } else {
        System.out.println("Data pada head:");
        head.data.tampil();
    }
}

public void getLast() {
    if (isEmpty()) {
        System.out.println("List kosong.");
    } else {
        System.out.println("Data pada tail:");
        tail.data.tampil();
    }
}

public void getIndex(int index) {
    if (index < 0 || index >= size()) {
        System.out.println("Indeks di luar batas!");
        return;
    }
    Node12 current = head;
    for (int i = 0; i < index; i++) {
        current = current.next;
    }
    System.out.println("Data pada indeks " + index + ":");
    current.data.tampil();
    }
}

