class MyLinkedList {
    int size;
    ListNode head;
    public MyLinkedList() {
        this.size=0;
        this.head=new ListNode(0);
    }
    
    public int get(int index) {
        if(index<0 || index>=size)return -1;
        ListNode curr=this.head;
        for(int i=0;i<=index;i++)curr=curr.next;
        return curr.val;
    }
    
    public void addAtHead(int val) {
        addAtIndex(0,val);
    }
    
    public void addAtTail(int val) {
        addAtIndex(this.size,val);
    }
    
    public void addAtIndex(int index, int val) {
        if(index>this.size)return;
        if(index<0)index=0;
        ++size;
        ListNode curr=this.head;
        for(int i=0;i<index;i++){
            curr=curr.next;
        }
        ListNode node=new ListNode(val);
        node.next=curr.next;
        curr.next=node;
    }
    
    public void deleteAtIndex(int index) {
        if(index>=size)return;
        ListNode curr=this.head;
        for(int i=0;i<index;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        size--;

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