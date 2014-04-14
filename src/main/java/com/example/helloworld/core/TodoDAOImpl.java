package com.example.helloworld.core;

import com.example.helloworld.resources.SqliteDBConnection;

import java.sql.Connection;
import java.sql.*;

/**
 * Created by syuan on 4/13/14.
 */
public class TodoDAOImpl implements TodoDAO{

    @Override
    public boolean addTodoModel(String name) {
        boolean flag=false;
        int status =0;

        Connection conn= SqliteDBConnection.getConnection();
        String sql="insert into todo (?,?)";
        PreparedStatement pstmt=null;
        try {
            pstmt=conn.prepareStatement(sql);
            pstmt.setInt('1', 1);
            pstmt.setString('2',name);
            if (status>0){
                flag=true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;


    }

    @Override
    public TodoModel getTodoModel(int id){

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


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return todo;
    }
}
