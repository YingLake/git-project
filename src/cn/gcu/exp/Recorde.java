package cn.gcu.exp;

import java.util.Date;
//收入或支出记录
public class Recorde {
    private Date date;//日期
    private int category;//收支类别
    private double revenueMoney;//收入金额
    private double expenditureMoney;//支出金额
    private double money;//剩余金额
    private double budgetBalance;//预算
    private String type;//类别
    private String remark;//备注

    public Recorde() {
    }

    //收入记录
    public Recorde(Date date, double revenueMoney, String revenueType, String remark) {
        this.date = date;
        this.revenueMoney = revenueMoney;
        this.type = revenueType;
        this.remark = remark;
    }

    //支出记录
    public Recorde(Date date, String remark, String revenueType, double expenditureMoney) {
        this.date = date;
        this.remark = remark;
        this.type = revenueType;
        this.expenditureMoney = expenditureMoney;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getRevenueMoney() {
        return revenueMoney;
    }

    public void setRevenueMoney(double revenueMoney) {
        this.revenueMoney = revenueMoney;
    }

    public double getExpenditureMoney() {
        return expenditureMoney;
    }

    public void setExpenditureMoney(double expenditureMoney) {
        this.expenditureMoney = expenditureMoney;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getBudgetBalance() {
        return budgetBalance;
    }

    public void setBudgetBalance(double budgetBalance) {
        this.budgetBalance = budgetBalance;
    }

    public String getRevenueType() {
        return type;
    }

    public void setRevenueType(String revenueType) {
        this.type = revenueType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
