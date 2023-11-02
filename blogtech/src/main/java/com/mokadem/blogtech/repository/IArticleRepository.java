package com.mokadem.blogtech.repository;

import com.mokadem.blogtech.repository.entity.*;
import org.springframework.data.repository.*;

public interface IArticleRepository extends CrudRepository<Article, Long> {
}
