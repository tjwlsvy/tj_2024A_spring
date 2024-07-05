package example.day02.springwebmvc.controller;

import example.day02.springwebmvc.model.dao.PhoneDao;
import example.day02.springwebmvc.model.dto.PhoneDto;

import java.util.ArrayList;

public class PhoneController {
    // [1] 싱글톤 패턴(패턴 : 문법 x )
    private static PhoneController phoneCont= new PhoneController();
    private PhoneController(){}
    public static PhoneController getInstance(){return phoneCont;}

    // 1.
    public boolean postPhone(PhoneDto phoneDto){
       return PhoneDao.getInstance().postPohone(phoneDto);

    }

    //  2.
    public ArrayList<PhoneDto> getPhone() {
        return PhoneDao.getInstance().getPhone();


    }

}
