package model;
// Generated 2021�~2��7�� �U��12:30:36 by Hibernate Tools 5.4.21.Final

/**
 * Answer generated by hbm2java
 */
public class Answer implements java.io.Serializable {

	private int aid;
	private Question question;
	private String answername;
	private String postedby;

	public Answer() {
	}

	public Answer(int aid, Question question, String answername, String postedby) {
		this.aid = aid;
		this.question = question;
		this.answername = answername;
		this.postedby = postedby;
	}

	public int getAid() {
		return this.aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public Question getQuestion() {
		return this.question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public String getAnswername() {
		return this.answername;
	}

	public void setAnswername(String answername) {
		this.answername = answername;
	}

	public String getPostedby() {
		return this.postedby;
	}

	public void setPostedby(String postedby) {
		this.postedby = postedby;
	}

}