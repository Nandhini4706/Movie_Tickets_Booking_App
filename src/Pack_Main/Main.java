package Pack_Main;
import Model.User;
import Model.Movie;
import Model.Ticket;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> addUser = new HashMap<>();
        HashMap<Integer, Movie> addMovie = new HashMap<>();
        addMovie.put(101,new Movie(101,"Jayanayagam"));
        addMovie.put(102, new Movie(102,"Parashakthi"));
        addMovie.put(103, new Movie( 103,"Mangatha"));
        while (true) {
            System.out.println("--------------Booking---------------");
            System.out.println("1.View Tickets");
            System.out.println("2.Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("-----------Available Tickets-------------");
                    for (int i:addMovie.keySet()) {
                      //  Movie m=addMovie.get(key);
                    //    System.out.println(addMovie.get(Key));
                    }
            }
        }
    }
}