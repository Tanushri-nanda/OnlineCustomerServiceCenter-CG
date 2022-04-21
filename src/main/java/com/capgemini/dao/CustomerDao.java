package com.capgemini.dao;

public interface CustomerDao {
	public String login(Login login)throws SQLException;
	public String createCustomer(Customer customer)throws SQLException;
	public Issue readIssueById(int issueId);
	public Issue reopenIssue(int issueId);
	public List<Issue> readAllIssue();
	public String changePassword(Login login);
	public String forgotPassword(int customerId);

}
