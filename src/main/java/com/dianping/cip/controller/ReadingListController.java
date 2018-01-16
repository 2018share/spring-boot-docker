package com.dianping.cip.controller;

import com.dianping.cip.entity.Book;
import com.dianping.cip.repository.ReadingListRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 周高磊
 * Date: 2018/1/16.
 * Email: gaoleizhou@gmail.com
 * Desc:
 *
 * @author zhougaolei
 */
@Controller
@RequestMapping("/readingList")
public class ReadingListController {

    @Resource
    private ReadingListRepository readingListRepository;

    @RequestMapping(value = "/{reader}",method= RequestMethod.GET)
    public String readersBooks(@PathVariable("reader") String reader, Model model) {
        List<Book> readingList = readingListRepository.findByReader(reader);
        if (readingList != null) {
            model.addAttribute("books", readingList);
        }
        return "readingList";
    }

    @RequestMapping(value = "/{reader}",method=RequestMethod.POST)
    public String addToReadingList(@PathVariable("reader") String reader, Book book) {
        book.setReader(reader);
        readingListRepository.save(book);
        return "redirect:/readingList/" + reader;
    }

}
