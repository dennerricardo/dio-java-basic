public class User {
    public static void main(String[] args) throws Exception{
        SmartTv smartTv = new SmartTv();

        smartTv.increaseVolume();
        smartTv.increaseVolume();
        smartTv.increaseVolume();
        smartTv.decreaseVolume();

        smartTv.changeChannel(12);

        smartTv.increaseChannel();
        smartTv.increaseChannel();
        smartTv.decreaseChannel();

        
        System.out.println("Is it on ? "+ smartTv.on);
        System.out.println("Volume:" + smartTv.volume);
        System.out.println("Current channel: "+ smartTv.channel);
    }


}