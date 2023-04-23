import java.util.List;

public class Show {

    public static void main(String[] args) {
        List<Movie> movies = List.of(new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 20)
        );

        long count = movies.stream().filter(movie -> movie.getLike() > 10).count();
        System.out.println(count);
    }
}
