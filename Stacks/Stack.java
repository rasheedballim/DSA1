package Stacks;

public class Stack{
    int[] array;
    int topOfStack;

    public Stack(int size){
        this.array = new int[size];
        this.topOfStack =-1;
        System.out.println("The Stack has been created with a size of:"+ size);
    }
    public boolean isEmpty(){
        if (topOfStack == -1){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if (topOfStack == array.length-1){
            return true;
        }
        return false;
    }
    public void push(int value){
         if(isFull()){
             System.out.println("Stack is full!");
         }
         else{
             array[topOfStack+1] = value;
             topOfStack++;
             System.out.println("Value successfully added!");
         }
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("The stack is empty!");
            return -1;
        }
        else{
            int value = array[topOfStack];
            topOfStack--;
            return (value);
        }
    }
    public int peep(){
        if(isEmpty()){
            System.out.println("The stack is empty!");
            return -1;
        }
        else{
            return (array[topOfStack]);
        }
    }
    public void delete(){
        if(isEmpty()){
            System.out.println("The stack is already empty!");
        }
        else{
            array =null;
            System.out.println("The stack has been deleted");
        }
    }

}
