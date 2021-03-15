/*
    Manhattan Distance
    John Marshall
 */

public class ManhattanDistance {

    // accepts 2 int arrays representing points and returns the distance between them
    // if int arrays are invalid points then -1 is returned
    public static int calculateManhattan(int[] pointA, int[] pointB) {

        // verifies that arrays are valid points
        if (pointA.length != 2 || pointB.length != 2)
            return -1;

        // returns | pointA(x) - pointB(x) | + | pointA(y) - pointB(y) |
        return Math.abs(pointA[0] - pointB[0]) + Math.abs(pointA[1] - pointB[1]);
    }
    // runs through a set of test cases for calculateManhattan method
    public static void calculateManhattanTest() {
        int[][] pointArray = { // contains test points, each line representing a set of two points
                {5, 4}, {3, 2}, // example test 1 - expects 4
                {-1, 2}, {1, -2}, // example test 2 - expects 6
                {1, 1}, {1, 1}, // all values the same - expects 0
                {-5, -6}, {-10, -12}, // all values negative - expects 11
                {1, 2}, {3, 4}, // point A smaller than point B - expects 4
                {1, 2, 3}, {1, 2}, // point A invalid - expects error
                {1, 2}, {1, 2, 3} // point B invalid - expects error
        };

        // for loop runs through all test cases in pointArray
        for (int i = 0; i < pointArray.length - 1; i = i + 2) {

            int[] pointA = pointArray[i];
            int[] pointB = pointArray[i + 1];
            int distance = calculateManhattan(pointA, pointB);

            if(distance != -1) { // prints points and distance calculated

                System.out.println("\nPoint A: " + pointA[0] + ", " + pointA[1]);
                System.out.println("Point B: " + pointB[0] + ", " + pointB[1]);
                System.out.println("Manhattan Distance: " + distance);
            }
            else { // if -1 is returned for distance an error is printed
                System.out.println("\nInvalid points detected, skipping input");
            }
        }
    }
    public static void main(String[] args) {

        // runs through a set of test cases
        calculateManhattanTest();

        // remove comments to run custom tests below
        /*
        int[] pointA = {5, 4};
        int[] pointB = {3, 2};
        int distance = calculateManhattan(pointA, pointB);

        System.out.println("Point A: " + pointA[0] + ", " + pointA[1]);
        System.out.println("Point B: " + pointB[0] + ", " + pointB[1]);
        System.out.println("Manhattan Distance: " + distance);
         */
    }
}
