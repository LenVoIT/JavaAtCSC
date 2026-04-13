package org.example.inoutfile.baitap1;

import java.io.*;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class BaiTap1 {
    private static final ArrayList<String> TASK_TITLES = new ArrayList<>(Arrays.asList("Cuộc họp", "Kế hoạch", "Giao việc", "Khác"));

    public static void showAllEmployeeTasks(ArrayList<EmployeeTask> employeeTasks) {
        if (employeeTasks == null || employeeTasks.isEmpty()) {
            System.out.println("Danh sách ghi chú rỗng");
            return;
        }
        System.out.println(String.format("%-20s | %-20s | %-20s | %-10s", "Họ tên", "Chủ đề", "Nội dung", "Ngày thực hiện"));
        for (EmployeeTask employeeTask : employeeTasks) {
            System.out.println(String.format("%-20s | %-20s | %-20s | %-10s",
                    employeeTask.getEmployeeName().trim(), employeeTask.getTaskTitle().trim(),
                    employeeTask.getTaskDetail().trim(), employeeTask.getDoingDate().trim()));
        }
    }

    private static boolean writeFileEmployeeTasks(final String fileName, EmployeeTask employeeTask) {
        try {
            if (employeeTask == null) {
                System.out.println("EmployeeTask không hợp lệ");
                return false;
            }
            FileWriter fileWriter = new FileWriter(fileName, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String employeeTaskLine = String.format("%-20s | %-20s | %-20s | %-10s",
                    employeeTask.getEmployeeName(), employeeTask.getTaskTitle(),
                    employeeTask.getTaskDetail(), employeeTask.getDoingDate());
            bufferedWriter.newLine();
            bufferedWriter.write(employeeTaskLine);
            bufferedWriter.close();
            System.out.println("Ghi file thành công.");
            return true;
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi file: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Lỗi xử lý: " + e.getMessage());
        }
        return false;
    }

    private static ArrayList<EmployeeTask> readFileEmployeeTasks(final String fileName) {
        try {
            ArrayList<EmployeeTask> employeeTasks = new ArrayList<>();
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] employeeLine = line.split("\\|");
                if (employeeLine == null || employeeLine.length == 0) {
                    continue;
                }
                EmployeeTask employeeTask = new EmployeeTask(
                        String.valueOf(employeeLine[0]),
                        String.valueOf(employeeLine[1]),
                        String.valueOf(employeeLine[2]),
                        String.valueOf(employeeLine[3])
                );
                employeeTasks.add(employeeTask);
            }
            bufferedReader.close();
            return employeeTasks;
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Lỗi xử lý: " + e.getMessage());
        }
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select = 0;

        final String fileName = "employeeTask.txt";

        do {
            System.out.println("\n========= MENU =========");
            System.out.println("1. Thêm ghi chú mới");
            System.out.println("2. Xem toàn bộ ghi chú");
            System.out.println("3. Thống kê ghi chú theo chủ đề");
            System.out.println("4. Thoát");
            System.out.println("Vui lòng chọn chức năng: ");

            select = scanner.nextInt();
            scanner.nextLine();
            switch (select) {
                case 1:
                    System.out.println("1. Thêm ghi chú mới");

                    EmployeeTask newEmployeeTask = getEmployeeTask(scanner);
                    writeFileEmployeeTasks(fileName, newEmployeeTask);
                    break;
                case 2:
                    System.out.println("2. Xem toàn bộ ghi chú");
                    ArrayList<EmployeeTask> employeeTasks = readFileEmployeeTasks(fileName);
                    showAllEmployeeTasks(employeeTasks);
                    break;
                case 3:
                    System.out.println("3. Thống kê ghi chú theo chủ đề");
                    Map<String, Integer> taskTitleCount = new HashMap<>();
                    for (String title : TASK_TITLES) {
                        taskTitleCount.put(title, 0);
                    }

                    employeeTasks = readFileEmployeeTasks(fileName);
                    for (EmployeeTask employeeTask : employeeTasks) {
                        String title = employeeTask.getTaskTitle().trim();
                        if (taskTitleCount.containsKey(title)) {
                            taskTitleCount.put(title, taskTitleCount.get(title) + 1);
                        }
                    }

                    for (Map.Entry<String, Integer> entry : taskTitleCount.entrySet()) {
                        System.out.println(String.format("%s - %s", entry.getKey(), entry.getValue()));
                    }

                    break;
            }

        } while (select != 4);
    }

    private static EmployeeTask getEmployeeTask(Scanner scanner) {
        System.out.println("Nhập họ tên nhân viên: ");
        String employeeName = scanner.nextLine();

        String taskTitle;
        do {
            System.out.println(String.format("Nhập chủ đề công việc (%s): ", TASK_TITLES));
            taskTitle = scanner.nextLine();
        } while (!TASK_TITLES.contains(taskTitle));

        System.out.println("Nhập nội dung ghi chú: ");
        String taskDetail = scanner.nextLine();

        String doingDateStr;
        boolean isDoingDateCorrect = true;
        do {
            System.out.println("Nhập ngày thực hiện (yyyy/MM/dd) và lớn hơn hoặc bằng ngày hiện tại: ");
            doingDateStr = scanner.nextLine();

            isDoingDateCorrect = checkDoingDate(doingDateStr);
        } while (!isDoingDateCorrect);

        doingDateStr = doingDateStr.replace("/", "-");
        EmployeeTask newEmployeeTask = new EmployeeTask(employeeName, taskTitle, taskDetail, doingDateStr);
        return newEmployeeTask;
    }

    private static boolean checkDoingDate(String doingDateStr) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        try {
            LocalDate doingDate = LocalDate.parse(doingDateStr, dateTimeFormatter);
            LocalDate today = LocalDate.now();

            return doingDate.isAfter(today);
        } catch (DateTimeException ex) {
            System.out.println(String.format("Ngày '%s' sai format yyyy/MM/dd", doingDateStr));
            return false;
        }
    }
}
