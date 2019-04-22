package com.example.daodemo.daoImpl;

import com.example.daodemo.dao.IEmpDao;
import com.example.daodemo.vo.Emp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * =======数据层实现类===========
 *
 * */

public class EmpDAOImpl  implements IEmpDao {
    private Connection conn ;	//需要利用COnnection对象操作
    private PreparedStatement pstmt ;
    /**
     * 如果要想使用数据层进行原子性的功能操作实现，必须要提供有Connection接口对象
     * 另外，由于开发之中业务层要调用数据层，所以数据库的打开与关闭交由业务层处理
     * @param conn 表示数据库连接对象
     * */
    public EmpDAOImpl(Connection conn){

        this.conn = conn ;
    }

    @Override
    public boolean doCreate(Emp vo) throws Exception{
        String sql = "INSERT INTO emp(id,ename) VALUES (?,?)" ;
        this.pstmt = this.conn.prepareStatement(sql);
        this.pstmt.setInt(1,vo.getId());
        this.pstmt.setString(2,vo.getEname());
        return this.pstmt.executeUpdate()>0;
    }


    @Override
    public boolean doUpdate(Emp vo) throws Exception {
        String sql = "UPDATE emp SET ename=? where ID=?" ;
        this.pstmt = this.conn.prepareStatement(sql);
        this.pstmt.setString(1,vo.getEname());
        this.pstmt.setInt(2,vo.getId());
        return this.pstmt.executeUpdate()>0;

    }
    /**
     * =====================
     * 删除是最头疼的,
     *
     * */

    @Override
    public boolean doRemoveBatch(Set<Integer> ids) throws Exception {
        return false;
    }

    @Override
    public Emp findById(Integer id) throws Exception {
        Emp vo = null;
        String sql = "SELECT  * FROM  emp WHERE id=?" ;
        this.pstmt = this.conn.prepareStatement(sql);
        this.pstmt.setInt(1,id);
        ResultSet rs = this.pstmt.executeQuery() ;
        if(rs.next()) {
            vo = new Emp() ;
            vo.setId(rs.getInt(1));
            vo.setEname(rs.getString(2));

        }
        return vo ;
    }

    @Override
    public List<Emp> findAll() throws Exception {

        List<Emp> all = new ArrayList<Emp>() ;
        String sql = "SELECT * FROM emp" ;
        this.pstmt = this.conn.prepareStatement(sql) ;
        ResultSet rs = this.pstmt.executeQuery() ;
        while(rs.next()) {
            Emp vo = new Emp() ;
            vo.setId(rs.getInt(1));
            vo.setEname(rs.getString(2));
            all.add(vo) ;
        }
        return all;

    }

    @Override
    public List<Emp> findAllSplit(Integer currentPage, Integer lineSize, String column, String keyWord) throws Exception {
        return null;
    }

    @Override
    public Integer getAllCount(String column, String keyWord) throws Exception {
        return null;
    }
}
