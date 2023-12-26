import java.util.*;

public class Test {
    private Customer[] customers;
    private int nums = 0;
    public Test(int num) {
        customers = new Customer[num];
    }
    public static void main(String[] args) {
        Test test = new Test(3);
        boolean BE = true;
        Scanner scan = new Scanner(System.in);
        while (BE) {
            System.out.println("-------------------客户信息管理软件---------------\n");
            System.out.println("-------------------1添加客户---------------");
            System.out.println("-------------------2修改用户---------------");
            System.out.println("-------------------3删除用户---------------");
            System.out.println("-------------------4客户列表---------------");
            System.out.println("-------------------5退   出---------------\n");
            System.out.print("请选择（1-5）：");
            int temp= scan.nextInt();
            switch (temp) {
                case 1:
                    Customer customer = new Customer("", "", 0, "", "");
                    Customer.add(customer);
                    test.customers[test.nums++] = customer;
                    break;
                case 2:
                    System.out.println("-------------------修改用户---------------");
                    System.out.print("请选择修改客户编号（-1退出）：");
                    int num = scan.nextInt();
                    boolean flag = true;
                    if (-1 == num) break;
                    for (int i = 1; i < test.customers.length+1; i++) {
                        if (i == num) {
                            Customer.revise(test.customers[i-1]);
                            flag = false;
                            System.out.println("--------------------修改成功---------------");
                            break;
                        }
                    }
                    if (flag) {
                        System.out.println("您选择的数字不存在！");
                        System.out.println("--------------修改失败---------------");
                    }
                    break;
                case 3:
                    System.out.println("-------------------删除用户---------------");
                    System.out.print("请选择修改客户编号（-1退出）：");
                    int num1 = scan.nextInt();
                    if (-1 == num1) break;
                    System.out.print("确定是否删除(Y/N):");
                    String decide = scan.next();
                    if (decide.equalsIgnoreCase("Y")) {
                        test.customers[num1-1] = null;
                        System.out.println("-----------------删除成功--------------");
                        break;
                    }
                case 4:
                    System.out.println("-------------------客户列表---------------");
                    System.out.println("编号\t\t姓名\t\t\t性别\t\t\t年龄\t\t\t电话\t\t\t邮箱");
                    for (int i = 0; i < test.customers.length ; i++) {
                        System.out.print((i+1)+"\t\t");
                        Customer.query(test.customers[i]);
                    }
                    System.out.println("------------------客户列表完成-----------------");
                    break;
                case 5:
                    BE = false;
                    break;
                default:
                    System.out.println("请重新输入1-5的数字");
            }

        }
        scan.close();
    }
}
