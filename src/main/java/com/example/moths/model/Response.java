package com.example.moths.model;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Response {
	private ArrayList<Moth> possibleMoths;
	
	public Response() {
		super();
	}
	
	public Response(ArrayList<Moth> mothList) {
		this.possibleMoths = mothList;
	}

	public ArrayList<Moth> getPossibleMoths() {
		return possibleMoths;
	}

	public void setPossibleMoths(ArrayList<Moth> possibleMoths) {
		this.possibleMoths = possibleMoths;
	}
	
    //Method exclusive to the Java application.
	public void fetchAllMoths() {
		
	}
	
	public void removeMothFromResponse(Moth moth) {
		try {
			this.possibleMoths.remove(moth);
		} catch (NoSuchElementException nsee) {
			//logger?
			System.out.println("No such moth in response");
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((possibleMoths == null) ? 0 : possibleMoths.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Response other = (Response) obj;
		if (possibleMoths == null) {
			if (other.possibleMoths != null)
				return false;
		} else if (!possibleMoths.equals(other.possibleMoths))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Response [possibleMoths=" + possibleMoths + "]";
	}
}