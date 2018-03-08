package com.chris.socialpage.data.repository;

import com.chris.socialpage.data.entity.Comment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ChrisJohnCarter on 3/7/18.
 */

@Repository
public interface CommentRepository  extends CrudRepository<Comment, Long> {
}
