/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multithreading;
 import java.util.LinkedList;
/**
 *
 * @author affrin
 */
public class Multithreading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  throws InterruptedException {
        // TODO code application logic here
        
        final PC p = new PC();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                try {
                    p.produce();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                try {
                    p.consume();
                }
                catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
    public static class PC {
        LinkedList<Integer> list = new LinkedList<>();
        int capacity = 2;
        public void produce() throws InterruptedException
        {
            int value = 0;
            while (true) {
                synchronized (this)
                {
                    while (list.size() == capacity)
                        wait();
 
                    System.out.println("Producer produced "
                                       + value);
                    break;
    }
            }
            }
         public void consume() throws InterruptedException
         {
            int value = 0;
            while (true) {
                synchronized (this)
                {
                    while (list.size() == capacity)
                        wait();
 
                    System.out.println("consumer brought "
                                       + value);
                  break;
    }
            }
            }
    }
}

