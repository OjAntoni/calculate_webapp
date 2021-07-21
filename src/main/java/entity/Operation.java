package entity;

import service.OperationService;

import java.util.Date;
import java.util.Objects;

public class Operation {

    private double num1;
    private double num2;
    private String oper;
    private double result;
    private Date date;
    private User user;

    public Operation(double num1, double num2, String oper, double result, Date date, User user) {
        this.num1 = num1;
        this.num2 = num2;
        this.oper = oper;
        this.result = result;
        this.date = date;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Operation operation = (Operation) o;
        return Double.compare(operation.num1, num1) == 0 && Double.compare(operation.num2, num2) == 0 && Double.compare(operation.result, result) == 0 && Objects.equals(oper, operation.oper) && Objects.equals(date, operation.date) && Objects.equals(user, operation.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num1, num2, oper, result, date, user);
    }

    @Override
    public String toString() {
        return num1 + " " + OperationService.getSymbol(oper) + " " + num2 + " = " + String.format("%.2f",result);
    }
}
