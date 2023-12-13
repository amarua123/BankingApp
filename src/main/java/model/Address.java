package model;

public class Address {

    public Address(String state, String city, String road, int pin){
        this.state = state;
        this.city = city;
        this.road = road;
        this.pin = pin;
    }
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    @Override
    public String toString() {
        return "State: "+state+", city: "+city+", road: "+road+"pin: "+pin;
    }

    private String state, city, road;
    private int pin;
    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

}
