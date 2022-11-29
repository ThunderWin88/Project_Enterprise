package example.rest.Repo;



import org.springframework.data.jpa.repository.JpaRepository;
import example.rest.model.user;

public interface UserRepo extends JpaRepository<user,Long>{
    
}

