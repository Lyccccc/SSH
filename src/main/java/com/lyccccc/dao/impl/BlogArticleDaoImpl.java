package com.lyccccc.dao.impl;

import com.lyccccc.dao.BlogArticleDao;
import com.lyccccc.model.BlogArticle;
import com.sun.tools.jdi.ArrayTypeImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by Liuyuchen on 2017/07/13.
 */
@Repository("articleDao")
@Transactional
public class BlogArticleDaoImpl extends BaseDaoImpl<BlogArticle> implements BlogArticleDao {

}
