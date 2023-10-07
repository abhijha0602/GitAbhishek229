package com.java.jdbc;

import java.sql.SQLException;
import java.util.List;

public class showAgentMain {

	public static void main(String[] args) {
		AgentDAO dao=new AgentDaoImpl();
        //try {
        try {
			List<Agent> agentList=dao.AgentShowDao();
			 for(Agent agent:agentList) {
        	 System.out.println(agent);
        }
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
