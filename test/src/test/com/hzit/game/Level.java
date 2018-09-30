package test.com.hzit.game;

public class Level {
	private int levelNo;
	// 各级别一次输出字符串的长度
	private int strLength;
	// 各级别输出字符串的次数
	private int strTimes;
	// 各级别闯关的时间限制
	private int timeLimit;
	// 各级别正确输入一次的得分
	private int perScore;

	
	
	public Level( int strLength, int strTimes, int timeLimit, int perScore) {
		this.levelNo = 1;
		this.strLength = strLength;
		this.strTimes = strTimes;
		this.timeLimit = timeLimit;
		this.perScore = perScore;
	}

	
	
	public Level() {
		this.levelNo = 1;
		this.strLength = 1;
		this.strTimes = 1;
		this.timeLimit = 60;
		this.perScore = 1;
	}



	public void increaseLevelNo() {
		if (levelNo < 6)
			setLevelNo(++levelNo);
		else
			setLevelNo(6);
	}

	public int getLevelNo() {
		return levelNo;
	}

	public void setLevelNo(int levelNo) {
		this.levelNo = levelNo;
	}

	public int getStrLength() {
		return strLength;
	}

	public void setStrLength(int strLength) {
		this.strLength = strLength;
	}

	public int getStrTimes() {
		return strTimes;
	}

	public void setStrTimes(int strTimes) {
		this.strTimes = strTimes;
	}

	public int getTimeLimit() {
		return timeLimit;
	}

	public void setTimeLimit(int timeLimit) {
		this.timeLimit = timeLimit;
	}

	public int getPerScore() {
		return perScore;
	}

	public void setPerScore(int perScore) {
		this.perScore = perScore;
	}
}
