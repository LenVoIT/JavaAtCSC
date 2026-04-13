package org.example.inoutfile.baitap1;

public class EmployeeTask {

    private String employeeName;
    private String taskTitle;
    private String taskDetail;
    private String doingDate;

    public EmployeeTask() {
    }

    public EmployeeTask(String employeeName, String taskTitle, String taskDetail, String doingDate) {
        this.employeeName = employeeName;
        this.taskTitle = taskTitle;
        this.taskDetail = taskDetail;
        this.doingDate = doingDate;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public String getTaskDetail() {
        return taskDetail;
    }

    public void setTaskDetail(String taskDetail) {
        this.taskDetail = taskDetail;
    }

    public String getDoingDate() {
        return doingDate;
    }

    public void setDoingDate(String doingDate) {
        this.doingDate = doingDate;
    }
}
