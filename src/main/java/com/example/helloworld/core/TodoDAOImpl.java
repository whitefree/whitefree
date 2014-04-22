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
        int id=0;

        Connection conn= SqliteDBConnection.getConnection();
        String sql="insert into todo values(?,?)";
        PreparedStatement pstmt=null;
        try {
            pstmt=conn.prepareStatement(sql);
            id=getMaxId()+1;
            pstmt.setInt(1, id);
            pstmt.setString(2,name+id);
            status=pstmt.executeUpdate();
            if (status>0){
                flag=true;
            }

        } catch (SQLException e) {
            flag=false;
        }
        return flag;
    }

    @Override
    public int getMaxId() {
        int maxId=0;
        Statement stmt=null;
        ResultSet rs=null;

        Connection conn= SqliteDBConnection.getConnection();
        String sql="select max(id) from todo ";

        try {
            stmt=conn.createStatement();
            rs=stmt.executeQuery(sql);
            while (rs.next()){
                maxId=Integer.parseInt(rs.getString(1));
            }
        } catch (SQLException e) {

        }
        return maxId;
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

        }
        return todo;
    }
}
