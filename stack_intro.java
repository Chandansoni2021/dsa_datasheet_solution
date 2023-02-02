class stack_intro{
    int size = 5;
    int arr[]=new int[size];
    int top=-1;

    public void push(int n){
        if(top==size-1){
            System.out.println("stack overflow");
        }
        else{
            top=top+1;
            arr[top]=n;
        }
    }
    public int pop()
    {
        if(top==-1){
            System.out.println(" Stack underflow ");
        }
        return arr[top--];
    }
    public void display(){
        for(int i=0;i<top;i++){
            System.out.println("the"+i+"element is "+arr[i]);
        }
    }
    public static void main(String[] args) {
        stack_intro obj = new stack_intro();
        obj.push(0);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.push(6);
    
        obj.pop();
        obj.display();
    }

}