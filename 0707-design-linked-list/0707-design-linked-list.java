class MyLinkedList {

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    Node tail;
    int cnt;
    public MyLinkedList() {
            head=null;
            tail=null;
            cnt=0;
    }
    
    public int get(int index) {
        if(index<0 || index >=cnt) return -1;
        Node current = head;
        for(int i=0;i<index;i++){
            current=current.next;
        }
        return current.data;
    }
    
    public void addAtHead(int val) {
        cnt++;
        Node current = new Node(val);
        if(head == null){
            head = current;
            tail = current;
            return;
        }
            current.next = head;
            head = current;
    }
    
    public void addAtTail(int val) {
        cnt++;

        Node current = new Node(val);
        if(tail==null){
            head = tail = current;
            return;
        }
        tail.next=current;
        tail = current;
        
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0 ||index>cnt){
            return;
        }
        if(index == 0){
            addAtHead(val);
            return;
        }
        if(index==cnt){
            addAtTail(val);
            return;
        }
        cnt++;
        Node nn = new Node(val);
        Node temp = head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        nn.next=temp.next;
        temp.next = nn;
    }
    
    public void deleteAtIndex(int index) {
        if(index<0 ||index>=cnt){
            return;
        }
        cnt--;
        if(index==0){
            if(head==tail){
                tail = tail.next;
            }
            head = head.next;
            return;
        }
        Node temp = head;
        for(int i=0;i<index-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if(temp.next==null){
            tail=temp;
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