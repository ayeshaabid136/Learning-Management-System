import java.util.*;

class carList implements Cloneable{

    private List<car> cars = new ArrayList<>();

    //null constructor
    public carList(){
this.cars = new ArrayList<>();
    }

    //parametrized constructor
    public carList(List<car> cars){
        this.cars = new ArrayList<>();
    }

    //copy constructor
    public carList(carList other){
        this.cars = new ArrayList<>();
        for(car c:other.cars){
            this.cars.add(c);   //making shalow copy of car object
        }
    }

    //add car
    public void addcar(car c){
        cars.add(c);
    }

    //Remove car by speed
    public boolean removeCar(double speed){
        for(car c : cars){
            if(c.getSpeed().equals(speed)){
                cars.remove(c);
                return c;
            }
        }
    }

    //Remove car by model
    public boolean removeCar(String model){
        for (car c : cars){
            if(c.getModel().equalsIgnoreCase(model)){
                cars.remove (c);
                return c;
            }
        }
    }

    //search car by model
    public car searchCar(String model){
        for(car c : cars){
            if(c.getModel().equalsIgnoreCase(model))
            return c;
        }
    }

    
    //ToString
    @Override
    public String toString(){
        return cars.toString();
    }

    //display 
    public void display(){
        System.out.println(cars);
    }

    //clone
    public Object clone() throws CloneNotSupportedException{
        carList cloned = (carList) super.clone();      
        cloned.cars = new ArrayList<>(this.cars);       //deep copy of the list
        return cloned;
    }


    //main.java
    public static void main(String[] args) {

        
        carList carList = new carList();     //object of carlist
       // private list<car> cars = new ArrayList<>(); 

        //create car object
        car c1 = new car("BMW",150 , 100);
        car c2 = new car( "Ferrari" , 45 , 200 );
        car c3 = new car( "Toyota" , 100 , 230);

        //Empty car List
        carList List = new carList();

        //add cars
          List.addcar(c1);
          List.addcar(c2);
          List.addcar(c3);
          System.out.println(List);
          List.displayCars();
          
          //remove car
          List.removeCar("Ferrari");
          List.displayCars();

          List.searchCar("Toyota");
          List.displayCars();

          List.displayCars();


}

