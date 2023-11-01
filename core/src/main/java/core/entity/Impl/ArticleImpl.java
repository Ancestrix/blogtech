package core.entity.Impl;

import core.entity.*;
import org.springframework.data.repository.*;
import org.springframework.stereotype.*;
import org.springframework.stereotype.Repository;

@Service
public interface ArticleImpl extends CrudRepository<Article, Long> {
}
