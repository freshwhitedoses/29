import java.sql.Array;
import java.util.ArrayList;

class Stack<T> {
    private T[] array;
    private int sizeS;
    Stack() {
        this.array = (T[]) new Object[0];
        //top=-1;
        this.sizeS = 0;
    }

    public void AddElement(T element){
        this.sizeS++;
        var tmp = ((T[]) new Object[sizeS]);
        System.arraycopy(array, 0, tmp, 0, array.length);
        array = tmp;
        array[sizeS-1]=element;
    }
    public T deleteElement(){
        T a=array[sizeS-1];
        var tmp = ((T[]) new Object[sizeS-1]);
        System.arraycopy(array, 0, tmp, 0, array.length-1);
        sizeS--;
        array = tmp;
        return a;
    }
    public T topElement(){
        return array[sizeS-1];
    }
    public boolean isEmpty(){
        return this.sizeS<1;
    }
    public void print(){
    for(T i: array){
        System.out.println(i);
    }

    }

}

public class Main {
    public static void main(String[] args) {
        var stack = new Stack<>();
        stack.AddElement(6);
        stack.AddElement(3);
        stack.AddElement(4);
        int a= (int) stack.deleteElement();
        System.out.println(a);
        stack.print();
        }

    }
