abstract class Vehicle implements Moveable {
    private String name;
    private int year;
    private String position;

    public Vehicle(String name, int year) {
        this.name = name;
        this.year = year;
        this.position = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public void turnLeft() {
        position = LEFT;
    }

    @Override
    public void turnRight() {
        position = RIGHT;
    }

    @Override
    public void goForward() {
        position = FORWARD;
    }

    @Override
    public void goBack() {
        position = BACK;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", position='" + position + '\'' +
                '}';
    }
}
