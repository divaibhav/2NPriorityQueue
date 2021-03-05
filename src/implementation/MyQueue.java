package implementation;

import myinterface.QueueADT;

public class MyQueue<E extends Comparable<E>>  implements QueueADT<E> {
    private E[] arr;
    private int front;
    private int rear;
    private int size;

    @Override
    public void enqueue(E data) {
        //after insert process
        //call rearrange
    }

    @Override
    public E dequeue() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    //to rearrange element after insert
    E[] brr;
    private void rearrange(){
        for (int i = rear - 1; i > front; i--) {
            if(brr[i].compareTo(brr[i-1]) >= 1){
             //swap
             E temp = brr[i];
             brr[i] = brr[i-1];
             brr[i-1] = temp;
            }
            else{
                break;
            }
        }
    }
}
