interface Moveable {
    String LEFT = "lewo";
    String RIGHT = "prawo";
    String FORWARD = "przód";
    String BACK = "tył";

    void turnLeft();

    void turnRight();

    void goForward();

    void goBack();
}
