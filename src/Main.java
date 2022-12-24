public class Main {
    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.SumarDoor();
        myCar.SumarDoor();
        myCar.SumarDoor();
        myCar.SumarDoor();
        System.out.println(myCar.Door);

    }
    static class Car{
        public int Door = 0;
        public void SumarDoor(){

            this.Door++;
        }
    }

}