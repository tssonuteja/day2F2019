package com.lambton;

public class Red {
    public static void main(String[] args)
    {
        Arithmetic s1= new Arithmetic();
        System.out.println(" sum "+ s1.add(10,20));
        System.out.println(" sub "+ s1.sub(30,20));
        System.out.println(" mul "+ s1.mul(10,20));
        System.out.println(" div  "+ s1.div(30,30));
        System.out.println(" mod "+ s1.mod(50,20));

        Student s2 = new Student();
        s2.setFirstName("Saiteja");
        s2.setLastNmae("sunkari");
        s2.setMarks1(30);
        s2.setMarks2(40);
        s2.setMarks3(50);
        s2.setMarks4(60);
        s2.setMarks5(50);
      s2.calculateTotal();
      s2.calculatePercentage();
      System.out.println(s2.getMarks1());
        System.out.println(s2.getMarks2());
        System.out.println(s2.getMarks3());
        System.out.println(s2.getMarks4());
        System.out.println(s2.getMarks5());
        System.out.println(s2.getTotal());
        System.out.println(s2.getPercentage());
        System.out.println(s2.getResult());








    }

}
