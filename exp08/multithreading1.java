/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exno8;

/**
 *
 * @author affrin
 */
public class Exno8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        fun t=new fun();
        t.start();
        fun1 t1=new fun1();
        t1.start();
        fun2 t2=new fun2();
        t2.start();
    }
   
}
class fun extends Thread{
   public void run()
   {
       System.out.println("1");
       try {
           Thread.sleep(5);
       } catch (InterruptedException e) {
           System.out.println(e);
       }
     System.out.println("4");
     try {
           Thread.sleep(8);
       } catch (InterruptedException e) {
           System.out.println(e);
       }
     System.out.println("7");
}
}
class fun1 extends Thread{
   public void run()
   {
       System.out.println("2");
       try {
           Thread.sleep(6);
       } catch (InterruptedException e) {
           System.out.println(e);
       }
     System.out.println("5");
     try {
           Thread.sleep(9);
       } catch (InterruptedException e) {
           System.out.println(e);
       }
     
     System.out.println("8");
}
}
class fun2 extends Thread{
   public void run()
   {
       System.out.println("3");
       try {
           Thread.sleep(7);
       } catch (InterruptedException e) {
           System.out.println(e);
       }
     System.out.println("6");
     try {
           Thread.sleep(10);
       } catch (InterruptedException e) {
           System.out.println(e);
       }
    try {
           Thread.sleep(10);
       } catch (InterruptedException e) {
           System.out.println(e);
       }
     System.out.println("9");
}
}

    
    

