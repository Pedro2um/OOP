
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    static public void main(String[] args){
        Map<Integer, Book> m = new HashMap<>();

        Scanner stream = new Scanner(System.in);
        stream.useDelimiter(";");
        while(stream.hasNextLine()){
            String line = stream.nextLine();

            /*String tempName = line.;
            String tempOwner = ;
            Integer release_date = ;
            Integer code = ;*/
            Book temp = new Book(stream);
            m.put(temp.getCode(), temp);
        }
        for(var x: m.values()){
            System.out.println(x);
        }
        /* Exemplo
        Book b1 = new Book("Hobbit Pedro 1945");
        Book b2 = new Book("Lord of The Rings Matheus 1955");

        m.put(1,b1);
        m.put(2,b2);
        */
    }
}
