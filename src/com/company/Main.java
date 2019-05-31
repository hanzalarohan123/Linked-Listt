package com.company;

public class Main
{

    public static void main(String[] args)
    {
        LinkedList adTest = new LinkedList();
        adTest.addBefore(adTest.EM,5);
        adTest.add(1);
        adTest.add(2);
        adTest.add(3);
        adTest.add(4);
        adTest.add(7);
        adTest.add(6);
        System.out.println("*************!*************");
        adTest.showAll2();
        System.out.println("**************@*************");
        System.out.println(adTest.HasData(1));
        System.out.println("***************#*************");
        System.out.println("Node is present at address "+ adTest.Search(1));
        System.out.println("****************$**************");
        // i searched for node that i have not entered like 11 so it will say not found
        adTest.Search(11);

    }
}
