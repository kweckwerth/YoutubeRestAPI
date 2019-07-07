package filtrierest.filtrie.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User
{
    //TODO finish fields
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long uid;

    @Column(name = "first", length = 50)
    private String first;

    @Column(name = "last", length = 50)
    private String last;


    public long getId() {
        return uid;
    }
    public String getFirst() {
        return first;
    }
    public String getLast() {
        return last;
    }

}
