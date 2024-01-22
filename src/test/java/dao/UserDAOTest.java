package dao;

import db.DBConnection;
import model.User;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDAOTest {
    @Test
    public void inset_test() {
        //given = 매개변수
        String username = "kim";
        String password = "1234";
        String phone = " 01012345678";

        //when = 실행
        UserDAO dao = new UserDAO();
        int result = dao.insert(username, password, phone);

        //then = 결과
        if (result == 1) {
            System.out.println("성공");
        } else if (result == 0) {
            System.out.println("값의 변화가 없습니다.");
        } else {
            System.out.println("실패");
        }
    }
    @Test
    public void delete_test(){
        //given
        int number = 1;

        //when
        UserDAO dao = new UserDAO() ;
        int result = dao.delete(number);

        //then
        if (result == 1) {
            System.out.println("성공");
        } else if (result == 0) {
            System.out.println(number + "번호를 찾을 수 없습니다.");
        } else {
            System.out.println("실패");
        }
    }
    @Test
    public void update(){
        //given
        String password = "9876";
        int number = 2;
        String phone = "01054788965";

        UserDAO dao = new UserDAO() ;
        int result = dao.update(password,phone,number);

        //then
        if (result == 1) {
            System.out.println("성공");
        } else if (result == 0) {
            System.out.println(number + "번호를 찾을 수 없습니다.");
        } else {
            System.out.println("실패");
        }
    }
    @Test
    public void selectByNumber(){
        //given
        int number = 2 ;

        //when
        UserDAO dao = new UserDAO();
        User user = dao.selectByNumber(number);
        if(user ==null){
            System.out.println(number+ "으로 조회된 값이 없습니다.");
        }else {
            System.out.println(user.getNumber());
            System.out.println(user.getUsername());
            System.out.println(user.getPassword());
            System.out.println(user.getPhone());
        }
    }
        @Test
        public void selectAllTest(){
            //given

            //when
            UserDAO dao =new UserDAO();
            List<User> userList = dao.selectAll();

            System.out.println(userList.size());
            System.out.println(userList);
        }



    }





