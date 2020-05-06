class Test {
    public static void main(String[] args) {
        RentableCar[] rentableCars = {
                new RentableCar("Renault", 2018, 5),
                new RentableCar("Ford", 2016, 4)
        };

        rentableCars[0].turnLeft();
        rentableCars[0].rent("Marek", "Kowalski", "13TS62");
        System.out.println(rentableCars[0]);
        rentableCars[0].handOver();
        System.out.println(rentableCars[0]);
    }
}
