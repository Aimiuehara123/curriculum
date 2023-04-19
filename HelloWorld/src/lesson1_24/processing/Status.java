package lesson1_24.processing;

public class Status {
	  private int hp;
	    private int mp;
	    private int atk;
	    private int agi;
	    private int def;

	    public Status(int hp, int mp, int atk, int agi, int def) {
	        this.hp = hp;
	        this.mp = mp;
	        this.atk = atk;
	        this.agi = agi;
	        this.def = def;
	    }

	    public void setHp(int hp) {
	        this.hp = hp;
	    }

	    public int getHp() {
	        return this.hp;
	    }

	    public void setMp(int mp) {
	        this.mp = mp;
	    }

	    public int getMp() {
	        return this.mp;
	    }

	    public void setAtk(int atk) {
	        this.atk = atk;
	    }

	    public int getAtk() {
	        return this.atk;
	    }

	    public void setAgi(int agi) {
	        this.agi = agi;
	    }

	    public int getAgi() {
	        return this.agi;
	    }

	    public void setDef(int def) {
	        this.def = def;
	    }

	    public int getDef() {
	        return this.def;
	    }
	
}
