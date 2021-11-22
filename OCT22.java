public class OCT22 {
    public static void main (String args[]) {
        LinkedNode n1 = new LinkedNode(1);
        LinkedNode n2 = new LinkedNode(2);
        LinkedNode n3 = new LinkedNode(3);

        n1.nextNode = n2;
        n2.nextNode = n3;

        int a = 1/2;
        System.out.println("a = " + a);

        // n1.print()  -> "1, 2, 3"
//        n1.printNode();
        n1.reversePrintNode();



        LinkedNode n4 = new LinkedNode(1);
        LinkedNode n5 = new LinkedNode(2);
        LinkedNode n6 = new LinkedNode(3);
        LinkedNode n7 = new LinkedNode(4);

        n4.nextNode = n5;
        n5.nextNode = n6;
//        n6.nextNode = n7;

//        boolean equals = n1.equals(n4);
//        System.out.println(equals);

//        System.out.println(n1.equalsRecursive(n4));
        System.out.println(LinkedNode.equalsRecursive(n1, n4));
//        LinkedNode n7 = new LinkedNode(1);
//        LinkedNode n8 = new LinkedNode(2);
//        LinkedNode n9 = new LinkedNode(3);
//        LinkedNode n10 = new LinkedNode(3);

//        n7.nextNode = n8;
//        n8.nextNode = n9;
//        n9.nextNode = n10;

//        boolean equals2 = n1.equals(n7);
//        System.out.println(equals2);


//        LinkedNode n9 = null;

//        boolean equals3 = n1.equals(n9);
//        System.out.println(equals3);

//        boolean equals = LinkedNode.equals(n1, n2);
//        System.out.println(equals);
//
//        boolean equals2 = LinkedNode.equals(n1, n9);
//        System.out.println(equals2);



    }
}

class LinkedNode {
    public int value;
    public LinkedNode nextNode;

    public LinkedNode (int value) {
        this.value = value;
    }

    public void printNode () {
        LinkedNode cur = this;

        while (cur != null) {
            System.out.print(cur.value + " ");
            cur = cur.nextNode;
        }
    }

    public void printNodeRecursive () {

        // print first half
        System.out.println(this.value);

        //stop condition
        if (this.nextNode == null) {
            return;
        }

        // print second half
        this.nextNode.printNodeRecursive();
    }

    public void reversePrintNode() {

        if (this.nextNode != null) {
            this.nextNode.reversePrintNode();
        }

        System.out.println(this.value);
    }



    public static boolean equals(LinkedNode node1, LinkedNode node2) {
        LinkedNode p1 = node1;
        LinkedNode p2 = node2;

        while (p1 != null &&  p2 != null) {
            if (p1.value == p2.value){
                p1 = p1.nextNode;
                p2 = p2.nextNode;
            }
            else {
                return false;
            }
        }

        if (p1 != null ||  p2 != null ) {
            return false;
        }

        return true;

    }


    public boolean equals(LinkedNode node) {
        LinkedNode p1 = this;
        LinkedNode p2 = node;

        while (p1 != null &&  p2 != null) {
            if (p1.value == p2.value){
                p1 = p1.nextNode;
                p2 = p2.nextNode;
            }
            else {
                return false;
            }
        }

        if (p1 != null ||  p2 != null ) {
            return false;
        }

        return true;
    }

    public static boolean equalsRecursive(LinkedNode node1, LinkedNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }
        return node1.value == node2.value && equalsRecursive(node1.nextNode, node2.nextNode);
    }

    public boolean equalsRecursive(LinkedNode node) {
        if (node == null) {
            return false;
        }

        if (this.value == node.value) {
            if (this.nextNode != null) {
                return this.nextNode.equalsRecursive(node.nextNode);
            }

            if (this.nextNode == null && node.nextNode == null){
                return true;
            }
        }
        return false;
    }

//    public boolean equalsRecursive2(LinkedNode node) {
//        // compare this and node's value
//        return (this.value == )
//    }
}