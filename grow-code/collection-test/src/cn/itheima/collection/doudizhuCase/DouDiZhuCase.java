package cn.itheima.collection.doudizhuCase;

import java.util.*;

/*
    总共54张牌,黑红梅方四种花色,大小王1-13
    三个玩家,随机发牌,各17张牌,剩余3张留做底牌
 */
public class DouDiZhuCase {
    public static void main(String[] args) {
        /*
            定义一个Map集合,用来存储扑克以及每一张牌对应的编号,要求无序
            定义一个List集合,用来存储扑克的编号.要求要有序排列,所以要用List集合
         */
        Map<Integer, String> pokerMap = new HashMap<>();
        ArrayList<Integer> pokerCode = new ArrayList<>();//扑克牌,每张牌的编号
        /*
            第一步:生产54张扑克牌    用一个容器盛装
                   大小王;4种花色,每种花色对应数字;
         */
        ArrayList<String> poker = new ArrayList<>();
        poker.add("大王");
        poker.add("小王");
        pokerCode.add(0);
        pokerCode.add(1);
        pokerMap.put(0, "大王");
        pokerMap.put(1, "小王");
        String[] pokerNum = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        String[] pokerSuit = {"♠", "♥", "♣", "◇"};
        int count = 2;
        for (int i = 0; i < pokerNum.length; i++) {
            for (int j = 0; j < pokerSuit.length; j++) {
                String getPoker = pokerSuit[j] + pokerNum[i];
                poker.add(getPoker);
                pokerMap.put(count, getPoker);
                pokerCode.add(count);
                count++;
            }
        }
        /*
            打乱牌的顺序
         */
        Collections.shuffle(pokerCode);
        /*
            开始发牌,三个玩家对应三个集合进行接收,另外创建第四个集合用来接收剩下的三张底牌
            玩家集合当中得到的是每一张扑克牌对应的编号
         */
        ArrayList<Integer> player01 = new ArrayList<>();
        ArrayList<Integer> player02 = new ArrayList<>();
        ArrayList<Integer> player03 = new ArrayList<>();
        ArrayList<Integer> bottom = new ArrayList<>();

        for (int i = 0; i < pokerCode.size(); i++) {
            if (i >= 51) {
                bottom.add(pokerCode.get(i));
            } else if (i % 3 == 0) {
                player01.add(pokerCode.get(i));
            } else if (i % 3 == 1) {
                player02.add(pokerCode.get(i));
            } else if (i % 3 == 2) {
                player03.add(pokerCode.get(i));
            }
        }
        /*
            发牌结束后就需要整理牌的顺序,使用Collections.sort()方法.
         */
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        selectPokerMap(player01,pokerMap);
        selectPokerMap(player02,pokerMap);
        selectPokerMap(player03,pokerMap);
        selectPokerMap(bottom,pokerMap);

    }

    /*
        定义一个方法,用来通过编号查找出对应的扑克牌
        方法名:selectPokerMap
        参数:玩家,扑克的键值对集合
        返回值:
     */
    public static void selectPokerMap(ArrayList<Integer> player,Map<Integer,String> pokerMap){
        for (int i = 0; i<player.size() ; i++) {
            Integer key = player.get(i);
            String value = pokerMap.get(key);
            System.out.print(value+" ");
        }
        System.out.println(player.size());
    }

    public static void method01(Map<Integer, String> map) {
        Set<Integer> set = map.keySet();

        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()) {
            Integer key = iterator.next();
            String value = map.get(key);
            System.out.print(key + "-" + value.toString()+";");
        }
    }
}
