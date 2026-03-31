public class MainClass {

    public static void main(String[] args) {

        System.out.println("Name: ABDUL MOIZ");
        System.out.println("Seat No: EB25210006001");

        // ================= SINGLY LINKED LIST =================
        System.out.println("\n--- Singly Linked List ---");

        SinglyLinkedList sll = new SinglyLinkedList();

        // Insert operations
        sll.insertBeginning(10); // 4
        sll.insertEnd(20); // 5
        sll.insertEnd(30);
        sll.insertPosition(2, 15); // 6
        sll.insertAfter(20, 25); // 7
        sll.insertBefore(20, 18); // 8

        // Traversal
        sll.display(); // 1

        // Length
        System.out.println("Length: " + sll.length()); // 2

        // Search
        sll.search(25); // 3

        // Delete operations
        sll.deleteBeginning(); // 9
        sll.deleteEnd(); // 10
        sll.deletePosition(2); // 11
        sll.deleteValue(18); // 12

        System.out.println("After Deletions:");
        sll.display();

        // Delete entire
        sll.deleteAll(); // 13
        System.out.println("After deleting entire list:");
        sll.display();

        // ================= DOUBLY LINKED LIST =================
        System.out.println("\n--- Doubly Linked List ---");

        DoublyLinkedList dll = new DoublyLinkedList();

        // Insert operations
        dll.insertBeginning(5); // 4
        dll.insertEnd(15); // 5
        dll.insertEnd(25);
        dll.insertPosition(2, 12); // 6
        dll.insertAfter(15, 18); // 7
        dll.insertBefore(15, 14); // 8

        // Traversal
        dll.display(); // 1

        // Length
        System.out.println("Length: " + dll.length()); // 2

        // Search
        dll.search(18); // 3

        // Delete operations
        dll.deleteBeginning(); // 9
        dll.deleteEnd(); // 10
        dll.deletePosition(2); // 11
        dll.deleteValue(14); // 12

        System.out.println("After Deletions:");
        dll.display();

        // Delete entire
        dll.deleteAll(); // 13
        System.out.println("After deleting entire list:");
        dll.display();
    }
}
