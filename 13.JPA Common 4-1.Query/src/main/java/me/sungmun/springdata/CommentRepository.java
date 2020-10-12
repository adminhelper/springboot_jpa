package me.sungmun.springdata;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.stream.Stream;

public interface CommentRepository extends  MyRepository<Comment, Long> {

//    List<Comment> findByCommnetContainsIgnoreCase(String Keyword, Pageable pageable);
//    Page<Comment> findByCommnetContainsIgnoreCase(String Keyword, Pageable pageable);
    Stream<Comment> findByCommnetContainsIgnoreCase(String Keyword, Pageable pageable);

}
