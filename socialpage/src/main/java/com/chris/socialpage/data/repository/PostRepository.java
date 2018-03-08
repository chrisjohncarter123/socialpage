package com.chris.socialpage.data.repository;

import com.chris.socialpage.data.entity.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ChrisJohnCarter on 3/7/18.
 */

@Repository
public interface PostRepository  extends CrudRepository<Post, Long> {
}
