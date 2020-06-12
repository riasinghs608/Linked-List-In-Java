
package doublylinkedlist;

/**
 *
 * @author pc
 */
public class EmployeeNode {
    
    private Employee emp;
    private EmployeeNode next;
    private EmployeeNode prev;

    public EmployeeNode(Employee emp) {
        this.emp = emp;
    }

    
    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    public EmployeeNode getPrev() {
        return prev;
    }

    public void setPrev(EmployeeNode prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return " "+emp ;
    }
    
    
    
    
    
}


