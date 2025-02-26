package com.dianwoda.usercenter.vera.piper.redis;

import com.dianwoda.usercenter.vera.piper.client.CircleDisposeHandler;

/**
 * redis command 过滤前拦截处理
 * @author seam
 */
public class CycleCommandFilterInterceptor<RedisCommand> implements CommandInterceptor<RedisCommand> {
  private CircleDisposeHandler<RedisCommand> circleDisposeHandler;

  public CycleCommandFilterInterceptor(CircleDisposeHandler<RedisCommand> circleDisposeHandler) {
    this.circleDisposeHandler = circleDisposeHandler;
  }

  @Override
  public RedisCommand interceptor(RedisCommand redisCommand) {
    if (!this.circleDisposeHandler.isCycleData(redisCommand)) {
      return redisCommand;
    } else {
      return null;
    }
  }
  
}
