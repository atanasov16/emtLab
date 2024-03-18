package mk.ukim.finki.emt.labemt.repository;

import mk.ukim.finki.emt.labemt.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
