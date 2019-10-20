package assignmentThree;

public class Tester {
    public static void main(String[] args) {
        LinkedList n = new LinkedList();
        n.add((8+1)+"_Absar_"+(7+10));
        n.add((8+2)+"_Absar_"+(7+20));
        n.add((8+3)+"_Absar_"+(7+30));
        n.add((8+4)+"_Absar_"+(7+40));
        n.add((8+5)+"_Absar_"+(7+50));
        n.add((8+6)+"_Absar_"+(7+60));

        n.printList(); //prints list
        n.countNode(); // tells number of nodes
        System.out.println(n.get(2));
        System.out.println(n.set(5,"ok"));
        n.printList();
        n.insertFirst("LMAO");
        n.printList();
        n.insertLast("Mama");
        n.printList();
        n.insertInAnyIndex(2,"Haire");
        n.printList();
        n.removeFirst();
        n.printList();
        n.removeLast();
        n.printList();
        n.removeElementFromAnyIndex(6);
        n.printList();
        System.out.println(n.search("9_Absar_17",1));
    }
}
