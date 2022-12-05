import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            double length = Double.parseDouble(scanner.nextLine());
            double width = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            Parallelepiped parallelepiped = new Parallelepiped(length,width,height);
            System.out.println(parallelepiped);
            Parallelepiped.getArea(parallelepiped);
            Parallelepiped.getVolume(parallelepiped);
        } catch (NumberFormatException e){
            System.err.println("Tamga beruugo bolboit!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}