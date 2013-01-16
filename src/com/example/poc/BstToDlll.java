package com.example.poc;

import java.util.Random;

public class BstToDlll {

	public static void go() {
		Bst tree = new Bst();
		Random r = new Random();
		for (int i = 0; i < 20; i++) {
			tree.insert(r.nextInt(100));
		}

		tree.printInOrder();
		tree.toList();
		tree.printList();
	}

	static class Bst {

		Node root;
		Node head;

		public void insert(int value) {
			Node n = new Node(value);
			if (root == null) {
				root = n;
			} else {
				Node parent = findParent(root, value);
				if (value <= parent.value) {
					parent.left = n;
				} else {
					parent.right = n;
				}
			}
		}

		public Node findParent(Node node, int value) {
			if (node == null) {
				return null;
			} else {
				if (value <= node.value && node.left != null) {
					return findParent(node.left, value);
				} else if (value > node.value && node.right != null) {
					return findParent(node.right, value);
				} else {
					return node;
				}
			}
		}

		class Node {
			public Node(int v) {
				value = v;
			}
			public Node left = null;
			public Node right = null;
			public int value;
		}

		public void printInOrder() {
			printInOrder(root);
			System.out.println();
		}

		private void toList() {
			toList(root, null);
		}

		private Node toList(Node n, Node prev) {
			if (n == null) {
				return prev;
			} else {
				prev = toList(n.left, prev);
				if (prev != null) {
					prev.right = n;
					n.left = prev;
				} else {
					head = n;
				}

				prev = toList(n.right, n);
				return prev;
			}
		}

		public void printInOrder(Node n) {
			if (n == null) {
				return;
			}
			printInOrder(n.left);
			System.out.print(n.value + " ");
			printInOrder(n.right);
		}

		public void printList() {
			if (root == null) {
				return;
			}
			Node n = head;

			while (n != null) {
				System.out.print(n.value + " ");
				n = n.right;
			}
			System.out.println();
		}
	}
}
