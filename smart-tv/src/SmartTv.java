public class SmartTv {
    
    Boolean on = false;
    int channel = 1;
    int volume = 25;
    
    public void turnOn(){
        on = true;
    }
    public void turnOff(){
        on = false;
    }

    public void increaseVolume(){
        volume++;
        System.out.println("Volume: "+volume);
    }
    public void decreaseVolume(){
        volume--;
        System.out.println("Volume: "+volume);
    }

    public void increaseChannel(){
        channel++;
         System.out.println("Channel: "+channel);
    }

    public void decreaseChannel(){
        channel--;
        System.out.println("Channel: "+channel);
    }

    public void changeChannel(int newChannel){
        channel = newChannel;
        System.out.println("Channel choosed: "+newChannel);
    }

}
