package com.astontech.mssc.repository;

import com.astontech.mssc.model.Post;
import org.springframework.data.repository.ListCrudRepository;

public interface PostRepository extends ListCrudRepository<Post, Integer> {
}
