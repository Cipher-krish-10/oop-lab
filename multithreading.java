class newthread extends Thread{
newthread(){
    super("ICT");
}
public void run(){
    try{
        for(int i=0;i<=100;i=i+2){
        System.out.println(getName() + ": " + i);
      Thread.sleep(1000);
}
}
catch(InterruptedException e){
    System.out.println("child interrupted");
}
  }
}

class newthread2 extends Thread{
    newthread2(){
        super("CCE");
    }
    public void run(){
        try{
            for(int i=1;i<=100;i=i+2){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println("child interrupted");
        }
    }
    }

class multithreading{
    public static void main(String[] args) {
       newthread t1= new newthread();
       newthread2 t2= new newthread2();
       t1.start();
       t2.start();
       Thread t3= Thread.currentThread();
       t3.setName("OOP");
       try{
        for(int i=5;i<+100;i=i+5){
        System.out.println(t3.getName() + ": " + i);
      Thread.sleep(1000);
       }
    }
    catch(InterruptedException e){
        System.out.println("child interrupted");
    }

    }
}