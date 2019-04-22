package com.example.ssmdemo.serviceImpl;

import com.example.ssmdemo.dbc.DatabaseConnection;
import com.example.ssmdemo.factory.DAOFactory;
import com.example.ssmdemo.service.IEmpService;
import com.example.ssmdemo.vo.Emp;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class EmpServiceImpl implements IEmpService {
    //在这个类的对象内部就提供有一个数据库连接类的实例化对象
    private DatabaseConnection dbc = new DatabaseConnection() ;

    @Override
    public boolean insert(Emp vo) throws Exception {
        return false;
    }

    @Override
    public boolean update(Emp vo) throws Exception {
        return false;
    }

    @Override
    public boolean delete(Set<Integer> ids) throws Exception {
        return false;
    }

    @Override
    public Emp get(Integer ids) throws Exception {
        return null;
    }

    @Override
    public List<Emp> list() throws Exception {
        try {
            return DAOFactory.getIEmpDAOInstance(this.dbc.getConnection()).findAll();
        }catch (Exception e){
            throw e;
        }finally {
            this.dbc.close();
        }
    }

    @Override
    public Map<String, Object> list(int currentPage, int lineSize, String column, String keyWord) throws Exception {
        return null;
    }
}
