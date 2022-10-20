package books;

public class Book implements Comparable<Book>{
    String name;
    String owner;

    Integer release_date;

    Integer code;
    public Book(String line){
        String[] data = line.split(" ");
        
        //dbg
        //System.out.println(data.length + "\n");
        name = data[0];

        //System.out.println(name);
        owner = data[1];

        //System.out.println(owner);
        release_date = Integer.parseInt(data[2]);

        code = Integer.parseInt(data[3]);
    }

    @Override
    public String toString() {
        return "Name = " + name + " ; " + "Owner = " + owner + "\n";
    }

    public Integer getCode(){
        return code;
    }

    public String getName(){
        return name;
    }

    @Override
    public int compareTo(Book a){
        return this.name.compareTo(a.name);
    }
}