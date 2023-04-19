package lesson1_24.processing;

public class StatusProcessing extends Status{
	public StatusProcessing() {
        super(849, 862, 375, 937, 24); // ステータスは要件に準じて設定しています
    }

    public void printStatus(String name) {
        System.out.println("こんにちは " + name + " さん");
        System.out.println("ステータス");
        System.out.println("HP：" + this.getHp());
        System.out.println("MP：" + this.getMp());
        System.out.println("攻撃力：" + this.getAtk());
        System.out.println("素早さ：" + this.getAgi());
        System.out.println("防御力：" + this.getDef());
        System.out.println("\nさあ冒険に出かけよう！");
    }
}
