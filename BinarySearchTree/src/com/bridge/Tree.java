package com.bridge;

public class Tree extends Node {
    public  void insert(Node node,int value) {
        if (value < node.value) {
           if(node.left != null) {
               insert(node.left,value);
           }
        }

    }
}
