package com.zhouyi.myblog.service;

import com.zhouyi.myblog.po.Comment;

import java.util.List;

public interface CommentService {

    List<Comment> listCommentByBlogId(Long BlogId);

    Comment saveComment(Comment comment);




}
