class ParkingSystem {
    private int big;
    private int medium;
    private int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    
    public boolean addCar(int carType) {
        if(carType == 1 && big > 0){
            big--;
            return true;
        }
        if(carType == 2 && medium > 0){
            medium--;
            return true;
        }
        if(carType == 3 && small > 0){
            small--;
            return true;
        }
        return false;
    }
}
public class Main{
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // int big = sc.nextInt();
        // int medium = sc.nextInt();
        // int small = sc.nextInt();
        ParkingSystem ps = new ParkingSystem(1, 1, 0);
        System.out.println(ps.addCar(1));
        System.out.println(ps.addCar(2));
        System.out.println(ps.addCar(3));
        System.out.println(ps.addCar(1));
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */