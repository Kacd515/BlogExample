package pl.akademiakodu.springExample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BlogController {



    @GetMapping("/")
    public String add(){
        return "add";
    }

    @GetMapping("/show")
    public String show(@RequestParam String title,
                       @RequestParam String content,
                       @RequestParam String author,
                       ModelMap modelMap
                        ) {
        Post post = new Post(title, content, author);
        modelMap.put("post", post);
        return "show";
    }



}

