//import package of ArrayList
import java.util.ArrayList;
import java.util.List;


class Light{

    int status;
    List<LightObserver> observers = new ArrayList<>();

    int getStatus(){
        return this.status;
    }

    void add(LightObserver observer){
        this.observers.add(observer);
    }

    void updateStatus(int status){
        this.status = status;
    }

    
    public void notifyObserver(){
        this.observers.stream().forEach( it -> it.updateStatus());
    }

}