package com.learn.design_patterns.behavioural.memento;

public class TextEditor {
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public void append(String text) {
		this.content += text;
	}

	public TextEditor(String content) {
		super();
		this.content = content;
	}

	public Memento createSnapshot() {
		return new Memento(this.content);
	}
	
	public void restoreSnapshot(Memento snapshot) {
		setContent(snapshot.getContent());
	}

	@Override
	public String toString() {
		return "TextEditor [content=" + content + "]";
	}
	
}
