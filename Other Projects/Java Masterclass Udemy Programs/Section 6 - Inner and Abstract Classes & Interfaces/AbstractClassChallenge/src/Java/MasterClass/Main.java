package Java.MasterClass;

public class Main {

    public static void main(String[] args) {
		SearchTree tree = new SearchTree(null);
		tree.traverse(tree.getRoot());

		String stringData = "0 1 2 3 4 5 6 7 8 9";

		String[] data = stringData.split(" ");
		for (String s : data)
		{
			//create new item with value set to string s
			tree.addItem(new Node(s));
		}

		tree.traverse(tree.getRoot());
		tree.removeItem(new Node("3"));
		tree.traverse(tree.getRoot());

		tree.removeItem(new Node("5"));
		tree.traverse(tree.getRoot());

		tree.removeItem(new Node("0"));
		tree.removeItem(new Node("4"));
		tree.removeItem(new Node("2"));
		tree.traverse(tree.getRoot());

		tree.removeItem(new Node("9"));
		tree.traverse(tree.getRoot());
		tree.removeItem(new Node("8"));
		tree.traverse(tree.getRoot());
		tree.removeItem(new Node("6"));
		tree.traverse(tree.getRoot());
		tree.removeItem(tree.getRoot());
		tree.traverse(tree.getRoot());
		tree.removeItem(tree.getRoot());
		tree.traverse(tree.getRoot());



//        MyLinkedList list = new MyLinkedList(null);
//        list.traverse(list.getRoot());
//
//	    String stringData = "0 1 2 3 4 5 6 7 8 9";
//
//	    String[] data = stringData.split(" ");
//	    for (String s : data)
//        {
//        //create new item with value set to string s
//            list.addItem(new Node(s));
//        }
//
//	    list.traverse(list.getRoot());
//	    list.removeItem(new Node("3"));
//	    list.traverse(list.getRoot());
//
//	    list.removeItem(new Node("5"));
//	    list.traverse(list.getRoot());
//
//	    list.removeItem(new Node("0"));
//	    list.removeItem(new Node("4"));
//	    list.removeItem(new Node("2"));
//	    list.traverse(list.getRoot());
//
//	    list.removeItem(new Node("9"));
//	    list.traverse(list.getRoot());
//	    list.removeItem(new Node("8"));
//	    list.traverse(list.getRoot());
//	    list.removeItem(new Node("6"));
//	    list.traverse(list.getRoot());
//	    list.removeItem(list.getRoot());
//	    list.traverse(list.getRoot());
//	    list.removeItem(list.getRoot());
//	    list.traverse(list.getRoot());
    }
}
