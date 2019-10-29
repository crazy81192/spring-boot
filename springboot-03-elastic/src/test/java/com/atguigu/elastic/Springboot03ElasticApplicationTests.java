package com.atguigu.elastic;

import com.atguigu.elastic.bean.Article;
import com.atguigu.elastic.bean.Book;
import com.atguigu.elastic.repository.BookRepository;
import io.searchbox.client.JestClient;
import io.searchbox.core.Index;
import io.searchbox.core.Search;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.naming.directory.SearchResult;
import java.io.IOException;

import static org.elasticsearch.action.admin.indices.stats.CommonStatsFlags.Flag.Search;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot03ElasticApplicationTests {

	@Autowired
	JestClient jestClient;

	@Autowired
	BookRepository bookRepository;

	@Test
	public void contextLoads() {
		//1.给Es中索引(保存)一个文档
		Article article = new Article();
		article.setId(1);
		article.setAuthor("zhangsna");
		article.setContent("好笑哈哈哈");
		article.setTitle("helloworld");
		//构建一个索引功能
		Index build = new Index.Builder(article).index("atguigu").type("news").build();
		try {
			//执行
			jestClient.execute(build);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void search(){
		//查询表达式
		String json = "";
		//构建搜索功能
		Search search = new Search.Builder(json).addIndex("atguigu").addType("news").build();
		//执行
//		try {
//			SearchResult result = jestClient.execute(search);
//			System.out.println(result);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}

	@Test
	public void test02(){
		Book book = new Book();
		bookRepository.index(book);
	}

}
