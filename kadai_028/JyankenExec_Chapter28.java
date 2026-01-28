package kadai_028;

public class JyankenExec_Chapter28 {

    public static void main(String[] args) {

        // じゃんけんクラスのインスタンスを作成
        Jyanken_Chapter28 jyanken = new Jyanken_Chapter28();

        // 自分の手を取得
        String myChoice = jyanken.getMyChoice();

        // 相手の手を乱数で取得
        String enemyChoice = jyanken.getRandom();

        // じゃんけんを実行
        jyanken.playGame(myChoice, enemyChoice);
    }
}
