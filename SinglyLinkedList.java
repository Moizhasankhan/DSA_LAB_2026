class SLLNode {
    int data;
    SLLNode next;

    SLLNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {
    SLLNode head;

    public void insertBeginning(int data) {
        SLLNode newNode = new SLLNode(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertEnd(int data) {
        SLLNode newNode = new SLLNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        SLLNode temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

    public void insertPosition(int pos, int data) {
        if (pos == 1) {
            insertBeginning(data);
            return;
        }
        SLLNode newNode = new SLLNode(data);
        SLLNode temp = head;
        for (int i = 1; temp != null && i < pos - 1; i++)
            temp = temp.next;
        if (temp != null) {
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public void insertAfter(int target, int data) {
        SLLNode temp = head;
        while (temp != null && temp.data != target)
            temp = temp.next;
        if (temp != null) {
            SLLNode newNode = new SLLNode(data);
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public void insertBefore(int target, int data) {
        if (head == null)
            return;
        if (head.data == target) {
            insertBeginning(data);
            return;
        }
        SLLNode temp = head;
        while (temp.next != null && temp.next.data != target)
            temp = temp.next;
        if (temp.next != null) {
            SLLNode newNode = new SLLNode(data);
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public void deleteBeginning() {
        if (head != null)
            head = head.next;
    }

    public void deleteEnd() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }
        SLLNode temp = head;
        while (temp.next.next != null)
            temp = temp.next;
        temp.next = null;
    }

    public void deletePosition(int pos) {
        if (head == null)
            return;
        if (pos == 1) {
            deleteBeginning();
            return;
        }
        SLLNode temp = head;
        for (int i = 1; temp != null && i < pos - 1; i++)
            temp = temp.next;
        if (temp != null && temp.next != null)
            temp.next = temp.next.next;
    }

    public void deleteValue(int val) {
        if (head == null)
            return;
        if (head.data == val) {
            deleteBeginning();
            return;
        }
        SLLNode temp = head;
        while (temp.next != null && temp.next.data != val)
            temp = temp.next;
        if (temp.next != null)
            temp.next = temp.next.next;
    }

    public void search(int key) {
        SLLNode temp = head;
        while (temp != null) {
            if (temp.data == key) {
                System.out.println("Found");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Not Found");
    }

    public int length() {
        int count = 0;
        SLLNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void display() {
        SLLNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public void deleteAll() {
        head = null;
    }
}