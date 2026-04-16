# playground-batch-processing

## 模块目标
练“怎么把一批数据稳定处理完”的策略，不依赖专门的批处理框架，重点关注分页、分批、重试和断点思路。

## 学习范围
- 分页扫描
- 分批写入 / 更新
- 重试
- checkpoint
- 队列缓冲
- processor 设计

## 包结构说明
- `paging`：分页扫描练习包，适合做大表分批读取实验。
- `chunk`：分块处理练习包，强调每次处理一小批。
- `batchinsert`：批量插入练习包。
- `batchupdate`：批量更新练习包。
- `retry`：失败重试练习包。
- `checkpoint`：断点续跑练习包，记录处理到哪里了。
- `queuebuffer`：队列缓冲练习包，适合模拟先积攒再批量落库。
- `processor`：处理器包，放核心处理流程或策略实现。

## 学习资源
- [内部资源清单](../docs/resources/batch-processing.md)
- [MyBatis Java API](https://mybatis.org/mybatis-3/zh_CN/java-api.html)
- [Java 并发常见面试题](https://javaguide.cn/java/concurrent/java-concurrent-questions-01.html)

## 练习任务
- [ ] 写分页扫描和批量更新 demo
- [ ] 写一份失败重试和断点续跑笔记
- [ ] 对批处理事务边界做实验记录

## 笔记区
- 数据量考虑：
- 失败补偿思路：
- 与 Quartz 的关系：

## 完成状态
- 状态：未开始
