package com.thrityfive;

public class Course {
	private int courseId;
	private String courseName;
	private String courseAdmin;
	private int quiz;
	private int handson;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int courseId, String courseName, String courseAdmin, int quiz, int handson) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseAdmin = courseAdmin;
		this.quiz = quiz;
		this.handson = handson;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseAdmin() {
		return courseAdmin;
	}
	public void setCourseAdmin(String courseAdmin) {
		this.courseAdmin = courseAdmin;
	}
	public int getQuiz() {
		return quiz;
	}
	public void setQuiz(int quiz) {
		this.quiz = quiz;
	}
	public int getHandson() {
		return handson;
	}
	public void setHandson(int handson) {
		this.handson = handson;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseAdmin=" + courseAdmin
				+ ", quiz=" + quiz + ", handson=" + handson + "]";
	}
	
}
