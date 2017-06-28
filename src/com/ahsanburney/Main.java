package com.ahsanburney;

public class Main {

    public static int multiplier = 7;

    public static void main(String[] args) {
	// write your code here

        StaticTest firstInstance = new StaticTest("1st Instance ");
        System.out.println(firstInstance.getName() + " is Instance number " + StaticTest.getNumInstance());

        StaticTest secondInstance = new StaticTest("2nd Instance");
        System.out.println(secondInstance.getName() + " is Instance number " + StaticTest.getNumInstance());

        StaticTest thirdInstance = new StaticTest("3nd Instance");
        System.out.println(thirdInstance.getName() + " is Instance number " + StaticTest.getNumInstance());

        int answer = multiple(6);
        System.out.println("the answer is " + answer);

    }

    public static int multiple(int number){
        return number * multiplier;
    }
}
