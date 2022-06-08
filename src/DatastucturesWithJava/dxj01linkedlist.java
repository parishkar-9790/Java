package datastuctures;
public class dxj01linkedlist {
    node head;
    static class node {
        String data;
        node next;

        node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    //adding operation add first add last
    public void addfirst(String data) {
        node newnode = new node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void addlast(String data) {
        node newnode = new node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        node currentnode = head;
        while (currentnode.next != null)
            currentnode = currentnode.next;
        currentnode.next=newnode;
    }

    public void printlist() {
        if(head==null){
            System.out.println("list is empty");
        }
        node currentnode = head;
        while (currentnode != null) {
            System.out.print(currentnode.data + "-->");
            currentnode = currentnode.next;
        }
    }
    public static void main(String[] args) {
        dxj01linkedlist list = new dxj01linkedlist();
        list.addfirst("je");
        list.addfirst("ji");
        list.addfirst("jo");
        list.addlast("helli");
        list.addlast("hter");
        list.printlist();
    }
}
