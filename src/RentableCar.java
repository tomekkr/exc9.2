class RentableCar extends Car implements Rentable {
    private Person user;

    public RentableCar(String name, int year, int seats) {
        super(name, year, seats);
        user = null;
    }

    @Override
    public void rent(String firstName, String lastName, String id) {
        if (isRent()) {
            System.out.println("Samochód aktualnie jest wynajęty przez " + user);
        } else {
            user = new Person(firstName, lastName, id);
        }
    }

    @Override
    public void handOver() {
        if (isRent()) {
            user = null;
        } else {
            System.out.println("Samochód nie jest aktualnie wynajęty");
        }
    }

    @Override
    public boolean isRent() {
        return user != null;
    }

    @Override
    public String toString() {
        return super.toString() + "; RentableCar{" +
                "user=" + user +
                '}';
    }
}
