class MyLinkedList {
    class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
            prev = null;
            next = null;
        }
    }
    Node head, tail;
    int c;
    public MyLinkedList() {
        head = null;
        tail = null;
        c = 0;
    }
    
    public int get(int index) {
        if(index < 0 || index >= c){
            return -1;
        }
        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node nn = new Node(val);
        if(head == null){
            head = nn;
            tail = nn;
        }
        else{
            nn.next = head;
            head.prev = nn;
            head = nn;
        }
        c++;
    }
    
    public void addAtTail(int val) {
        Node nn = new Node(val);
            if(head == null){
                head = nn;
                tail = nn;
            }
            else{
                tail.next = nn;
                nn.prev = tail;
                tail = nn;
            }
            c++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 || index > c){
            return;
        }
        if(index == 0){
            addAtHead(val);
        }
        else if(index == c){
            addAtTail(val);
        }
        else{
            Node temp = head;
            for(int i = 0; i < index - 1; i++){
                temp = temp.next;
            }
            Node nn = new Node(val);
            nn.prev = temp;
            nn.next = temp.next;
            temp.next = nn;
            nn.next.prev = nn;
            c++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= c){
            return;
        }
        // delete at first
        if(index == 0){
            head = head.next;
            if(head == null){
                tail = null;
            }
            else{
                head.prev = null;
            }
            c--;
        }
        // delete at last
        else if(index == c - 1){
            tail = tail.prev;
            if(tail == null){
                head = null;
            }
            else{
                tail.next = null;
            }
            c--;
        }
        //delete at middle
        else{
            Node temp = head;
            for(int i = 0; i < index - 1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            temp.next.prev = temp;
            c--;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */