class LightObserver{

    int id;
    Light light;

    public LightObserver(int id,Light light){
        this.id = id;
        this.light = light;
        this.light.add(this);
    }

    void updateStatus(){
        System.out.println("updating: " + this.id + " status: " +  light.getStatus());
    }

}