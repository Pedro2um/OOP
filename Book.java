import java.util.Scanner;

public class Book {
    String name;
    String owner;

    Integer release_date;

    Integer code;
    public Book(Scanner stream){
        String[] data = stream.delimiter().split(stream.toString());
        //dbg
        System.out.println(data.length + "\n");
        name = data[0];
        System.out.println(data[0]);
        owner = data[1];
        System.out.println(data[1]);
        release_date = Integer.parseInt(data[2]);
        code = Integer.parseInt(data[3]);
    }

    @Override
    public String toString() {
        return "Name = " + name + " " + "Owner = " + owner + "\n";
    }

    public Integer getCode(){
        return code;
    }
}
