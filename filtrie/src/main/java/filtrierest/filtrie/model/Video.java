package filtrierest.filtrie.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "playlists")
public class Video
{
    @Id
    private long id;

    @Column(name = "vidid")
    private String vid;


    @Column(name = "startseconds")
    private int startSeconds;

    @Column(name = "endseconds")
    private int endSeconds;

    @Column(name = "userid")
    private long userid;

    @Column(name = "vidname", length = 50)
    private String name;


    public String getVid() {
        return vid;
    }


    public int getStartSeconds() {
        return startSeconds;
    }

    public int getEndSeconds() {
        return endSeconds;
    }




}
