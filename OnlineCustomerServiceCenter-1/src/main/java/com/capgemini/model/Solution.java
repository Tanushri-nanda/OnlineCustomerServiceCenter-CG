package com.capgemini.model;

import java.util.Date;

public class Solution {
	private int solutionId;
	private String solutionDescription;
	private Date solutionDate;
	
	private Operator specilist;
	private Issue issue;
	public Solution() {
		super();
	}
	public Solution(int solutionId, String solutionDescription, Date solutionDate, Operator specilist, Issue issue) {
		super();
		this.solutionId = solutionId;
		this.solutionDescription = solutionDescription;
		this.solutionDate = solutionDate;
		this.specilist = specilist;
		this.issue = issue;
	}
	public int getSolutionId() {
		return solutionId;
	}
	public void setSolutionId(int solutionId) {
		this.solutionId = solutionId;
	}
	public String getSolutionDescription() {
		return solutionDescription;
	}
	public void setSolutionDescription(String solutionDescription) {
		this.solutionDescription = solutionDescription;
	}
	public Date getSolutionDate() {
		return solutionDate;
	}
	public void setSolutionDate(Date solutionDate) {
		this.solutionDate = solutionDate;
	}
	public Operator getSpecilist() {
		return specilist;
	}
	public void setSpecilist(Operator specilist) {
		this.specilist = specilist;
	}
	public Issue getIssue() {
		return issue;
	}
	public void setIssue(Issue issue) {
		this.issue = issue;
	}
	@Override
	public String toString() {
		return "Solution [solutionId=" + solutionId + ", solutionDescription=" + solutionDescription + ", solutionDate="
				+ solutionDate + ", specilist=" + specilist + ", issue=" + issue + "]";
	}
	
}

