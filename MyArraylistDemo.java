import java.util.Scanner;

public class MyArraylistDemo {
    public static void main(String args[]) {
    while(true){
        MyArrayList<Integer> l = new MyArrayList<Integer>();
        l.insertAtIndex(0, 10);
        l.insertAtIndex(1, 20);
        l.insertAtIndex(2, 30);
        l.insertAtIndex(3, 40);
        System.out.println("List: " + l);

    
        System.out.println("Choose what to do: ");
        System.out.println("1. Get");
        System.out.println("2. Find");
        System.out.println("3. Add");
        System.out.println("4. Count");
        System.out.println("5. Capacity");
        System.out.println("6. Exit");

        System.out.println("Enter number of choice: ");
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            
            if(n == 1){
                System.out.println("Enter index of the element: ");
                try (Scanner inp = new Scanner(System.in)) {
                    int get = inp.nextInt();
                    if(get < 0 ){
                        throw new IllegalArgumentException("Invalid Index: " + get);
                    }
                    int getE = l.GetElementAtIndex(get);

                    System.out.println(getE);
                }
                return;
            }
            else if(n == 2){
                System.out.println("Enter element to find: ");
                try (Scanner inp = new Scanner(System.in)) {
                    int get = inp.nextInt();
                    Object findE = l.Find(get);
                    System.out.println(findE);
                }
                return;
            }
            else if(n == 3){
                System.out.println("Enter element to add: ");
                try (Scanner inp = new Scanner(System.in)) {
                    int get = inp.nextInt();
                    l.Add(get);
                    System.out.println("List: " + l);
                }
                return;
            }
            else if(n == 4){
                System.out.println("Current size: ");
                int countE = l.GetSize();
                System.out.println(countE);
                return;
            }
            else if(n == 5){
                System.out.println("Current length: ");
                int count1E = l.GetCapacity();
                System.out.println(count1E);
                return;
            }
            else if(n == 6){
                System.exit(0);;
                return;
            }
        }

    }
    } 
}
