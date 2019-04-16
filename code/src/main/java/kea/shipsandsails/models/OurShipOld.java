package kea.shipsandsails.models;

public class OurShipOld {

    private int shipId;
    private int shipType;
    private String nationality;
    private String name;
    private int x;
    private int y;
    private Direction direction; //ENUM, N, NE, SE, S, SW, NW
    private int speed; //change: speed last round +/- calculated change
    private int hull_health; //0 - 100
    private int sail_health; //0 - 100
    private int sailors; //0 - MAX_SAILORS
    private int load; //load time // Set this to 1 if reloading, 2 if switching ammunition, then decrement by one each turn? when 0 one can fire?

    /* Our group added */

    private int sailorsOnSails;
    private int sailorsOnGuns;
    private int sailsActive;
    private int sailsInReserve;

    private final int rows_of_guns = 1;
    private final int guns_per_row = 8;

    public int getSailorsOnSails() {
      return sailorsOnSails;
    }

    public int getsailorsOnGuns() {
      return sailorsOnGuns;
    }

    public int getSailsActive() {
      return sailsActive;
    }

    public int getSailsInReserve() {
      return sailsInReserve;
    }

    public void setSailsActive(int sailsActive) {
      this.sailsActive = sailsActive;
    }

    public void setSailsInReserve(int sailsInReserve) {
      this.sailsInReserve = sailsInReserve;
    }

    public void setSailorsOnSails(int sailorsOnSails) {
      this.sailorsOnSails = sailorsOnSails;
    }

    public void setSailorsOnGuns(int sailorsOnGuns) {
      this.sailorsOnGuns = sailorsOnGuns;
    }


    public OurShipOld(int shipId, int shipType, String nationality, String name, int x, int y, Direction direction, int speed, int hull_health, int sail_health, int load, int sailors, int sailsActive, int sailsInReserve, int sailorsOnSails, int sailorsOnGuns) {
        this.shipId = shipId;
        this.shipType = shipType;
        this.nationality = nationality;
        this.name = name;
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.speed = speed;
        this.hull_health = hull_health;
        this.sail_health = sail_health;
        this.load = load;
        this.sailors = sailors;

        this.sailsActive = sailsActive;
        this.sailsInReserve = sailsInReserve;
        this.sailorsOnSails = sailsActive * 6 + 2/(sailors-sailsActive*6-rows_of_guns*guns_per_row*3);    // 6: The number of sailors per sail for all ship types
        this.sailorsOnGuns = sailors - sailorsOnSails;
    }

    /* // Our group added */

    public int getShipId() {
        return shipId;
    }

    public void setShipId(int shipId) {
        this.shipId = shipId;
    }

    public int getShipType() {
        return shipType;
    }

    public void setShipType(int shipType) {
        this.shipType = shipType;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHull_health() {
        return hull_health;
    }

    public void setHull_health(int hull_health) {
        this.hull_health = hull_health;
    }

    public int getSail_health() {
        return sail_health;
    }

    public void setSail_health(int sail_health) {
        this.sail_health = sail_health;
    }

    public int getSailors() {
        return sailors;
    }

    public void setSailors(int sailors) {
        this.sailors = sailors;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }
}
