package Module_1.FanApp;

/*
 * Alexander, K. (2023). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved. 

 */

 public class Fan {

    //Declare the four constants that represent fan speed
        final int STOPPED = 0;
        final int SLOW = 1;
        final int MEDIUM = 2;
        final int FAST = 3;

    //Declaring private variables
        private int speed;
        private boolean on;
        private double radius;
        private String color;

    //A non-argument constructor that sets the fields to the default value
        Fan(){
            speed = STOPPED;
            on = false;
            radius = 6;
            color = "white";

        }

    //Setting accessors and mutators for each data field
        //Accessor for speed
        public String getSpeed() {
            String s = "";
            switch (speed) {
                case SLOW: s = "SLOW"; break;
                case MEDIUM: s = "MEDIUM"; break;
                case FAST: s = "FAST";
            }
            return s;
        }
        //Mutator for speed
        public void setSpeed(int speed){
            this.speed = speed;
        }

        //Accessor for on
        public boolean getOn(){
            return on;
        }
        //Mutator for on
        public void setOn(boolean on){
            this.on = on;
        }
    
        //Accessor for radius
        public double getRadius(){
            return radius;
        }
        //Mutator for radius
        public void setRadius(double radius){
            this.radius = radius;
        }

        //Accessor for color
        public String getColor(){
            return color;
        }
        //Mutator for color
        public void setColor(String color){
            this.color = color;
        }

        //An argument constructor that creates a fan using the four fields
        Fan(int speed, boolean on, double radius, String color){

        }

        //Determining Fan Status
        public String toString(){
            if (on == true){
                return "\nFan speed: " + getSpeed() + ", color: " + color + ", radius: " + radius + "\n";
            
            }
            else {
                return "\nFan color: " + color + ", radius: " + radius + "\nfan is off\n";
            }

        }
 }