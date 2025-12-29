package Model;

public class Ticket {
    private int ticketId;
    private String theatre;
    private User user;
    private Movie movie;

    public Ticket(int ticketId,String theatre, User user, Movie movie){
        this.ticketId=ticketId;
        this.theatre=theatre;
        this.user=user;
        this.movie=movie;
    }

    public int getTicketId() {
        return ticketId;
    }

    public User getUser() {
        return user;

    }
    public Movie getmovie(){
           return movie;
    }
    public  String theatre(){
        return theatre;
    }
}
