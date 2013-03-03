package com.rafalkalita.rmwlex;

public class HomeViewModel {

	private final String title;
	private final String message;
	private final String serverTime;
	
	public HomeViewModel(final String title, final String message, final String serverTime) {
		
		this.title = title;
		this.message = message;
		this.serverTime = serverTime;
	}

	public String getTitle() {
		return title;
	}

	public String getMessage() {
		return message;
	}

	public String getServerTime() {
		return serverTime;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result
				+ ((serverTime == null) ? 0 : serverTime.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		HomeViewModel other = (HomeViewModel) obj;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (serverTime == null) {
			if (other.serverTime != null)
				return false;
		} else if (!serverTime.equals(other.serverTime))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "HomeViewModel [title=" + title + ", message=" + message
				+ ", serverTime=" + serverTime + "]";
	}
	
	
}
