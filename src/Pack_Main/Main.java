package Pack_Main;
import Model.User;
import Model.Movie;
import Model.Ticket;

import javax.xml.namespace.QName;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, User> addUser = new HashMap<>();
        HashMap<Integer, Movie> addMovie = new LinkedHashMap<>();
        HashMap<Integer,Ticket> book=new HashMap<>();
        addMovie.put(101,new Movie(101,"Jana Nayagam", 550, "First Class"));
        addMovie.put(102,new Movie(101,"Jana Nayagam", 350, "Second Class"));
        addMovie.put(103,new Movie(101,"Jana Nayagam", 250, "Third Class"));
        addMovie.put(111, new Movie(102, "Parasakthi", 550, "First Class"));
        addMovie.put(112, new Movie(102, "Parasakthi", 350, "Second Class"));
        addMovie.put(113, new Movie(102, "Parasakthi", 250, "Third Class"));
        addMovie.put(121, new Movie( 103,"Magatha",550,"First Class"));
        addMovie.put(122, new Movie( 103,"Magatha",350,"Second Class"));
        addMovie.put(123, new Movie( 103,"Magatha",250,"Third Class"));
        System.out.println("Enter Name");
        String name=sc.nextLine();
        int id=1;
        addUser.put(1,new User(id, name));

        while (true) {
            System.out.println("--------------Booking---------------");
            System.out.println("1.View Tickets");
            System.out.println("2.Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:

                    System.out.println("-----------Available Tickets-------------");
                    int count=1;
                    for(Movie m:addMovie.values()){
                        System.out.println(count +". " +m.getMovieId() +" Movie |" + m.getMovieName() +"| Price |" +m.getMoviePrice() +"| Class |" +m.getMovieClass());
                   count++;
                    }
                    int choose=sc.nextInt();
                    System.out.println("Enter Choice: ");
                    if(choose==1){

                    }
            }
        }
    }
}