# boot-integration-demo

## 模块目标
把前面学过的 Web、MySQL、Redis、异步、Quartz、Pulsar 串成一个小型综合练习模块。

## 学习范围
- REST API
- 数据落库
- 缓存
- 异步任务
- 调度任务
- 消息通知

## 包结构说明
- `controller`：综合模块的接口入口。
- `service`：综合业务接口层。
- `service.impl`：综合业务实现层。
- `mapper`：数据库访问层。
- `entity`：数据库实体对象。
- `dto`：请求对象。
- `vo`：返回对象。
- `cache`：缓存相关逻辑。
- `mq`：消息队列相关逻辑。
- `task`：异步任务或调度任务相关逻辑。
- `config`：综合配置。
- `exception`：综合模块异常处理。

## 学习资源
- [内部资源清单](../docs/resources/integration.md)
- [瑞吉外卖](https://www.bilibili.com/video/BV13a411q753/)
- [苍穹外卖](https://www.bilibili.com/video/BV1TP411v7v6/)

## 练习任务
- [ ] 设计一个小业务并串联多个模块能力
- [ ] 记录链路上的关键点和失败处理方式
- [ ] 复盘每一项能力在综合项目里的职责边界

## 笔记区
- 业务题材：
- 技术串联路径：
- 当前欠缺能力：

## 完成状态
- 状态：未开始
