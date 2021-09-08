package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PostService {
    public List<Post> listAllPosts() {
        List<Post> posts = new ArrayList<>();
        posts.add(new Post("Самый первый пост"));
        posts.add(new Post("Второй пост"));
        posts.add(new Post("Третий пост"));
        return posts;
    }
}
