package com.dianping.cip.repository;

import com.dianping.cip.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by 周高磊
 * Date: 2018/1/16.
 * Email: gaoleizhou@gmail.com
 * Desc:
 *
 * @author zhougaolei
 */
public interface ReadingListRepository extends JpaRepository<Book, Long> {

    List<Book> findByReader(String reader);

}
