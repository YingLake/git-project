package cn.gcu.exp;

import java.sql.SQLException;
import java.time.LocalDateTime;

public interface ISystem {
    public void revenue(String date, double revenueMoney, String revenueType, String remark) throws SQLException;//增加收入记录
    public void expenditure(String date, double expenditureMoney, String type, String remark) throws SQLException;//增加支出记录
    public void showBill();//账单展示
    public void searchBill();//账单查询
    public void budgetManage();//预算管理
    public void monthStatistic();//月度统计
    public void menuGui();//菜单界面
    public void exit();//退出系统
    public LocalDateTime toLocalDateTime(String localDateTime);
}
