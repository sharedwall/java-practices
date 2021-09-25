package sprint3.elevator;

import java.util.Scanner;

public class TestElevator {
    public static void main(String[] args) {
        System.out.println("Welcome to Elevator program.");

        Scanner scanner = new Scanner(System.in);
        Elevator elevator = new Elevator(Direction.STAND, 1);

        while (true) {
            System.out.println("Please choose the floor: <1,2,3,4,5,6,7,8,9,10>, or 0 to elevate");
            System.out.print(">> ");
            int selectedFloor = scanner.nextInt();
            if (selectedFloor==0){
                elevator.elevate();
            }else if (selectedFloor > 0 && selectedFloor < 11) {
                System.out.println("selected floor is: " + selectedFloor);
                if (selectedFloor != elevator.getCurrentFloor()) {
                    elevator.setNewRequest(selectedFloor);
                } else {
                    System.out.println("We are at selected floor: " + selectedFloor);
                    continue;
                }
            } else {
                System.out.println("selected floor is not allowed: " + selectedFloor);
                continue;
            }
            System.out.println(elevator);
        }
    }
}
