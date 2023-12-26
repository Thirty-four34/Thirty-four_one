import java.util.*;

/**
 * 叁拾肆
 * 2022/11/20 11:34:46
 **/
public class tyu {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        String[] flower = {"黑","梅","方","桃"};
        String[] number = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        for (Integer I=0;I<number.length;I++) {
            for (Integer J=0;J<flower.length;J++) {
                al.add(flower[J]+number[I]);
            }
        }
        al.add("小王");
        al.add("大王");
        Collections.shuffle(al);
        ArrayList<String> player1 = new ArrayList<String>();
        ArrayList<String> player2 = new ArrayList<String>();
        ArrayList<String> player3 = new ArrayList<String>();
        ArrayList<String> dipai = new ArrayList<String>();
        for (int i = 0; i < al.size(); i++) {
            if(i>=al.size()-3){
                dipai.add(al.get(i));
            } else if (i % 3 == 0) {
                player1.add(al.get(i));
            } else if (i%3==1) {
                player2.add(al.get(i));
            } else if (i%3==2) {
                player3.add(al.get(i));
            }
        }
        System.out.println(player1);
        System.out.println("排序");
        Collections.sort(player1,new MyDoudizhuSort());
        System.out.println(player1);
        System.out.println("--------------------------------------------------");
        System.out.println(player2);
        System.out.println("排序");
        Collections.sort(player2,new MyDoudizhuSort());
        System.out.println(player2);
        System.out.println("--------------------------------------------------");

        System.out.println(player3);
        System.out.println("排序");
        Collections.sort(player3,new MyDoudizhuSort());
        System.out.println(player3);
        System.out.println("--------------------------------------------------");

        System.out.println(dipai);
        System.out.println("--------------------------抓地主-----------------------------");
        Random ran = new Random();
        int num= ran.nextInt(51);
        String str = al.get(num);
        System.out.println("地主是："+str);
        while (true) {
            if(player1.contains(str)) {
                player1.addAll(dipai);
                break;
            }
            else if (player2.contains(str)) {
                player2.addAll(dipai);
                break;
            } else if (player3.contains(str)) {
                player3.addAll(dipai);
                break;
            }
        }
        System.out.println("--------------------最后的牌型--------------------");
        Collections.sort(player1,new MyDoudizhuSort());
        System.out.println("player1:"+player1);
        System.out.println("--------------------------------------------------");

        Collections.sort(player2,new MyDoudizhuSort());
        System.out.println("player2:"+player2);
        System.out.println("--------------------------------------------------");

        Collections.sort(player3,new MyDoudizhuSort());
        System.out.println("player3:"+player3);
    }
}
class MyDoudizhuSort implements Comparator<String> {
    TreeMap<Integer,String> TM = new TreeMap<Integer,String>();
    private void sorts() {
        String[] flower = {"红","梅","方","桃"};
        String[] number = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        for (Integer I=0;I<number.length;I++) {
            for (Integer J=0;J<flower.length;J++) {
                TM.put(J+I*4,flower[J]+number[I]);
            }
        }
        TM.put(52,"小王");
        TM.put(53,"大王");
    }
    @Override
    public int compare(String o1, String o2) {
        this.sorts();
        Set<Integer> set = TM.keySet();
        int num1=0,num2=0;
        for (Integer N : set) {
            if(o1.equals(TM.get(N))){
                num1=N;
            }else if(o2.equals(TM.get(N))){
                num2=N;
            }
        }
        return num1-num2;
    }
}