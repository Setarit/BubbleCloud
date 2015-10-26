package com.setarit.bubblecloud.model;

import java.nio.file.Path;

import javafx.beans.property.BooleanProperty;

/**
 * Wrapper class for the java.nio.file.Path class
 * @author Setarit
 *
 */
public class LocalPathWrapper {
	private Path path;
	private BooleanProperty activated;
	
	public LocalPathWrapper(){}
	
	public Path getPath() {
		return path;
	}
	public void setPath(Path path) {
		this.path = path;
	}
	public BooleanProperty isActivated() {
		return activated;
	}
	public void setActivated(BooleanProperty activated) {
		this.activated = activated;
	}
	
	public String getFullPathAsString(){
		return getPath().getParent() + "/" + getPath().getFileName().toString();
	}
}
