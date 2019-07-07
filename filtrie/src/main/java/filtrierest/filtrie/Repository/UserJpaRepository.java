package filtrierest.filtrie.Repository;

import filtrierest.filtrie.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserJpaRepository  extends JpaRepository<User,Long>
{



}
