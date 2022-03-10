import java.util.Arrays;

public class MyArrayList <T> {
    
    private T[] backingArray;

    public int size;
    private int lastIndex;

    //Initializing Arraylist
    public MyArrayList() {
        this.backingArray = (T[]) new Object[4];
        this.size = 4;
        this.lastIndex = 0;
    }

    //Dynamic resizing of the list
    public void insertAtIndex (int index, T item) {
        if(index < 0 || index > this.size) {
            throw new IllegalArgumentException("Invalid Index: " + index);
        }
        if(this.size == this.backingArray.length) {
            this.backingArray = Arrays.copyOf(this.backingArray, this.backingArray.length + 4);
        }
        for(int i=this.size; i>index; i--) {
            this.backingArray[i] = this.backingArray[i-1];
        }
        this.backingArray[index] = item;
        this.size++;
    }

    //Get Element method
    public T GetElementAtIndex(int index) {
        if(index >= size) {
            throw new IndexOutOfBoundsException();
        }
        System.out.println("The element is: ");
        return this.backingArray[index];  
    }

    //Add Element method
    public void Add(T newElement){
        //add element
        this.insertAtIndex(this.size, newElement);
        System.out.println("Adding element:");
        lastIndex++;
    }

    //Find Element method
    /*public Boolean Find(T elementFind){
        boolean test = false;
        for (T element : backingArray) {
            if (element == elementFind) {
                test = true;
                break;
            }
            System.out.println("Is " + elementFind
                           + " present in the array: " + test);
        }
    }*/

    public Object Find(T elementFind)
    {
        boolean test = false;
        for (T element : backingArray) {
            if (element == elementFind) {
                System.out.println("Is " + elementFind + " present in the array: ");
                test = true;
                break;
            }
            System.out.println("Is " + elementFind + " present in the array: ");
            break;
        }
        return test;
    }

    //Get Size method
    public int GetSize(){
        return this.size;
    }

    //Get Capacity method
    public int GetCapacity() {
        return backingArray.length;
    }

    public String toString() {
        if(this.size == 0) {
            return "[empty]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i=0; i<this.size-1; i++) {
            sb.append(this.backingArray[i]);
            sb.append(", ");
        }
        sb.append(this.backingArray[this.size-1]);
        sb.append("]");
        return sb.toString();
    }

}
