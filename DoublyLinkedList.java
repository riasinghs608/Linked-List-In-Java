
package doublylinkedlist;

class EmployeeDoublyLinkedList
{
    EmployeeNode listptr,tail;
    
    public void addToFront(Employee emp)
    {
        EmployeeNode node=new EmployeeNode(emp);
        node.setNext(listptr);
        if(listptr==null)
            tail=node;
        else
            listptr.setPrev(node);
        
        
        listptr=node;
    }
    
    public void addToLast(Employee emp)
    {
        EmployeeNode node=new EmployeeNode(emp);
        
        tail.setNext(node);
        node.setPrev(tail);
        tail=node;
    }
    
    public void printList()
    {
        EmployeeNode current=listptr;
        System.out.print("HEAD->");
        while(current!=null)
        {
            System.out.print(current);
            System.out.print("->");
            current=current.getNext();
        }
        System.out.print("null");
        System.out.println("");
    }
    
    public void removeFront()
    {
        if(listptr==null)
            return;
        else
        {
            listptr=listptr.getNext();
        }
        
    }
    
    public void removeLast()
    {
        if(listptr==null)
            return;
        else
        {
            EmployeeNode current;
            current=tail.getPrev();
            tail=current;
            tail.setNext(null);
        }
    }
}

public class DoublyLinkedList {

    
    public static void main(String[] args) {
        
        Employee janeJones=new Employee("Jane","Jones",123);
        Employee johnDoe=new Employee("John","Doe",153);
        Employee marySmith=new Employee("Mary","Smith",163);
        Employee mikeWilson=new Employee("Mike","Wilson",193);
        
        EmployeeDoublyLinkedList list=new EmployeeDoublyLinkedList();
        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);
        
        list.printList();
        list.removeFront();
        System.out.println("");
        list.printList();
        
        Employee riaSingh=new Employee("Ria","Singh",326);
        list.addToLast(riaSingh);
        list.printList();
        
        list.removeLast();
        list.printList();
    }
    
}
