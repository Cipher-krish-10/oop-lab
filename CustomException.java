import java.util.*;

class containeremptyexception extends Exception{
    containeremptyexception(String msg){
        super(msg);
    }
}

class container<T>{
    T item;
    container(){
        this.item=null;
    }
    
    public void additem(T item){
        this.item=item;
    }

    public T getitem() throws containeremptyexception{
        if(item==null)
        throw new containeremptyexception("container is empty");

        return item;

    }
    
}
class CustomException{
    public static void main(String []args){
        container<Integer> box= new container<>();

        try{
            //box.additem();
            System.out.println("Item in container" +box.getitem());
        }
        catch(containeremptyexception e){
            System.out.println(e.getMessage());
        }
    }
}
