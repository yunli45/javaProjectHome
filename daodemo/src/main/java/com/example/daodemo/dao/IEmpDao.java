package com.example.daodemo.dao;

import com.example.daodemo.vo.Emp;

import java.util.List;
import java.util.Set;

// 数据层接口
//同层之间如果要进行访问，那么必须要提供有接口，以定义操作标准，那么对于数据层也是一样的，因为数据层最终是要交给业务层执行，所以需要先定义出数据层接口

/**
 * 对于整个数据层的开发严格来讲就只有两类功能：
 * -数据更新：建议它的操作方法以doXxx()的形式命名。例如：doCreate()。
 * -数据查询，对于查询分为两种形式：
 * （1）查询表中数据：以fingXxx（）形式命名。例如：findById()。
 * （2）统计表中的数据：以getXxx（）形式命名。例如：getName()。
 */
public interface IEmpDao {
    /**
     * 实现数据的增加操作
     * @param vo 包含了要增加数据的VO对象
     * @return 数据保存成功返回true，否则返回false
     * @throws Exception SQL执行异常
     * */
    public boolean doCreate(Emp vo) throws Exception;

    /**
     * 实现数据的修改操作
     * @param vo 包含了要修改数据的信息，一定要提供有ID内容
     * @return 数据保存成功返回true，否则返回false
     * @throws Exception SQL执行异常
     * */
    public boolean doUpdate(Emp vo) throws Exception;

    /**
     * 执行数据的批量删除操作，所有要删除的数据已Set集合的形式保存
     * 删除成功返回true（删除的数据个数与要删除的数据个数相同，例如要删除4个，可是要求的是删除5个，则返回false），否则返回false
     * @param ids 包含了所有要删除的数据ID，不包含有重复内容
     * @return 删除成功返回true（删除的数据个数与要删除的数据个数相同），否则返回false
     * @throws Exception SQL执行异常
     * */
    public boolean doRemoveBatch(Set<Integer> ids) throws Exception;

    /**
     * 根据雇员编号查询雇员信息
     * @param id 要查询的雇员编号
     * @return 如果雇员信息存在，则将数据以VO类对象的形式返回，如果雇员数据不存在，则返回null
     * @throws Exception SQL执行异常
     * */
    public Emp findById(Integer id) throws Exception ;

    /**
     * 查询指定数据表的全部记录，并且以集合的形式返回
     * @return 如果表中有数据，则所有的数据会封装为VO对象而后利用List集合返回，
     * 如果没有数据，那么集合的长度为0（size（）== 0，不是null）
     * @throws Exception SQL执行异常
     * */
    public List<Emp> findAll() throws Exception ;

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
    public List<Emp> findAllSplit(Integer currentPage, Integer  lineSize, String column, String keyWord) throws Exception ;

    /**
     * 进行模糊查询数据量的统计，如果表中没有记录统计的结果就是0
     * @param column 要进行模糊查询的数据列
     * @param keyWord 模糊查询的关键字
     * @return 返回表中的数据量，如果没有数据返回0
     * @throws Exception
     * */
    public Integer getAllCount(String column, String keyWord) throws Exception ;


}
