Class Main{
    public static void main(String[] args){

        Light light = new Light();

        LightObserver observer1 = new LightObserver(light);
        LightObserver observer2 = new LightObserver(light);

        light.updateStatus(2);
        light.notify();
    }
}