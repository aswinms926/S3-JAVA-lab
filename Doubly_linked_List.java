import java.util.Scanner;
import java.util.LinkedList;
class DoublyLinkedlist<T>
{

    LinkedList<T> l=new LinkedList<>();
    public void insertFront(T element)
    {
        l.addFirst(element);
    }
    public void insertLast(T element){l.addLast(element);}
    public void Delete(int pos)
    {
        l.remove(pos );
    }
    public void insert(int pos,T el)
    {
        l.add(pos,el );
    }
    public void display()
    {
        for(T element : l)
        {
            System.out.println(element+" ");

        }
        System.out.println(" ");

    }
}
public class Doubly_linked_List {

    public static  void main(String args[]) {
        DoublyLinkedlist<Integer> D = new DoublyLinkedlist<>();
        Scanner sc = new Scanner(System.in);

        int ch;
        do {
            System.out.println("***************************");
            System.out.println("1)to insert aat front : ");
            System.out.println("2)to insert at last");
            System.out.println("3)to insert at pos");

            System.out.println("4)to delete at any pos");
            System.out.println("4)display");
            System.out.println("Enter your choise : ");
            ch = sc.nextInt();

            switch (ch) {
                case 1: {
                    System.out.println("enter the element to insert st front : ");
                    int el = sc.nextInt();
                    D.insertFront(el);
                    break;
                }
                case 2: {
                    System.out.println("Enter the element to at last ");
                    int el = sc.nextInt();
                    D.insertLast(el);
                    break;
                }
                case 3: {
                    System.out.println("Enter the element  ");
                    int el = sc.nextInt();
                    System.out.println("Enter pos ");
                    int pos = sc.nextInt();
                    D.insert(pos, el);
                    break;
                }
                case 4: {

                    System.out.println("Enter pos you wanna delete : ");
                    int pos = sc.nextInt();
                    D.Delete(pos);
                    break;
                }
                case 5: {

                    System.out.println("Displaying : ");

                    D.display();
                    break;
                }
                default:
                    break;
            }
        } while (ch != 5);


    }
}
