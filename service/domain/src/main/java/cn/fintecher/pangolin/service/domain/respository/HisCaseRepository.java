package cn.fintecher.pangolin.service.domain.respository;


import cn.fintecher.pangolin.entity.domain.HisCase;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Created by huyanmin on 2018/7/26.
 */
public interface HisCaseRepository extends ElasticsearchRepository<HisCase, String> {

}