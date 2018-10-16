package cn.fintecher.pangolin.service.management.repository;

import cn.fintecher.pangolin.entity.managentment.SensitiveWord;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface SensitiveWordRepository extends MongoRepository<SensitiveWord, String>, QuerydslPredicateExecutor<SensitiveWord> {
}
