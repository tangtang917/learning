# boot-redis

## 模块目标
练 Redis 在后端里的常见使用方式，包括缓存、分布式锁和缓存问题治理。

## 学习范围
- RedisTemplate
- 字符串与对象缓存
- 缓存穿透 / 击穿 / 雪崩
- 分布式锁
- 热点数据处理

## 包结构说明
- `controller`：缓存相关接口入口。
- `service`：缓存业务接口层。
- `service.impl`：缓存业务实现层。
- `cache`：缓存操作包，放缓存读写和缓存策略逻辑。
- `lock`：分布式锁包，放锁实现和锁实验。
- `config`：Redis 配置、序列化配置等。
- `util`：Redis 模块辅助工具。

## 学习资源
- [内部资源清单](../docs/resources/redis.md)
- [图解 Redis](https://www.xiaolincoding.com/redis/)
- [Spring Data Redis 中文文档](https://springdoc.cn/spring-data-redis/)

## 练习任务
- [ ] 写一个基础缓存查询 demo
- [ ] 设计一个简单分布式锁 demo
- [ ] 对三种缓存异常场景分别做笔记

## 笔记区
- 缓存模型：
- 锁实现思路：
- 风险点：

## 完成状态
- 状态：未开始
