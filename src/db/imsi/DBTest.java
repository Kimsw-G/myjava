package db.imsi;

import db.dao.DBCon;
import db.entity.MemberEntity;

public class DBTest {
    public static void main(String[] args) {
        DBCon dbCon = new DBCon();

        try {
            dbCon.conn();
            System.out.println("ํดใใ");
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            dbCon.closeDB();
        }
        
    }
}
