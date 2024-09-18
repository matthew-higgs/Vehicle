public class main {
    public static void main(String[] args) {
        vehicle myCar = new vehicle("Ford", "Fusion");
        System.out.println(myCar.getMake());
        myCar.setMake("Chevy");
        System.out.println(myCar.getMake());
    }
}
