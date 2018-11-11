package org.jax.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jax.messenger.model.Message;
import org.jax.messenger.service.MessageService;

@Path("/messeges")
public class MessegeResource {

	MessageService messageSerivce = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMesseges() {
		return messageSerivce.getAllMessages();
	}
}
