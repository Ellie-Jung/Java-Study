package ch12;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FootballPlayer implements Serializable{
	private String name;
	private int number;
	private String team;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public FootballPlayer(String name, int number, String team, int age) {
		this.name = name;
		this.number = number;
		this.team = team;
		this.age = age;
	}

	@Override
	public String toString() {
		return "FootballPlayer [name=" + name + ", number=" + number + ", team=" + team + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return age%3;
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj!=null && obj instanceof FootballPlayer ) {
			FootballPlayer f =(FootballPlayer)obj;
			if(f.name.equals(name)&&f.team.equals(team)&&f.age==age) {
				result = true ;
			}
		}return result;
	}

	public int compareTo(FootballPlayer o) {
		
		int result = this.team.compareTo(o.team);  //음수 양수 0
		
		if(result ==0) {
			result = this.name.compareTo(o.name);
			if(result==0) {
				result = this.number - o.number;
			}
		}
		return result;
		
	}
}

