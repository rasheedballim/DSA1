package Stacks;
// Test

public class Main {
    public static void main(String[] args){
        Stack s =new Stack(4);
        
        System.out.println(s.isEmpty());
        System.out.println(s.isFull());
        s.push(5);
        s.push(6);

        System.out.println(s.pop());
        System.out.println(s.peep());
        s.delete();





    }
    
}
