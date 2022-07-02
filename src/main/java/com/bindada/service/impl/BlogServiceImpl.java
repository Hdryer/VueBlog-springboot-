package com.bindada.service.impl;

import com.bindada.entity.Blog;
import com.bindada.mapper.BlogMapper;
import com.bindada.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author bindada
 * @since 2022-04-12
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
