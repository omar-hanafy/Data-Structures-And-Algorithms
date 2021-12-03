package trees.binary.search;

public class Main {

    public static void main(String[] args) {

        Tree intTree = new Tree();
        intTree.insert(30);
        intTree.insert(20);
        intTree.insert(40);
        intTree.insert(16);
        intTree.insert(23);
        intTree.insert(14);
        intTree.insert(17);
        intTree.insert(34);
        intTree.insert(46);
        intTree.insert(66);
        intTree.insert(60);
        intTree.insert(62);

        intTree.traverseInOrder();
        System.out.println();
//
//        System.out.println(intTree.get(27));
//        System.out.println(intTree.get(17));
//        System.out.println(intTree.get(8888));

//        System.out.println(intTree.min());
//        System.out.println(intTree.max());

        intTree.delete(40);
        intTree.traversePreOrder();
        System.out.println();

    }
}
