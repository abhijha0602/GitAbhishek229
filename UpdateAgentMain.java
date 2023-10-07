package com.java.jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class UpdateAgentMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Agent agent=new Agent();
		System.out.println("enter agent no");
		agent.setAgentId(sc.nextInt());
		System.out.println("enter name ");
		agent.setName(sc.next());
		System.out.println("enter city ");
		agent.setCity(sc.next());

		System.out.println("enter gender male/female");
		agent.setGender(Gender.valueOf(sc.next()));
	    System.out.println("enter marital status ");
		agent.setMaritalStatus(sc.nextInt());
		System.out.println("enter premium ");
		agent.setPremium(sc.nextDouble());
		
		AgentDAO dao=new AgentDaoImpl();
		
		
	     try {
			System.out.println(dao.updateAgentDao(agent));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	}


