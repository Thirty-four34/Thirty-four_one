import java.util.Scanner;

public class Customer {
    private String name;
    private String sex;
    private int age;
    private String phone;
    private String mailbox;

    public Customer() {

    }
    public Customer(String name, String sex, int age, String phone, String mailbox) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.phone = phone;
        this.mailbox = mailbox;
    }

    /*娣诲姞瀹㈡埛*/
    public static void add(Customer c) {
        Scanner scan = new Scanner(System.in);
        //涓嶄娇鐢╪extLine()鎺ュ彈瀛楃涓叉槸鍥犱负锛屽湪nextInt()浣跨敤nextLine()锛宯extLine()浼氳嚜鍔ㄨ烦杩�
        System.out.print("濮撳悕锛�");
        c.name = scan.next();
        System.out.print("鎬у埆锛�");
        c.sex = scan.next();
        System.out.print("骞撮緞锛�");
        c.age = scan.nextInt();
        System.out.print("鐢佃瘽锛�");
        c.phone = scan.next();
        System.out.print("閭锛�");
        c.mailbox = scan.next();
//        scan.close();//姝ゅ涓嶅叧闂璼can鏄洜涓哄湪Test涓篃浣跨敤浜哠canner锛屽鏋滄澶勫叧闂嚭鐜颁細鎶ラ敊
    }

    /*淇敼瀹㈡埛淇℃伅*/
    public static void revise(Customer c) {
        Scanner scan = new Scanner(System.in);
        System.out.print("濮撳悕锛�"+c.getName()+"锛�:");
        c.setName(scan.next());
        System.out.print("鎬у埆锛�"+c.getSex()+"锛�:");
        c.setSex(scan.next());
        System.out.print("骞撮緞锛�"+c.getAge()+"锛�:");
        c.setAge(scan.nextInt());
        System.out.print("鐢佃瘽锛�"+c.getPhone()+"锛�:");
        c.setPhone(scan.next());
        System.out.print("閭锛�"+c.getMailbox()+"锛�:");
        c.setMailbox(scan.next());

    }

    /*鍒犻櫎瀹㈡埛淇℃伅*/
    public static void delete(Customer customer) {


    }

    /*鏌ョ湅鐢ㄦ埛鍒楄〃*/
    public static void query(Customer customer) {
        System.out.println(customer);
    }

    @Override
    public String toString() {
        return
                 name + "    " + sex +"       " +
                 age + "      " + phone + "       " +
                 mailbox;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMailbox() {
        return mailbox;
    }

    public void setMailbox(String mailbox) {
        this.mailbox = mailbox;
    }
}
