/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latmodul5_strukdat;

/**
 *
 * @author Abdillah
 */
public class BinaryThree {
    public Node root;
    
    public void NewNode(int data){
        root = NewNode(root, new Node(data));
        
    }
    
    private Node NewNode(Node root, Node newData){
        if (root == null){
            root = newData;
            return root;
        }
        if (newData.data < root.data){
            root.left = NewNode(root.left, newData);
        }else{
            root.right = NewNode(root.right, newData);
        }
        return root;
            
    }
    public void inOrder(Node node){
        if(node != null){
            inOrder(node.left);
            System.out.println(node.data + "");
            inOrder(node.right);
        }
    }
    public void preOrder(Node node){}
    public void postOrder(Node node){}
        
}
    

