package cn.fintecher.pangolin.service.repair.respository;

import cn.fintecher.pangolin.entity.repair.ExamineStatus;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Created by hanwannan on 2017/8/27.
 */
public interface ExamineStatusRepository extends ElasticsearchRepository<ExamineStatus, String> {

}
