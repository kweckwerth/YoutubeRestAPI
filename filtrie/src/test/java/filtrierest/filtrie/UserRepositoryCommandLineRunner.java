package filtrierest.filtrie;


import filtrierest.filtrie.Repository.UserJpaRepository;
import filtrierest.filtrie.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);

    @Autowired
    private UserJpaRepository userRepository;

    @Override
    public void run(String... args) {
        log.info("-------------------------------");
        log.info("Finding all users");
        log.info("-------------------------------");
        for (User user : userRepository.findAll()) {
            log.info(user.getFirst());
            log.info(user.getLast());
            Assert.notNull(user.getFirst(), "first name can't be null");
            Assert.notNull(user.getLast(), "last name can't be null");
        }
    }

}
