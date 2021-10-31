package sprint3.elevator;

import java.util.*;

public class Elevator {
    private Direction direction;
    private int currentFloor;
    private final SortedSet<Integer> requests;

    public Elevator(Direction direction, int currentFloor) {
        this.direction = direction;
        requests = new TreeSet<>();
        this.currentFloor = currentFloor;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setNewRequest(int floor) {
        if (direction == Direction.STAND) {
            direction = currentFloor > floor ? Direction.DOWN : Direction.UP;
        }
        if (currentFloor != floor)
            requests.add(floor);
    }

    public void elevate() {
        System.out.println("Moving Direction is: " + direction);
        List<Integer> movedFloors = new ArrayList<>();
        switch (direction) {
            case UP:
                for (Integer floor : requests) {
                    if (floor > currentFloor){
                        movedFloors.add(floor);
                    }
                }
                movedFloors.forEach(integer -> {
                    System.out.println("Moving up to floor:" + integer);
                    currentFloor = integer;
                    requests.remove(integer);
                });
                reverseDirection();
                break;
            case DOWN:
                for (Integer floor : requests) {
                    if (floor < currentFloor){
                        movedFloors.add(floor);
                    }
                }
                Collections.reverse(movedFloors);
                movedFloors.forEach(integer -> {
                    System.out.println("Moving down to floor:" + integer);
                    currentFloor = integer;
                    requests.remove(integer);
                });
                reverseDirection();
                break;
        }
    }

    private void reverseDirection(){
        if (requests.size() == 0) {
            setDirection(Direction.STAND);
            return;
        }
        direction = direction.equals(Direction.DOWN) ? Direction.UP : Direction.DOWN;
        elevate();
    }

    @Override
    public String toString() {
        return "Elevator{" + "direction=" + direction + ", currentFloor=" + currentFloor + ", requests=" + requests + '}';
    }
}
