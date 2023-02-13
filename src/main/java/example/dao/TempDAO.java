package example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;
import org.springframework.stereotype.Repository;


@Repository
public class TempDAO {

    public boolean isMatches(String name, String userPwd){
        Connection connection = JdbcConnector.getConnection();
        System.out.println("레포지 호출");
//        String responsePwd = null;
//        try(PreparedStatement preparedStatement = connection.prepareStatement(DBSql.readPwdSql.text());){
//            preparedStatement.setString(1,name);
//
//            try(ResultSet responseData = preparedStatement.executeQuery()){
//                System.out.print(Objects.isNull(responseData));
//
//                if(responseData != null) {
//                    while(responseData.next()) {
//                        responsePwd = responseData.getString("pwd");
//                    }
//                }
//            }
//        }catch (SQLException e){
//            System.out.println(e.getMessage());
//        }
//        if(Objects.isNull(responsePwd) || !Objects.equals(responsePwd, userPwd)){
//            return false;
//        }
        return true;
    }
}
