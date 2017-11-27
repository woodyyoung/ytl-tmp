package com.lty.tmp.service.common.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lty.tmp.service.cache.TmpCache;

/**
 * 
 * @描述: 自动生成报文序列号
 * @作者: jianjun.liu
 * @创建时间: 2017年10月23日
 * @版本: 1.0
 */
@Component
public class SequenceGenerator {
	@Autowired
	private TmpCache tmpCache;

	public int getMsgId() {
		long message_sequence = tmpCache.increment_message_sequence_num("MESSAGE_SEQUENCE", 1);

		if (message_sequence == 99999999) {
			tmpCache.remove_message_sequence_num("MESSAGE_SEQUENCE");
		}

		return (int) message_sequence;

	}

}
