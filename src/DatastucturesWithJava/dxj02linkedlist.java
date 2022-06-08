package datastuctures;

class node {
    String data;
    node next;
    node head;

    node(String data) {
        this.data = data;
        this.next = null;
    }

    void addfirst(String data) {
        node newnode = new node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    void addlast(String data) {
        node newnode = new node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        node currentnode = head;
        while (currentnode.next != null) {
            currentnode = currentnode.next;
        }
        currentnode.next = newnode;
    }

    void printlist() {
        if (head == null) {
            return;
        }
        node currentnode = head;
        while (currentnode != null) {
            System.out.print(currentnode.data + "-->");
            currentnode = currentnode.next;
        }
    }
}

class dxj02linkedlist {
    public static void main(String[] args) {
        node hi = new node("hi");
        hi.addfirst("hello there");
        hi.addfirst("how are you beautiful");
        hi.printlist();
    }


}