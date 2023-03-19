package Module_1.FanApp;

public class TestFanApp {
    

    /**
     * @param args
     */

    public static void main(String[] args){

        //Setting Constants
        final int STOPPED = 0;
        final int SLOW = 1;
        final int MEDIUM = 2;
        final int FAST = 3;

        
        //Creating two fan objects
        Fan fan1 = new Fan();
        Fan fan2 = new Fan(MEDIUM, false, 0, null);

        //Setting test values for fan2
        fan2.setSpeed(MEDIUM);
        fan2.setRadius(8.0);
        fan2.setColor("Blue");
        fan2.setOn(true);

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }

    

    
}
