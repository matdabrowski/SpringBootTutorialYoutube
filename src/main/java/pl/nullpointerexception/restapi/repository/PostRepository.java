package pl.nullpointerexception.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.nullpointerexception.restapi.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
