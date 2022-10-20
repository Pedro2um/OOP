
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


import books.Book;

public class App {
    static public void main(String[] args){
        Map<Integer, Book> m = new HashMap<>();
        
        Scanner stream = new Scanner(System.in);

        while(stream.hasNextLine()){
            Book temp = new Book(stream.nextLine());
            m.put(temp.getCode(), temp);
        }

        stream.close();
        
        TreeMap<String,Book> m2 = new TreeMap<>();
        

        for (var x : m.values()) {
            m2.put(x.getName(), x);
        }
        
        m.clear();

        for(var x: m2.values()){
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

