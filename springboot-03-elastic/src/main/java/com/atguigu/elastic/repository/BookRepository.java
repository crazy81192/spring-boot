package com.atguigu.elastic.repository;

import com.atguigu.elastic.bean.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author ming
 * @create 2019-08-24 13:19
 */
public interface BookRepository extends ElasticsearchRepository<Book,Integer> {

}
