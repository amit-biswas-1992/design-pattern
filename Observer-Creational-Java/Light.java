Class Light{

    int status;
    List<LightObserver> observers = new ArrayList<>();

    int getStatus(){
        return this.status;
    }

    void add(LightObserver observer){
        this.observers.add(observer);
    }

    void updateStatus(int status){
        this.status = status
    }

    
    void notify(){
        this.observers.stream().forEach( it=> it.updateStatus());
    }

}