
package threadexample;

class Threaddemo extends Thread{
   synchronized static void printTable(int n)
    {
        for(int i=1;i<5;i++)
        {
             System.out.println(n*i);
             try{
                 Thread.sleep(400);
             }catch(Exception e)
             {
                 System.out.println("Exception is:"+e);
             }
        }
       
    }
}
class MyThread1 extends Thread{
    Threaddemo t;
    MyThread1(Threaddemo t){
        this.t=t;
    }
    public void run()
    {
        t.printTable(5);
    }
}
class MyThread2 extends Thread{
    Threaddemo t;
    MyThread2(Threaddemo t){
        this.t=t;
    }
    public void run()
    {
          t.printTable(100);
    }
}
class MyThread3 extends Thread{
    Threaddemo t;
    MyThread3(Threaddemo t){
        this.t=t;
    }
    public void run()
    {
          t.printTable(50);
    }
}
class MyThread4 extends Thread{
    Threaddemo t;
    MyThread4(Threaddemo t){
        this.t=t;
    }
    public void run()
    {
          t.printTable(500);
    }
}
public class ThreadExample {

    
    public static void main(String[] args) {
        Threaddemo t1=new Threaddemo();
        MyThread1 obj=new MyThread1(t1);
        MyThread2 obj1=new MyThread2(t1);
        MyThread3 obj2=new MyThread3(t1);
        MyThread4 obj3=new MyThread4(t1);
        
       
        obj.start();
        obj1.start();
        obj2.start();
        obj3.start();
    }
    
}
