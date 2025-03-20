package ru.specialist;

import java.util.List;

public interface Observer {
	public void handleEvent(List<String> figures);
}
