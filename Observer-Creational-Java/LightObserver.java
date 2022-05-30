Class LightObserver{

    Light light;

    constructor(Light light){
        this.light = light;
        this.light.add(this);
    }

    void updateStatus(){
        System.out.println("updating: " + light.getStatus());
    }

}