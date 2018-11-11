package org.jax.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.jax.messenger.database.DatabaseClass;
import org.jax.messenger.model.Message;

public class MessageService {

	private Map<Long, Message> messages = DatabaseClass.getMessages();

	public MessageService() {
		messages.put(1L, new Message(1L, "Hello", "Ala"));
		messages.put(2L, new Message(2L, "Hi", "Ola"));
		messages.put(3L, new Message(3L, "Fu", "Zola"));
	}

	public List<Message> getAllMessages() {
		/*
		 * Message m1 = new Message(1L, "Hello", "Ala"); Message m2 = new Message(2L,
		 * "Hi", "Ola"); Message m3 = new Message(3L, "FU", "Zola");
		 * 
		 * List<Message> list = new ArrayList<Message>(); list.add(m1); list.add(m2);
		 * list.add(m3); return list;
		 */
		return new ArrayList<Message>(messages.values());
	}

	public Message getMessage(long id) {
		return messages.get(id);
	}

	public Message addMessage(Message message) {
		message.setId(messages.size() + 1);
		messages.put(message.getId(), message);
		return message;
	}

	public Message updateMessage(Message message) {
		if (message.getId() <= 0) {
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}

	public Message removeMessage(long id) {
		return messages.remove(id);
	}

}
