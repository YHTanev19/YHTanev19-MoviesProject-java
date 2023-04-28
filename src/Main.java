import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MovieCollection MovieCollection = new MovieCollection();

        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println("Choose an option:");
            System.out.println();
            System.out.println("1. Add a movie");
            System.out.println("2. Remove a movie by ID");
            System.out.println("3. Print MovieCollection by author");
            System.out.println("4. Print the most expensive movie/(s)");
            System.out.println("5. Print the average price of MovieCollection by author");
            System.out.println("0. Exit");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice)
            {
                case 1:
                    try {
                        Movie movie = new Movie();
                        System.out.print("Enter movie name: ");
                        movie.settitle(scanner.nextLine());
                        System.out.print("Enter author name: ");
                        movie.setGentre(scanner.nextLine());
                        System.out.print("Enter price: ");
                        movie.setYear(scanner.nextInt());
                        System.out.print("Enter year: ");
                        movie.setMovieLength(scanner.nextDouble());
                        System.out.print("Enter movie id: ");
                        movie.setId(scanner.nextInt());


                        MovieCollection.addMovieToList(movie);
                        System.out.println("Movie added successfully.");
                    }
                    catch (Exception exception) {
                        System.out.println("Error" + exception.getMessage());
                    }
                    break;

                case 2:
                    System.out.println("Enter movie id to delete:");
                    int movieId = scanner.nextInt();
                    scanner.nextLine();

                    try {
                        MovieCollection.removeMovieFromList(movieId);


                    } catch (Exception exception) {
                        System.out.println("Error " + exception.getMessage());
                    }
                    break;

                case 3:
                    System.out.print("Enter author name or press Enter to print all MovieCollection: ");
                    String author = scanner.nextLine();
                    MovieCollection.printmovieByAuthor(author);
                    break;

                case 4:
                    MovieCollection.mostExpensivemovie();
                    break;

                case 5:
                    System.out.print("Enter author name or press Enter for total average: ");
                    author = scanner.next();
                    if(author.equals(""))
                    {
                        MovieCollection.averagePrice(author);
                    }

                case 0:
                    System.out.println("Exitting program...");
                    System.exit(0);

            }

        }
        while (choice != 0);
    }
    }
}