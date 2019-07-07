package filtrierest.filtrie.Repository;

import filtrierest.filtrie.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlaylistJpaRepository extends JpaRepository<Video,Long>
{
    List<Video> findByUserid(Long userid);
}



