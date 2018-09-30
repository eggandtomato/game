package test.com.hzit.game;

import java.util.Scanner;

public class Player {
	//玩家等级
	private int levelNo;
	//当前分数
	private int curScore;
	//玩家开始游戏的时间微秒
	private long startTime;
	//已玩游戏的时长 ，秒
	private int elapsedTime;
	
	
	public Player(int levelNo, int curScore, long startTime, int elapsedTime) {
		this.levelNo = levelNo;
		this.curScore = curScore;
		this.startTime = startTime;
		this.elapsedTime = elapsedTime;
	}

	public String play() {
		Scanner sc = new Scanner(System.in);
		String in = sc.next();
		return in;
	}

    public void increaseScore(int score) {
    	setCurScore(curScore+score);
    }
	

	public int getLevelNo() {
		return levelNo;
	}



	public void setLevelNo(int levelNo) {
		this.levelNo = levelNo;
	}



	public int getCurScore() {
		return curScore;
	}



	public void setCurScore(int curScore) {
		this.curScore = curScore;
	}



	public long getStartTime() {
		return startTime;
	}



	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}



	public int getElapsedTime() {
		return elapsedTime;
	}



	public void setElapsedTime(int elapsedTime) {
		this.elapsedTime = elapsedTime;
	}


	@Override
	public String toString() {
		return "输入正确，您的积分" + curScore + "，您的级别" + levelNo + "，已用时间"
				+ elapsedTime + "秒";
	}
	

}
