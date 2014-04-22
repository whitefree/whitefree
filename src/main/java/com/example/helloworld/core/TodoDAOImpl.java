package com.example.helloworld.core;

import com.example.helloworld.resources.SqliteDBConnection;

import java.sql.Connection;
import java.sql.*;

/**
 * Created by syuan on 4/13/14.
 */
public class TodoDAOImpl implements TodoDAO{


    int id=4;
    @Override
    public boolean addTodoModel(String name) {
        boolean flag=false;
        int status =0;

        Connection conn= SqliteDBConnection.getConnection();
        String sql="insert into todo values(?,?)";
        PreparedStatement pstmt=null;
        try {
            pstmt=conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            pstmt.setString(2,name);
            status=pstmt.executeUpdate();
            if (status>0){
                flag=true;
                id++;
            }

        } catch (SQLException e) {
            flag=false;
        }
        return flag;


    }

    @Override
    public String getTodoModel(int id){

        String name="origin name";
        TodoModel todo=new TodoModel();
        Statement stmt=null;
        ResultSet rs=null;

        Connection conn= SqliteDBConnection.getConnection();
        String sql="select * from todo where id="+id;

        try {
            stmt=conn.createStatement();
            rs=stmt.executeQuery(sql);
            while (rs.next()){

                todo.setId(rs.getInt(1));
                todo.setName(rs.getString(2));
            }
            name=todo.getName();


        } catch (SQLException e) {
            name="no match record";
        }
        return name;
    }
}
