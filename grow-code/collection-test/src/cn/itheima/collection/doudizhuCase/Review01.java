package cn.itheima.collection.doudizhuCase;

import java.util.*;

/*
    斗地主
 */
public class Review01 {
    public static void main(String[] args) {
        /*
            生成一副扑克牌,需要有:
                花色:黑红梅方
                大小:2,A,K,Q,J,10,9,8,7,6,5,4,3
         */
        String[] pookerNum = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        //定义一个数组用来表示花色
        String[] pookerSuit = {"♠","♥","♣","♦"};
        //定义一个Map集合,用来存储扑克牌以及每张扑克牌对应的数字
        Map<Integer, String> pookerMap = new HashMap<>();
        pookerMap.put(0, "大王");
        pookerMap.put(1, "小王");
        //定义一个集合用来存储编号
        ArrayList<Integer> pookerCode = new ArrayList<>();
        pookerCode.add(0);
        pookerCode.add(1);
        /*
            开始生产一副扑克牌,生成的每一张牌进行键值对匹配
         */
        int count = 2;
        for (String num : pookerNum) {
            for (String suit : pookerSuit) {
                String getPooker = suit + num;
                pookerCode.add(count);
                pookerMap.put(count, getPooker);
                count++;
            }
        }
        System.out.println("总共有:"+pookerCode.size());
//        method_01(pookerMap);
        //打乱牌的顺序,使用Collections工具类的shuffle()方法
        Collections.shuffle(pookerCode);
        //定义三个玩家,以及底牌的集合,用来存储得到的扑克牌.发牌是发的扑克牌的编号,Integer类型
        ArrayList<Integer> player01 = new ArrayList<>();
        ArrayList<Integer> player02 = new ArrayList<>();
        ArrayList<Integer> player03 = new ArrayList<>();
        ArrayList<Integer> bottom = new ArrayList<>();
        //发牌功能,%3==0发给第一个人以此类推
        for (int i=0; i<pookerCode.size(); i++) {
            if (i >=51) {
                bottom.add(pookerCode.get(i));
            } else if (i % 3 == 0) {
                player01.add(pookerCode.get(i));
            } else if (i % 3 == 1) {
                player02.add(pookerCode.get(i));
            } else if (i % 3 == 2) {
                player03.add(pookerCode.get(i));
            }
        }
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        Collections.sort(bottom);
        System.out.println("刘德华:"+method02(player01,pookerMap)+";"+player01.size());
        System.out.println("张学友:"+method02(player02,pookerMap)+";"+player02.size());
        System.out.println("郭德纲:"+method02(player03,pookerMap)+";"+player03.size());
        System.out.println(method02(bottom,pookerMap));
    }

    /*
        定义一个方法用来遍历Map集合(entrySet())
     */
    public static void method(Map<Integer, String> map) {
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> next = iterator.next();
            int key = next.getKey();
            String value = next.getValue();
            System.out.println(key + ":" + value);
        }
    }

    /*
        用keySet()方法来遍历map集合
     */
    public static void method_01(Map<Integer,String> map){
        Set<Integer> set = map.keySet();
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            Integer key = iterator.next();
            String value = map.get(key);
            System.out.println(key +":"+value);
        }
    }

    /*
        根据key来获取value
     */
    public static ArrayList<String> method02(ArrayList<Integer> player,Map<Integer,String> map){
        ArrayList<String> playerPoker = new ArrayList<>();
        for (Integer key : player) {
            String value = map.get(key);
            playerPoker.add(value);
        }
        return playerPoker;
    }
}
