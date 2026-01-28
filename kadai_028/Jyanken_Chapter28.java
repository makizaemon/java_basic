package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {

    // 自分のじゃんけんの手を入力するメソッド
    public String getMyChoice() {

        // Scannerクラス（標準入力を扱う）
        Scanner scanner = new Scanner(System.in);

        // 入力案内を表示
        System.out.println("自分のじゃんけんの手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");

        // 入力値を取得
        String myChoice = scanner.next();

        return myChoice;
    }

    // 対戦相手のじゃんけんの手を乱数で選ぶメソッド
    public String getRandom() {

        // じゃんけんの手を配列で管理
        String[] hands = { "r", "s", "p" };

        // 0以上3未満の乱数を生成
        double random = Math.random() * 3;

        // 小数点以下を切り捨てて0～2を取得
        int index = (int) Math.floor(random);

        return hands[index];
    }

    // じゃんけんを行うメソッド
    public void playGame(String myChoice, String enemyChoice) {

        // じゃんけんの手を日本語に変換するHashMap
        HashMap<String, String> jyankenMap = new HashMap<>();
        jyankenMap.put("r", "グー");
        jyankenMap.put("s", "チョキ");
        jyankenMap.put("p", "パー");

        // 手を表示
        System.out.println(
            "自分の手は" + jyankenMap.get(myChoice) +
            ",対戦相手の手は" + jyankenMap.get(enemyChoice)
        );

        // 勝敗判定（equalsメソッドを使用）
        if (myChoice.equals(enemyChoice)) {
            System.out.println("あいこです");
        } else if (
            (myChoice.equals("r") && enemyChoice.equals("s")) ||
            (myChoice.equals("s") && enemyChoice.equals("p")) ||
            (myChoice.equals("p") && enemyChoice.equals("r"))
        ) {
            System.out.println("自分の勝ちです");
        } else {
            System.out.println("自分の負けです");
        }
    }
}
