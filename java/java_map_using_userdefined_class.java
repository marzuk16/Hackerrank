import java.util.*;

class Book{
    private String name;
    private String author;
    private String edition;
    private Integer price;

    Book(){

    }

    Book(String name, String author, String edition, Integer price){
        this.name = name;
        this.author = author;
        this.edition = edition;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getAuthor(){
        return this.author;
    }

    public void setAuthor(String author){
        this.author = author;
    }
    public String getEdition(){
        return this.edition;
    }

    public void setEdition(String edition){
        this.edition = edition;
    }
    public Integer getPrice(){
        return this.price;
    }

    public void setPrice(Integer price){
        this.price = price;
    }

    @Override
    public boolean equals(Object obj){
        if(obj.hashCode() == this.hashCode()) return true;
        else return false;
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.name, this.author, this.edition);
    }
}
public class java_map_using_userdefined_class {

    public static void main(String[] args){
        Book b1 = new Book("c", "Marzuk", "2nd", 100);
        Book b2 = new Book("cpp", "Marzuk", "2nd", 150);
        Book b3 = new Book("c", "Marzuk", "2nd", 100);
        Book b4 = new Book("c", "Marzuk", "2nd", 100);

        List<Book> list = new ArrayList<>();
        Set<Book> st = new HashSet<>();
        Map<Book, Integer> mp = new HashMap<>();
    
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);

        st.addAll(list);

        for(Book b:list){
            mp.put(b, mp.getOrDefault(b, 0) + 1);
        }

        System.out.println(list.size());
        System.out.println(st.size());
        System.out.println(mp.size());

    }
}