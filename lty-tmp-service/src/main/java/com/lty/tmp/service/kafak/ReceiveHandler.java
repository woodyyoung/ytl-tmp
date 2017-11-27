package com.lty.tmp.service.kafak;

import com.lty.tmp.service.kafak.modle.Message;

public interface ReceiveHandler<T> {
	public void handMsg(Message msg, T t);

}
