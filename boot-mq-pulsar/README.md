# boot-mq-pulsar

## 模块目标
练 Pulsar / TDMQ 的基础消息收发、消费模式、重试、幂等和积压处理思路。

## 学习范围
- Producer
- Consumer
- Topic 与 Subscription
- 重试与死信
- 幂等消费
- 接入配置

## 包结构说明
- `producer`：消息生产者包，负责发送消息。
- `consumer`：消息消费者包，负责消费消息。
- `config`：Pulsar / TDMQ 连接和客户端配置。
- `model`：消息模型包，比如消息体对象。
- `retry`：重试处理包，放失败重试逻辑。
- `idempotent`：幂等处理包，放防止重复消费的逻辑。
- `controller`：测试或触发消息发送的接口入口。

## 学习资源
- [内部资源清单](../docs/resources/pulsar.md)
- [腾讯云 TDMQ for Pulsar 文档首页](https://cloud.tencent.com/document/product/1179)
- [Spring Boot Starter 接入](https://cloud.tencent.com/document/product/1179/66699)

## 练习任务
- [ ] 写一套最小消息收发 demo
- [ ] 写一份消费幂等策略笔记
- [ ] 记录 TDMQ 和开源 Pulsar 接入差异

## 笔记区
- Topic 设计：
- Subscription 理解：
- 可靠性策略：

## 完成状态
- 状态：未开始
