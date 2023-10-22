class Travel {
    String destination;
    String activity;

    public Travel(String destination, String activity) {
        this.destination = destination;
        this.activity = activity;
    }

    public void display() {
        System.out.println(destination + " - " + activity);
    }



    public static void main(String[] args) {
        Travel trip1 = new Travel("Kerala", "Sightseeing");
        Travel trip2 = new Travel("Paris", "Shopping");

        trip1.display();
        trip2.display();
    }
}

