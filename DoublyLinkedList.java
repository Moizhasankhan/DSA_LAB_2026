class DLLNode {
    int data;
    DLLNode prev, next;

    DLLNode(int data) {
        this.data = data;
        prev = next = null;
    }
}

public class DoublyLinkedList {
    DLLNode head;

    public void insertBeginning(int data) {
        DLLNode newNode = new DLLNode(data);
        newNode.next = head;
        if (head != null)
            head.prev = newNode;
        head = newNode;
    }

    public void insertEnd(int data) {
        DLLNode newNode = new DLLNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        DLLNode temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
    }

    public void insertPosition(int pos, int data) {
        if (pos == 1) {
            insertBeginning(data);
            return;
        }
        DLLNode temp = head;
        for (int i = 1; temp != null && i < pos - 1; i++)
            temp = temp.next;
        if (temp != null) {
            DLLNode newNode = new DLLNode(data);
            newNode.next = temp.next;
            newNode.prev = temp;
            if (temp.next != null)
                temp.next.prev = newNode;
            temp.next = newNode;
        }
    }

    public void insertAfter(int target, int data) {
        DLLNode temp = head;
        while (temp != null && temp.data != target)
            temp = temp.next;
        if (temp != null) {
            DLLNode newNode = new DLLNode(data);
            newNode.next = temp.next;
            newNode.prev = temp;
            if (temp.next != null)
                temp.next.prev = newNode;
            temp.next = newNode;
        }
    }

    public void insertBefore(int target, int data) {
        DLLNode temp = head;
        while (temp != null && temp.data != target)
            temp = temp.next;
        if (temp == null)
            return;
        if (temp == head) {
            insertBeginning(data);
            return;
        }
        DLLNode newNode = new DLLNode(data);
        newNode.next = temp;
        newNode.prev = temp.prev;
        temp.prev.next = newNode;
        temp.prev = newNode;
    }

    public void deleteBeginning() {
        if (head != null) {
            head = head.next;
            if (head != null)
                head.prev = null;
        }
    }

    public void deleteEnd() {
        if (head == null)
            return;
        DLLNode temp = head;
        while (temp.next != null)
            temp = temp.next;
        if (temp.prev != null)
            temp.prev.next = null;
        else
            head = null;
    }

    public void deletePosition(int pos) {
        if (head == null)
            return;
        if (pos == 1) {
            deleteBeginning();
            return;
        }
        DLLNode temp = head;
        for (int i = 1; temp != null && i < pos; i++)
            temp = temp.next;
        if (temp != null) {
            if (temp.next != null)
                temp.next.prev = temp.prev;
            if (temp.prev != null)
                temp.prev.next = temp.next;
        }
    }

    public void deleteValue(int val) {
        DLLNode temp = head;
        while (temp != null && temp.data != val)
            temp = temp.next;
        if (temp == null)
            return;
        if (temp == head) {
            deleteBeginning();
            return;
        }
        if (temp.next != null)
            temp.next.prev = temp.prev;
        if (temp.prev != null)
            temp.prev.next = temp.next;
    }

    public void search(int key) {
        DLLNode temp = head;
        while (temp != null) {
            if (temp.data == key) {
                System.out.println("Found");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Not Found");
    }

    public void display() {
        DLLNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public int length() {
        int count = 0;
        DLLNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void deleteAll() {
        head = null;
    }
}