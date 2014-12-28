package me.abraham.datastructures;

/**
 * Class BinarySearchTree - A class which acts as a binary search tree
 *
 * @author Alex Abraham
 *
 * @version 12.14.2014
 */

public class BinarySearchTree<T extends Comparable<T>> {

	protected Node root;
	protected Node nil; //Sentinel to resemble null value
	
	public BinarySearchTree()
	{
		setNil(new Node(null));
		root = nil;
	}
	
	
	protected void setNil(Node node) {
		nil = node;
		nil.parent = nil;
		nil.left = nil;
		nil.right = nil;
	}
	
	protected boolean isNil(Node node)
	{
		return node == nil;
	}
	
	public void inorderWalk(Visitor v) {
		inorderWalk(root, v);
	}
	
	protected void inorderWalk(Node node, Visitor v)
	{
		if (!isNil(node)) {
			inorderWalk(node.left, v);
			v.visit(node);
			inorderWalk(node.right, v);
		}
	}
	
	public void preorderWalk(Visitor v)
	{
		preorderWalk(root, v);
	}
	
	protected void preorderWalk(Node node, Visitor v) {
		if (!isNil(node)) {
			v.visit(node);
			preorderWalk(node.left, v);
			preorderWalk(node.right, v);
		}
	}
	
	public void postorderWalk(Visitor v) {
		postorderWalk(root, v);
	}
	
	protected void postorderWalk(Node node, Visitor v) {
		if (!isNil(node)) {
			postorderWalk(node.left, v);
			postorderWalk(node.right, v);
			v.visit(node);
		}
	}
	
	public Node search(T key)
	{
		return search(root, key);
	}
	
	protected Node search(Node node, T key)
	{
		int compareValue;
		
		if (node == nil || (compareValue = key.compareTo(node.data)) == 0) return node;
		
		if (compareValue < 0) return search(node.left, key);
		
		return search(node.right, key);
	}
	
	public Node iterativeSearch(T key)
	{
		Node node = root;
		int compareValue;
		
		while (node != nil && (compareValue = key.compareTo(node.data)) != 0) {
			if (compareValue < 0) node = node.left;
			else node = node.right;
		}
		
		return node;
	}
	
	public Node minimum()
	{
		return treeMinimum(root);
	}
	
	protected Node treeMinimum(Node node)
	{
		while (node.left != nil) node = node.left;
		return node;
	}
	
	public Node maximum()
	{
		return treeMaximum(root);
	}
	
	protected Node treeMaximum(Node node)
	{
		while (node.right != nil) node = node.right;
		return node;
	}
	
	public Node successor(Node node)
	{
		if (node.right != nil) return treeMinimum(node.right);
		
		else {		
			Node parent = node.parent;
			while (parent != nil && parent.right == node) {
				node = parent;
				parent = parent.parent;
			}
			return node;
		}
	}
	
	public Node predecessor(Node node)
	{
		if (node.left != nil) return treeMaximum(node.left);
		
		else {
			Node parent = node.parent;
			while (parent != nil && parent.left == node) {
				node = parent;
				parent = parent.parent;
			}
			return node;
		}
	}
	
	public Node insert(T data)
	{
		Node node = new Node(data);		
		return treeInsert(node);
	}
	
	/*
	 * Made a decision that all nodes with equal data values will go to the left
	 */
	protected Node treeInsert(Node newNode)
	{
		Node parent = nil;
		Node node = root;
		
		while (node != nil) {
			parent = node;
			if (newNode.compareTo(node) <= 0) node = node.left;
			else node = node.right;
		}
		
		newNode.parent = parent;
		
		if (parent == nil) root = newNode;
		
		else {
			if (newNode.compareTo(parent) <= 0) parent.left = newNode;
			else parent.right = newNode;
		}
		
		return newNode;
	}
	
	/*
	 * Deletes first instance of data
	 */
	public void delete(T data) {
		Node node = search(data);
		
		if (node != nil) delete(node);
	}
	
	public void delete(Node node)
	{
		if (node == nil) throw new DeleteSentinelException();
		
		Node replacement;
		
		if (node.left == nil) {
			replacement = node.right;
		} else if (node.right == nil) {
			replacement = node.left;
		} else {
			replacement = successor(node);
			delete(replacement);
			
			replacement.left = node.left;
			replacement.right = node.right;
			node.left.parent = replacement;
			node.right.parent = replacement;
		}
		
		if (replacement != nil) {
			replacement.parent = node.parent;
		}
		
		if (root == node) {
			root = replacement;
		} else {
			if (node == node.parent.left) {
				node.parent.left = replacement;
			} else {
				node.parent.right = replacement;
			}
		}
		
	}
	
	public Comparable<T> dereference(Node node)
	{
		return node.data;
	}
	
	protected class Node implements Comparable<Node>{
		T data;
		Node left;
		Node right;
		Node parent;
		
		public Node(T data) {
			this.data = data;
			this.left = nil;
			this.right = nil;
			this.parent = nil;
		}
		
		@Override
		public int compareTo(Node node) {
			return this.data.compareTo(node.data);
		}
		
		@Override
		public String toString() {
			if (this == nil) return "nil";
			return data.toString();
		}
	}
	
	/*
	 * This interface is used to determine what to do when visiting a node
	 */
	public interface Visitor {
		public Object visit(Object handle);
	}
	
	public static class DeleteSentinelException extends RuntimeException {}

}
