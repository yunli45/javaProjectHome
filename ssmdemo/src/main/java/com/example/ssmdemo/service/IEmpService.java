package com.example.ssmdemo.service;


/*
 * 定义emp表的业务层的执行标准
 *
 * */

import com.example.ssmdemo.vo.Emp;
import org.apache.ibatis.jdbc.SQL;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 定义emp表的业务层的执行标准，此类一定要负责数据库的打开与关闭操作
 * 此类可以通过DAOFactory类取得IEmpDAO接口对象
 * @author Bruis
 *
 */

public interface IEmpService {

    /**
     * 实现员工数据的增加操作，本次操作要调用IEmpDao接口的如下方法
     * 需调用IEmpDao.findById()方法，判断要增加的数据的id是否存在
     * @param vo 包含了要增加数据的VO对象
     * @return 如果增加数据的ID重复或者保存失败，返回false，否则返回true
     * @throws SQLException
     * */
    public boolean insert(Emp vo) throws Exception;

    /**
     *
     * 实现员工数据修改操作，本次调用IEmpDao.doUpdate()方法，本次修改属于全部内容的修改
     *  @param vo
     *   @throws SQLException
     * */
    public boolean update(Emp vo) throws Exception;

    /**
     *执行雇员数据的删除操作，可以删除多个雇员信息，调用IEmpDao.doRemoveBatch() 方法
     * @param ids 包含了全部要删除数据的集合，没有重复数据
     *@throws SQLException
     * */
    public boolean delete(Set<Integer> ids) throws Exception;

    /**
     *  根据员工编号去查询该员工的全部信息，调用IEmpDao.findById()
     *
     * */
    public Emp get(Integer ids) throws Exception;

    /**
     * 查询员工表中全部员工的信息，调用IEmpDao.findAll()
     *  @return 查询结果以List集合的形式返回，如果没有数据则集合的长度为0
     *@throws SQLException
     * */
     public List<Emp> list() throws Exception;
    /**
     * 实现数据的模糊查询与数据统计，要调用IEmpDAO接口的两个方法
     * 调用IEmpDAO.findAllSplit()方法，查询出所有的表数据，返回的是List<Emp>
     * 调用IEmpDAO.getAllCount()方法，查询所有的数据量，返回的Integer
     * @param currentPage 当前所在页
     * @param lineSize 每页显示的记录数
     * @param column 模糊查询的数据列
     * @param keyWord 关键字
     *
     * @return 由于需要返回多种数据类型，所以使用Map集合返回，由于类型不统一，所以所有value的类型设置为Object
     * 如果key = allEmps，value = IEmpDAO.findAllSplit（）返回结果，List<Emp>
     * 如果key = empCount，value = IEmpDAO.getAllCount()返回结果，Integer
     * @throws Exception
     */
    public Map<String,Object> list(int currentPage, int lineSize, String column, String keyWord) throws Exception ;
}


