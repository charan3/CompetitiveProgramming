/*
Choose two movies whose total runtimes will equal the exact flight length.
 A method that takes an integer flightLength (in minutes) and an array of integers movieLengths (in minutes)
  and returns a boolean indicating whether there are two numbers in movieLengths whose sum equals flightLength.
 */
import java.util.Hashtable;

public class InflightEntertainment {
    public boolean findMovies(int flight_time, int [] movie){

        Hashtable<Integer,Integer> hash = new Hashtable<>();

        for (int i=0; i<movie.length; i++) {

            if(hash.get(flight_time-movie[i])==null){
                hash.put(movie[i],1);
            }
            else {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        /*
        int flightLength = 34;

        int[] movieLengths = {10,3,24,20,12,40,12,30};
        */
        int flightLength = 6;
        int[] movieLengths = {6};


        InflightEntertainment inf = new InflightEntertainment();
        System.out.println(inf.findMovies(flightLength,movieLengths));
    }
}
