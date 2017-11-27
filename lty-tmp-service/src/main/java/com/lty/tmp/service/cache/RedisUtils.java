package com.lty.tmp.service.cache;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;

@Component
public class RedisUtils {

	@Autowired
	private StringRedisTemplate redisTemplate;

	/**
	 * 批量删除对应的value
	 * 
	 * @param keys
	 */
	public void remove(final String... keys) {
		for (String key : keys) {
			remove(key);
		}
	}

	/**
	 * 批量删除key
	 * 
	 * @param pattern
	 */
	public void removePattern(final String pattern) {
		Set<String> keys = redisTemplate.keys(pattern);
		if (keys.size() > 0)
			redisTemplate.delete(keys);
	}

	/**
	 * 删除对应的value
	 * 
	 * @param key
	 */
	public void remove(final String key) {
		if (exists(key)) {
			redisTemplate.delete(key);
		}
	}

	/**
	 * 判断缓存中是否有对应的value
	 * 
	 * @param key
	 * @return
	 */
	public boolean exists(final String key) {
		return redisTemplate.hasKey(key);
	}

	/**
	 * 读取缓存
	 * 
	 * @param key
	 * @return
	 */
	public String getString(final String key) {
		String result = null;
		ValueOperations<String, String> operations = redisTemplate.opsForValue();
		result = operations.get(key);
		return result;
	}

	/**
	 * 读取缓存
	 * 
	 * @param key
	 * @return
	 */
	public long getLong(final String key) {
		String result = null;
		ValueOperations<String, String> operations = redisTemplate.opsForValue();
		result = operations.get(key);
		return Long.parseLong(result);
	}

	/**
	 * 读取缓存
	 * 
	 * @param key
	 * @return
	 */
	public int getInt(final String key) {
		String result = null;
		ValueOperations<String, String> operations = redisTemplate.opsForValue();
		result = operations.get(key);
		return Integer.parseInt(result);
	}

	/**
	 * 读取缓存
	 * 
	 * @param key
	 * @return
	 */
	public <T> T getObject(final String key, Class<T> clazz) {
		String result = null;
		ValueOperations<String, String> operations = redisTemplate.opsForValue();
		result = operations.get(key);
		return JSON.parseObject(result, clazz);
	}

	/**
	 * 写入缓存
	 * 
	 * @param key
	 * @param value
	 * @return
	 */
	public void setObject(final String key, Object value) {
		String json = JSON.toJSONString(value);
		redisTemplate.opsForValue().set(key, json);
	}

	/**
	 * 写入缓存
	 * 
	 * @param key
	 * @param value
	 * @return
	 */
	public void setString(final String key, String value) {
		redisTemplate.opsForValue().set(key, value);
	}

	/**
	 * 写入缓存
	 * 
	 * @param key
	 * @param value
	 * @return
	 */
	public void setObject(final String key, Object value, Long expireTime) {
		String json = JSON.toJSONString(value);
		redisTemplate.opsForValue().set(key, json, expireTime, TimeUnit.SECONDS);
	}

	/**
	 * 
	 * @功能：对缓存数值进行加见操作
	 * 
	 *
	 * @返回：boolean
	 */
	public long increment(final String key, int num) {
		return redisTemplate.opsForValue().increment(key, num);
	}

	/**
	 * 
	 * @功能：添加元素到set集合
	 * 
	 *
	 * @返回：void
	 */
	public void setAdd(final String key, String... o) {
		redisTemplate.opsForSet().add(key, o);
	}

	/**
	 * 
	 * @功能：从set集合删除元素
	 * 
	 *
	 * @返回：void
	 */
	public void setRemove(final String key, Object... o) {
		redisTemplate.opsForSet().remove(key, o);
	}

	/**
	 * 
	 * @功能：获取set集合所有元素
	 * 
	 *
	 * @返回：Set<Object>
	 */
	public Set<String> setMembers(final String key) {
		return redisTemplate.opsForSet().members(key);
	}

	/**
	 * 
	 * @功能：获取匹配的keys
	 * 
	 * @param context
	 *
	 * @返回：Set<String>
	 */
	public Set<String> getKeys(final String pattern) {
		return redisTemplate.keys(pattern);
	}

}