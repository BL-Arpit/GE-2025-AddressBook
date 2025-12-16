public class Queue {
    int[] queue;
    int rear,front ;
    int capacity;

    Queue(int capacity){
        queue = new int[capacity];
        this.capacity = capacity;
        front= -1;
        rear = -1;

    }

    public void enqueue(int a){
        if(isFull()){
            System.out.println("Queue is full cant add");
        }else{
            queue[++rear] = a;
        }
    }

    public void dequeue(){
        if (isEmpty()){
            System.out.println("Queue is empty");
        }else{
            System.out.println(queue[front]);
            front ++;
        }
    }

    public void peek(){
        if (isEmpty()){
            System.out.println("Stack is empty");
        }else{
            System.out.println(queue[front]);
        }
    }


    public boolean isFull(){
        return rear == capacity-1;

    }

    public boolean isEmpty(){
        return rear == front;
    }


}
