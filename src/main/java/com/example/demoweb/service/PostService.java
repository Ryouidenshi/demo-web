package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.*;

@Service
public class PostService {
    public List<Post> listAllPosts() {
        Date date = new Date();
        List<Post> posts = new ArrayList<>();
        posts.add(new Post("Самый первый пост", date));
        posts.add(new Post("Второй пост", date));
        posts.add(new Post("Третий пост", date));
        return posts;
    }
}
