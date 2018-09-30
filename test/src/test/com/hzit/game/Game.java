package test.com.hzit.game;

import java.util.Random;

public class Game {
	private Player player;
	private String str;
	private Level level;

	public Game(Player player, String str, Level level) {
		this.player = player;
		this.str = str;
		this.level = level;
		this.player.setLevelNo(level.getLevelNo());
	}

	public Game(Player player, String str) {
		this.player = player;
		this.str = str;

	}

	public String printStr() {
		String[] out = str.split("");
		Random rand = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < level.getStrLength(); i++) {
			sb.append(out[rand.nextInt(str.length())]);
		}
		return sb.toString();
	}

	public void f() {
		if(level.getStrTimes()==0) {
			level.increaseLevelNo();
		}
		level.setStrTimes(level.getStrTimes()-1);
		String out = printStr();
		System.out.println("游戏输出：" + out);
		String in = player.play();
		if (!out.equals(in)) {
			System.out.println("游戏结束");
			System.exit(0);
		} else {
			player.increaseScore(level.getPerScore());
		}
		player.setLevelNo(level.getLevelNo());
	}

	public void printResult() {

	}

	public static void main(String[] args) {
		Level l = new Level();
		Player p = new Player(5, 0, 0L, 0);
		Game g = new Game(p, "abcdefghijklmnopqrstuvwxyz", l);
		while(true) {
		g.f();
		System.out.println(p);
		}
	}
}
