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
        addMovie.put(101,new Movie(101,"Jana Nayagam"));
        addMovie.put(102, new Movie(102,"Parasakthi"));
        addMovie.put(103, new Movie( 103,"Magatha"));
        while (true) {
            System.out.println("--------------Booking---------------");
            System.out.println("1.View Tickets");
            System.out.println("2.Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    int count=1;
                    System.out.println("-----------Available Tickets-------------");
                    for(Movie m:addMovie.values()){
                        System.out.println(count +". " +m.getMovieId() +" Movie " + m.getMovieName());
                   count++;
                    }
                    int choose=sc.nextInt();
                    System.out.println("Enter Choice: ");
                    if(choose==1){
                        System.out.println();
                    }
            }
        }
    }
}