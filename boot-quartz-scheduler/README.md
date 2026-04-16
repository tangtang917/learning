# boot-quartz-scheduler

## 模块目标
练 Quartz 定时调度，重点贴近公司项目的 `JDBC JobStore + 集群 + 动态创建任务` 场景。

## 学习范围
- Job / Trigger / Cron
- 动态创建、暂停、恢复、删除任务
- Cron 表达式校验
- JDBC JobStore
- `JobStoreTX`
- 集群配置

## 包结构说明
- `controller`：调度管理接口层，比如新增任务、暂停任务、恢复任务。
- `service`：调度业务能力定义层。
- `service.impl`：调度业务实现层。
- `job`：Quartz 作业包，放真正执行的任务类。
- `trigger`：触发器相关包，放触发器组装和触发策略逻辑。
- `config`：Quartz 配置包，放调度器、JobStore、线程池配置。
- `model`：任务模型对象，比如任务参数和任务定义对象。
- `validator`：Cron 表达式和任务入参校验。
- `util`：调度工具方法。

## 学习资源
- [内部资源清单](../docs/resources/quartz.md)
- [Baeldung 中文：Spring 中使用 Quartz 实现任务调度](https://www.baeldung-cn.com/spring-quartz-schedule)
- [PDai：SpringBoot 定时任务 - Quartz](https://pdai.tech/md/spring/springboot/springboot-x-task-quartz-timer.html)

## 练习任务
- [ ] 写一个静态 Cron 任务
- [ ] 写动态任务的创建与停启
- [ ] 把 JDBC JobStore 和集群配置记成自己的模板

## 笔记区
- 任务模型：
- 与 `@Scheduled` 的区别：
- 公司项目映射点：

## 完成状态
- 状态：未开始
