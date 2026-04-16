# boot-async-task

## 模块目标
练 Spring 进程内异步任务，包括 `@Async`、线程池、任务编排、异步异常处理和监听模式。

## 学习范围
- `@Async`
- 线程池配置
- 异步异常处理
- 任务拆分
- 监听与通知

## 包结构说明
- `controller`：触发异步任务的接口入口。
- `service`：异步任务相关业务接口层。
- `service.impl`：异步业务实现层。
- `config`：异步线程池和异步支持配置。
- `executor`：执行器包，可以理解为线程池管理或任务执行器相关代码。
- `task`：具体任务包，放真正要异步执行的任务内容。
- `listener`：监听器包，放异步事件监听和任务完成回调逻辑。

## 学习资源
- [内部资源清单](../docs/resources/concurrency.md)
- [内部 Spring 资源](../docs/resources/spring.md)
- [黑马 Spring Boot 2 教程](https://www.bilibili.com/video/BV15b4y1a7yG/)

## 练习任务
- [ ] 写一个异步发送通知 demo
- [ ] 配一套可解释的线程池参数
- [ ] 记录异步调用中最容易踩坑的 3 个点

## 笔记区
- 适用场景：
- 不适用场景：
- 与 MQ 的边界：

## 完成状态
- 状态：未开始
