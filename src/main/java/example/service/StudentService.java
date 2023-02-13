package example.service;

import example.dao.TempDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private final TempDAO tempDAO;

    @Autowired
    public StudentService(TempDAO tempDAO) {
        this.tempDAO = tempDAO;
    }

    public boolean loginChecked(){
        System.out.println("서비스 호출");
        return tempDAO.isMatches("길웅","1234");
    }


}
