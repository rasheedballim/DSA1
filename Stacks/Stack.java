package Stacks;
public class Stack{
    int[] array;
    int topOfStack;

    public Stack(int size){
        this.array = new int[size];
        this.topOfStack =-1;
        System.out.println("The Stack has been created with a size of:"+ size);
    }
    
}