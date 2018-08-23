package fundamentals.labs;

/**
 * Fundamentals Exercise 4: Area and Perimeter
 *
 *      Write the necessary code to calculate the area and perimeter of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {
        double radius = 3.14;
        int height = 5;
        //I'm using the formula for volume for area (it didn't specify volume or surface area)
        double area = Math.PI * (radius * radius) * height;
        //cylinders are three dimensional so I'm using the formula for surface area instead of perimeter
        double perimeter = (2 * Math.PI * radius * height) + (2 * Math.PI * (radius * radius));
        System.out.println("The area is: " + area);
        System.out.println("The perimeter is " + perimeter);
    }
}
