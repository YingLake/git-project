package cn.gcu.exp;

import cn.gcu.exp.util.DBOperator;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class billSystem implements ISystem {
    DBOperator db;

    @Override
    public LocalDateTime toLocalDateTime(String localDateTime) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse(localDateTime, df);
        return dateTime;
    }


    //增加收入记录
    @Override
    public void revenue(String date, double revenueMoney, String type, String remark) throws SQLException {
        db = new DBOperator();
        String SQL = "SELECT * FROM bill ORDER BY date DESC LIMIT 1;";
        ResultSet resultSet = db.executeQuery(SQL);
        resultSet.next();
        double money = resultSet.getDouble("money") + revenueMoney;
        LocalDateTime localDateTime = this.toLocalDateTime(date);
        String sql = "insert into bill (category,date,money,revenueMoney,type,remark) values(1,\'" + localDateTime + "\'," + money + "," + revenueMoney + ",\'" + type + "\',\'" + remark + "\');";
        int i = db.executeUpdate(sql);
        if (i > 0) {
            System.out.println("添加成功");
        }
    }

    //增加支出记录
    @Override
    public void expenditure(String date, double expenditureMoney, String type, String remark) throws SQLException {
        db = new DBOperator();
        String SQL = "SELECT * FROM bill ORDER BY date DESC LIMIT 1;";
        ResultSet resultSet = db.executeQuery(SQL);
        resultSet.next();
        double money = resultSet.getDouble("money") - expenditureMoney;
        LocalDateTime localDateTime = this.toLocalDateTime(date);
        String sql = "insert into bill (category,date,money,expenditureMoney,type,remark) values(1,\'" + localDateTime + "\'," + money + "," + expenditureMoney + ",\'" + type + "\',\'" + remark + "\');";
        int i = db.executeUpdate(sql);
        if (i > 0) {
            System.out.println("添加成功");
        }

    }

    //账单展示
    @Override
    public void showBill() {

    }

    //账单查询
    @Override
    public void searchBill() {

    }

    //预算管理
    @Override
    public void budgetManage() {

    }

    //月度统计
    @Override
    public void monthStatistic() {

    }

    //菜单界面
    @Override
    public void menuGui() {

    }

    //退出系统
    @Override
    public void exit() {

    }

    public static void main(String[] args) throws SQLException {
        billSystem bs = new billSystem();
        bs.expenditure("2023-10-11 18:00:00", 300.0, "吃饭", "无");
    }
}
