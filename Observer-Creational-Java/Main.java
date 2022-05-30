class Main{
    public static void main(String[] args){

        Light light = new Light();

        LightObserver observer1 = new LightObserver(1,light);
        LightObserver observer2 = new LightObserver(2,light);

        light.updateStatus(2);
        light.notifyObserver();
    }
}