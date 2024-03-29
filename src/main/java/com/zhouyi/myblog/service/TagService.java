package com.zhouyi.myblog.service;

import com.zhouyi.myblog.po.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TagService {

    Tag saveTag(Tag tag);

    Tag getTag(Long id);

    Page<Tag> listTag(Pageable pageable);

    List<Tag> lisTagTop(Integer size);

    Tag updateTag(Long id, Tag tag);

    void deleteTag(Long id);

    Tag getTagByName(String name);

    List<Tag> listTag(String ids);

    List<Tag> listTag();


}
