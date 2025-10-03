public class car implements Cloneable{
    private String model;
    private double speed;
    private int power;

    //null constructor
    car(){
        this.model = "unknown";
        this.speed = 0.0;
        this.power = 0;
    }

    //parametrized constructor
    public car(String model, double speed, int power){
        this.model = model;
        this.speed = speed;
        this.power = power;
    }

    //copy constructor
    public car(car other){
        this.model = other.model;
        this.speed = other.speed;
        this.power =other.power;
    }

    //setter
    public void set(String model, double speed, int power){
        this.model = model;
        this.speed = speed;
        this.power = power;
    }

    //getter
    public String getModel(){
       return model;
    }

    public double getSpeed(){
        return speed;
    }

    public int getPower(){
        return power;
    }

    //ToString
    @Override
    public String toString(){
        return "Model=" +model+ ",speed" +speed+ ",power" +power;
    }

    //clone
    @Override
    public car Clone()  throws CloneNotSupportedException{
        return(car) super.clone();
      }
    }


    //main.java
    public static void main(String[] args) {
        car car1 = new car("Ferrari" ,150,200 );
        System.out.println("Original car:" +car1);

        //clone the car 
        car car2 = null;
         car2 = car1.clone();
        System.out.println("cloned car:" +car2);

        //change values in cloned object
        car2.setModel("Lamborghini");
        car2.setSpeed(255);
        car2.setPower(600);
        System.out.println("cloned car2:" +car2);
    }
}