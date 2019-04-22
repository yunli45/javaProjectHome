package com.example.ssmdemo.dao;


import com.example.ssmdemo.vo.Emp;

import java.util.List;
import java.util.Set;

/**
 * 定义emp表的数据层的操作标准
 * */

/**
 * 对于整个数据层的开发严格来讲就只有两类功能：
 * -数据更新：建议它的操作方法以doXxx()的形式命名。例如：doCreate()。
 * -数据查询，对于查询分为两种形式：
 * （1）查询表中数据：以fingXxx（）形式命名。例如：findById()。
 * （2）统计表中的数据：以getXxx（）形式命名。例如：getName()。
 */

public interface IEmpDAO {
    /**
     *  实现数据的增加操作
     * @param vo 包含了要增加数据的Vo对象
     * @return 数据保存成功返回true，否则为flase
     * @throws Exception SQL执行异常
     *
     * */
    public boolean doCreate (Emp vo) throws Exception ;


    /**
     *
     * 实现对数据修改操作
     * @param vo 包含了需要修改的数据信息一定要有id
     * @return 数据保存成功返回true，否则返回false
     * @throws Exception SQL执行异常
     *
     * */
    public boolean doUpdate(Emp vo) throws Exception;

    /**
     * 执行数据的批量删除操作，所有要删除的数据以Set集合的形式保存
     * 删除成功返回true（删除的数据个数与要删除的数据个数相同，例如要删除4个，可是要求的是删除5个
     * ，则返回false），否则返回false
     * @param ids 包含了所有要删除的数据的id，不包含有重复内容
     * @return 删除成功返回true（删除的数据个数与要删除的数据个数相同），否则返回false
     * @throws Exception SQL执行异常
     *
     * */
    public boolean doRemoveBatch(Set<Integer> ids) throws Exception;

    /**
     *
     * 根据员工编号查询该员工的全部信息
     * @param id 要查询的员工编号
     * @return 如果员工信息存在，则将数据已VO类数据对象的形式返回，如果不存在，返回为null
     * @throws Exception SQL执行异常
     *
     * */
    public Emp findById(Integer id) throws Exception;

    /**
     * 查询指定数据表的全部记录，并且以集合的形式返沪
     * @return 如果数据表中存在数据，则所有的数据会封装为VO对象而后利用List集合返回
     * 如果没有数据，那么集合的长度为0（size == 0， 不是null）
     *  @throws Exception SQL执行异常
     *
     * */
    public List<Emp> findAll()throws Exception;

    /**
     * 分页进行数据的模糊查询，查询结果以集合的形式返回
     * @param currentPage 当前所在的页
     * @param lineSize 每页显示的数据行数
     * @param column 要进行模糊查询的数据列
     * @param keyWord 模糊查询的关键字
     * @return 如果表中有数据，则所有的数据会封装为VO对象而后利用List集合返回，
     * 如果没有数据，那么集合的长度为0（size（）== 0，不是null）
     * @throws Exception SQL执行异常
     * */
    public List<Emp> findAllSplit(Integer currentPage, Integer  lineSize, String column, String keyWord) throws Exception;

    /**
     * 进行模糊查询数据量的统计，如果表中没有记录统计的结果就是0
     * @param column 要进行模糊查询的数据列
     * @param keyWord 模糊查询的关键字
     * @return 返回表中的数据量，如果没有数据返回0
     * @throws Exception
     * */
    public Integer getAllCount(String column, String keyWord) throws Exception ;

}
