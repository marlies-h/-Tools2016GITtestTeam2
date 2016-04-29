package at.fhhgb.mc.Aufgabe1;

public class Main {

	public static void main(String[] args) {
		BinarySearchTree tree= new BinarySearchTree();
		BinarySearchTree tree2= new BinarySearchTree();
		tree.insert(88);
		tree.insert(65);
		tree.insert(97);
		tree.insert(54);
		tree.insert(82);
		tree.insert(76);
		tree.insert(80);
//		tree.insert(7);
//		tree.insert(13);
//		tree.insert(29);
//		System.out.println(tree.find(3));
//		System.out.println(tree.find(7));
//		System.out.println(tree.find(13));
//		System.out.println(tree.find(15));
//		System.out.println(tree.size);
//		tree2.insert(1);
//		tree2.insert(6);
//		tree2.insert(14);
//		System.out.println(tree2.size);
//		System.out.println(tree.getParent(6));
//		System.out.println(tree.getParent(4));
//		System.out.println(tree.getParent(13));
//		System.out.println(tree.getParent(8));
//		System.out.println(tree.getParent(55));
//		System.out.println(tree.getParent(1));
//		System.out.println(tree.getParent(-3));
		int[] array=tree.toArray(true);
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
		int[] array2=tree.toArrayPostOrder();
		for(int i=0;i<array2.length;i++){
			System.out.print(array2[i]+" ");
		}
		System.out.println();
		int[] array3=tree.toArrayPreOrder();
		for(int i=0;i<array3.length;i++){
			System.out.print(array3[i]+" ");
		}
		System.out.println();
		System.out.println(tree.max());
		System.out.println(tree.min());
		System.out.println(tree.toString());
		System.out.println("--------------------------------------------------");
		tree.remove(82);
		System.out.println(tree.toString());
	}

}
