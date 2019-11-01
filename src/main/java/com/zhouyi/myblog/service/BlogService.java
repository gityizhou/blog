package com.zhouyi.myblog.service;

import com.zhouyi.myblog.po.Blog;
import com.zhouyi.myblog.vo.BlogQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService {

    Blog getBlog(Long id);

    Page<Blog> listBlog(Pageable pageable, BlogQuery blog);

    Page<Blog> listBlog(Pageable pageable);

    Page<Blog> listBlog(Long tagId,Pageable pageable);

    Page<Blog> listBlog(Pageable pageable, String query);

    Blog saveBlog(Blog blog);

    Blog updateBlog(Long id, Blog blog);

    List<Blog> listRecommendBlogTop(Integer size);

    void deleteBlog(Long id);

    Blog getAndConvert(Long id);


}
