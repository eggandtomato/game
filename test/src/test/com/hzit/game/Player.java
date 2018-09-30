package test.com.hzit.game;

import java.util.Scanner;

public class Player {
	//��ҵȼ�
	private int levelNo;
	//��ǰ����
	private int curScore;
	//��ҿ�ʼ��Ϸ��ʱ��΢��
	private long startTime;
	//������Ϸ��ʱ�� ����
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
		return "������ȷ�����Ļ���" + curScore + "�����ļ���" + levelNo + "������ʱ��"
				+ elapsedTime + "��";
	}
	

}
