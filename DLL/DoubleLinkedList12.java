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
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        } 
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
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
}

