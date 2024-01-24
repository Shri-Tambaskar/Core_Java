package com.mkpits.collection;

import java.util.ArrayList;

public class Example15_Tree {

	String data;
	ArrayList<Example15_Tree> children;

	public Example15_Tree(String data) {

		this.data = data;
		this.children = new ArrayList<Example15_Tree>();
	}

	public void addChild(Example15_Tree node) {
		this.children.add(node);
	}

	public String print(int level) {
		String ret;
		ret = "  ".repeat(level) + data + "\n";
		for (Example15_Tree node : children) {
			ret += node.print(level + 1);
		}
		return ret;
	}
}
