public class Queue1{
    static final  int MAX_SIZE=5;

    static int  queueArray[]=new int[MAX_SIZE];
    static int front=-1;
    static int rear=-1;

    public static void addqeue(int element){
        if(isFull()){
            System.out.println("Full");
            return;
        }
        if (isEmpty()){
            front=0;
        }
        ++rear;
        queueArray[rear]=element;
    }

    public static int removeqeue(){
        if(isEmpty()){
            System.out.println("Empty");
            return 0;
        }
        int removedelement=queueArray[front];
        if(front==rear){
            front=rear=-1;
        }
        else {
            front++;
        }
        return removedelement;
    }

    public static boolean isEmpty(){
        return front==-1;
    }

    public static boolean isFull(){
        return rear==MAX_SIZE-1;
    }

     public static void main(String[] args){
        addqeue(12);
         addqeue(1);
         addqeue(11);
         addqeue(14);
         addqeue(13);

         for(int i=0;i<5;++i){
             int removedNumber=removeqeue();
             System.out.println(removedNumber);
         }
     }
}