package com.changgou.content.service;
import com.changgou.content.pojo.Content;
import com.github.pagehelper.PageInfo;
import java.util.List;
/****
 * @Author:gaoyihua
 * @Description:Content的业务层接口
 * @Date 2021-03-09 01:41:49
 *****/
public interface ContentService {

    /***
     * Content多条件分页查询
     * @param content
     * @param page
     * @param size
     * @return
     */
    PageInfo<Content> findPage(Content content, int page, int size);

    /***
     * Content分页查询
     * @param page
     * @param size
     * @return
     */
    PageInfo<Content> findPage(int page, int size);

    /***
     * Content多条件搜索方法
     * @param content
     * @return
     */
    List<Content> findList(Content content);

    /***
     * 删除Content
     * @param  id
     */
    void delete(String id);

    /***
     * 修改Content数据
     * @param content
     */
    void update(Content content);

    /***
     * 新增Content
     * @param content
     */
    void add(Content content);

    /**
     * 根据ID查询Content
     * @paramString id
     * @return
     */
     Content findById(String id);

    /***
     * 查询所有Content
     * @return
     */
    List<Content> findAll();

    /***
     * 根据categoryId查询广告集合
     * @param id
     * @return
     */
    List<Content> findByCategory(String id);
}
