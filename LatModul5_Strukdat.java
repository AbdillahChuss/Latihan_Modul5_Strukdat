/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.latmodul5_strukdat;

/**
 *
 * @author Abdillah
 */
public class LatModul5_Strukdat {

    public static void main(String[] args) {
        BinaryThree pohon = new BinaryThree();
        
        pohon.NewNode(20);
        pohon.NewNode(2);
        pohon.NewNode(25);
        pohon.NewNode(37);
        pohon.NewNode(16);
        
        System.out.println("\nPre Order :");
        pohon.preOrder(pohon.root);
        System.out.println("\nIn order :");
        pohon.inOrder(pohon.root);
        System.out.println("\nPost Order :");
        pohon.postOrder(pohon.root);
    }
}
