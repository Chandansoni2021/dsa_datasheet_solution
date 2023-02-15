class ll{
  static class Node{
    String data;
    Node next;
    

    Node(String data){
      this.data=data;
      this.next=null;
    }
  }
Node head =null;

  // add\
  // add first
  // add last

  //add first;
public void addfirst(String data){
  Node newNode = new Node(data);
  if(head ==null){
    head = newNode;
  }
  else{
    newNode.next = head;
    head = newNode;

  }
}

public void addlast(String data){
  Node new_Node = new Node(data);
  if(head==null){
   head = new Node(data);

  }
  new_Node.next = null;

  Node ptr = head;
  while (ptr.next != null)
    ptr = ptr.next;

  ptr.next = new_Node;
  return;


}
public void insertloc(Node prev_node, String data) {
  if (prev_node == null) {
    System.out.println("The given previous node cannot be null");
    return;
  }
  Node new_Node = new Node(data);
  new_Node.next = prev_node.next;
  prev_node.next = new_Node;
}


public void deleteLast()
{
    if (head == null){
        System.out.println("List is empty, not possible to delete");
    }

    // if LL has only one node
    if(head.next == null)
    {
        System.out.println("Deleted: " + head.data);
        head= head.next;
    }
    Node previous = null;
    Node temp = head;
    // else traverse to the last node
    while (temp.next != null)
    {
        // store previous link node as we need to change its next val
        previous = temp;
        temp = temp.next;
    }
    // Curr assign 2nd last node's next to Null
    System.out.println("Deleted: " + temp.data);
    previous.next = null;
    // 2nd last now becomes the last node

}

public void display(){
  Node  temp=head;
  if(head==null){
    System.out.println("ll does not exist");
  }
  else{
    while(temp!=null){
      System.out.println(temp.data);
      temp=temp.next;
    }
  }

}




public void deleteloc(int position)
{ 
    if (head == null)
      return;

    Node temp = head;

    if (position == 0) {
      head = temp.next;
      return;
    }
    // Find the key to be deleted
    for (int i = 0; temp != null && i < position - 1; i++)
      temp = temp.next;

    // If the key is not present
    if (temp == null || temp.next == null)
      return;

    // Remove the node
    Node next = temp.next.next;

    temp.next = next;
  }
    
    



  public static void main(String[] args) {
    ll list = new ll();
    list.addfirst("ram");

    list.addfirst("chandan");
    list.addfirst("arti");

    
    list.addlast("ritu");
    list.deleteLast();
    list.deleteloc(1);
    list.addfirst("huuuu");
    list.display();
   
  }
}