class Main {
  public static boolean loopDetection(LinkedListNode n){
    LinkedListNode fast=n;
    LinkedListNode slow=n;
    if(n==null) return false;
    while(fast!=null && fast.next!=null){
      slow=slow.next;
      fast=fast.next.next;//fast moves 2x speed of slow
      if(slow==fast)break;// after collision, they will both be k steps away from start of loop.
    }
    if(fast==null||fast.next==null){
      return false; //List does not contain a loop
    }
    slow=n;
    while(slow!=fast){//place slow at head. They are both k steps away from start of loop.
      slow=slow.next;
      fast=fast.next;
    }
    return true;
  }
  public static void main(String[] args) {
    LinkedListNode T = new LinkedListNode('T');
    LinkedListNode A = new LinkedListNode('A');
    LinkedListNode C = new LinkedListNode('C');
    LinkedListNode O = new LinkedListNode('O');
    LinkedListNode C2= new LinkedListNode('C');
    LinkedListNode A2= new LinkedListNode('A');
    LinkedListNode T2= new LinkedListNode('T');
    T.next=A;A.next=C;C.next=O;O.next=C2;C2.next=A2;A2.next=T2;T2.next=O;
    //T2 points to O. So there is a loop after O.

    System.out.print(loopDetection(T));
    // should return true because list has a loop.
  }
}